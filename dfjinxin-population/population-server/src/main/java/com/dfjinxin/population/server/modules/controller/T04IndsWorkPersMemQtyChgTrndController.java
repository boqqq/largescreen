package com.dfjinxin.population.server.modules.controller;

import java.util.Map;

import com.dfjinxin.population.server.modules.dto.T04IndsWorkPersMemQtyChgTrndVo;
import com.dfjinxin.population.server.modules.dto.T04IndsWorkPersMemStruVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T04IndsWorkPersMemQtyChgTrnd;
import com.dfjinxin.population.server.modules.service.T04IndsWorkPersMemQtyChgTrndService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT04IndsWorkPersMemQtyChgTrndController;



/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:53:58
 */
@RestController
public class T04IndsWorkPersMemQtyChgTrndController implements IT04IndsWorkPersMemQtyChgTrndController{

    @Autowired
    private T04IndsWorkPersMemQtyChgTrndService t04IndsWorkPersMemQtyChgTrndService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        T04IndsWorkPersMemStruVo result = t04IndsWorkPersMemQtyChgTrndService.getData(params);

        return Response.ok().put("result", result);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T04IndsWorkPersMemQtyChgTrnd t04IndsWorkPersMemQtyChgTrnd){
		t04IndsWorkPersMemQtyChgTrndService.save(t04IndsWorkPersMemQtyChgTrnd);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T04IndsWorkPersMemQtyChgTrnd t04IndsWorkPersMemQtyChgTrnd){
		t04IndsWorkPersMemQtyChgTrndService.updateById(t04IndsWorkPersMemQtyChgTrnd);

        return Response.ok();
    }


}
