package com.dfjinxin.population.server.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dfjinxin.population.api.entity.T06BringChgFeat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 老年抚养比变化特征
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:47:52
 */
@Repository
@Mapper
public interface T06BringChgFeatDao extends BaseMapper<T06BringChgFeat> {

    @Select("SELECT m1.date_stat,m1.yty_growth1,m1.unit1,m2.yty_growth2,m2.unit2 FROM \n" +
            "(SELECT t1.date_stat,t1.yty_growth yty_growth1,t1.unit unit1 FROM t06_bring_chg_feat t1\n" +
            "WHERE t1.unit_type = '老年抚养比'\n" +
            "ORDER BY t1.date_stat DESC\n" +
            "LIMIT 10) m1,\n" +
            "(SELECT t2.date_stat,t2.yty_growth yty_growth2,t2.unit unit2 FROM t06_bring_chg_feat t2\n" +
            "WHERE t2.unit_type = '同比增长率'\n" +
            "ORDER BY t2.date_stat DESC\n" +
            "LIMIT 10)m2\n" +
            "WHERE m1.date_stat = m2.date_stat\n" +
            "ORDER BY m1.date_stat")
    List<Map<String, Object>> select();
}
