package com.example.demo.interceptor;

import com.example.demo.core.inter.CustomCoreInterface;
import com.example.demo.model.api.ErrorResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class CustomInterceptor implements HandlerInterceptor {

    @Autowired
    private CustomCoreInterface CustomCoreInterface; 
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        if (request.getHeader("Authorization") == null) {
            response.setContentType("application/json");
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            
            ErrorResponse errRes = new ErrorResponse("Unauthorization", HttpStatus.UNAUTHORIZED.value());
            response.getWriter().print(this.CustomCoreInterface.GetJSONObject(errRes));
            return false;
        }
        System.out.println("Pre Handle method is Calling");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
            Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("Post Handle method is Calling");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception) throws Exception {

        System.out.println("Request and Response is completed");
    }
}
