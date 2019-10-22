package com.dfjinxin.population.server.modules.dao;

import com.dfjinxin.population.api.entity.T01PrmnPopuAndGrowRate;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 常住人口及增长率
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:32
 */
@Repository
@Mapper
public interface T01PrmnPopuAndGrowRateDao extends BaseMapper<T01PrmnPopuAndGrowRate> {

}
