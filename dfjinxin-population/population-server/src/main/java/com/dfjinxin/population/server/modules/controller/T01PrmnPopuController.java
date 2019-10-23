package com.dfjinxin.population.server.modules.controller;

import java.util.List;
import java.util.Map;

import com.dfjinxin.population.api.entity.T04IndsWorkPersMemQtyChgTrnd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T01PrmnPopu;
import com.dfjinxin.population.server.modules.service.T01PrmnPopuService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT01PrmnPopuController;



/**
 * 常住人口
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:35:47
 */
@RestController
public class T01PrmnPopuController implements IT01PrmnPopuController{

    @Autowired
    private T01PrmnPopuService t01PrmnPopuService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T01PrmnPopu> list = t01PrmnPopuService.getList(params);

        return Response.ok().put("list", list);
    }

    /**
     * 各市县常住人口情况
     */
    @Override
    public Response select(){
        List<Map<String, Object>> list = t01PrmnPopuService.select();

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T01PrmnPopu t01PrmnPopu){
		t01PrmnPopuService.save(t01PrmnPopu);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T01PrmnPopu t01PrmnPopu){
		t01PrmnPopuService.updateById(t01PrmnPopu);

        return Response.ok();
    }


}
