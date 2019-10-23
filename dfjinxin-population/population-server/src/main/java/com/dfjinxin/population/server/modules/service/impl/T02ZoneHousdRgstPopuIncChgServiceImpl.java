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

import com.dfjinxin.population.server.modules.dao.T02ZoneHousdRgstPopuIncChgDao;
import com.dfjinxin.population.api.entity.T02ZoneHousdRgstPopuIncChg;
import com.dfjinxin.population.server.modules.service.T02ZoneHousdRgstPopuIncChgService;


@Service("t02ZoneHousdRgstPopuIncChgService")
public class T02ZoneHousdRgstPopuIncChgServiceImpl extends ServiceImpl<T02ZoneHousdRgstPopuIncChgDao, T02ZoneHousdRgstPopuIncChg> implements T02ZoneHousdRgstPopuIncChgService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T02ZoneHousdRgstPopuIncChg> page = this.page(
                new Query<T02ZoneHousdRgstPopuIncChg>().getPage(params),
                new QueryWrapper<T02ZoneHousdRgstPopuIncChg>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T02ZoneHousdRgstPopuIncChg> getList(Map<String, Object> params) {
         Wrapper<T02ZoneHousdRgstPopuIncChg> wrapper=  WrapperUtils.createWrapper2(params);
         return baseMapper.selectList(wrapper);
    }

}