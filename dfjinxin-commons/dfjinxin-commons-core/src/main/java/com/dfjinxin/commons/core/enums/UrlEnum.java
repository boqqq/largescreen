package com.dfjinxin.commons.core.enums;

public enum UrlEnum {

    //oauth2登录
    LOGIN_URL("/oauth/token"),
    CHECK_TOKEN_URL("/oauth/check_token"),

    ;

    private String url;

    UrlEnum(String url) {
        this.url = url;

    }


    public String getUrl() {
        return url;
    }
}
