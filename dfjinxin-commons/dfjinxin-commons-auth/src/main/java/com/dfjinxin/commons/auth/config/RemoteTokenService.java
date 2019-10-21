package com.dfjinxin.commons.auth.config;

import com.dfjinxin.commons.core.enums.UrlEnum;
import com.dfjinxin.commons.core.util.CodeUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.exceptions.InvalidTokenException;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.AccessTokenConverter;
import org.springframework.security.oauth2.provider.token.DefaultAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.rmi.ServerException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Slf4j
public class RemoteTokenService extends RemoteTokenServices {

    @Value("${security.oauth2.client.client-id}")
    private String clientId;

    @Value("${security.oauth2.client.client-secret}")
    private String clientSecret;

    @Value("${dfjinxin.auth.url}")
    private String authUrl;

    @Autowired
    private RestTemplate restTemplate;

    private String tokenName = "token";

    /**
     * 鉴权模式
     */
    public static final String[] GRANT_TYPE = {"password", "refresh_token", "access_token"};

    private AccessTokenConverter tokenConverter = new DefaultAccessTokenConverter();

    @Override
    public OAuth2Authentication loadAuthentication(String accessToken) throws AuthenticationException, InvalidTokenException {
        MultiValueMap<String, String> formData = new LinkedMultiValueMap<String, String>();
        formData.add(tokenName, accessToken);
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", getAuthorizationHeader(clientId, clientSecret));
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        Map<String, Object> map = new HashMap<>();

        try {
            map = restTemplate.exchange(authUrl + UrlEnum.CHECK_TOKEN_URL.getUrl(), HttpMethod.POST,
                    new HttpEntity<>(formData, headers), Map.class).getBody();
            //error -> invalid_token
            if("invalid_token".equals(map.get("error"))){
                log.error("令牌失效");
            }
        } catch (Exception e) {
            log.error("令牌校验异常", e);
        }
        return tokenConverter.extractAuthentication(map);
    }

    @Override
    public OAuth2AccessToken readAccessToken(String accessToken) {
        throw new UnsupportedOperationException("Not supported: read access token");
    }

    private String getAuthorizationHeader(String clientId, String clientSecret) {

        if (clientId == null || clientSecret == null) {
            logger.warn("Null Client ID or Client Secret detected. Endpoint that requires authentication will reject request with 401 error.");
        }

        String creds = String.format("%s:%s", clientId, clientSecret);
        try {
            return "Basic " + new String(Base64.encode(creds.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Could not convert String");
        }
    }

}
