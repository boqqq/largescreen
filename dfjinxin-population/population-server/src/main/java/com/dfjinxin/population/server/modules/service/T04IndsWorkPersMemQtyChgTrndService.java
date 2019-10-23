package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T04IndsWorkPersMemQtyChgTrnd;
import com.dfjinxin.population.server.modules.dto.T04IndsWorkPersMemQtyChgTrndVo;
import com.dfjinxin.population.server.modules.dto.T04IndsWorkPersMemStruVo;

import java.util.Map;

/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:53:58
 */
public interface T04IndsWorkPersMemQtyChgTrndService extends IService<T04IndsWorkPersMemQtyChgTrnd> {

    PageUtils queryPage(Map<String, Object> params);

    T04IndsWorkPersMemStruVo getData(Map<String, Object> params);

}

