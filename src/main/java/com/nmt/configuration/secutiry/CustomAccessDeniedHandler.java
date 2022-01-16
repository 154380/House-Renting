package com.nmt.configuration.secutiry;

import com.nmt.exception.ForbiddenException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException, ForbiddenException{
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        response.sendRedirect("/access-denied");
    }
}
