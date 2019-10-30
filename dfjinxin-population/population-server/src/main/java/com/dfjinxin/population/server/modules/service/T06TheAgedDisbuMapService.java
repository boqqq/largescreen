package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T06TheAgedDisbuMap;

import java.util.List;
import java.util.Map;

/**
 * 老年人分布地图
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 19:02:19
 */
public interface T06TheAgedDisbuMapService extends IService<T06TheAgedDisbuMap> {

    PageUtils queryPage(Map<String, Object> params);

    List<Map<String, Object>> select();
}

