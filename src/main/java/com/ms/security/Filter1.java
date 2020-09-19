package com.ms.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Slf4j
@Order(1)
@Component
public class Filter1 implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //filter 2 defe ishledi
        //private key infrastructure
        log.trace("My Servlet filter in action {} {} {}", request.getParameterMap(), response, chain);
        chain.doFilter(request, response); //
        log.trace("My Servlet filter end");
    }
}
