package com.dfjinxin.population.server.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T05PopuLabrWork;
import com.dfjinxin.population.server.modules.service.T05PopuLabrWorkService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT05PopuLabrWorkController;



/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 10:16:11
 */
@RestController
public class T05PopuLabrWorkController implements IT05PopuLabrWorkController{

    @Autowired
    private T05PopuLabrWorkService t05PopuLabrWorkService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T05PopuLabrWork> list = t05PopuLabrWorkService.getList(params);

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T05PopuLabrWork t05PopuLabrWork){
		t05PopuLabrWorkService.save(t05PopuLabrWork);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T05PopuLabrWork t05PopuLabrWork){
		t05PopuLabrWorkService.updateById(t05PopuLabrWork);

        return Response.ok();
    }


}
