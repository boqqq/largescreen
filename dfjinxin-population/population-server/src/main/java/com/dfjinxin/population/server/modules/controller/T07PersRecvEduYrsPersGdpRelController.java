package com.dfjinxin.population.server.modules.controller;

import java.util.Arrays;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T07PersRecvEduYrsPersGdpRel;
import com.dfjinxin.population.server.modules.service.T07PersRecvEduYrsPersGdpRelService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT07PersRecvEduYrsPersGdpRelController;
import com.dfjinxin.commons.core.util.api.Response;



/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 10:05:51
 */
@RestController
public class T07PersRecvEduYrsPersGdpRelController implements IT07PersRecvEduYrsPersGdpRelController{

    @Autowired
    private T07PersRecvEduYrsPersGdpRelService t07PersRecvEduYrsPersGdpRelService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        PageUtils page = t07PersRecvEduYrsPersGdpRelService.queryPage(params);

        return Response.ok().put("page", page);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T07PersRecvEduYrsPersGdpRel t07PersRecvEduYrsPersGdpRel){
		t07PersRecvEduYrsPersGdpRelService.save(t07PersRecvEduYrsPersGdpRel);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T07PersRecvEduYrsPersGdpRel t07PersRecvEduYrsPersGdpRel){
		t07PersRecvEduYrsPersGdpRelService.updateById(t07PersRecvEduYrsPersGdpRel);

        return Response.ok();
    }


}
