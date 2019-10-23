package com.dfjinxin.population.server.modules.dao;

import com.dfjinxin.population.api.entity.T07QltyFstNm;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 10:05:50
 */
@Repository
@Mapper
public interface T07QltyFstNmDao extends BaseMapper<T07QltyFstNm> {

    @Select("SELECT t.*  FROM t07_qlty_fst_nm t,(SELECT MAX(date_stat) max_date  FROM t07_qlty_fst_nm ) t1\n" +
            "WHERE t.date_stat = t1.max_date\n" +
            "ORDER BY t.Qlty_Fst_Nm*1 ")
    List<T07QltyFstNm> select(Map<String, Object> params);

    @Select("SELECT m1.GDP gdp,m1.gdp_yty_growth,m2.egr_coef,m2.egr_yty_growth,\n" +
            "m3.yty_growth_01,m3.yty_growth_02,m41.age_yty_growth1,m42.age_yty_growth2,\n" +
            "m51.old_yty_growth1,m52.old_yty_growth2,m61.totl_yty_growth1,m62.totl_yty_growth2\n" +
            " FROM \n" +
            "(SELECT t1.GDP,t1.yty_growth gdp_yty_growth FROM T07_Pers_Zone_GDP t1\n" +
            "ORDER  BY t1.date_stat DESC\n" +
            "LIMIT 1) m1,\n" +
            "(SELECT t2.egr_coef,t2.yty_growth egr_yty_growth FROM T07_Ave_Ege_Coef t2\n" +
            "ORDER  BY t2.date_stat DESC\n" +
            "LIMIT 1) m2,\n" +
            "(SELECT t3.yty_growth_01,t3.yty_growth_02 FROM T07_Popu_Grow_Rate t3\n" +
            "ORDER  BY t3.date_stat DESC\n" +
            "LIMIT 1) m3,\n" +
            "(SELECT t4.yty_growth age_yty_growth1 FROM T07_Then_Aged_Coef t4\n" +
            "WHERE t4.unit_type = '老年系数'\n" +
            "ORDER  BY t4.date_stat DESC\n" +
            "LIMIT 1) m41,\n" +
            "(SELECT t41.yty_growth age_yty_growth2 FROM T07_Then_Aged_Coef t41\n" +
            "WHERE t41.unit_type = '同比增长率'\n" +
            "ORDER  BY t41.date_stat DESC\n" +
            "LIMIT 1) m42,\n" +
            "(SELECT t5.yty_growth old_yty_growth1 FROM T07_Old_Sht_Vs t5\n" +
            "WHERE t5.unit_type = '老少比'\n" +
            "ORDER  BY t5.date_stat DESC\n" +
            "LIMIT 1) m51,\n" +
            "(SELECT t51.yty_growth old_yty_growth2 FROM T07_Old_Sht_Vs t51\n" +
            "WHERE t51.unit_type = '同比增长率'\n" +
            "ORDER  BY t51.date_stat DESC\n" +
            "LIMIT 1) m52,\n" +
            "(SELECT t6.yty_growth totl_yty_growth1 FROM T07_Totl_Bring_Vs t6\n" +
            "WHERE t6.unit_type = '总抚养比'\n" +
            "ORDER  BY t6.date_stat DESC\n" +
            "LIMIT 1) m61,\n" +
            "(SELECT t61.yty_growth totl_yty_growth2 FROM T07_Totl_Bring_Vs t61\n" +
            "WHERE t61.unit_type = '同比增长率'\n" +
            "ORDER  BY t61.date_stat DESC\n" +
            "LIMIT 1) m62")
    List<Map<String, Object>> leftIndex();

    @Select("SELECT m1.acreage1,m11.acreage2,m2.coef1,m21.coef2 FROM \n" +
            "(SELECT t1.acreage acreage1 FROM T07_Pers_Hous_Area t1\n" +
            "WHERE t1.type_desc = '本期-乡村'\n" +
            "ORDER BY t1.date_stat DESC \n" +
            "LIMIT 1) m1,\n" +
            "(SELECT t1.acreage acreage2 FROM T07_Pers_Hous_Area t1\n" +
            "WHERE t1.type_desc = '本期-城镇'\n" +
            "ORDER BY t1.date_stat DESC\n" +
            "LIMIT 1) m11,\n" +
            "(SELECT t2.value coef1  FROM T07_Ege_Coef t2\n" +
            "WHERE t2.type_desc = '农村恩格尔'\n" +
            "ORDER BY t2.date_stat DESC\n" +
            "LIMIT 1) m2,\n" +
            "(SELECT t21.value coef2 FROM T07_Ege_Coef t21\n" +
            "WHERE t21.type_desc = '城镇恩格尔'\n" +
            "ORDER BY t21.date_stat DESC\n" +
            "LIMIT 1) m21")
    List<Map<String, Object>> bottomIndex1();

    @Select("SELECT m1.popu_denst,m2.green_area,m3.watr_qty,m4.consm_qty FROM\n" +
            "(SELECT t1.popu_denst FROM T07_Popu_Denst t1\n" +
            "ORDER BY t1.date_stat\n" +
            "LIMIT 1) m1,\n" +
            "(SELECT t2.green_area FROM T07_Pers_Green_Plc_Area t2\n" +
            "ORDER BY t2.date_stat\n" +
            "LIMIT 1) m2,\n" +
            "(SELECT t3.watr_qty FROM T07_Pers_Day_Watr_Qty t3\n" +
            "ORDER BY t3.date_stat\n" +
            "LIMIT 1) m3,\n" +
            "(SELECT t4.consm_qty FROM T07_Pers_Src_Consm_Qty t4\n" +
            "ORDER BY t4.date_stat\n" +
            "LIMIT 1) m4")
    List<Map<String, Object>> bottomIndex2();

    @Select("SELECT m1.doct_cnt_num,m2.bed_digit_num,m3.insud_rate_num,m4.total_fee,m5.year_num FROM\n" +
            "\t(SELECT t1.Doct_Cnt_num doct_cnt_num FROM T07_Popu_Own_Doct_Cnt t1\n" +
            "\tORDER BY t1.date_stat\n" +
            "\tLIMIT 1) m1,\n" +
            "\t(SELECT t2.Bed_Digit_num bed_digit_num FROM T07_Popu_Own_Bed_Digit t2\n" +
            "\tORDER BY t2.date_stat\n" +
            "\tLIMIT 1) m2,\n" +
            "\t(SELECT t3.Insud_Rate_num insud_rate_num FROM T07_NCMS_Insud_Rate t3\n" +
            "\tORDER BY t3.date_stat\n" +
            "\tLIMIT 1) m3,\n" +
            "\t(SELECT t4.total_fee FROM T07_Pers_Hlth_Totl_Fee t4\n" +
            "\tORDER BY t4.date_stat\n" +
            "\tLIMIT 1) m4,\n" +
            "\t(SELECT t5.year_num FROM T07_Pers_Recv_Edu_Yrs t5\n" +
            "\tORDER BY t5.date_stat\n" +
            "\tLIMIT 1) m5")
    List<Map<String, Object>> bottomIndex3();
}
