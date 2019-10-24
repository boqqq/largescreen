package com.dfjinxin.population.server.modules.service.impl;

import com.dfjinxin.commons.core.util.WrapperUtils;
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

import com.dfjinxin.population.server.modules.dao.T04WorkPopuGrowRateTrndDao;
import com.dfjinxin.population.api.entity.T04WorkPopuGrowRateTrnd;
import com.dfjinxin.population.server.modules.service.T04WorkPopuGrowRateTrndService;


@Service("t04WorkPopuGrowRateTrndService")
public class T04WorkPopuGrowRateTrndServiceImpl extends ServiceImpl<T04WorkPopuGrowRateTrndDao, T04WorkPopuGrowRateTrnd> implements T04WorkPopuGrowRateTrndService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T04WorkPopuGrowRateTrnd> page = this.page(
                new Query<T04WorkPopuGrowRateTrnd>().getPage(params),
                new QueryWrapper<T04WorkPopuGrowRateTrnd>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T04WorkPopuGrowRateTrnd> getList(Map<String, Object> params) {
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        List<T04WorkPopuGrowRateTrnd> list = baseMapper.selectList(wrapper);
        if (StringUtils.isNotEmpty((String)params.get("order"))) {
            Collections.reverse(list);
        }
        return list;
    }
}
