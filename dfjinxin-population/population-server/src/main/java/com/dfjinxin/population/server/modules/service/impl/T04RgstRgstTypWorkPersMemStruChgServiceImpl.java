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

import com.dfjinxin.population.server.modules.dao.T04RgstRgstTypWorkPersMemStruChgDao;
import com.dfjinxin.population.api.entity.T04RgstRgstTypWorkPersMemStruChg;
import com.dfjinxin.population.server.modules.service.T04RgstRgstTypWorkPersMemStruChgService;


@Service("t04RgstRgstTypWorkPersMemStruChgService")
public class T04RgstRgstTypWorkPersMemStruChgServiceImpl extends ServiceImpl<T04RgstRgstTypWorkPersMemStruChgDao, T04RgstRgstTypWorkPersMemStruChg> implements T04RgstRgstTypWorkPersMemStruChgService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T04RgstRgstTypWorkPersMemStruChg> page = this.page(
                new Query<T04RgstRgstTypWorkPersMemStruChg>().getPage(params),
                new QueryWrapper<T04RgstRgstTypWorkPersMemStruChg>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T04RgstRgstTypWorkPersMemStruChg> getList(Map<String, Object> params) {
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        List<T04RgstRgstTypWorkPersMemStruChg> list = baseMapper.selectList(wrapper);
        if (StringUtils.isNotEmpty((String)params.get("order"))) {
            Collections.reverse(list);
        }
        return list;
    }
}
