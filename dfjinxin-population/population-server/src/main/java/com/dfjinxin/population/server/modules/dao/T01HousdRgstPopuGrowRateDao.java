package com.dfjinxin.population.server.modules.dao;

import com.dfjinxin.population.api.entity.T01HousdRgstPopuGrowRate;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 户籍人口及增长率
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:39
 */
@Repository
@Mapper
public interface T01HousdRgstPopuGrowRateDao extends BaseMapper<T01HousdRgstPopuGrowRate> {

    @Select("SELECT t.date_stat,t.popu_total,t.yty_growth FROM T01_Housd_Rgst_Popu_Grow_Rate t\n" +
            "ORDER BY t.date_stat")
    List<T01HousdRgstPopuGrowRate> select();
}
