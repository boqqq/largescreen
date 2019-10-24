package com.dfjinxin.population.server.modules.service.impl;

import com.dfjinxin.commons.core.util.WrapperUtils;
import com.dfjinxin.population.api.entity.T01HousdRgstPopuGrowRate;
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

import com.dfjinxin.population.server.modules.dao.T05FamilyEgrCoefDao;
import com.dfjinxin.population.api.entity.T05FamilyEgrCoef;
import com.dfjinxin.population.server.modules.service.T05FamilyEgrCoefService;


@Service("t05FamilyEgrCoefService")
public class T05FamilyEgrCoefServiceImpl extends ServiceImpl<T05FamilyEgrCoefDao, T05FamilyEgrCoef> implements T05FamilyEgrCoefService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T05FamilyEgrCoef> page = this.page(
                new Query<T05FamilyEgrCoef>().getPage(params),
                new QueryWrapper<T05FamilyEgrCoef>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T05FamilyEgrCoef> getList(Map<String, Object> params) {
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        List<T05FamilyEgrCoef> list = baseMapper.selectList(wrapper);
        if (StringUtils.isNotEmpty((String)params.get("order"))) {
            Collections.reverse(list);
        }
        return list;
    }
}
