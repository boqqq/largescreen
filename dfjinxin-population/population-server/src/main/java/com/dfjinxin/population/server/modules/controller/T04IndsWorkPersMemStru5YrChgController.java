package com.dfjinxin.population.server.modules.controller;

import java.util.Map;

import com.dfjinxin.population.server.modules.dto.T04IndsWorkPersMemStru5YrChgVo;
import com.dfjinxin.population.server.modules.dto.T04IndsWorkPersMemStruVo;
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
        T04IndsWorkPersMemStruVo result = t04IndsWorkPersMemStru5YrChgService.getData(params);

        return Response.ok().put("result", result);
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
