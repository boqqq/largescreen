package com.dfjinxin.population.server.modules.service.impl;

import com.dfjinxin.commons.core.util.WrapperUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;

import com.dfjinxin.population.server.modules.dao.T01HousdRgstPopuGrowRateDao;
import com.dfjinxin.population.api.entity.T01HousdRgstPopuGrowRate;
import com.dfjinxin.population.server.modules.service.T01HousdRgstPopuGrowRateService;


@Service("t01HousdRgstPopuGrowRateService")
public class T01HousdRgstPopuGrowRateServiceImpl extends ServiceImpl<T01HousdRgstPopuGrowRateDao, T01HousdRgstPopuGrowRate> implements T01HousdRgstPopuGrowRateService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T01HousdRgstPopuGrowRate> page = this.page(
                new Query<T01HousdRgstPopuGrowRate>().getPage(params),
                new QueryWrapper<T01HousdRgstPopuGrowRate>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T01HousdRgstPopuGrowRate> getList(Map<String, Object> params) {
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        return baseMapper.selectList(wrapper);
    }

    @Override
    public List<T01HousdRgstPopuGrowRate> select() {
        return baseMapper.select();
    }
}
