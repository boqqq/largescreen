package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.Test;
import java.util.Map;

/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-20 03:07:32
 */
public interface TestService extends IService<Test> {

    PageUtils queryPage(Map<String, Object> params);
}

