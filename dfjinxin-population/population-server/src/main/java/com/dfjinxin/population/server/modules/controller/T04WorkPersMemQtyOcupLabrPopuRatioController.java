package com.dfjinxin.population.server.modules.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T04WorkPersMemQtyOcupLabrPopuRatio;
import com.dfjinxin.population.server.modules.service.T04WorkPersMemQtyOcupLabrPopuRatioService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT04WorkPersMemQtyOcupLabrPopuRatioController;
import com.dfjinxin.commons.core.util.api.Response;



/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:15:22
 */
@RestController
public class T04WorkPersMemQtyOcupLabrPopuRatioController implements IT04WorkPersMemQtyOcupLabrPopuRatioController{

    @Autowired
    private T04WorkPersMemQtyOcupLabrPopuRatioService t04WorkPersMemQtyOcupLabrPopuRatioService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T04WorkPersMemQtyOcupLabrPopuRatio> list = t04WorkPersMemQtyOcupLabrPopuRatioService.getList(params);

        return Response.ok().put("list", list);
    }

    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T04WorkPersMemQtyOcupLabrPopuRatio t04WorkPersMemQtyOcupLabrPopuRatio){
		t04WorkPersMemQtyOcupLabrPopuRatioService.save(t04WorkPersMemQtyOcupLabrPopuRatio);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T04WorkPersMemQtyOcupLabrPopuRatio t04WorkPersMemQtyOcupLabrPopuRatio){
		t04WorkPersMemQtyOcupLabrPopuRatioService.updateById(t04WorkPersMemQtyOcupLabrPopuRatio);

        return Response.ok();
    }


}
