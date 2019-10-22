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

import com.dfjinxin.population.server.modules.dao.T01PrmnPopuAgeMidDigitDao;
import com.dfjinxin.population.api.entity.T01PrmnPopuAgeMidDigit;
import com.dfjinxin.population.server.modules.service.T01PrmnPopuAgeMidDigitService;


@Service("t01PrmnPopuAgeMidDigitService")
public class T01PrmnPopuAgeMidDigitServiceImpl extends ServiceImpl<T01PrmnPopuAgeMidDigitDao, T01PrmnPopuAgeMidDigit> implements T01PrmnPopuAgeMidDigitService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T01PrmnPopuAgeMidDigit> page = this.page(
                new Query<T01PrmnPopuAgeMidDigit>().getPage(params),
                new QueryWrapper<T01PrmnPopuAgeMidDigit>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T01PrmnPopuAgeMidDigit> getList(Map<String, Object> params) {
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        return baseMapper.selectList(wrapper);
    }
}
