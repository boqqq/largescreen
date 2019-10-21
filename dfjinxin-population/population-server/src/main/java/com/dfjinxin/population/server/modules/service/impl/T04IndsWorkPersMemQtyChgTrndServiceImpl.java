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

import com.dfjinxin.population.server.modules.dao.T04IndsWorkPersMemQtyChgTrndDao;
import com.dfjinxin.population.api.entity.T04IndsWorkPersMemQtyChgTrnd;
import com.dfjinxin.population.server.modules.service.T04IndsWorkPersMemQtyChgTrndService;


@Service("t04IndsWorkPersMemQtyChgTrndService")
public class T04IndsWorkPersMemQtyChgTrndServiceImpl extends ServiceImpl<T04IndsWorkPersMemQtyChgTrndDao, T04IndsWorkPersMemQtyChgTrnd> implements T04IndsWorkPersMemQtyChgTrndService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T04IndsWorkPersMemQtyChgTrnd> page = this.page(
                new Query<T04IndsWorkPersMemQtyChgTrnd>().getPage(params),
                new QueryWrapper<T04IndsWorkPersMemQtyChgTrnd>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T04IndsWorkPersMemQtyChgTrnd> getList(Map<String, Object> params) {
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        return baseMapper.selectList(wrapper);
    }
}
