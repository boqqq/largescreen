//package com.dfjinxin.commons.auth.compoment;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.oauth2.common.OAuth2AccessToken;
//import org.springframework.security.oauth2.provider.authentication.BearerTokenExtractor;
//import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
//import org.springframework.security.oauth2.provider.authentication.TokenExtractor;
//import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.Enumeration;
//
//public class DfjinxinBearerTokenExtractor implements TokenExtractor {
//
//    private final static Log logger = LogFactory.getLog(BearerTokenExtractor.class);
//
//    @Override
//    public Authentication extract(HttpServletRequest request) {
//        String tokenValue = extractToken(request);
//        if (tokenValue != null) {
//            PreAuthenticatedAuthenticationToken authentication = new PreAuthenticatedAuthenticationToken(tokenValue, "");
//            return authentication;
//        }
//        return null;
//    }
//
//    protected String extractToken(HttpServletRequest request) {
//        // first check the header...
//        String token = extractHeaderToken(request);
//
//        // bearer type allows a request parameter as well
//        if (token == null) {
//            logger.debug("Token not found in headers. Trying request parameters.");
//            token = request.getParameter(OAuth2AccessToken.ACCESS_TOKEN);
//            if (token == null) {
//                logger.debug("Token not found in request parameters.  Not an OAuth2 request.");
//            } else {
//                request.setAttribute(OAuth2AuthenticationDetails.ACCESS_TOKEN_TYPE, OAuth2AccessToken.BEARER_TYPE);
//            }
//        }
//
//        return token;
//    }
//
//    /**
//     * Extract the OAuth bearer token from a header.
//     *
//     * @param request The request.
//     * @return The token, or null if no OAuth authorization header was supplied.
//     */
//    protected String extractHeaderToken(HttpServletRequest request) {
//        Enumeration<String> headers = request.getHeaders("cookie");
//        while (headers.hasMoreElements()) {
//            String value = headers.nextElement();
//            if (!value.contains("access_token")) {
//                return null;
//            }
//            String accessToken = value.substring(value.indexOf("access_token="), value.indexOf("access_token=") + 55);
//            String authorization = accessToken.substring(13);
//            String authHeaderValue = handleToken(request, authorization);
//            if (authHeaderValue != null) return authHeaderValue;
//        }
//
//        Enumeration<String> authHeaders = request.getHeaders("Authorization");
//        while (authHeaders.hasMoreElements()) {
//            String authorization = authHeaders.nextElement();
//            String authHeaderValue = handleToken(request, authorization);
//            if (authHeaderValue != null) return authHeaderValue;
//        }
//
//        return null;
//    }
//
//    private String handleToken(HttpServletRequest request, String authorization) {
//        if ((authorization.toLowerCase().startsWith(OAuth2AccessToken.BEARER_TYPE.toLowerCase()))) {
//            String authHeaderValue = authorization.substring(OAuth2AccessToken.BEARER_TYPE.length()).trim();
//            // Add this here for the auth details later. Would be better to change the signature of this method.
//            request.setAttribute(OAuth2AuthenticationDetails.ACCESS_TOKEN_TYPE,
//                    authorization.substring(0, OAuth2AccessToken.BEARER_TYPE.length()).trim());
//            int commaIndex = authHeaderValue.indexOf(',');
//            if (commaIndex > 0) {
//                authHeaderValue = authHeaderValue.substring(0, commaIndex);
//            }
//            return authHeaderValue;
//        }
//        return null;
//    }
//
//}
