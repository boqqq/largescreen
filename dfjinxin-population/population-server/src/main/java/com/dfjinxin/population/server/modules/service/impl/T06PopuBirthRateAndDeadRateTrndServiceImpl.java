package com.dfjinxin.population.server.modules.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;
import com.dfjinxin.population.api.entity.T06PopuBirthRateAndDeadRateTrnd;
import com.dfjinxin.population.server.modules.dao.T06PopuBirthRateAndDeadRateTrndDao;
import com.dfjinxin.population.server.modules.service.T06PopuBirthRateAndDeadRateTrndService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("t06PopuBirthRateAndDeadRateTrndService")
public class T06PopuBirthRateAndDeadRateTrndServiceImpl extends ServiceImpl<T06PopuBirthRateAndDeadRateTrndDao, T06PopuBirthRateAndDeadRateTrnd> implements T06PopuBirthRateAndDeadRateTrndService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T06PopuBirthRateAndDeadRateTrnd> page = this.page(
                new Query<T06PopuBirthRateAndDeadRateTrnd>().getPage(params),
                new QueryWrapper<T06PopuBirthRateAndDeadRateTrnd>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T06PopuBirthRateAndDeadRateTrnd> select(Map<String, Object> params) {
        List<T06PopuBirthRateAndDeadRateTrnd> page = baseMapper.select(params);

        return page;
    }

}