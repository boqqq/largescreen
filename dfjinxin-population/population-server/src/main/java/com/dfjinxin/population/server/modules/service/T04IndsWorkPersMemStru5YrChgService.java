package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T04IndsWorkPersMemStru5YrChg;
import com.dfjinxin.population.server.modules.dto.T04IndsWorkPersMemStru5YrChgVo;
import com.dfjinxin.population.server.modules.dto.T04IndsWorkPersMemStruVo;

import java.util.Map;

/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:53:25
 */
public interface T04IndsWorkPersMemStru5YrChgService extends IService<T04IndsWorkPersMemStru5YrChg> {

    PageUtils queryPage(Map<String, Object> params);

    T04IndsWorkPersMemStruVo getData(Map<String, Object> params);

}

