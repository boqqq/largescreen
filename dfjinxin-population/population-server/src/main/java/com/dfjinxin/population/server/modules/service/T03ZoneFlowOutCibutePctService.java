package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T03ZoneFlowOutCibutePct;

import java.util.List;
import java.util.Map;

/**
 * 各地区流出贡献占比
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
public interface T03ZoneFlowOutCibutePctService extends IService<T03ZoneFlowOutCibutePct> {

    PageUtils queryPage(Map<String, Object> params);
    Map<String, List<String>> findAll();
}

