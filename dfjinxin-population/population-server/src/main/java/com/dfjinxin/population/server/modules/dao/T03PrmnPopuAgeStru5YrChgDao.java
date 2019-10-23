package com.dfjinxin.population.server.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dfjinxin.population.api.entity.T03PrmnPopuAgeStru5YrChg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 常住人口年龄结构5年变迁
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@Repository
@Mapper
public interface T03PrmnPopuAgeStru5YrChgDao extends BaseMapper<T03PrmnPopuAgeStru5YrChg> {

    @Select("select * from t03_prmn_popu_age_stru_5_yr_chg where date_stat=2015 order by age_Period")
    List<T03PrmnPopuAgeStru5YrChg> find2015All();
    @Select("select * from t03_prmn_popu_age_stru_5_yr_chg where date_stat=2019 order by age_Period")
    List<T03PrmnPopuAgeStru5YrChg> find2019All();
}
