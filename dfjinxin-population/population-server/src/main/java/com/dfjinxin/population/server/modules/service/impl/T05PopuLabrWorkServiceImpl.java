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

import com.dfjinxin.population.server.modules.dao.T05PopuLabrWorkDao;
import com.dfjinxin.population.api.entity.T05PopuLabrWork;
import com.dfjinxin.population.server.modules.service.T05PopuLabrWorkService;


@Service("t05PopuLabrWorkService")
public class T05PopuLabrWorkServiceImpl extends ServiceImpl<T05PopuLabrWorkDao, T05PopuLabrWork> implements T05PopuLabrWorkService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T05PopuLabrWork> page = this.page(
                new Query<T05PopuLabrWork>().getPage(params),
                new QueryWrapper<T05PopuLabrWork>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T05PopuLabrWork> getList(Map<String, Object> params) {
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        List<T05PopuLabrWork> list = baseMapper.selectList(wrapper);
        if (StringUtils.isNotEmpty((String)params.get("order"))) {
            Collections.reverse(list);
        }
        return list;
    }
}
