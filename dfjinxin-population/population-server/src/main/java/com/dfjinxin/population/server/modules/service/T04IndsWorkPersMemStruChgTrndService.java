package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T04IndsWorkPersMemStruChgTrnd;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:26:13
 */
public interface T04IndsWorkPersMemStruChgTrndService extends IService<T04IndsWorkPersMemStruChgTrnd> {

    PageUtils queryPage(Map<String, Object> params);

    List<T04IndsWorkPersMemStruChgTrnd> getList(Map<String, Object> params);

}

