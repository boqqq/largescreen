package com.dfjinxin.population.server.modules.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;
import com.dfjinxin.population.api.entity.T03ZoneFlowInCibutePct;
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
    public Map findAll(){
        List<T03ZoneFlowInCibutePct> list1=t03ZoneFlowInCibutePctDao.find2016All();
        List<T03ZoneFlowInCibutePct> list2=t03ZoneFlowInCibutePctDao.find2017All();
        List<Map<String,String>> resultList1 = new ArrayList<>();
        List<Map<String,String>> resultList2 = new ArrayList<>();
        for(T03ZoneFlowInCibutePct t:list1){
            Map<String,String> tmp=new HashMap<>();
            tmp.put("xdate",t.getAreaName());
            tmp.put("enName",t.getAreaName());
            tmp.put("value",t.getYtyGrowth());
            resultList1.add(tmp);
        }
        for(T03ZoneFlowInCibutePct t:list2){
            Map<String,String> tmp=new HashMap<>();
            tmp.put("xdate",t.getAreaName());
            tmp.put("enName",t.getAreaName());
            tmp.put("value",t.getYtyGrowth());
            resultList2.add(tmp);
        }
        Map resultMap = new HashMap<>();
        resultMap.put("2016",resultList1);
        resultMap.put("2017",resultList2);
        return resultMap;
    }
}