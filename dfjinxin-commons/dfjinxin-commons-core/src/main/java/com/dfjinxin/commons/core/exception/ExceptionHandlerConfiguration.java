package com.dfjinxin.commons.core.exception;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExceptionHandlerConfiguration {
    @Bean
    @ConditionalOnMissingBean(ServiceExceptionHandler.class)
    public ServiceExceptionHandler serviceExceptionHandler() {
        return new ServiceExceptionHandler();
    }

    @Bean
    public ExceptionErrorDecoder exceptionErrorDecoder() {
        return new ExceptionErrorDecoder();
    }
}
