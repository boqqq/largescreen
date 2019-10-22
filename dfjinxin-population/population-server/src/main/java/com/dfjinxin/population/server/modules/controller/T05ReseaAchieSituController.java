package com.dfjinxin.population.server.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T05ReseaAchieSitu;
import com.dfjinxin.population.server.modules.service.T05ReseaAchieSituService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT05ReseaAchieSituController;



/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 10:16:16
 */
@RestController
public class T05ReseaAchieSituController implements IT05ReseaAchieSituController{

    @Autowired
    private T05ReseaAchieSituService t05ReseaAchieSituService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T05ReseaAchieSitu> list = t05ReseaAchieSituService.getList(params);

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T05ReseaAchieSitu t05ReseaAchieSitu){
		t05ReseaAchieSituService.save(t05ReseaAchieSitu);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T05ReseaAchieSitu t05ReseaAchieSitu){
		t05ReseaAchieSituService.updateById(t05ReseaAchieSitu);

        return Response.ok();
    }


}
