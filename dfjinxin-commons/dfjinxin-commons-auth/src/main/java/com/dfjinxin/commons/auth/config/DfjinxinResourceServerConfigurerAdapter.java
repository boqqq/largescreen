package com.dfjinxin.commons.auth.config;

import com.dfjinxin.commons.auth.compoment.DfjinxinUserAuthenticationConverter;
import com.dfjinxin.commons.auth.compoment.ResourceAuthExceptionEntryPoint;
import com.dfjinxin.commons.core.config.FilterIgnorePropertiesConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.authentication.TokenExtractor;
import org.springframework.security.oauth2.provider.token.DefaultAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.security.oauth2.provider.token.UserAuthenticationConverter;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.web.client.RestTemplate;

@Slf4j
public class DfjinxinResourceServerConfigurerAdapter extends ResourceServerConfigurerAdapter {

    @Autowired
    private FilterIgnorePropertiesConfig ignorePropertiesConfig;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    protected RemoteTokenServices remoteTokenServices;
    @Autowired
    protected ResourceAuthExceptionEntryPoint resourceAuthExceptionEntryPoint;
    @Autowired
    private AccessDeniedHandler dfjinxinAccessDeniedHandler;
//    @Autowired
//    private TokenExtractor tokenExtractor;

    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.cors().and().csrf().disable();
        //允许使用iframe 嵌套，避免swagger-ui 不被加载的问题
        httpSecurity.headers().frameOptions().disable();
//        ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry registry = httpSecurity.authorizeRequests();
//        ignorePropertiesConfig.getUrls().forEach(url -> registry.antMatchers(url).permitAll());
        httpSecurity.authorizeRequests().antMatchers("/**").permitAll();
    }

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {

        DefaultAccessTokenConverter accessTokenConverter = new DefaultAccessTokenConverter();
        UserAuthenticationConverter userTokenConverter = new DfjinxinUserAuthenticationConverter();
        accessTokenConverter.setUserTokenConverter(userTokenConverter);

        remoteTokenServices.setAccessTokenConverter(accessTokenConverter);
        remoteTokenServices.setRestTemplate(restTemplate);
        resources.tokenServices(remoteTokenServices);

        resources.authenticationEntryPoint(resourceAuthExceptionEntryPoint);
        resources.accessDeniedHandler(dfjinxinAccessDeniedHandler);

//        resources.tokenExtractor(tokenExtractor);
    }
}
