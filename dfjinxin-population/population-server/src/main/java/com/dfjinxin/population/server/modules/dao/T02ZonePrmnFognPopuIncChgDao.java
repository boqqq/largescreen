package com.dfjinxin.population.server.modules.dao;

import com.dfjinxin.population.api.entity.T02ZonePrmnFognPopuIncChg;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 各地区户籍人口增量变化
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 08:39:03
 */
@Repository
@Mapper
public interface T02ZonePrmnFognPopuIncChgDao extends BaseMapper<T02ZonePrmnFognPopuIncChg> {
	
}
