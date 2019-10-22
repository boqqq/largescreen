package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T07PersRecvEduYrsPersGdpRel;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 10:05:51
 */
public interface T07PersRecvEduYrsPersGdpRelService extends IService<T07PersRecvEduYrsPersGdpRel> {

    PageUtils queryPage(Map<String, Object> params);

    List<T07PersRecvEduYrsPersGdpRel> select(Map<String, Object> params);
}

