package com.dfjinxin.population.server.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T01HousdRgstPopu;
import com.dfjinxin.population.server.modules.service.T01HousdRgstPopuService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT01HousdRgstPopuController;



/**
 * 户籍人口
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:35:55
 */
@RestController
public class T01HousdRgstPopuController implements IT01HousdRgstPopuController{

    @Autowired
    private T01HousdRgstPopuService t01HousdRgstPopuService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T01HousdRgstPopu> list = t01HousdRgstPopuService.getList(params);

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T01HousdRgstPopu t01HousdRgstPopu){
		t01HousdRgstPopuService.save(t01HousdRgstPopu);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T01HousdRgstPopu t01HousdRgstPopu){
		t01HousdRgstPopuService.updateById(t01HousdRgstPopu);

        return Response.ok();
    }


}
