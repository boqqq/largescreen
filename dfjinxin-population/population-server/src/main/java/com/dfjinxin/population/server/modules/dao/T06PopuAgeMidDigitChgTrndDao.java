package com.dfjinxin.population.server.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dfjinxin.population.api.entity.T06PopuAgeMidDigitChgTrnd;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 人口年龄中位数变化趋势
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:10:02
 */
@Repository
@Mapper
public interface T06PopuAgeMidDigitChgTrndDao extends BaseMapper<T06PopuAgeMidDigitChgTrnd> {

    @Select("SELECT t.date_stat,t.unit,t.middle_cnt,t.popu_type from t06_popu_age_mid_digit_chg_trnd t \n" +
            "GROUP BY t.popu_type,t.date_stat\n" +
            "ORDER BY t.date_stat")
    List<T06PopuAgeMidDigitChgTrnd> select();
}
