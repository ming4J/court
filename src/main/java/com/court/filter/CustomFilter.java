package com.court.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author zJay~
 *
 */
@WebFilter(filterName="customFilter",urlPatterns="/*")  
public class CustomFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Filtler Init....");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		response.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		HttpServletResponse res = (HttpServletResponse) response;
		res.setHeader("Access-Control-Allow-Origin","*");
		res.setHeader("Access-Control-Allow-Methods","POST,GET,OPTIONS,DELETE");
		res.setHeader("Access-Control-Max-Age","3600");
		res.setHeader("Access-Control-Allow-Headers","Origin, X-Requested-With, Content-Type, Accept");
		chain.doFilter(request, response);  
	}

	@Override
	public void destroy() {
		System.out.println("Filtler Destroy....");
	}

	
}
