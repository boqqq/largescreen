package com.dfjinxin.population.server.modules.dao;

import com.dfjinxin.population.api.entity.T01PrmnPopu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 常住人口
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:35:47
 */
@Repository
@Mapper
public interface T01PrmnPopuDao extends BaseMapper<T01PrmnPopu> {

    @Select("SELECT m1.area_code,m1.area_name,m1.date_stat,m1.popu_total,m1.unit,m2.unit1,m2.popu_total,m2.area_code1 FROM\n" +
            "(SELECT t.date_stat,t.area_code,t.area_name,t.unit,t.popu_total FROM T01_Prmn_Popu t\n" +
            "WHERE t.unit_type = '人口数量') m1,\n" +
            "(SELECT t1.unit unit1,t1.popu_total popu_total,t1.area_code area_code1 FROM T01_Prmn_Popu t1\n" +
            "WHERE t1.unit_type = '增量') m2\n" +
            "WHERE m1.area_code = m2.area_code1\n" +
            "AND m1.area_code != '460000000000'")
    List<T01PrmnPopu> select();
}
