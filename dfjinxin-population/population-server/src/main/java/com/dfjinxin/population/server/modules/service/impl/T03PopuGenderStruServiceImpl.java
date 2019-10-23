package com.dfjinxin.population.server.modules.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;
import com.dfjinxin.population.api.entity.T03PopuGenderStru;
import com.dfjinxin.population.server.modules.dao.T03PopuGenderStruDao;
import com.dfjinxin.population.server.modules.service.T03PopuGenderStruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("t03PopuGenderStruService")
public class T03PopuGenderStruServiceImpl extends ServiceImpl<T03PopuGenderStruDao, T03PopuGenderStru> implements T03PopuGenderStruService {

    @Autowired
    private T03PopuGenderStruDao t03PopuGenderStruDao;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T03PopuGenderStru> page = this.page(
                new Query<T03PopuGenderStru>().getPage(params),
                new QueryWrapper<T03PopuGenderStru>()
        );

        return new PageUtils(page);
    }

    @Override
    public Map<String,List<String>> findAll(){
        List<String> manList = t03PopuGenderStruDao.findManAll().stream().map(v->v.getYtyGrowth()).collect(Collectors.toList());
        List<String> womanList = t03PopuGenderStruDao.findWomanAll().stream().map(v->'-'+v.getYtyGrowth()).collect(Collectors.toList());
        Map<String,List<String>> resultMap = new HashMap<>();
        resultMap.put("man",manList);
        resultMap.put("woman",womanList);
        return resultMap;
    }
}