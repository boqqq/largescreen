package com.dfjinxin.population.server.modules.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;
import com.dfjinxin.population.api.entity.T03RecvEduDegrStruChg;
import com.dfjinxin.population.server.modules.dao.T03RecvEduDegrStruChgDao;
import com.dfjinxin.population.server.modules.service.T03RecvEduDegrStruChgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("t03RecvEduDegrStruChgService")
public class T03RecvEduDegrStruChgServiceImpl extends ServiceImpl<T03RecvEduDegrStruChgDao, T03RecvEduDegrStruChg> implements T03RecvEduDegrStruChgService {

    @Autowired
    private T03RecvEduDegrStruChgDao t03RecvEduDegrStruChgDao;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T03RecvEduDegrStruChg> page = this.page(
                new Query<T03RecvEduDegrStruChg>().getPage(params),
                new QueryWrapper<T03RecvEduDegrStruChg>()
        );

        return new PageUtils(page);
    }

    @Override
    public Map<String, List<String>> findAll(){
        List<String> yearList = t03RecvEduDegrStruChgDao.findYears().stream().map(v->v.toString()).collect(Collectors.toList());
        List<String> eduList = t03RecvEduDegrStruChgDao.edus();
        Map<String,List<String>> resultMap = new HashMap<>();
        for(String i:yearList){
            List<T03RecvEduDegrStruChg> tmpList = new ArrayList<>();
            resultMap.put(i,t03RecvEduDegrStruChgDao.findAll(i)
                .stream().map(T03RecvEduDegrStruChg::getYtyGrowth).collect(Collectors.toList())
            );
        }
        resultMap.put("years",yearList);
        resultMap.put("edus",eduList);
        return resultMap;
    }
}