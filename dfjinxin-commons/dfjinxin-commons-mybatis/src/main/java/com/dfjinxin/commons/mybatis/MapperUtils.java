package com.dfjinxin.commons.mybatis;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.enums.SqlMethod;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import com.baomidou.mybatisplus.core.metadata.TableInfoHelper;
import com.baomidou.mybatisplus.core.toolkit.*;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import org.apache.ibatis.binding.MapperMethod;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionUtils;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 基于MybatisPlus BaseMapper的工具类
 */
public abstract class MapperUtils {
    /**
     * 判断数据库操作是否成功
     *
     * @param result 数据库操作返回影响条数
     * @return boolean
     */
    private static boolean retBool(Integer result) {
        return SqlHelper.retBool(result);
    }

    private static <T> Class<T> currentModelClass(BaseMapper<T> mapper) {
        return (Class<T>) ReflectionKit.getSuperClassGenericType(mapper.getClass(), 0);
    }

    /**
     * 批量操作 SqlSession
     */
    private static <T> SqlSession sqlSessionBatch(BaseMapper<T> mapper) {
        return SqlHelper.sqlSessionBatch(currentModelClass(mapper));
    }

    /**
     * 释放sqlSession
     *
     * @param sqlSession session
     */
    private static <T> void closeSqlSession(BaseMapper<T> mapper, SqlSession sqlSession) {
        SqlSessionUtils.closeSqlSession(sqlSession, GlobalConfigUtils.currentSessionFactory(currentModelClass(mapper)));
    }

    /**
     * 获取 SqlStatement
     *
     * @param sqlMethod ignore
     * @return ignore
     */
    private static <T> String sqlStatement(BaseMapper<T> mapper, SqlMethod sqlMethod) {
        return SqlHelper.table(currentModelClass(mapper)).getSqlStatement(sqlMethod.getMethod());
    }

    public static <T> boolean save(BaseMapper<T> mapper, T entity) {
        return retBool(mapper.insert(entity));
    }

    /**
     * 批量插入
     *
     * @param entityList ignore
     * @param batchSize  ignore
     * @return ignore
     */
    public static <T> boolean saveBatch(BaseMapper<T> mapper, Collection<T> entityList, int batchSize) {
        String sqlStatement = sqlStatement(mapper, SqlMethod.INSERT_ONE);
        try (SqlSession batchSqlSession = sqlSessionBatch(mapper)) {
            int i = 0;
            for (T anEntityList : entityList) {
                batchSqlSession.insert(sqlStatement, anEntityList);
                if (i >= 1 && i % batchSize == 0) {
                    batchSqlSession.flushStatements();
                }
                i++;
            }
            batchSqlSession.flushStatements();
        }
        return true;
    }

    /**
     * TableId 注解存在更新记录，否插入一条记录
     *
     * @param entity 实体对象
     * @return boolean
     */
    public static <T> boolean saveOrUpdate(BaseMapper<T> baseMapper, T entity) {
        if (null != entity) {
            Class<?> cls = entity.getClass();
            TableInfo tableInfo = TableInfoHelper.getTableInfo(cls);
            Assert.notNull(tableInfo, "error: can not execute. because can not find cache of TableInfo for entity!");
            String keyProperty = tableInfo.getKeyProperty();
            Assert.notEmpty(keyProperty, "error: can not execute. because can not find column for id from entity!");
            Object idVal = ReflectionKit.getMethodValue(cls, entity, tableInfo.getKeyProperty());
            return StringUtils.checkValNull(idVal) || Objects.isNull(getById(baseMapper, (Serializable) idVal)) ? save(baseMapper, entity) : updateById(baseMapper, entity);
        }
        return false;
    }

    public static <T> boolean saveOrUpdateBatch(BaseMapper<T> baseMapper, Collection<T> entityList, int batchSize) {
        Assert.notEmpty(entityList, "error: entityList must not be empty");
        Class<?> cls = currentModelClass(baseMapper);
        TableInfo tableInfo = TableInfoHelper.getTableInfo(cls);
        Assert.notNull(tableInfo, "error: can not execute. because can not find cache of TableInfo for entity!");
        String keyProperty = tableInfo.getKeyProperty();
        Assert.notEmpty(keyProperty, "error: can not execute. because can not find column for id from entity!");
        try (SqlSession batchSqlSession = sqlSessionBatch(baseMapper)) {
            int i = 0;
            for (T entity : entityList) {
                Object idVal = ReflectionKit.getMethodValue(cls, entity, keyProperty);
                if (StringUtils.checkValNull(idVal) || Objects.isNull(getById(baseMapper, (Serializable) idVal))) {
                    batchSqlSession.insert(sqlStatement(baseMapper, SqlMethod.INSERT_ONE), entity);
                } else {
                    MapperMethod.ParamMap<T> param = new MapperMethod.ParamMap<>();
                    param.put(Constants.ENTITY, entity);
                    batchSqlSession.update(sqlStatement(baseMapper, SqlMethod.UPDATE_BY_ID), param);
                }
                // 不知道以后会不会有人说更新失败了还要执行插入 😂😂😂
                if (i >= 1 && i % batchSize == 0) {
                    batchSqlSession.flushStatements();
                }
                i++;
            }
            batchSqlSession.flushStatements();
        }
        return true;
    }

    public static <T> boolean removeById(BaseMapper<T> baseMapper, Serializable id) {
        return SqlHelper.retBool(baseMapper.deleteById(id));
    }

    public static <T> boolean removeByMap(BaseMapper<T> baseMapper, Map<String, Object> columnMap) {
        Assert.notEmpty(columnMap, "error: columnMap must not be empty");
        return SqlHelper.retBool(baseMapper.deleteByMap(columnMap));
    }

    public static <T> boolean remove(BaseMapper<T> baseMapper, Wrapper<T> wrapper) {
        return SqlHelper.retBool(baseMapper.delete(wrapper));
    }

    public static <T> boolean removeByIds(BaseMapper<T> baseMapper, Collection<? extends Serializable> idList) {
        return SqlHelper.retBool(baseMapper.deleteBatchIds(idList));
    }

    public static <T> boolean updateById(BaseMapper<T> baseMapper, T entity) {
        return retBool(baseMapper.updateById(entity));
    }

    public static <T> boolean update(BaseMapper<T> baseMapper, T entity, Wrapper<T> updateWrapper) {
        return retBool(baseMapper.update(entity, updateWrapper));
    }

    public static <T> boolean updateBatchById(BaseMapper<T> baseMapper, Collection<T> entityList, int batchSize) {
        Assert.notEmpty(entityList, "error: entityList must not be empty");
        String sqlStatement = sqlStatement(baseMapper, SqlMethod.UPDATE_BY_ID);
        try (SqlSession batchSqlSession = sqlSessionBatch(baseMapper)) {
            int i = 0;
            for (T anEntityList : entityList) {
                MapperMethod.ParamMap<T> param = new MapperMethod.ParamMap<>();
                param.put(Constants.ENTITY, anEntityList);
                batchSqlSession.update(sqlStatement, param);
                if (i >= 1 && i % batchSize == 0) {
                    batchSqlSession.flushStatements();
                }
                i++;
            }
            batchSqlSession.flushStatements();
        }
        return true;
    }

    public static <T> T getById(BaseMapper<T> baseMapper, Serializable id) {
        return baseMapper.selectById(id);
    }

    public static <T> Collection<T> listByIds(BaseMapper<T> baseMapper, Collection<? extends Serializable> idList) {
        return baseMapper.selectBatchIds(idList);
    }

    public static <T> Collection<T> listByMap(BaseMapper<T> baseMapper, Map<String, Object> columnMap) {
        return baseMapper.selectByMap(columnMap);
    }

    public static <T> T getOne(BaseMapper<T> baseMapper, Wrapper<T> queryWrapper, boolean throwEx) {
        if (throwEx) {
            return baseMapper.selectOne(queryWrapper);
        }
        return SqlHelper.getObject(baseMapper.selectList(queryWrapper));
    }

    public static <T> Map<String, Object> getMap(BaseMapper<T> baseMapper, Wrapper<T> queryWrapper) {
        return SqlHelper.getObject(baseMapper.selectMaps(queryWrapper));
    }

    public static <T> int count(BaseMapper<T> baseMapper, Wrapper<T> queryWrapper) {
        return SqlHelper.retCount(baseMapper.selectCount(queryWrapper));
    }

    public static <T> List<T> list(BaseMapper<T> baseMapper, Wrapper<T> queryWrapper) {
        return baseMapper.selectList(queryWrapper);
    }

    public static <T> IPage<T> page(BaseMapper<T> baseMapper, IPage<T> page, Wrapper<T> queryWrapper) {
        return baseMapper.selectPage(page, queryWrapper);
    }

    public static <T> List<Map<String, Object>> listMaps(BaseMapper<T> baseMapper, Wrapper<T> queryWrapper) {
        return baseMapper.selectMaps(queryWrapper);
    }

    public static <V, T> List<V> listObjs(BaseMapper<T> baseMapper, Wrapper<T> queryWrapper, Function<? super Object, V> mapper) {
        return baseMapper.selectObjs(queryWrapper).stream().filter(Objects::nonNull).map(mapper).collect(Collectors.toList());
    }

    public static <T> IPage<Map<String, Object>> pageMaps(BaseMapper<T> baseMapper, IPage<T> page, Wrapper<T> queryWrapper) {
        return baseMapper.selectMapsPage(page, queryWrapper);
    }

    public <V, T> V getObj(BaseMapper<T> baseMapper, Wrapper<T> queryWrapper, Function<? super Object, V> mapper) {
        return SqlHelper.getObject(listObjs(baseMapper, queryWrapper, mapper));
    }
}
