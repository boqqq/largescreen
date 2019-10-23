package com.dfjinxin.population.server.modules.dao;

import com.dfjinxin.population.api.entity.T04IndsWorkPersMemStru5YrChg;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:53:25
 */
@Repository
@Mapper
public interface T04IndsWorkPersMemStru5YrChgDao extends BaseMapper<T04IndsWorkPersMemStru5YrChg> {


    @Select("SET @SQL = NULL;\n" +
            "SET @CODE = '${areaCode}';\n" +
            "SELECT\n" +
            "\tGROUP_CONCAT(\n" +
            "\t\tDISTINCT CONCAT(\n" +
            "\t\t\t'MAX(IF(c.date_stat = ''',\n" +
            "\t\t\tc.date_stat,\n" +
            "\t\t\t''', c.yty_growth, -0.000000001)) AS ''',\n" +
            "\t\t\tc.date_stat,\n" +
            "\t\t\t''''\n" +
            "\t\t)\n" +
            "\t) INTO @SQL\n" +
            "FROM\n" +
            "\t(\n" +
            "\t\tSELECT\n" +
            "\t\t\tt1.*\n" +
            "\t\tFROM\n" +
            "\t\t\tT04_Inds_Work_Pers_Mem_Stru_5_Yr_Chg t1\n" +
            "\t\tRIGHT JOIN (\n" +
            "\t\t\tSELECT DISTINCT\n" +
            "\t\t\t\t(date_stat)\n" +
            "\t\t\tFROM\n" +
            "\t\t\t\tT04_Inds_Work_Pers_Mem_Stru_5_Yr_Chg\n" +
            "\t\t\tORDER BY\n" +
            "\t\t\t\tdate_stat DESC\n" +
            "\t\t\tLIMIT ${limit}\n" +
            "\t\t) t2 ON t1.date_stat = t2.date_stat\n" +
            "\t) c;\n" +
            "SET @SQL = CONCAT(\n" +
            "\t'Select c.work_type_desc type,',\n" +
            "\t@SQL,\n" +
            "\t' From (select * from T04_Inds_Work_Pers_Mem_Stru_5_Yr_Chg t where t.area_code = ''',\n" +
            "\t@CODE,\n" +
            "\t''') c Group by c.work_type_desc'\n" +
            ");\n" +
            "PREPARE stmt\n" +
            "FROM\n" +
            "\t@SQL;\n" +
            "EXECUTE stmt;\n" +
            "DEALLOCATE PREPARE stmt;\n")
    List<Map<String, String>> getList(Map<String, Object> map);

    @Select("SELECT DISTINCT\n" +
            "\t(date_stat) dateStat\n" +
            "FROM\n" +
            "\tT04_Inds_Work_Pers_Mem_Stru_5_Yr_Chg\n" +
            "ORDER BY\n" +
            "\tdate_stat DESC\n" +
            "LIMIT ${limit}")
    List<Map<String, String>> getDateList(Map<String, Object> map);

}
