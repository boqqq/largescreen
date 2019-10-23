package com.dfjinxin.population.server.modules.service.impl;

import com.dfjinxin.commons.core.util.WrapperUtils;
import com.dfjinxin.population.api.entity.T04WorkPopuGrowRateTrnd;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;

import com.dfjinxin.population.server.modules.dao.T01AgingPopuPctDao;
import com.dfjinxin.population.api.entity.T01AgingPopuPct;
import com.dfjinxin.population.server.modules.service.T01AgingPopuPctService;


@Service("t01AgingPopuPctService")
public class T01AgingPopuPctServiceImpl extends ServiceImpl<T01AgingPopuPctDao, T01AgingPopuPct> implements T01AgingPopuPctService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T01AgingPopuPct> page = this.page(
                new Query<T01AgingPopuPct>().getPage(params),
                new QueryWrapper<T01AgingPopuPct>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T01AgingPopuPct> getList(Map<String, Object> params) {
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        List<T01AgingPopuPct> list = baseMapper.selectList(wrapper);
        if (StringUtils.isNotEmpty((String)params.get("order"))) {
            Collections.reverse(list);
        }
        return list;
    }
}
