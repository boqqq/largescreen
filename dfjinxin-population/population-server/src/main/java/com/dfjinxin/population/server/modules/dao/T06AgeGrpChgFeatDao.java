package com.dfjinxin.population.server.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dfjinxin.population.api.entity.T06AgeGrpChgFeat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 年龄组迁徙变化特征
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:10:02
 */
@Repository
@Mapper
public interface T06AgeGrpChgFeatDao extends BaseMapper<T06AgeGrpChgFeat> {

    @Select("SELECT t.date_stat,t.unit,t.unit_type,t.gender,t.yty_growth FROM t06_age_grp_chg_feat t\n" +
            "GROUP BY t.unit_type,t.date_stat\n" +
            "ORDER BY t.date_stat,t.unit_type")
    List<T06AgeGrpChgFeat> select();
}
