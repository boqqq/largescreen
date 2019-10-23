package com.dfjinxin.population.server.modules.dao;

import com.dfjinxin.population.api.entity.T04IndsWorkPersMemQtyChgTrnd;
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
 * @date 2019-10-21 17:53:58
 */
@Repository
@Mapper
public interface T04IndsWorkPersMemQtyChgTrndDao extends BaseMapper<T04IndsWorkPersMemQtyChgTrnd> {
    @Select("SET @sql = NULL;\n" +
            "SET @code = '${areaCode}';\n" +
            "SELECT\n" +
            "  GROUP_CONCAT(DISTINCT\n" +
            "    CONCAT(\n" +
            "      'MAX(IF(c.date_stat = ''',\n" +
            "      c.date_stat,\n" +
            "      ''', c.practitioner_num, -0.000000001)) AS ''',\n" +
            "      c.date_stat, ''''\n" +
            "    )\n" +
            "  ) INTO @sql\n" +
            "FROM T04_Inds_Work_Pers_Mem_Qty_Chg_Trnd c;\n" +
            " \n" +
            "SET @sql = CONCAT('Select c.work_type_desc type,', @sql, \n" +
            "                        ' From (select * from T04_Inds_Work_Pers_Mem_Qty_Chg_Trnd t where t.area_code = ''', @code, ''') c Group by c.work_type_desc');\n" +
            "PREPARE stmt FROM @sql;\n" +
            "EXECUTE stmt;\n" +
            "DEALLOCATE PREPARE stmt;")
    List<Map<String, String>> getList(Map<String, Object> map);

    @Select("SELECT DISTINCT\n" +
            "\t(date_stat) dateStat\n" +
            "FROM\n" +
            "\tT04_Inds_Work_Pers_Mem_Qty_Chg_Trnd\n" +
            "WHERE\n" +
            "\tarea_code = '${areaCode}'\n" +
            "ORDER BY\n" +
            "\tdate_stat")
    List<Map<String, String>> getDateList(Map<String, Object> map);
}
