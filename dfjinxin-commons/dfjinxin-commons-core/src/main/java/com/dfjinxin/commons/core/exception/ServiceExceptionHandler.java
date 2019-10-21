package com.dfjinxin.commons.core.exception;

import com.dfjinxin.commons.core.util.CodeUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice("com.dfjinxin")
@Slf4j
public class ServiceExceptionHandler {
    /** 自定义的ServiceException异常所对应的HttpStatus */
    public static final int ServiceException_HttpStatus = 999;

    @Value("${spring.application.name}")
    private String app;

    @ExceptionHandler(ServiceException.class)
    @ResponseBody
    public FeignClientError handleServiceException(ServiceException e, HttpServletRequest request, HttpServletResponse response) {
        response.setStatus(ServiceException_HttpStatus);
        log.error("Controller处理发生错误: {}:{} ", e.getCode(), e.getMessage(), e);
        e.setApp(app);
        FeignClientError error = new FeignClientError(e);
        error.addInfo("path", request.getServletPath());
        error.addInfo("method", request.getMethod());

        return error;
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public FeignClientError handleRuntimeException(RuntimeException e, HttpServletRequest request, HttpServletResponse response) {
        response.setStatus(ServiceException_HttpStatus);

        log.error("Controller处理发生错误: {}:{} ", "IllegalArgumentException", e.getMessage(), e);
        FeignClientError error = new FeignClientError(app, e);
        error.addInfo("path", request.getServletPath());
        error.addInfo("method", request.getMethod());

        return error;
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public FeignClientError handleException(Exception e, HttpServletRequest request, HttpServletResponse response) {
        response.setStatus(ServiceException_HttpStatus);

        log.error("Controller处理发生错误: {}:{} ", "IllegalArgumentException", e.getMessage(), e);
        FeignClientError error = new FeignClientError(app, new RuntimeException(e.getMessage()));
        error.addInfo("path", request.getServletPath());
        error.addInfo("method", request.getMethod());

        return error;
    }

}
