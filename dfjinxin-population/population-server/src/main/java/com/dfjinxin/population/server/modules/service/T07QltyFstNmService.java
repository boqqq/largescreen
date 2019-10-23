package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T07QltyFstNm;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 10:05:50
 */
public interface T07QltyFstNmService extends IService<T07QltyFstNm> {

    PageUtils queryPage(Map<String, Object> params);

    List<T07QltyFstNm> select(Map<String, Object> params);

    List<Map<String, Object>> leftIndex();

    List<Map<String, Object>> bottomIndex1();

    List<Map<String, Object>> bottomIndex2();

    List<Map<String, Object>> bottomIndex3();
}

