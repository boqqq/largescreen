package com.dfjinxin.population.server.modules.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T02LabrPopuGrowRateChgTrnd;
import com.dfjinxin.population.server.modules.service.T02LabrPopuGrowRateChgTrndService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT02LabrPopuGrowRateChgTrndController;
import com.dfjinxin.commons.core.util.api.Response;



/**
 * 劳动力人口增长率变化趋势
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 08:39:03
 */
@RestController
public class T02LabrPopuGrowRateChgTrndController implements IT02LabrPopuGrowRateChgTrndController{

    @Autowired
    private T02LabrPopuGrowRateChgTrndService t02LabrPopuGrowRateChgTrndService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T02LabrPopuGrowRateChgTrnd> list = t02LabrPopuGrowRateChgTrndService.getList(params);

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T02LabrPopuGrowRateChgTrnd t02LabrPopuGrowRateChgTrnd){
		t02LabrPopuGrowRateChgTrndService.save(t02LabrPopuGrowRateChgTrnd);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T02LabrPopuGrowRateChgTrnd t02LabrPopuGrowRateChgTrnd){
		t02LabrPopuGrowRateChgTrndService.updateById(t02LabrPopuGrowRateChgTrnd);

        return Response.ok();
    }


}
