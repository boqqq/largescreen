package com.dfjinxin.population.server.modules.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;
import com.dfjinxin.population.api.entity.T03LabrPopuStruChg;
import com.dfjinxin.population.server.modules.dao.T03LabrPopuStruChgDao;
import com.dfjinxin.population.server.modules.service.T03LabrPopuStruChgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("t03LabrPopuStruChgService")
public class T03LabrPopuStruChgServiceImpl extends ServiceImpl<T03LabrPopuStruChgDao, T03LabrPopuStruChg> implements T03LabrPopuStruChgService {

    @Autowired
    private T03LabrPopuStruChgDao t03LabrPopuStruChgDao;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T03LabrPopuStruChg> page = this.page(
                new Query<T03LabrPopuStruChg>().getPage(params),
                new QueryWrapper<T03LabrPopuStruChg>()
        );

        return new PageUtils(page);
    }

    @Override
    public Map<String, List<String>> findAll(){
        List<String> onrList = t03LabrPopuStruChgDao.findTypeOne()
                .stream().map(T03LabrPopuStruChg::getYtyGrowth).collect(Collectors.toList());
        List<String> twoList = t03LabrPopuStruChgDao.findTypeTwo()
                .stream().map(T03LabrPopuStruChg::getYtyGrowth).collect(Collectors.toList());
        List<String> threeList = t03LabrPopuStruChgDao.findTypeThree()
                .stream().map(T03LabrPopuStruChg::getYtyGrowth).collect(Collectors.toList());
        Map<String,List<String>> resultMap = new HashMap<>();
        resultMap.put("one",onrList);
        resultMap.put("two",twoList);
        resultMap.put("three",threeList);
        return resultMap;
    }
}