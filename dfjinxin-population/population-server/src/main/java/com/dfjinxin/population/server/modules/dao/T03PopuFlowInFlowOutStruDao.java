package com.dfjinxin.population.server.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dfjinxin.population.api.entity.T03PopuFlowInFlowOutStru;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 人口流入流出结构
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@Repository
@Mapper
public interface T03PopuFlowInFlowOutStruDao extends BaseMapper<T03PopuFlowInFlowOutStru> {

    @Select("select max(date_stat) from t03_popu_flow_in_flow_out_stru")
    Integer findMaxYear();
    @Select("select * from t03_popu_flow_in_flow_out_stru where date_stat=#{date}")
    List<T03PopuFlowInFlowOutStru> findAll(@Param("date") Integer date);
}
