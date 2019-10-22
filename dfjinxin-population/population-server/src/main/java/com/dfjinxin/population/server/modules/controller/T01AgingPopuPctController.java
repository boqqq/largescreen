package com.dfjinxin.population.server.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T01AgingPopuPct;
import com.dfjinxin.population.server.modules.service.T01AgingPopuPctService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT01AgingPopuPctController;



/**
 * 老龄人口占比
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:24
 */
@RestController
public class T01AgingPopuPctController implements IT01AgingPopuPctController{

    @Autowired
    private T01AgingPopuPctService t01AgingPopuPctService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T01AgingPopuPct> list = t01AgingPopuPctService.getList(params);

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T01AgingPopuPct t01AgingPopuPct){
		t01AgingPopuPctService.save(t01AgingPopuPct);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T01AgingPopuPct t01AgingPopuPct){
		t01AgingPopuPctService.updateById(t01AgingPopuPct);

        return Response.ok();
    }


}
