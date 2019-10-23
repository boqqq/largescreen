package com.dfjinxin.population.server.modules.service.impl;

import com.dfjinxin.commons.core.util.WrapperUtils;
import com.dfjinxin.population.api.entity.T04RgstRgstTypWorkPersMemStruChg;
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

import com.dfjinxin.population.server.modules.dao.T04IndsWorkPersMemStruChgTrndDao;
import com.dfjinxin.population.api.entity.T04IndsWorkPersMemStruChgTrnd;
import com.dfjinxin.population.server.modules.service.T04IndsWorkPersMemStruChgTrndService;


@Service("t04IndsWorkPersMemStruChgTrndService")
public class T04IndsWorkPersMemStruChgTrndServiceImpl extends ServiceImpl<T04IndsWorkPersMemStruChgTrndDao, T04IndsWorkPersMemStruChgTrnd> implements T04IndsWorkPersMemStruChgTrndService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T04IndsWorkPersMemStruChgTrnd> page = this.page(
                new Query<T04IndsWorkPersMemStruChgTrnd>().getPage(params),
                new QueryWrapper<T04IndsWorkPersMemStruChgTrnd>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T04IndsWorkPersMemStruChgTrnd> getList(Map<String, Object> params) {
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        List<T04IndsWorkPersMemStruChgTrnd> list = baseMapper.selectList(wrapper);
        if (StringUtils.isNotEmpty((String)params.get("order"))) {
            Collections.reverse(list);
        }
        return list;
    }
}
