package org.bizinfinitas.timesheet.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class UserLoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        HttpSession currentSession = request.getSession(false);
        if (currentSession == null) {
            return false;
        }
        if (currentSession.getAttribute("loggedUser") == null) {
            return false;
        }
        return true;
    }
}
