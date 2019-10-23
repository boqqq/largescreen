package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T01PrmnPopu;

import java.util.List;
import java.util.Map;

/**
 * 常住人口
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:35:47
 */
public interface T01PrmnPopuService extends IService<T01PrmnPopu> {

    PageUtils queryPage(Map<String, Object> params);

    List<T01PrmnPopu> getList(Map<String, Object> params);

    List<Map<String, Object>> select();

}

