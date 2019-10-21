package com.dfjinxin.population.server;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.dfjinxin")
@MapperScan(basePackages = "com.dfjinxin.population.server.modules.dao")
public class PopulationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PopulationServerApplication.class, args);
    }

    /** * 分页插件 */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
