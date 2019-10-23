package com.dfjinxin.population.server.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T04WorkPopuGrowRateTrnd;
import com.dfjinxin.population.server.modules.service.T04WorkPopuGrowRateTrndService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT04WorkPopuGrowRateTrndController;



/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:48:00
 */
@RestController
public class T04WorkPopuGrowRateTrndController implements IT04WorkPopuGrowRateTrndController{

    @Autowired
    private T04WorkPopuGrowRateTrndService t04WorkPopuGrowRateTrndService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T04WorkPopuGrowRateTrnd> list = t04WorkPopuGrowRateTrndService.getList(params);

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T04WorkPopuGrowRateTrnd t04WorkPopuGrowRateTrnd){
		t04WorkPopuGrowRateTrndService.save(t04WorkPopuGrowRateTrnd);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T04WorkPopuGrowRateTrnd t04WorkPopuGrowRateTrnd){
		t04WorkPopuGrowRateTrndService.updateById(t04WorkPopuGrowRateTrnd);

        return Response.ok();
    }


}
