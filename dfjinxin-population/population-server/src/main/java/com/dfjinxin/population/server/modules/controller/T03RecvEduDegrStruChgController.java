package com.dfjinxin.population.server.modules.controller;

import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT03RecvEduDegrStruChgController;
import com.dfjinxin.population.api.entity.T03RecvEduDegrStruChg;
import com.dfjinxin.population.server.modules.service.T03RecvEduDegrStruChgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;



/**
 * 受教育程度结构变化
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@RestController
public class T03RecvEduDegrStruChgController implements IT03RecvEduDegrStruChgController{

    @Autowired
    private T03RecvEduDegrStruChgService t03RecvEduDegrStruChgService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        PageUtils page = t03RecvEduDegrStruChgService.queryPage(params);

        return Response.ok().put("page", page);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T03RecvEduDegrStruChg t03RecvEduDegrStruChg){
		t03RecvEduDegrStruChgService.save(t03RecvEduDegrStruChg);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T03RecvEduDegrStruChg t03RecvEduDegrStruChg){
		t03RecvEduDegrStruChgService.updateById(t03RecvEduDegrStruChg);

        return Response.ok();
    }

    @Override
    public Response findAll(){
        return Response.ok().put("edu",t03RecvEduDegrStruChgService.findAll());
    }
}
