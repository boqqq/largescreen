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

import com.dfjinxin.population.server.modules.dao.T01LiqdPopuAndGrowRateDao;
import com.dfjinxin.population.api.entity.T01LiqdPopuAndGrowRate;
import com.dfjinxin.population.server.modules.service.T01LiqdPopuAndGrowRateService;


@Service("t01LiqdPopuAndGrowRateService")
public class T01LiqdPopuAndGrowRateServiceImpl extends ServiceImpl<T01LiqdPopuAndGrowRateDao, T01LiqdPopuAndGrowRate> implements T01LiqdPopuAndGrowRateService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T01LiqdPopuAndGrowRate> page = this.page(
                new Query<T01LiqdPopuAndGrowRate>().getPage(params),
                new QueryWrapper<T01LiqdPopuAndGrowRate>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T01LiqdPopuAndGrowRate> getList(Map<String, Object> params) {
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        return baseMapper.selectList(wrapper);
    }
}
