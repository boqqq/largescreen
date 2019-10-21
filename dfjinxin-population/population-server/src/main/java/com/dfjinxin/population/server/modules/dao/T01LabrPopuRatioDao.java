package com.dfjinxin.population.server.modules.dao;

import com.dfjinxin.population.api.entity.T01LabrPopuRatio;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 劳动人口占比及同比
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 15:23:18
 */
@Repository
@Mapper
public interface T01LabrPopuRatioDao extends BaseMapper<T01LabrPopuRatio> {

}
