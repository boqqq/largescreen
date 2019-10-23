package com.dfjinxin.population.server.modules.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;
import com.dfjinxin.population.api.entity.T06AgingPopuStruAndTrnd;
import com.dfjinxin.population.server.modules.dao.T06AgingPopuStruAndTrndDao;
import com.dfjinxin.population.server.modules.service.T06AgingPopuStruAndTrndService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("t06AgingPopuStruAndTrndService")
public class T06AgingPopuStruAndTrndServiceImpl extends ServiceImpl<T06AgingPopuStruAndTrndDao, T06AgingPopuStruAndTrnd> implements T06AgingPopuStruAndTrndService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T06AgingPopuStruAndTrnd> page = this.page(
                new Query<T06AgingPopuStruAndTrnd>().getPage(params),
                new QueryWrapper<T06AgingPopuStruAndTrnd>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T06AgingPopuStruAndTrnd> select(Map<String, Object> params) {
        List<T06AgingPopuStruAndTrnd> page = baseMapper.select();

        return page;
    }

}