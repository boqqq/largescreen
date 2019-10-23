package com.dfjinxin.population.server.modules.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.dfjinxin.commons.core.util.WrapperUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;

import com.dfjinxin.population.server.modules.dao.T02ZonePrmnFognPopuIncChgDao;
import com.dfjinxin.population.api.entity.T02ZonePrmnFognPopuIncChg;
import com.dfjinxin.population.server.modules.service.T02ZonePrmnFognPopuIncChgService;


@Service("t02ZonePrmnFognPopuIncChgService")
public class T02ZonePrmnFognPopuIncChgServiceImpl extends ServiceImpl<T02ZonePrmnFognPopuIncChgDao, T02ZonePrmnFognPopuIncChg> implements T02ZonePrmnFognPopuIncChgService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T02ZonePrmnFognPopuIncChg> page = this.page(
                new Query<T02ZonePrmnFognPopuIncChg>().getPage(params),
                new QueryWrapper<T02ZonePrmnFognPopuIncChg>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T02ZonePrmnFognPopuIncChg> getList(Map<String, Object> params) {
        Wrapper<T02ZonePrmnFognPopuIncChg> wrapper= WrapperUtils.createWrapper2(params);
        return baseMapper.selectList(wrapper);
    }

}