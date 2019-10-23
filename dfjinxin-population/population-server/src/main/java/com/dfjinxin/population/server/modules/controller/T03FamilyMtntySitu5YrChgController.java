package com.dfjinxin.population.server.modules.controller;

import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT03FamilyMtntySitu5YrChgController;
import com.dfjinxin.population.api.entity.T03FamilyMtntySitu5YrChg;
import com.dfjinxin.population.server.modules.service.T03FamilyMtntySitu5YrChgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;



/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:39:27
 */
@RestController
public class T03FamilyMtntySitu5YrChgController implements IT03FamilyMtntySitu5YrChgController{

    @Autowired
    private T03FamilyMtntySitu5YrChgService t03FamilyMtntySitu5YrChgService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        PageUtils page = t03FamilyMtntySitu5YrChgService.queryPage(params);

        return Response.ok().put("page", page);
    }
    /**
     * 查询所有
     */
    @Override
    public Response findALL(){
        Map resMap = t03FamilyMtntySitu5YrChgService.findAll();
        return Response.ok().put("page", resMap);
    }

    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T03FamilyMtntySitu5YrChg t03FamilyMtntySitu5YrChg){
		t03FamilyMtntySitu5YrChgService.save(t03FamilyMtntySitu5YrChg);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T03FamilyMtntySitu5YrChg t03FamilyMtntySitu5YrChg){
		t03FamilyMtntySitu5YrChgService.updateById(t03FamilyMtntySitu5YrChg);

        return Response.ok();
    }


}
