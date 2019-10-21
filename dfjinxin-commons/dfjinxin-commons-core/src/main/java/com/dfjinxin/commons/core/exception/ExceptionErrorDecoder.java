package com.dfjinxin.commons.core.exception;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.Collection;

@Slf4j
public class ExceptionErrorDecoder implements ErrorDecoder {
    @Autowired
    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Exception decode(String methodKey, Response response) {
        int status = response.status();

        switch (status) {
            case ServiceExceptionHandler.ServiceException_HttpStatus:
                Collection<String> contentTypes = response.headers().get("Content-Type");

                if (contentTypes != null && contentTypes.stream().anyMatch(contentType -> contentType.contains("application/json"))) {
                    try {
                        FeignClientError error = objectMapper.readValue(response.body().asInputStream(), FeignClientError.class);
                        return new ServiceException(error);
                    } catch (IOException e) {
                        log.error("返回状态码为999时，解析ResponseBody失败", e);
                        return e;
                    }
                } else {
                    log.error("返回状态码为999, 但Content-Type不包含'application/json'. Content-Type: {}", contentTypes);
                    return new IllegalStateException("Content-Type is not 'application/json'");
                }
            default:
                return new ErrorDecoder.Default().decode(methodKey, response);
        }
    }
}
