package com.dfjinxin.population.server.modules.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;
import com.dfjinxin.population.api.entity.T03ZoneFlowOutCibutePct;
import com.dfjinxin.population.server.modules.dao.T03ZoneFlowOutCibutePctDao;
import com.dfjinxin.population.server.modules.service.T03ZoneFlowOutCibutePctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("t03ZoneFlowOutCibutePctService")
public class T03ZoneFlowOutCibutePctServiceImpl extends ServiceImpl<T03ZoneFlowOutCibutePctDao, T03ZoneFlowOutCibutePct> implements T03ZoneFlowOutCibutePctService {

    @Autowired
    private T03ZoneFlowOutCibutePctDao t03ZoneFlowOutCibutePctDao;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T03ZoneFlowOutCibutePct> page = this.page(
                new Query<T03ZoneFlowOutCibutePct>().getPage(params),
                new QueryWrapper<T03ZoneFlowOutCibutePct>()
        );

        return new PageUtils(page);
    }
    @Override
    public Map<String, List<String>> findAll(){
        List<String> list1=t03ZoneFlowOutCibutePctDao.find2016All().stream().map(v->v.getYtyGrowth()).collect(Collectors.toList());
        List<String> list2=t03ZoneFlowOutCibutePctDao.find2017All().stream().map(v->v.getYtyGrowth()).collect(Collectors.toList());
        list1.add(0,"0");
        list2.add(11,"0");
        Map<String,List<String>> resultMap = new HashMap<>();
        resultMap.put("2016",list1);
        resultMap.put("2017",list2);
        resultMap.put("areas",t03ZoneFlowOutCibutePctDao.areas());
        resultMap.put("years",t03ZoneFlowOutCibutePctDao.years());
        return resultMap;
    }
}