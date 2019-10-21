package com.dfjinxin.commons.core.exception;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 服务器错误
 */
@Data
@Accessors(chain = true)
public class FeignClientError implements Serializable {
    private static final long serialVersionUID = 4334496367387951036L;

    private String app;
    private String code;
    private String message;
    private Map<String, String> infos;

    public FeignClientError() {
    }

    public FeignClientError(ServiceException e) {
        app = e.getApp();
        code = e.getCode();
        message = e.getMessage();
        if (e.getInfos() != null) {
            infos = new HashMap<>(e.getInfos());
        }
    }

    public FeignClientError(String app, RuntimeException e) {
        this.app = app;
        code = e.getClass().getCanonicalName();
        message = e.getMessage();
    }

    public void addInfo(String key, String value) {
        if (!StringUtils.hasText(key) || !StringUtils.hasText(value)) {
            return;
        }

        if (infos == null) {
            infos = new HashMap<>();
        }
        infos.put(key, value);
    }
}
