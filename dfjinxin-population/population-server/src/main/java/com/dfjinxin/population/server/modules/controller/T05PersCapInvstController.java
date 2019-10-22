package com.dfjinxin.population.server.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T05PersCapInvst;
import com.dfjinxin.population.server.modules.service.T05PersCapInvstService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT05PersCapInvstController;



/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 10:16:23
 */
@RestController
public class T05PersCapInvstController implements IT05PersCapInvstController{

    @Autowired
    private T05PersCapInvstService t05PersCapInvstService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T05PersCapInvst> list = t05PersCapInvstService.getList(params);

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T05PersCapInvst t05PersCapInvst){
		t05PersCapInvstService.save(t05PersCapInvst);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T05PersCapInvst t05PersCapInvst){
		t05PersCapInvstService.updateById(t05PersCapInvst);

        return Response.ok();
    }


}
