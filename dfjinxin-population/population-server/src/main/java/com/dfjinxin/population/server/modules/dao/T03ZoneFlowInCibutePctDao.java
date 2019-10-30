package com.dfjinxin.population.server.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dfjinxin.population.api.entity.T03ZoneFlowInCibutePct;
import com.dfjinxin.population.api.entity.T03ZoneFlowOutCibutePct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 各地区流入贡献占比
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@Repository
@Mapper
public interface T03ZoneFlowInCibutePctDao extends BaseMapper<T03ZoneFlowInCibutePct> {

    @Select("SELECT  t.area_name,t.yty_growth,t.date_stat  FROM t03_zone_flow_in_cibute_pct  t,(\n" +
            "SELECT  m.date_stat  FROM t03_zone_flow_in_cibute_pct  m\n" +
            "GROUP BY m.date_stat\n" +
            "ORDER BY m.date_stat desc\n" +
            "LIMIT 1) t1\n" +
            "WHERE t.date_stat = t1.date_stat\n")
    List<T03ZoneFlowOutCibutePct> findAll();
}
