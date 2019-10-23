package com.dfjinxin.commons.core.util;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

public class WrapperUtils {

    public static QueryWrapper createWrapper (Map<String, Object> params) {
        String areaCode = (String)params.get("areaCode");
        String dateStat = (String)params.get("dateStat");
        String order = (String)params.get("order");
        String limit = (String)params.get("limit");
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(StringUtils.isNotEmpty(areaCode), "area_code", areaCode);
        wrapper.eq(StringUtils.isNotEmpty(dateStat), "date_stat", dateStat);
        if (StringUtils.isNotEmpty(order)) {
            wrapper.orderByDesc(order);
        }
        if (StringUtils.isNotEmpty(limit)) {
            wrapper.last("limit 0 , " + Integer.parseInt(limit));
        }
        return wrapper;
    }
    public static QueryWrapper createWrapper2 (Map<String, Object> params) {
        String areaCode = (String)params.get("areaCode");
        String dateStat = (String)params.get("dateStat");
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(StringUtils.isNotEmpty(areaCode), "area_code", areaCode);
        wrapper.eq(StringUtils.isNotEmpty(dateStat), "date_stat", dateStat);
        wrapper.orderByAsc(new String[]{"area_code","date_stat"});

        return wrapper;
    }
}
