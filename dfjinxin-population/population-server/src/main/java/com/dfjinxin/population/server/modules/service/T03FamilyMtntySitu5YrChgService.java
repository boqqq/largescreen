package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T03FamilyMtntySitu5YrChg;

import java.util.Map;

/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:39:27
 */
public interface T03FamilyMtntySitu5YrChgService extends IService<T03FamilyMtntySitu5YrChg> {

    PageUtils queryPage(Map<String, Object> params);
    Map findAll();
}

