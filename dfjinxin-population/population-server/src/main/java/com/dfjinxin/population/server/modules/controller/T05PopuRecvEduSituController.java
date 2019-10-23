package com.dfjinxin.population.server.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T05PopuRecvEduSitu;
import com.dfjinxin.population.server.modules.service.T05PopuRecvEduSituService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT05PopuRecvEduSituController;



/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 10:15:38
 */
@RestController
public class T05PopuRecvEduSituController implements IT05PopuRecvEduSituController{

    @Autowired
    private T05PopuRecvEduSituService t05PopuRecvEduSituService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T05PopuRecvEduSitu> list = t05PopuRecvEduSituService.getList(params);

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T05PopuRecvEduSitu t05PopuRecvEduSitu){
		t05PopuRecvEduSituService.save(t05PopuRecvEduSitu);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T05PopuRecvEduSitu t05PopuRecvEduSitu){
		t05PopuRecvEduSituService.updateById(t05PopuRecvEduSitu);

        return Response.ok();
    }


}
