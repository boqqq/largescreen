package com.dfjinxin.population.server.modules.controller;

import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT03PrmnPopuAgeStru5YrChgController;
import com.dfjinxin.population.api.entity.T03PrmnPopuAgeStru5YrChg;
import com.dfjinxin.population.server.modules.service.T03PrmnPopuAgeStru5YrChgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;



/**
 * 常住人口年龄结构5年变迁
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@RestController
public class T03PrmnPopuAgeStru5YrChgController implements IT03PrmnPopuAgeStru5YrChgController{

    @Autowired
    private T03PrmnPopuAgeStru5YrChgService t03PrmnPopuAgeStru5YrChgService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        PageUtils page = t03PrmnPopuAgeStru5YrChgService.queryPage(params);

        return Response.ok().put("page", page);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T03PrmnPopuAgeStru5YrChg t03PrmnPopuAgeStru5YrChg){
		t03PrmnPopuAgeStru5YrChgService.save(t03PrmnPopuAgeStru5YrChg);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T03PrmnPopuAgeStru5YrChg t03PrmnPopuAgeStru5YrChg){
		t03PrmnPopuAgeStru5YrChgService.updateById(t03PrmnPopuAgeStru5YrChg);

        return Response.ok();
    }

    /**
     * 查询所有
     */
    @Override
    public Response findAll(){
       Map<String, List<String>> resultMap = t03PrmnPopuAgeStru5YrChgService.findAll();
       return  Response.ok().put("page", resultMap);
    }

}
