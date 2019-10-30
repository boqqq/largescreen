package com.dfjinxin.population.server.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dfjinxin.population.api.entity.T06TheAgedDisbuMap;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 老年人分布地图
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 19:02:19
 */
@Repository
@Mapper
public interface T06TheAgedDisbuMapDao extends BaseMapper<T06TheAgedDisbuMap> {

    @Select("SELECT m1.area_code,m1.area_name,m1.unit_cnt,m2.unit_cnt pm,m1.unit FROM \n" +
            "(SELECT t1.area_name,t1.unit_cnt,t1.rank_no,t1.area_code,t1.unit FROM t06_the_aged_disbu_map t1\n" +
            "WHERE t1.rank_no = '人口占比') m1,\n" +
            "(SELECT t2.area_name,t2.unit_cnt,t2.rank_no,t2.area_code,t2.unit FROM t06_the_aged_disbu_map t2\n" +
            "WHERE t2.rank_no = '排名') m2\n" +
            "WHERE m1.area_code = m2.area_code\n" +
            "ORDER BY pm*1 ")
    List<Map<String, Object>> select();
}
