package com.dfjinxin.population.server.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T05ChrnBrSitu;
import com.dfjinxin.population.server.modules.service.T05ChrnBrSituService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT05ChrnBrSituController;



/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 10:15:15
 */
@RestController
public class T05ChrnBrSituController implements IT05ChrnBrSituController{

    @Autowired
    private T05ChrnBrSituService t05ChrnBrSituService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T05ChrnBrSitu> list = t05ChrnBrSituService.getList(params);

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T05ChrnBrSitu t05ChrnBrSitu){
		t05ChrnBrSituService.save(t05ChrnBrSitu);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T05ChrnBrSitu t05ChrnBrSitu){
		t05ChrnBrSituService.updateById(t05ChrnBrSitu);

        return Response.ok();
    }


}
