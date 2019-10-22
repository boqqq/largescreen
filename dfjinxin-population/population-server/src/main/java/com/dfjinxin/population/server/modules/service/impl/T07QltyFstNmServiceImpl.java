package com.dfjinxin.population.server.modules.service.impl;

import org.springframework.stereotype.Service;
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

}