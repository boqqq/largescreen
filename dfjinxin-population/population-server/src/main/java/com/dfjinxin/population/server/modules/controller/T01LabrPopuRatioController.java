package com.dfjinxin.population.server.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T01LabrPopuRatio;
import com.dfjinxin.population.server.modules.service.T01LabrPopuRatioService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT01LabrPopuRatioController;



/**
 * 劳动人口占比及同比
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:11
 */
@RestController
public class T01LabrPopuRatioController implements IT01LabrPopuRatioController{

    @Autowired
    private T01LabrPopuRatioService t01LabrPopuRatioService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T01LabrPopuRatio> list = t01LabrPopuRatioService.getList(params);

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T01LabrPopuRatio t01LabrPopuRatio){
		t01LabrPopuRatioService.save(t01LabrPopuRatio);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T01LabrPopuRatio t01LabrPopuRatio){
		t01LabrPopuRatioService.updateById(t01LabrPopuRatio);

        return Response.ok();
    }


}
