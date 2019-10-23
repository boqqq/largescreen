package com.dfjinxin.population.server.modules.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;
import com.dfjinxin.population.api.entity.T03PrmnPopuAgeStru5YrChg;
import com.dfjinxin.population.server.modules.dao.T03PrmnPopuAgeStru5YrChgDao;
import com.dfjinxin.population.server.modules.service.T03PrmnPopuAgeStru5YrChgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("t03PrmnPopuAgeStru5YrChgService")
public class T03PrmnPopuAgeStru5YrChgServiceImpl extends ServiceImpl<T03PrmnPopuAgeStru5YrChgDao, T03PrmnPopuAgeStru5YrChg> implements T03PrmnPopuAgeStru5YrChgService {

    @Autowired
    private T03PrmnPopuAgeStru5YrChgDao t03PrmnPopuAgeStru5YrChgDao;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T03PrmnPopuAgeStru5YrChg> page = this.page(
                new Query<T03PrmnPopuAgeStru5YrChg>().getPage(params),
                new QueryWrapper<T03PrmnPopuAgeStru5YrChg>()
        );

        return new PageUtils(page);
    }

    @Override
    public Map<String,List<String>> findAll(){
        List<String> list1=t03PrmnPopuAgeStru5YrChgDao.find2015All().stream().map(v->v.getYtyGrowth()).collect(Collectors.toList());
        List<String> list2=t03PrmnPopuAgeStru5YrChgDao.find2019All().stream().map(v->v.getYtyGrowth()).collect(Collectors.toList());
        Map<String,List<String>> resultMap=new HashMap();
        resultMap.put("2015",list1);
        resultMap.put("2019",list2);
        return resultMap;
    }

}