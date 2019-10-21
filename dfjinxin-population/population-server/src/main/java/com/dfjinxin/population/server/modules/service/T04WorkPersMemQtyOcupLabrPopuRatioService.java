package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T04WorkPersMemQtyOcupLabrPopuRatio;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:15:22
 */
public interface T04WorkPersMemQtyOcupLabrPopuRatioService extends IService<T04WorkPersMemQtyOcupLabrPopuRatio> {

    PageUtils queryPage(Map<String, Object> params);

    List<T04WorkPersMemQtyOcupLabrPopuRatio> getList(Map<String, Object> params);

}

