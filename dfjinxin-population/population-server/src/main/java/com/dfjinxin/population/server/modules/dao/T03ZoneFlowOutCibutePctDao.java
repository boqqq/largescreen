package com.dfjinxin.population.server.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dfjinxin.population.api.entity.T03ZoneFlowOutCibutePct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 各地区流出贡献占比
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@Repository
@Mapper
public interface T03ZoneFlowOutCibutePctDao extends BaseMapper<T03ZoneFlowOutCibutePct> {

    @Select("select * from (SELECT DISTINCT(date_stat)as date_stat FROM t03_zone_flow_out_cibute_pct order by date_stat desc limit 2)a order by date_stat")
    List<String> years();
    @Select("SELECT DISTINCT(area_name) FROM `t03_zone_flow_out_cibute_pct`")
    List<String> areas();
    @Select("select * from t03_zone_flow_out_cibute_pct where date_stat=#{date} order by area_code")
    List<T03ZoneFlowOutCibutePct> findAll(@Param("date") Integer date);
}
