package com.dfjinxin.development.server;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.dfjinxin")
@MapperScan(basePackages = "com.dfjinxin.development.server.modules.dao")
public class DevelopmentServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevelopmentServerApplication.class, args);
    }

    /** * 分页插件 */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
