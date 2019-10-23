package com.dfjinxin.population.server.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T01LiqdPopuAndGrowRate;
import com.dfjinxin.population.server.modules.service.T01LiqdPopuAndGrowRateService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT01LiqdPopuAndGrowRateController;



/**
 * 流动人口及增长率
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:46
 */
@RestController
public class T01LiqdPopuAndGrowRateController implements IT01LiqdPopuAndGrowRateController{

    @Autowired
    private T01LiqdPopuAndGrowRateService t01LiqdPopuAndGrowRateService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T01LiqdPopuAndGrowRate> list = t01LiqdPopuAndGrowRateService.getList(params);

        return Response.ok().put("list", list);
    }

    /**
     * 列表
     */
    @Override
    public Response select(){
        List<T01LiqdPopuAndGrowRate> list = t01LiqdPopuAndGrowRateService.select();

        return Response.ok().put("list", list);
    }




    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T01LiqdPopuAndGrowRate t01LiqdPopuAndGrowRate){
		t01LiqdPopuAndGrowRateService.save(t01LiqdPopuAndGrowRate);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T01LiqdPopuAndGrowRate t01LiqdPopuAndGrowRate){
		t01LiqdPopuAndGrowRateService.updateById(t01LiqdPopuAndGrowRate);

        return Response.ok();
    }


}
