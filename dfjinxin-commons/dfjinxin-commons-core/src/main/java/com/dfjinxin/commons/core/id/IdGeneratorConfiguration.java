package com.dfjinxin.commons.core.id;

import com.dfjinxin.commons.core.id.impl.SnowflakeIdGenerator;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "dfjinxin.core.idgenerator")
@Setter
@Slf4j
public class IdGeneratorConfiguration {
    private Long datacenter;
    private Long worker;

    @Bean("idGenerator")
    @ConditionalOnProperty(name = "dfjinxin.core.idgenerator.mode", havingValue = "snowflake")
    public IdGenerator snowflakeIdGenerator() {
        return new SnowflakeIdGenerator(datacenter, worker);
    }
}
