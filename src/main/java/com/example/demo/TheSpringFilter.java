package com.example.demo;

import javax.servlet.*;
import java.io.IOException;

public class TheSpringFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //call ALL SPRING SECURITY FILTERS
    }

    @Override
    public void destroy() {

    }
}
