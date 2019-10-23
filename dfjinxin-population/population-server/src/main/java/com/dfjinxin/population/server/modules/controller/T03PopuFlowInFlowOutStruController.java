package com.dfjinxin.population.server.modules.controller;

import java.util.Arrays;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T03PopuFlowInFlowOutStru;
import com.dfjinxin.population.server.modules.service.T03PopuFlowInFlowOutStruService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT03PopuFlowInFlowOutStruController;
import com.dfjinxin.commons.core.util.api.Response;



/**
 * 人口流入流出结构
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@RestController
public class T03PopuFlowInFlowOutStruController implements IT03PopuFlowInFlowOutStruController{

    @Autowired
    private T03PopuFlowInFlowOutStruService t03PopuFlowInFlowOutStruService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        PageUtils page = t03PopuFlowInFlowOutStruService.queryPage(params);

        return Response.ok().put("page", page);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T03PopuFlowInFlowOutStru t03PopuFlowInFlowOutStru){
		t03PopuFlowInFlowOutStruService.save(t03PopuFlowInFlowOutStru);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T03PopuFlowInFlowOutStru t03PopuFlowInFlowOutStru){
		t03PopuFlowInFlowOutStruService.updateById(t03PopuFlowInFlowOutStru);

        return Response.ok();
    }


}
