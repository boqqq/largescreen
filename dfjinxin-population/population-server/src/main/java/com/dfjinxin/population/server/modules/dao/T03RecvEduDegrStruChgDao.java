package com.dfjinxin.population.server.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dfjinxin.population.api.entity.T03RecvEduDegrStruChg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 受教育程度结构变化
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@Repository
@Mapper
public interface T03RecvEduDegrStruChgDao extends BaseMapper<T03RecvEduDegrStruChg> {

    @Select("select * from t03_recv_edu_degr_stru_chg where date_stat=#{date} order by type")
    List<T03RecvEduDegrStruChg> findAll(@Param("date") Integer date);
    @Select("select distinct(date_stat) from t03_recv_edu_degr_stru_chg")
    List<Integer> findYears();
}
