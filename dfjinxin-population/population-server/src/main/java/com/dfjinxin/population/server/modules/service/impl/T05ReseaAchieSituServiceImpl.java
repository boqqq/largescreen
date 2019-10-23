package com.dfjinxin.population.server.modules.service.impl;

import com.dfjinxin.commons.core.util.WrapperUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;

import com.dfjinxin.population.server.modules.dao.T05ReseaAchieSituDao;
import com.dfjinxin.population.api.entity.T05ReseaAchieSitu;
import com.dfjinxin.population.server.modules.service.T05ReseaAchieSituService;


@Service("t05ReseaAchieSituService")
public class T05ReseaAchieSituServiceImpl extends ServiceImpl<T05ReseaAchieSituDao, T05ReseaAchieSitu> implements T05ReseaAchieSituService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T05ReseaAchieSitu> page = this.page(
                new Query<T05ReseaAchieSitu>().getPage(params),
                new QueryWrapper<T05ReseaAchieSitu>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T05ReseaAchieSitu> getList(Map<String, Object> params) {
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        return baseMapper.selectList(wrapper);
    }
}
