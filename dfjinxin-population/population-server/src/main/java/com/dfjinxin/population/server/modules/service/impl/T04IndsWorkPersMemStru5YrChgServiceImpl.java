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

import com.dfjinxin.population.server.modules.dao.T04IndsWorkPersMemStru5YrChgDao;
import com.dfjinxin.population.api.entity.T04IndsWorkPersMemStru5YrChg;
import com.dfjinxin.population.server.modules.service.T04IndsWorkPersMemStru5YrChgService;


@Service("t04IndsWorkPersMemStru5YrChgService")
public class T04IndsWorkPersMemStru5YrChgServiceImpl extends ServiceImpl<T04IndsWorkPersMemStru5YrChgDao, T04IndsWorkPersMemStru5YrChg> implements T04IndsWorkPersMemStru5YrChgService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T04IndsWorkPersMemStru5YrChg> page = this.page(
                new Query<T04IndsWorkPersMemStru5YrChg>().getPage(params),
                new QueryWrapper<T04IndsWorkPersMemStru5YrChg>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T04IndsWorkPersMemStru5YrChg> getList(Map<String, Object> params) {
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);
        return baseMapper.selectList(wrapper);
    }
}
