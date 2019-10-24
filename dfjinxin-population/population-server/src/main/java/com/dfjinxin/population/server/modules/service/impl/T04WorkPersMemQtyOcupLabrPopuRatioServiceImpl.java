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

import com.dfjinxin.population.server.modules.dao.T04WorkPersMemQtyOcupLabrPopuRatioDao;
import com.dfjinxin.population.api.entity.T04WorkPersMemQtyOcupLabrPopuRatio;
import com.dfjinxin.population.server.modules.service.T04WorkPersMemQtyOcupLabrPopuRatioService;


@Service("t04WorkPersMemQtyOcupLabrPopuRatioService")
public class T04WorkPersMemQtyOcupLabrPopuRatioServiceImpl extends ServiceImpl<T04WorkPersMemQtyOcupLabrPopuRatioDao, T04WorkPersMemQtyOcupLabrPopuRatio> implements T04WorkPersMemQtyOcupLabrPopuRatioService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T04WorkPersMemQtyOcupLabrPopuRatio> page = this.page(
                new Query<T04WorkPersMemQtyOcupLabrPopuRatio>().getPage(params),
                new QueryWrapper<T04WorkPersMemQtyOcupLabrPopuRatio>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T04WorkPersMemQtyOcupLabrPopuRatio> getList(Map<String, Object> params) {
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        List<T04WorkPersMemQtyOcupLabrPopuRatio> list = baseMapper.selectList(wrapper);
        if (StringUtils.isNotEmpty((String)params.get("order"))) {
            Collections.reverse(list);
        }
        return list;
    }

}
