package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T01LiqdPopu;

import java.util.List;
import java.util.Map;

/**
 * 流动人口
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:04
 */
public interface T01LiqdPopuService extends IService<T01LiqdPopu> {

    PageUtils queryPage(Map<String, Object> params);

    List<T01LiqdPopu> getList(Map<String, Object> params);

}

