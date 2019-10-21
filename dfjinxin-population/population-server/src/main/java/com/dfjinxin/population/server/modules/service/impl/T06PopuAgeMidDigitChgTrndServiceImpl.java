package com.dfjinxin.population.server.modules.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;

import com.dfjinxin.population.server.modules.dao.T06PopuAgeMidDigitChgTrndDao;
import com.dfjinxin.population.api.entity.T06PopuAgeMidDigitChgTrnd;
import com.dfjinxin.population.server.modules.service.T06PopuAgeMidDigitChgTrndService;


@Service("t06PopuAgeMidDigitChgTrndService")
public class T06PopuAgeMidDigitChgTrndServiceImpl extends ServiceImpl<T06PopuAgeMidDigitChgTrndDao, T06PopuAgeMidDigitChgTrnd> implements T06PopuAgeMidDigitChgTrndService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T06PopuAgeMidDigitChgTrnd> page = this.page(
                new Query<T06PopuAgeMidDigitChgTrnd>().getPage(params),
                new QueryWrapper<T06PopuAgeMidDigitChgTrnd>()
        );

        return new PageUtils(page);
    }

}