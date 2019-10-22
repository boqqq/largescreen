package com.dfjinxin.population.server.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dfjinxin.population.api.entity.T06AgingPopuStruAndTrnd;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 老龄人口结构与趋势
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:10:02
 */
@Repository
@Mapper
public interface T06AgingPopuStruAndTrndDao extends BaseMapper<T06AgingPopuStruAndTrnd> {

    @Select("SELECT t.date_stat,t.unit,t.unit_type,t.yty_growth,t.popu_total FROM t06_aging_popu_stru_and_trnd t\n" +
            "GROUP BY t.unit_type,t.date_stat\n" +
            "ORDER BY t.date_stat")
    List<T06AgingPopuStruAndTrnd> select();
}
