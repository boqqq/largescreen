package com.dfjinxin.population.server.modules.controller;

import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT01LiqdPopuController;
import com.dfjinxin.population.api.entity.T01LiqdPopu;
import com.dfjinxin.population.server.modules.service.T01LiqdPopuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * 流动人口
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:04
 */
@RestController
public class T01LiqdPopuController implements IT01LiqdPopuController {

    @Autowired
    private T01LiqdPopuService t01LiqdPopuService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T01LiqdPopu> list = t01LiqdPopuService.getList(params);

        return Response.ok().put("list", list);
    }

    /**
     * 列表
     */
    @Override
    public Response leftIndex(@RequestParam Map<String, Object> params){
        List<Map<String, Object>> list = t01LiqdPopuService.leftIndex();

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T01LiqdPopu t01LiqdPopu){
		t01LiqdPopuService.save(t01LiqdPopu);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T01LiqdPopu t01LiqdPopu){
		t01LiqdPopuService.updateById(t01LiqdPopu);

        return Response.ok();
    }


}
