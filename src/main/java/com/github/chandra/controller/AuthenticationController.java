package com.github.chandra.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.Map;

@RestController
public class AuthenticationController {

    private static final String NAME="name";
    private static final String ERROR_MESSAGE="error.message";


    @GetMapping("/user")
    public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
        return Collections.singletonMap(NAME, principal.getAttribute(NAME));
    }

    @GetMapping("/error")
    public String error(HttpServletRequest request) {
        String message = (String) request.getSession().getAttribute(ERROR_MESSAGE);
        request.getSession().removeAttribute(ERROR_MESSAGE);
        return message;
    }
}
