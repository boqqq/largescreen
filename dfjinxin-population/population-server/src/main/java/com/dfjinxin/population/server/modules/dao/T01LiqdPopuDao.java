package com.dfjinxin.population.server.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dfjinxin.population.api.entity.T01LiqdPopu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 流动人口
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:04
 */
@Repository
@Mapper
public interface T01LiqdPopuDao extends BaseMapper<T01LiqdPopu> {
    @Select("SELECT m1.popu_total1,m11.popu_rate1,m2.popu_total2,m21.popu_rate2,m3.popu_total3,m31.popu_rate3,\n" +
            "m4.proportion,m4.yty_growth4,m5.yty_growth,m51.pct_rate,m6.middle_cnt FROM\n" +
            "  (SELECT t1.popu_total popu_total1 FROM T01_Prmn_Popu t1\n" +
            "  WHERE t1.area_code = '460000000000'\n" +
            "  AND t1.unit_type = '人口数量'\n" +
            "  ORDER BY t1.date_stat\n" +
            "  LIMIT 1) m1,\n" +
            "    (SELECT t11.popu_total popu_rate1 FROM T01_Prmn_Popu t11\n" +
            "  WHERE t11.area_code = '460000000000'\n" +
            "  AND t11.unit_type = '同比'\n" +
            "  ORDER BY t11.date_stat\n" +
            "  LIMIT 1) m11,\n" +
            "    (SELECT t2.popu_total popu_total2 FROM T01_Housd_Rgst_Popu t2\n" +
            "  WHERE t2.area_code = '460000000000'\n" +
            "  AND t2.unit_type = '人口数量'\n" +
            "  ORDER BY t2.date_stat\n" +
            "  LIMIT 1) m2,\n" +
            "    (SELECT t21.popu_total popu_rate2 FROM T01_Housd_Rgst_Popu t21\n" +
            "  WHERE t21.area_code = '460000000000'\n" +
            "  AND t21.unit_type = '同比'\n" +
            "  ORDER BY t21.date_stat\n" +
            "  LIMIT 1) m21,\n" +
            "    (SELECT t3.popu_total popu_total3 FROM T01_Liqd_Popu t3\n" +
            "  WHERE t3.area_code = '460000000000'\n" +
            "  AND t3.unit_type = '人口数量'\n" +
            "  ORDER BY t3.date_stat\n" +
            "  LIMIT 1) m3,\n" +
            "    (SELECT t31.popu_total popu_rate3 FROM T01_Liqd_Popu t31\n" +
            "  WHERE t31.area_code = '460000000000'\n" +
            "  AND t31.unit_type = '同比'\n" +
            "  ORDER BY t31.date_stat\n" +
            "  LIMIT 1) m31,\n" +
            "    (SELECT t4.proportion,t4.yty_growth yty_growth4 FROM T01_Labr_Popu_Ratio t4\n" +
            "  ORDER BY t4.date_stat\n" +
            "  LIMIT 1) m4,\n" +
            "    (SELECT t5.yty_growth,t5.yty_growth pct_rate FROM T01_Aging_Popu_Pct t5\n" +
            "\t\tWHERE t5.unit_type = '人口占比'\n" +
            "  ORDER BY t5.date_stat\n" +
            "  LIMIT 1) m5,\n" +
            " (SELECT t51.yty_growth pct_rate FROM T01_Aging_Popu_Pct t51\n" +
            "\tWHERE t51.unit_type = '同比'\n" +
            "  ORDER BY t51.date_stat\n" +
            "  LIMIT 1) m51,\n" +
            "    (SELECT t6.middle_cnt FROM T01_Prmn_Popu_Age_Mid_Digit t6\n" +
            "  ORDER BY t6.date_stat\n" +
            "  LIMIT 1) m6\n")
    List<Map<String, Object>> leftIndex();
}
