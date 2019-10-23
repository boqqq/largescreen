package com.dfjinxin.population.server.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dfjinxin.population.api.entity.T06BringChgFeat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Select("SELECT t.date_stat,t.yty_growth,t.unit FROM t06_bring_chg_feat t\n" +
            "ORDER BY t.date_stat")
    List<T06BringChgFeat> select();
}
