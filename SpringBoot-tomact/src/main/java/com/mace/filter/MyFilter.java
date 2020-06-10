package com.mace.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-10 20:55
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Myfilter run");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
