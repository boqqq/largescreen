package com.dfjinxin.population.server.modules.controller;

import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT03ZoneFlowOutCibutePctController;
import com.dfjinxin.population.api.entity.T03ZoneFlowOutCibutePct;
import com.dfjinxin.population.server.modules.service.T03ZoneFlowOutCibutePctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;



/**
 * 各地区流出贡献占比
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@RestController
public class T03ZoneFlowOutCibutePctController implements IT03ZoneFlowOutCibutePctController{

    @Autowired
    private T03ZoneFlowOutCibutePctService t03ZoneFlowOutCibutePctService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        PageUtils page = t03ZoneFlowOutCibutePctService.queryPage(params);

        return Response.ok().put("page", page);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T03ZoneFlowOutCibutePct t03ZoneFlowOutCibutePct){
		t03ZoneFlowOutCibutePctService.save(t03ZoneFlowOutCibutePct);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T03ZoneFlowOutCibutePct t03ZoneFlowOutCibutePct){
		t03ZoneFlowOutCibutePctService.updateById(t03ZoneFlowOutCibutePct);

        return Response.ok();
    }

    @Override
    public Response findAll(){
        return Response.ok().put("flowOut",t03ZoneFlowOutCibutePctService.findAll());
    }
}
