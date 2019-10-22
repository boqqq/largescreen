package com.dfjinxin.population.server.modules.dao;

import com.dfjinxin.population.api.entity.T01LiqdPopu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 流动人口
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:04
 */
@Repository
@Mapper
public interface T01LiqdPopuDao extends BaseMapper<T01LiqdPopu> {

}
