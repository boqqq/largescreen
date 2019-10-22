package com.dfjinxin.population.server.modules.dao;

import com.dfjinxin.population.api.entity.T01PrmnPopuAgeMidDigit;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 常住人口年龄中位数
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:18
 */
@Repository
@Mapper
public interface T01PrmnPopuAgeMidDigitDao extends BaseMapper<T01PrmnPopuAgeMidDigit> {

}
