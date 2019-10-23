package com.dfjinxin.population.server.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T01HousdRgstPopuGrowRate;
import com.dfjinxin.population.server.modules.service.T01HousdRgstPopuGrowRateService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT01HousdRgstPopuGrowRateController;



/**
 * 户籍人口及增长率
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:39
 */
@RestController
public class T01HousdRgstPopuGrowRateController implements IT01HousdRgstPopuGrowRateController{

    @Autowired
    private T01HousdRgstPopuGrowRateService t01HousdRgstPopuGrowRateService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T01HousdRgstPopuGrowRate> list = t01HousdRgstPopuGrowRateService.getList(params);

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T01HousdRgstPopuGrowRate t01HousdRgstPopuGrowRate){
		t01HousdRgstPopuGrowRateService.save(t01HousdRgstPopuGrowRate);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T01HousdRgstPopuGrowRate t01HousdRgstPopuGrowRate){
		t01HousdRgstPopuGrowRateService.updateById(t01HousdRgstPopuGrowRate);

        return Response.ok();
    }


}
