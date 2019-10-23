package com.dfjinxin.population.server.modules.controller;

import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT03PopuGenderStruController;
import com.dfjinxin.population.api.entity.T03PopuGenderStru;
import com.dfjinxin.population.server.modules.service.T03PopuGenderStruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;



/**
 * 人口性别结构
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@RestController
public class T03PopuGenderStruController implements IT03PopuGenderStruController{

    @Autowired
    private T03PopuGenderStruService t03PopuGenderStruService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        PageUtils page = t03PopuGenderStruService.queryPage(params);

        return Response.ok().put("page", page);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T03PopuGenderStru t03PopuGenderStru){
		t03PopuGenderStruService.save(t03PopuGenderStru);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T03PopuGenderStru t03PopuGenderStru){
		t03PopuGenderStruService.updateById(t03PopuGenderStru);

        return Response.ok();
    }

    @Override
    public Response findAll(){
        return Response.ok().put("sexData",t03PopuGenderStruService.findAll());
    }
}
