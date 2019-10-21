package com.dfjinxin.population.server.modules.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;

import com.dfjinxin.population.server.modules.dao.TestDao;
import com.dfjinxin.population.api.entity.Test;
import com.dfjinxin.population.server.modules.service.TestService;


@Service("testService")
public class TestServiceImpl extends ServiceImpl<TestDao, Test> implements TestService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Test> page = this.page(
                new Query<Test>().getPage(params),
                new QueryWrapper<Test>()
        );

        return new PageUtils(page);
    }

}