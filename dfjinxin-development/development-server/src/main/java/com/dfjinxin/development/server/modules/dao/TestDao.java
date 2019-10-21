package com.dfjinxin.development.server.modules.dao;

import com.dfjinxin.development.api.entity.Test;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-20 01:08:46
 */
@Repository
@Mapper
public interface TestDao extends BaseMapper<Test> {
	
}
