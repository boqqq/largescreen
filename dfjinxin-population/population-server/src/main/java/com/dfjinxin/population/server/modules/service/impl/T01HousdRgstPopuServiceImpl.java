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

import com.dfjinxin.population.server.modules.dao.T01HousdRgstPopuDao;
import com.dfjinxin.population.api.entity.T01HousdRgstPopu;
import com.dfjinxin.population.server.modules.service.T01HousdRgstPopuService;


@Service("t01HousdRgstPopuService")
public class T01HousdRgstPopuServiceImpl extends ServiceImpl<T01HousdRgstPopuDao, T01HousdRgstPopu> implements T01HousdRgstPopuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T01HousdRgstPopu> page = this.page(
                new Query<T01HousdRgstPopu>().getPage(params),
                new QueryWrapper<T01HousdRgstPopu>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T01HousdRgstPopu> getList(Map<String, Object> params) {
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        return baseMapper.selectList(wrapper);
    }
}
