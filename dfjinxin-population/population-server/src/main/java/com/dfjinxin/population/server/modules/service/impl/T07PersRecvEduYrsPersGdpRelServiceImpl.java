package com.dfjinxin.population.server.modules.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;

import com.dfjinxin.population.server.modules.dao.T07PersRecvEduYrsPersGdpRelDao;
import com.dfjinxin.population.api.entity.T07PersRecvEduYrsPersGdpRel;
import com.dfjinxin.population.server.modules.service.T07PersRecvEduYrsPersGdpRelService;


@Service("t07PersRecvEduYrsPersGdpRelService")
public class T07PersRecvEduYrsPersGdpRelServiceImpl extends ServiceImpl<T07PersRecvEduYrsPersGdpRelDao, T07PersRecvEduYrsPersGdpRel> implements T07PersRecvEduYrsPersGdpRelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T07PersRecvEduYrsPersGdpRel> page = this.page(
                new Query<T07PersRecvEduYrsPersGdpRel>().getPage(params),
                new QueryWrapper<T07PersRecvEduYrsPersGdpRel>()
        );

        return new PageUtils(page);
    }

}