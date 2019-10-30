package com.dfjinxin.population.server.modules.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;
import com.dfjinxin.population.api.entity.T03ZoneFlowInCibutePct;
import com.dfjinxin.population.api.entity.T03ZoneFlowOutCibutePct;
import com.dfjinxin.population.server.modules.dao.T03ZoneFlowInCibutePctDao;
import com.dfjinxin.population.server.modules.service.T03ZoneFlowInCibutePctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service("t03ZoneFlowInCibutePctService")
public class T03ZoneFlowInCibutePctServiceImpl extends ServiceImpl<T03ZoneFlowInCibutePctDao, T03ZoneFlowInCibutePct> implements T03ZoneFlowInCibutePctService {

    @Autowired
    private T03ZoneFlowInCibutePctDao t03ZoneFlowInCibutePctDao;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T03ZoneFlowInCibutePct> page = this.page(
                new Query<T03ZoneFlowInCibutePct>().getPage(params),
                new QueryWrapper<T03ZoneFlowInCibutePct>()
        );

        return new PageUtils(page);
    }
    @Override
    public List<T03ZoneFlowOutCibutePct> findAll(){
        List<T03ZoneFlowOutCibutePct> page = baseMapper.findAll();
        return page;
    }
}