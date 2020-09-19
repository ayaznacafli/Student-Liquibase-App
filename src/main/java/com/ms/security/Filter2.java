package com.ms.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Slf4j
@Order(2)
@Component
public class Filter2 implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.trace("My Servlet filter 2 in action {} {} {}", request.getParameterMap(), response, chain);
        chain.doFilter(request, response); //->Controller ->
        log.trace("My Servlet 2 Filter end");
    }
}
