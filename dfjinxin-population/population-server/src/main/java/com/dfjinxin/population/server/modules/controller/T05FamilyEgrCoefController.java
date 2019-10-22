package com.dfjinxin.population.server.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T05FamilyEgrCoef;
import com.dfjinxin.population.server.modules.service.T05FamilyEgrCoefService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT05FamilyEgrCoefController;



/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 10:15:59
 */
@RestController
public class T05FamilyEgrCoefController implements IT05FamilyEgrCoefController{

    @Autowired
    private T05FamilyEgrCoefService t05FamilyEgrCoefService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T05FamilyEgrCoef> list = t05FamilyEgrCoefService.getList(params);

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T05FamilyEgrCoef t05FamilyEgrCoef){
		t05FamilyEgrCoefService.save(t05FamilyEgrCoef);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T05FamilyEgrCoef t05FamilyEgrCoef){
		t05FamilyEgrCoefService.updateById(t05FamilyEgrCoef);

        return Response.ok();
    }


}
