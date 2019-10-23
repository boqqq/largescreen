package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T01PrmnPopuAndGrowRate;

import java.util.List;
import java.util.Map;

/**
 * 常住人口及增长率
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:32
 */
public interface T01PrmnPopuAndGrowRateService extends IService<T01PrmnPopuAndGrowRate> {

    PageUtils queryPage(Map<String, Object> params);

    List<T01PrmnPopuAndGrowRate> getList(Map<String, Object> params);

}

