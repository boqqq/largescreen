package com.dfjinxin.population.server.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dfjinxin.population.api.entity.T03FamilyMtntySitu5YrChg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:39:27
 */
@Repository
@Mapper
public interface T03FamilyMtntySitu5YrChgDao extends BaseMapper<T03FamilyMtntySitu5YrChg> {

    @Select("select distinct(date_stat) from t03_family_mtnty_situ_5_yr_chg order by date_stat desc")
    List<Integer> findYears();

    @Select("SELECT * FROM `t03_family_mtnty_situ_5_yr_chg` where yty_num=1 order by date_stat desc")
    List<T03FamilyMtntySitu5YrChg> oneChild();

    @Select("SELECT * FROM `t03_family_mtnty_situ_5_yr_chg` where yty_num=2 order by date_stat desc")
    List<T03FamilyMtntySitu5YrChg> twoChild();

    @Select("SELECT * FROM `t03_family_mtnty_situ_5_yr_chg` where yty_num=3 order by date_stat desc")
    List<T03FamilyMtntySitu5YrChg> threeChild();

}
