package com.dfjinxin.population.server.modules.dao;

import com.dfjinxin.population.api.entity.T01HousdRgstPopuGrowRate;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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

}
