package com.dfjinxin.population.server.modules.controller;

import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT03ZoneFlowInCibutePctController;
import com.dfjinxin.population.api.entity.T03ZoneFlowInCibutePct;
import com.dfjinxin.population.server.modules.service.T03ZoneFlowInCibutePctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;



/**
 * 各地区流入贡献占比
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@RestController
public class T03ZoneFlowInCibutePctController implements IT03ZoneFlowInCibutePctController{

    @Autowired
    private T03ZoneFlowInCibutePctService t03ZoneFlowInCibutePctService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        PageUtils page = t03ZoneFlowInCibutePctService.queryPage(params);

        return Response.ok().put("page", page);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T03ZoneFlowInCibutePct t03ZoneFlowInCibutePct){
		t03ZoneFlowInCibutePctService.save(t03ZoneFlowInCibutePct);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T03ZoneFlowInCibutePct t03ZoneFlowInCibutePct){
		t03ZoneFlowInCibutePctService.updateById(t03ZoneFlowInCibutePct);

        return Response.ok();
    }

    @Override
    public Response findAll(){
       return Response.ok().put("flowIn",t03ZoneFlowInCibutePctService.findAll());
    }

}
