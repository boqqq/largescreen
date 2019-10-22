package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T06PopuBirthRateAndDeadRateTrnd;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:33:14
 */
public interface T06PopuBirthRateAndDeadRateTrndService extends IService<T06PopuBirthRateAndDeadRateTrnd> {

    PageUtils queryPage(Map<String, Object> params);

    List<T06PopuBirthRateAndDeadRateTrnd> select(Map<String, Object> params);
}

