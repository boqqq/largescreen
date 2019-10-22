package com.dfjinxin.population.server.modules.dao;

import com.dfjinxin.population.api.entity.T01AgingPopuPct;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 老龄人口占比
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:24
 */
@Repository
@Mapper
public interface T01AgingPopuPctDao extends BaseMapper<T01AgingPopuPct> {

}
