package com.dfjinxin.population.server.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dfjinxin.population.api.entity.T03LabrPopuStruChg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 劳动力人口结构变化
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@Repository
@Mapper
public interface T03LabrPopuStruChgDao extends BaseMapper<T03LabrPopuStruChg> {

    @Select("select * from t03_labr_popu_stru_chg where type=1 order by date_stat")
    List<T03LabrPopuStruChg> findTypeOne();

    @Select("select * from t03_labr_popu_stru_chg where type=2 order by date_stat")
    List<T03LabrPopuStruChg> findTypeTwo();

    @Select("select * from t03_labr_popu_stru_chg where type=3 order by date_stat")
    List<T03LabrPopuStruChg> findTypeThree();
}
