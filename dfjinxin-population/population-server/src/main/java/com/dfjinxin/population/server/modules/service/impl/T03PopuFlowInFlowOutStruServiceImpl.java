package com.dfjinxin.population.server.modules.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;
import com.dfjinxin.population.api.entity.T03PopuFlowInFlowOutStru;
import com.dfjinxin.population.server.modules.dao.T03PopuFlowInFlowOutStruDao;
import com.dfjinxin.population.server.modules.service.T03PopuFlowInFlowOutStruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service("t03PopuFlowInFlowOutStruService")
public class T03PopuFlowInFlowOutStruServiceImpl extends ServiceImpl<T03PopuFlowInFlowOutStruDao, T03PopuFlowInFlowOutStru> implements T03PopuFlowInFlowOutStruService {

    @Autowired
    private T03PopuFlowInFlowOutStruDao t03PopuFlowInFlowOutStruDao;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T03PopuFlowInFlowOutStru> page = this.page(
                new Query<T03PopuFlowInFlowOutStru>().getPage(params),
                new QueryWrapper<T03PopuFlowInFlowOutStru>()
        );

        return new PageUtils(page);
    }

    @Override
    public Map<String,List<T03PopuFlowInFlowOutStru>> findAll(){
        List<T03PopuFlowInFlowOutStru> allList = t03PopuFlowInFlowOutStruDao.findAll(t03PopuFlowInFlowOutStruDao.findMaxYear());
        List<T03PopuFlowInFlowOutStru> flowIn = new ArrayList<>();
        List<T03PopuFlowInFlowOutStru> flowOut = new ArrayList<>();
        Map<String,List<T03PopuFlowInFlowOutStru>> resultMap = new HashMap();
        for (T03PopuFlowInFlowOutStru t:allList) {
            if(Double.parseDouble(t.getPopuTotal())>=0){
                flowIn.add(t);
            }
            else {
                flowOut.add(t);
            }
        }
        resultMap.put("flowIn",flowIn);
        resultMap.put("flowOut",flowOut);
        return resultMap;
    }

}