package com.dfjinxin.population.server.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T05RsdntGoverIncom;
import com.dfjinxin.population.server.modules.service.T05RsdntGoverIncomService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT05RsdntGoverIncomController;



/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 10:15:52
 */
@RestController
public class T05RsdntGoverIncomController implements IT05RsdntGoverIncomController{

    @Autowired
    private T05RsdntGoverIncomService t05RsdntGoverIncomService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T05RsdntGoverIncom> list = t05RsdntGoverIncomService.getList(params);

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T05RsdntGoverIncom t05RsdntGoverIncom){
		t05RsdntGoverIncomService.save(t05RsdntGoverIncom);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T05RsdntGoverIncom t05RsdntGoverIncom){
		t05RsdntGoverIncomService.updateById(t05RsdntGoverIncom);

        return Response.ok();
    }


}
