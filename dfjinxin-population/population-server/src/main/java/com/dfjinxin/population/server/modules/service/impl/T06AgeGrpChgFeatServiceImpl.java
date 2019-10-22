package com.dfjinxin.population.server.modules.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;
import com.dfjinxin.population.api.entity.T06AgeGrpChgFeat;
import com.dfjinxin.population.server.modules.dao.T06AgeGrpChgFeatDao;
import com.dfjinxin.population.server.modules.service.T06AgeGrpChgFeatService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("t06AgeGrpChgFeatService")
public class T06AgeGrpChgFeatServiceImpl extends ServiceImpl<T06AgeGrpChgFeatDao, T06AgeGrpChgFeat> implements T06AgeGrpChgFeatService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T06AgeGrpChgFeat> page = this.page(
                new Query<T06AgeGrpChgFeat>().getPage(params),
                new QueryWrapper<T06AgeGrpChgFeat>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T06AgeGrpChgFeat> select(Map<String, Object> params) {
        List<T06AgeGrpChgFeat> page = baseMapper.select();

        return page;
    }

}