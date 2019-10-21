package com.dfjinxin.population.server.modules.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;

import com.dfjinxin.population.server.modules.dao.T01LabrPopuRatioDao;
import com.dfjinxin.population.api.entity.T01LabrPopuRatio;
import com.dfjinxin.population.server.modules.service.T01LabrPopuRatioService;


@Service("t01LabrPopuRatioService")
public class T01LabrPopuRatioServiceImpl extends ServiceImpl<T01LabrPopuRatioDao, T01LabrPopuRatio> implements T01LabrPopuRatioService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T01LabrPopuRatio> page = this.page(
                new Query<T01LabrPopuRatio>().getPage(params),
                new QueryWrapper<T01LabrPopuRatio>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T01LabrPopuRatio> getList(Map<String, Object> params) {
        String areaCode = (String)params.get("area_code");
        String dateStat = (String)params.get("date_stat");
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(StringUtils.isNotEmpty(areaCode), "area_code", areaCode);
        wrapper.eq(StringUtils.isNotEmpty(areaCode), "date_stat", dateStat);

        return baseMapper.selectList(wrapper);
    }
}
