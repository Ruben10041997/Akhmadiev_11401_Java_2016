package ru.kpfu.itis.ra.security;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



public class AccessDenyHandler implements AccessDeniedHandler {

    private String errorPage;

    public AccessDenyHandler() {
    }

    public AccessDenyHandler(String errorPage) {
        this.errorPage = errorPage;
    }

    public String getErrorPage() {
        return errorPage;
    }

    public void setErrorPage(String errorPage) {
        this.errorPage = errorPage;
    }

    public void handle(HttpServletRequest request, HttpServletResponse response,
                       AccessDeniedException e) throws IOException, ServletException {
        response.sendRedirect("/accessdeny");
    }
}