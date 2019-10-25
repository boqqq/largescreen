package com.dfjinxin.population.server.modules.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;
import com.dfjinxin.population.api.entity.T06BringChgFeat;
import com.dfjinxin.population.server.modules.dao.T06BringChgFeatDao;
import com.dfjinxin.population.server.modules.service.T06BringChgFeatService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("t06BringChgFeatService")
public class T06BringChgFeatServiceImpl extends ServiceImpl<T06BringChgFeatDao, T06BringChgFeat> implements T06BringChgFeatService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T06BringChgFeat> page = this.page(
                new Query<T06BringChgFeat>().getPage(params),
                new QueryWrapper<T06BringChgFeat>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<Map<String, Object>> select() {
        List<Map<String, Object>> page = baseMapper.select();

        return page;
    }

}