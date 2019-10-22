package com.dfjinxin.population.server.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T01PrmnPopuAndGrowRate;
import com.dfjinxin.population.server.modules.service.T01PrmnPopuAndGrowRateService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT01PrmnPopuAndGrowRateController;



/**
 * 常住人口及增长率
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:32
 */
@RestController
public class T01PrmnPopuAndGrowRateController implements IT01PrmnPopuAndGrowRateController{

    @Autowired
    private T01PrmnPopuAndGrowRateService t01PrmnPopuAndGrowRateService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T01PrmnPopuAndGrowRate> list = t01PrmnPopuAndGrowRateService.getList(params);

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T01PrmnPopuAndGrowRate t01PrmnPopuAndGrowRate){
		t01PrmnPopuAndGrowRateService.save(t01PrmnPopuAndGrowRate);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T01PrmnPopuAndGrowRate t01PrmnPopuAndGrowRate){
		t01PrmnPopuAndGrowRateService.updateById(t01PrmnPopuAndGrowRate);

        return Response.ok();
    }


}
