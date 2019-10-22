package com.dfjinxin.population.server.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T05MdclHlthServ;
import com.dfjinxin.population.server.modules.service.T05MdclHlthServService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT05MdclHlthServController;



/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 10:16:05
 */
@RestController
public class T05MdclHlthServController implements IT05MdclHlthServController{

    @Autowired
    private T05MdclHlthServService t05MdclHlthServService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T05MdclHlthServ> list = t05MdclHlthServService.getList(params);

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T05MdclHlthServ t05MdclHlthServ){
		t05MdclHlthServService.save(t05MdclHlthServ);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T05MdclHlthServ t05MdclHlthServ){
		t05MdclHlthServService.updateById(t05MdclHlthServ);

        return Response.ok();
    }


}
