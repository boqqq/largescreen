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

import com.dfjinxin.population.server.modules.dao.T01PrmnPopuDao;
import com.dfjinxin.population.api.entity.T01PrmnPopu;
import com.dfjinxin.population.server.modules.service.T01PrmnPopuService;


@Service("t01PrmnPopuService")
public class T01PrmnPopuServiceImpl extends ServiceImpl<T01PrmnPopuDao, T01PrmnPopu> implements T01PrmnPopuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T01PrmnPopu> page = this.page(
                new Query<T01PrmnPopu>().getPage(params),
                new QueryWrapper<T01PrmnPopu>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T01PrmnPopu> getList(Map<String, Object> params) {
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        return baseMapper.selectList(wrapper);
    }

    @Override
    public List<T01PrmnPopu> select() {
        return baseMapper.select();
    }
}
