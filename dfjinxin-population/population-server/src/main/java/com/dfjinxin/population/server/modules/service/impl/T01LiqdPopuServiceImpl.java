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

import com.dfjinxin.population.server.modules.dao.T01LiqdPopuDao;
import com.dfjinxin.population.api.entity.T01LiqdPopu;
import com.dfjinxin.population.server.modules.service.T01LiqdPopuService;


@Service("t01LiqdPopuService")
public class T01LiqdPopuServiceImpl extends ServiceImpl<T01LiqdPopuDao, T01LiqdPopu> implements T01LiqdPopuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T01LiqdPopu> page = this.page(
                new Query<T01LiqdPopu>().getPage(params),
                new QueryWrapper<T01LiqdPopu>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T01LiqdPopu> getList(Map<String, Object> params) {
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        return baseMapper.selectList(wrapper);
    }
}
