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

import com.dfjinxin.population.server.modules.dao.T02LabrPopuGrowRateChgTrndDao;
import com.dfjinxin.population.api.entity.T02LabrPopuGrowRateChgTrnd;
import com.dfjinxin.population.server.modules.service.T02LabrPopuGrowRateChgTrndService;


@Service("t02LabrPopuGrowRateChgTrndService")
public class T02LabrPopuGrowRateChgTrndServiceImpl extends ServiceImpl<T02LabrPopuGrowRateChgTrndDao, T02LabrPopuGrowRateChgTrnd> implements T02LabrPopuGrowRateChgTrndService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T02LabrPopuGrowRateChgTrnd> page = this.page(
                new Query<T02LabrPopuGrowRateChgTrnd>().getPage(params),
                new QueryWrapper<T02LabrPopuGrowRateChgTrnd>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T02LabrPopuGrowRateChgTrnd> getList(Map<String, Object> params) {
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        return baseMapper.selectList(wrapper);
    }

}