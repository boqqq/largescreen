package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T01LiqdPopuAndGrowRate;

import java.util.List;
import java.util.Map;

/**
 * 流动人口及增长率
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:46
 */
public interface T01LiqdPopuAndGrowRateService extends IService<T01LiqdPopuAndGrowRate> {

    PageUtils queryPage(Map<String, Object> params);

    List<T01LiqdPopuAndGrowRate> getList(Map<String, Object> params);

}

