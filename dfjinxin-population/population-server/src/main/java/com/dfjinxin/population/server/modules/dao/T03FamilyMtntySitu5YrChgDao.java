package com.dfjinxin.population.server.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dfjinxin.population.api.entity.T03FamilyMtntySitu5YrChg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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

    @Select("select * from (select distinct(date_stat)as date_stat from t03_family_mtnty_situ_5_yr_chg ORDER BY date_stat desc limit 5)a ORDER BY date_stat")
    List<Integer> findYears();

    @Select("select distinct(yty_num),birth_type from t03_family_mtnty_situ_5_yr_chg order by yty_num")
    List<T03FamilyMtntySitu5YrChg> birthTypes();

    @Select("<script>" +
            "SELECT * FROM `t03_family_mtnty_situ_5_yr_chg` " +
            "where yty_num=#{ytyNum} " +
            "and date_stat in " +
            "<foreach collection='date' item='item' open='(' separator=',' close=')'>" +
            "#{item}" +
            "</foreach>" +
            "order by date_stat" +
            "</script>")
    List<T03FamilyMtntySitu5YrChg> findAll(@Param("ytyNum") Integer ytyNum,
                                            @Param("date") List<Integer> date);

}
