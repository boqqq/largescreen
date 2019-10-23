package com.dfjinxin.population.server.modules.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;
import com.dfjinxin.population.api.entity.T03PopuFlowInFlowOutStru;
import com.dfjinxin.population.server.modules.dao.T03PopuFlowInFlowOutStruDao;
import com.dfjinxin.population.server.modules.service.T03PopuFlowInFlowOutStruService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("t03PopuFlowInFlowOutStruService")
public class T03PopuFlowInFlowOutStruServiceImpl extends ServiceImpl<T03PopuFlowInFlowOutStruDao, T03PopuFlowInFlowOutStru> implements T03PopuFlowInFlowOutStruService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T03PopuFlowInFlowOutStru> page = this.page(
                new Query<T03PopuFlowInFlowOutStru>().getPage(params),
                new QueryWrapper<T03PopuFlowInFlowOutStru>()
        );

        return new PageUtils(page);
    }

}