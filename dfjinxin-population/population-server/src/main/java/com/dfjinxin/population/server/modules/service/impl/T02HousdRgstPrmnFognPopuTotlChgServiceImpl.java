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

import com.dfjinxin.population.server.modules.dao.T02HousdRgstPrmnFognPopuTotlChgDao;
import com.dfjinxin.population.api.entity.T02HousdRgstPrmnFognPopuTotlChg;
import com.dfjinxin.population.server.modules.service.T02HousdRgstPrmnFognPopuTotlChgService;


@Service("t02HousdRgstPrmnFognPopuTotlChgService")
public class T02HousdRgstPrmnFognPopuTotlChgServiceImpl extends ServiceImpl<T02HousdRgstPrmnFognPopuTotlChgDao, T02HousdRgstPrmnFognPopuTotlChg> implements T02HousdRgstPrmnFognPopuTotlChgService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T02HousdRgstPrmnFognPopuTotlChg> page = this.page(
                new Query<T02HousdRgstPrmnFognPopuTotlChg>().getPage(params),
                new QueryWrapper<T02HousdRgstPrmnFognPopuTotlChg>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T02HousdRgstPrmnFognPopuTotlChg> getList(Map<String, Object> params) {
        params.put("order","date_stat");
        params.put("limit","10");
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        return baseMapper.selectList(wrapper);
    }





}