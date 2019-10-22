package com.dfjinxin.population.server.modules.service.impl;

import com.dfjinxin.population.api.entity.T06TheAgedDisbuMap;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;

import com.dfjinxin.population.server.modules.dao.T07QltyFstNmDao;
import com.dfjinxin.population.api.entity.T07QltyFstNm;
import com.dfjinxin.population.server.modules.service.T07QltyFstNmService;


@Service("t07QltyFstNmService")
public class T07QltyFstNmServiceImpl extends ServiceImpl<T07QltyFstNmDao, T07QltyFstNm> implements T07QltyFstNmService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T07QltyFstNm> page = this.page(
                new Query<T07QltyFstNm>().getPage(params),
                new QueryWrapper<T07QltyFstNm>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<T07QltyFstNm> select(Map<String, Object> params) {
        List<T07QltyFstNm> page = baseMapper.select(params);
        return page;
    }

    @Override
    public List<Map<String, Object>> leftIndex() {
        List<Map<String, Object>> page = baseMapper.leftIndex();
        return page;
    }

    @Override
    public List<Map<String, Object>> bottomIndex1() {
        List<Map<String, Object>> page = baseMapper.bottomIndex1();
        return page;
    }

    @Override
    public List<Map<String, Object>> bottomIndex2() {
        List<Map<String, Object>> page = baseMapper.bottomIndex2();
        return page;
    }

    @Override
    public List<Map<String, Object>> bottomIndex3() {
        List<Map<String, Object>> page = baseMapper.bottomIndex3();
        return page;
    }


}