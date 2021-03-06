package com.dfjinxin.population.server.modules.dao;

import com.dfjinxin.population.api.entity.T01HousdRgstPopu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 户籍人口
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:35:55
 */
@Repository
@Mapper
public interface T01HousdRgstPopuDao extends BaseMapper<T01HousdRgstPopu> {

}
