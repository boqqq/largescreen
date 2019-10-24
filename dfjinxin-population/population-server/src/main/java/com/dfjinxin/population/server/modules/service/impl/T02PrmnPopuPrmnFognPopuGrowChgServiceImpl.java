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

import com.dfjinxin.population.server.modules.dao.T02PrmnPopuPrmnFognPopuGrowChgDao;
import com.dfjinxin.population.api.entity.T02PrmnPopuPrmnFognPopuGrowChg;
import com.dfjinxin.population.server.modules.service.T02PrmnPopuPrmnFognPopuGrowChgService;


@Service("t02PrmnPopuPrmnFognPopuGrowChgService")
public class T02PrmnPopuPrmnFognPopuGrowChgServiceImpl extends ServiceImpl<T02PrmnPopuPrmnFognPopuGrowChgDao, T02PrmnPopuPrmnFognPopuGrowChg> implements T02PrmnPopuPrmnFognPopuGrowChgService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T02PrmnPopuPrmnFognPopuGrowChg> page = this.page(
                new Query<T02PrmnPopuPrmnFognPopuGrowChg>().getPage(params),
                new QueryWrapper<T02PrmnPopuPrmnFognPopuGrowChg>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T02PrmnPopuPrmnFognPopuGrowChg> getList(Map<String, Object> params) {
        params.put("order","date_stat");
        params.put("limit","10");
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        return baseMapper.selectList(wrapper);
    }


}