package com.dfjinxin.population.server.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dfjinxin.population.api.entity.T06PopuBirthRateAndDeadRateTrnd;
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
 * @date 2019-10-21 18:33:14
 */
@Repository
@Mapper
public interface T06PopuBirthRateAndDeadRateTrndDao extends BaseMapper<T06PopuBirthRateAndDeadRateTrnd> {

    @Select("SELECT t.date_stat,t.Birth_Rate,t.Dead_Rate,t.unit FROM t06_popu_birth_rate_and_dead_rate_trnd t\n" +
            "ORDER BY t.date_stat")
    List<T06PopuBirthRateAndDeadRateTrnd> select(Map<String, Object> params);
}
