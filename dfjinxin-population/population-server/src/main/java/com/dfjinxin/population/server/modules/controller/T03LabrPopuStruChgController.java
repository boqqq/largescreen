package com.dfjinxin.population.server.modules.controller;

import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT03LabrPopuStruChgController;
import com.dfjinxin.population.api.entity.T03LabrPopuStruChg;
import com.dfjinxin.population.server.modules.service.T03LabrPopuStruChgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;



/**
 * 劳动力人口结构变化
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@RestController
public class T03LabrPopuStruChgController implements IT03LabrPopuStruChgController{

    @Autowired
    private T03LabrPopuStruChgService t03LabrPopuStruChgService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        PageUtils page = t03LabrPopuStruChgService.queryPage(params);

        return Response.ok().put("page", page);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T03LabrPopuStruChg t03LabrPopuStruChg){
		t03LabrPopuStruChgService.save(t03LabrPopuStruChg);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T03LabrPopuStruChg t03LabrPopuStruChg){
		t03LabrPopuStruChgService.updateById(t03LabrPopuStruChg);

        return Response.ok();
    }

    @Override
    public Response findAll(){
        return Response.ok().put("labr",t03LabrPopuStruChgService.findAll());
    }

}
