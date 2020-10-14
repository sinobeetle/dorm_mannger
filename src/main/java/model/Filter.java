package model;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter(filterName = "Filter")

public class Filter implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("站点网址：http://www.runoob.com");
        System.out.println();
        chain.doFilter(req, resp);


    }

    public void init(FilterConfig config) throws ServletException {
        String Site= config.getInitParameter("Site");
        System.out.println("4151515156156156156156");
    }
}
