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

import com.dfjinxin.population.server.modules.dao.T05PopuRecvEduSituDao;
import com.dfjinxin.population.api.entity.T05PopuRecvEduSitu;
import com.dfjinxin.population.server.modules.service.T05PopuRecvEduSituService;


@Service("t05PopuRecvEduSituService")
public class T05PopuRecvEduSituServiceImpl extends ServiceImpl<T05PopuRecvEduSituDao, T05PopuRecvEduSitu> implements T05PopuRecvEduSituService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T05PopuRecvEduSitu> page = this.page(
                new Query<T05PopuRecvEduSitu>().getPage(params),
                new QueryWrapper<T05PopuRecvEduSitu>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T05PopuRecvEduSitu> getList(Map<String, Object> params) {
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        List<T05PopuRecvEduSitu> list = baseMapper.selectList(wrapper);
        if (StringUtils.isNotEmpty((String)params.get("order"))) {
            Collections.reverse(list);
        }
        return list;
    }
}
