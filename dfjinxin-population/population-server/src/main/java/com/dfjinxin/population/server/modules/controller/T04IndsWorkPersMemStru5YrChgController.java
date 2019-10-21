package com.dfjinxin.population.server.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T04IndsWorkPersMemStru5YrChg;
import com.dfjinxin.population.server.modules.service.T04IndsWorkPersMemStru5YrChgService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT04IndsWorkPersMemStru5YrChgController;



/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:53:25
 */
@RestController
public class T04IndsWorkPersMemStru5YrChgController implements IT04IndsWorkPersMemStru5YrChgController{

    @Autowired
    private T04IndsWorkPersMemStru5YrChgService t04IndsWorkPersMemStru5YrChgService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T04IndsWorkPersMemStru5YrChg> T01LabrPopuRatioList = t04IndsWorkPersMemStru5YrChgService.getList(params);

        return Response.ok().put("list", T01LabrPopuRatioList);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T04IndsWorkPersMemStru5YrChg t04IndsWorkPersMemStru5YrChg){
		t04IndsWorkPersMemStru5YrChgService.save(t04IndsWorkPersMemStru5YrChg);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T04IndsWorkPersMemStru5YrChg t04IndsWorkPersMemStru5YrChg){
		t04IndsWorkPersMemStru5YrChgService.updateById(t04IndsWorkPersMemStru5YrChg);

        return Response.ok();
    }


}
