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

import java.util.ArrayList;
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
        List<String> aresList = t03ZoneFlowOutCibutePctDao.areas();
        List<String> yearsList = t03ZoneFlowOutCibutePctDao.years();
        Map<String,List<String>> resultMap = new HashMap<>();
        for(String str:yearsList){
            List<T03ZoneFlowOutCibutePct> tmpList=t03ZoneFlowOutCibutePctDao.findAll(Integer.parseInt(str));
            List<String> nameList=t03ZoneFlowOutCibutePctDao.findAll(Integer.parseInt(str)).stream().map(T03ZoneFlowOutCibutePct::getAreaName).collect(Collectors.toList());
            List<String> tempList = new ArrayList<>();
            for(String area:aresList){
                for(T03ZoneFlowOutCibutePct t03 : tmpList){
                    if(area.equals( t03.getAreaName())){
                        tempList.add(t03.getYtyGrowth());
                    }else if(!nameList.contains(area)){
                        tempList.add("0");
                        break;
                    }
                }
            }
            resultMap.put(str,tempList);
        }
        resultMap.put("years",yearsList);
        resultMap.put("areas",aresList);
        return resultMap;
    }
}