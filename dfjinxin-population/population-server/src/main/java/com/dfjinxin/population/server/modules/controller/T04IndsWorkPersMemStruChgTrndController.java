package com.dfjinxin.population.server.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T04IndsWorkPersMemStruChgTrnd;
import com.dfjinxin.population.server.modules.service.T04IndsWorkPersMemStruChgTrndService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT04IndsWorkPersMemStruChgTrndController;



/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:26:13
 */
@RestController
public class T04IndsWorkPersMemStruChgTrndController implements IT04IndsWorkPersMemStruChgTrndController{

    @Autowired
    private T04IndsWorkPersMemStruChgTrndService t04IndsWorkPersMemStruChgTrndService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T04IndsWorkPersMemStruChgTrnd> list = t04IndsWorkPersMemStruChgTrndService.getList(params);

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T04IndsWorkPersMemStruChgTrnd t04IndsWorkPersMemStruChgTrnd){
		t04IndsWorkPersMemStruChgTrndService.save(t04IndsWorkPersMemStruChgTrnd);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T04IndsWorkPersMemStruChgTrnd t04IndsWorkPersMemStruChgTrnd){
		t04IndsWorkPersMemStruChgTrndService.updateById(t04IndsWorkPersMemStruChgTrnd);

        return Response.ok();
    }


}
