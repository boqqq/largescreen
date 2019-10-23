package com.dfjinxin.population.server.modules.dao;

import com.dfjinxin.population.api.entity.T07PersRecvEduYrsPersGdpRel;
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
 * @date 2019-10-22 10:05:51
 */
@Repository
@Mapper
public interface T07PersRecvEduYrsPersGdpRelDao extends BaseMapper<T07PersRecvEduYrsPersGdpRel> {

    @Select("SELECT t.* FROM T07_Pers_Recv_Edu_Yrs_Pers_GDP_Rel t\n" +
            "WHERE t.area_code = '460000000000'\n" +
            "ORDER BY t.date_stat")
    List<T07PersRecvEduYrsPersGdpRel> select(Map<String, Object> params);

}
