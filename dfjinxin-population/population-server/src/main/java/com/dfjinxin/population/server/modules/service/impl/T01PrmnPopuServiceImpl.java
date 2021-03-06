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
        List<T01PrmnPopu> list = baseMapper.selectList(wrapper);
        if (StringUtils.isNotEmpty((String)params.get("order"))) {
            Collections.reverse(list);
        }
        return list;
    }

    @Override
    public List<Map<String, Object>> select() {
        return baseMapper.select();
    }
}
