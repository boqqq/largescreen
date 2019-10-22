package com.dfjinxin.population.server.modules.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;
import com.dfjinxin.population.api.entity.T06TheAgedDisbuMap;
import com.dfjinxin.population.server.modules.dao.T06TheAgedDisbuMapDao;
import com.dfjinxin.population.server.modules.service.T06TheAgedDisbuMapService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("t06TheAgedDisbuMapService")
public class T06TheAgedDisbuMapServiceImpl extends ServiceImpl<T06TheAgedDisbuMapDao, T06TheAgedDisbuMap> implements T06TheAgedDisbuMapService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T06TheAgedDisbuMap> page = this.page(
                new Query<T06TheAgedDisbuMap>().getPage(params),
                new QueryWrapper<T06TheAgedDisbuMap>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T06TheAgedDisbuMap> select() {
        List<T06TheAgedDisbuMap> page = baseMapper.select();

        return page;
    }

}