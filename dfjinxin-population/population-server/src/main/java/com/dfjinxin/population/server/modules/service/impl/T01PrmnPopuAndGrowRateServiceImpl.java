package com.dfjinxin.population.server.modules.service.impl;

import com.dfjinxin.commons.core.util.WrapperUtils;
import com.dfjinxin.population.api.entity.T01HousdRgstPopuGrowRate;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;

import com.dfjinxin.population.server.modules.dao.T01PrmnPopuAndGrowRateDao;
import com.dfjinxin.population.api.entity.T01PrmnPopuAndGrowRate;
import com.dfjinxin.population.server.modules.service.T01PrmnPopuAndGrowRateService;


@Service("t01PrmnPopuAndGrowRateService")
public class T01PrmnPopuAndGrowRateServiceImpl extends ServiceImpl<T01PrmnPopuAndGrowRateDao, T01PrmnPopuAndGrowRate> implements T01PrmnPopuAndGrowRateService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T01PrmnPopuAndGrowRate> page = this.page(
                new Query<T01PrmnPopuAndGrowRate>().getPage(params),
                new QueryWrapper<T01PrmnPopuAndGrowRate>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T01PrmnPopuAndGrowRate> getList(Map<String, Object> params) {
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        List<T01PrmnPopuAndGrowRate> list = baseMapper.selectList(wrapper);
        if (StringUtils.isNotEmpty((String)params.get("order"))) {
            Collections.reverse(list);
        }
        return list;
    }

    @Override
    public List<T01PrmnPopuAndGrowRate> select() {
        return baseMapper.select();
    }
}
