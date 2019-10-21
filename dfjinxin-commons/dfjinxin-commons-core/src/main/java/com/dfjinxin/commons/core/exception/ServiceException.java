package com.dfjinxin.commons.core.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一业务异常处理类
 *
 */
@Getter
public class ServiceException extends RuntimeException {
    @Setter
    private String app;
    private final String code;
    private final Map<String, String> infos = new HashMap<>();

    public ServiceException(String code, String msg) {
        super(msg);
        this.code = code;
    }

    public ServiceException(String code, String msg, Throwable cause) {
        super(msg, cause);
        this.code = code;
    }

    public ServiceException(FeignClientError feignClientError, Throwable cause) {
        super(feignClientError.getMessage(), cause);
        this.code = feignClientError.getCode();
    }

    public ServiceException(FeignClientError feignClientError) {
        super(feignClientError.getMessage());
        this.app = feignClientError.getApp();
        this.code = feignClientError.getCode();
    }


    public void addInfo(String key, String value) {
        if (!StringUtils.hasText(key) || !StringUtils.hasText(value)) {
            return;
        }

        infos.put(key, value);
    }
}
