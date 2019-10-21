package com.dfjinxin.commons.mybatis;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.dfjinxin.commons.core.id.IdGenerator;
import com.dfjinxin.commons.mybatis.handler.MyBatisPlusIdHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class MybtisPlusConfiguration {
    @Bean
    @ConditionalOnClass(IdGenerator.class)
    public MetaObjectHandler autoFillIdHandler(IdGenerator idGenerator) {
        log.info("初始化 Mybatis-Plus 主键生成器");
        return new MyBatisPlusIdHandler(idGenerator);
    }
}
