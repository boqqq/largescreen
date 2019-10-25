package com.dfjinxin.population.server.modules.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;
import com.dfjinxin.population.api.entity.T03FamilyMtntySitu5YrChg;
import com.dfjinxin.population.server.modules.dao.T03FamilyMtntySitu5YrChgDao;
import com.dfjinxin.population.server.modules.service.T03FamilyMtntySitu5YrChgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("t03FamilyMtntySitu5YrChgService")
public class T03FamilyMtntySitu5YrChgServiceImpl extends ServiceImpl<T03FamilyMtntySitu5YrChgDao, T03FamilyMtntySitu5YrChg> implements T03FamilyMtntySitu5YrChgService {

    @Autowired
    private T03FamilyMtntySitu5YrChgDao t03FamilyMtntySitu5YrChgDao;

    List<Integer> yearList = new ArrayList<>();

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T03FamilyMtntySitu5YrChg> page = this.page(
                new Query<T03FamilyMtntySitu5YrChg>().getPage(params),
                new QueryWrapper<T03FamilyMtntySitu5YrChg>()
        );

        return new PageUtils(page);
    }

    @Override
    public Map findAll(){
       List<Integer> yearList = t03FamilyMtntySitu5YrChgDao.findYears();
       List<T03FamilyMtntySitu5YrChg> typeList = t03FamilyMtntySitu5YrChgDao.birthTypes();
       Map resultMap=new HashMap();
       resultMap.put("years",yearList);
       for(T03FamilyMtntySitu5YrChg fam:typeList){
           resultMap.put(fam.getBirthType(),t03FamilyMtntySitu5YrChgDao.findAll(Integer.parseInt(fam.getYtyNum()),yearList).stream().map(T03FamilyMtntySitu5YrChg::getYtyGrowth).collect(Collectors.toList()));
       }
        resultMap.put("types",typeList.stream().map(T03FamilyMtntySitu5YrChg::getBirthType).collect(Collectors.toList()));
        return resultMap;
    }

}