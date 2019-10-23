package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T03PrmnPopuAgeStru5YrChg;

import java.util.List;
import java.util.Map;

/**
 * 常住人口年龄结构5年变迁
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
public interface T03PrmnPopuAgeStru5YrChgService extends IService<T03PrmnPopuAgeStru5YrChg> {

    PageUtils queryPage(Map<String, Object> params);
    Map<String,List<String>> findAll();
}

