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

import com.dfjinxin.population.server.modules.dao.T05RsdntGoverIncomDao;
import com.dfjinxin.population.api.entity.T05RsdntGoverIncom;
import com.dfjinxin.population.server.modules.service.T05RsdntGoverIncomService;


@Service("t05RsdntGoverIncomService")
public class T05RsdntGoverIncomServiceImpl extends ServiceImpl<T05RsdntGoverIncomDao, T05RsdntGoverIncom> implements T05RsdntGoverIncomService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T05RsdntGoverIncom> page = this.page(
                new Query<T05RsdntGoverIncom>().getPage(params),
                new QueryWrapper<T05RsdntGoverIncom>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T05RsdntGoverIncom> getList(Map<String, Object> params) {
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        return baseMapper.selectList(wrapper);
    }
}
