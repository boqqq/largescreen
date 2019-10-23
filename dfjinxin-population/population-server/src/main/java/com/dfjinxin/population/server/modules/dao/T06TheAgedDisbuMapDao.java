package com.dfjinxin.population.server.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dfjinxin.population.api.entity.T06TheAgedDisbuMap;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Select("SELECT t.area_name,t.unit_cnt,t.rank_no,t.area_code,t.unit FROM t06_the_aged_disbu_map t\n" +
            "ORDER BY t.rank_no")
    List<T06TheAgedDisbuMap> select();
}
