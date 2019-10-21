package com.dfjinxin.development.server.modules.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.dfjinxin.commons.mybatis.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;

import com.dfjinxin.development.server.modules.dao.TestDao;
import com.dfjinxin.development.api.entity.Test;
import com.dfjinxin.development.server.modules.service.TestService;


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

    @Override
    public Test queryByName(String name) {
        LambdaQueryWrapper<Test> lambdaQueryWrapper = new QueryWrapper<Test>().lambda();
        lambdaQueryWrapper.eq(Test::getName, name);
        Test test = MapperUtils.getOne(testDao, lambdaQueryWrapper, true);
        return test;
    }

    @Autowired
    private TestDao testDao;
}