package com.deviceseller.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

public class SecurityUtils {

    private static final String ROLE_PREFIX = "ROLE_";
    private static final String AUTH_TYPE = "Bearer";
    private static final String AUTH_TYPE_PREFIX = AUTH_TYPE + " ";

    public static SimpleGrantedAuthority convertToAuthority(String role) {
        String formattedRole = role.startsWith(ROLE_PREFIX) ? role : ROLE_PREFIX + role;
        return new SimpleGrantedAuthority(formattedRole);
    }

    public static String extractAuthTokenFromRequest(HttpServletRequest request) {
        String bearerToken = request.getHeader(HttpHeaders.AUTHORIZATION);
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith(AUTH_TYPE_PREFIX)) {
            return bearerToken.substring(7);
        }
        return null;
    }
}
