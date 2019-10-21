package com.dfjinxin.population.server.modules.dao;

import com.dfjinxin.population.api.entity.T06PopuAgeMidDigitChgTrnd;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 人口年龄中位数变化趋势
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 15:13:11
 */
@Repository
@Mapper
public interface T06PopuAgeMidDigitChgTrndDao extends BaseMapper<T06PopuAgeMidDigitChgTrnd> {
	
}
