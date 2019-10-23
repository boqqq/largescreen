package com.dfjinxin.population.server.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T05BasicPubCult;
import com.dfjinxin.population.server.modules.service.T05BasicPubCultService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT05BasicPubCultController;



/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 10:15:45
 */
@RestController
public class T05BasicPubCultController implements IT05BasicPubCultController{

    @Autowired
    private T05BasicPubCultService t05BasicPubCultService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T05BasicPubCult> list = t05BasicPubCultService.getList(params);

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T05BasicPubCult t05BasicPubCult){
		t05BasicPubCultService.save(t05BasicPubCult);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T05BasicPubCult t05BasicPubCult){
		t05BasicPubCultService.updateById(t05BasicPubCult);

        return Response.ok();
    }


}
