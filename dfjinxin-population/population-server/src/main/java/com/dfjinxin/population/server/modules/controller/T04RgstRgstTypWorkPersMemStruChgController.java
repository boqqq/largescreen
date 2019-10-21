package com.dfjinxin.population.server.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T04RgstRgstTypWorkPersMemStruChg;
import com.dfjinxin.population.server.modules.service.T04RgstRgstTypWorkPersMemStruChgService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT04RgstRgstTypWorkPersMemStruChgController;



/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:52:34
 */
@RestController
public class T04RgstRgstTypWorkPersMemStruChgController implements IT04RgstRgstTypWorkPersMemStruChgController{

    @Autowired
    private T04RgstRgstTypWorkPersMemStruChgService t04RgstRgstTypWorkPersMemStruChgService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T04RgstRgstTypWorkPersMemStruChg> T01LabrPopuRatioList = t04RgstRgstTypWorkPersMemStruChgService.getList(params);

        return Response.ok().put("list", T01LabrPopuRatioList);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T04RgstRgstTypWorkPersMemStruChg t04RgstRgstTypWorkPersMemStruChg){
		t04RgstRgstTypWorkPersMemStruChgService.save(t04RgstRgstTypWorkPersMemStruChg);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T04RgstRgstTypWorkPersMemStruChg t04RgstRgstTypWorkPersMemStruChg){
		t04RgstRgstTypWorkPersMemStruChgService.updateById(t04RgstRgstTypWorkPersMemStruChg);

        return Response.ok();
    }


}
