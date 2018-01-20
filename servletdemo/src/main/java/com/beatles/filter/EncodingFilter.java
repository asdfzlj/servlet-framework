package com.beatles.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import org.apache.log4j.Logger;

/**
 * 字符编码过滤器
 * 
 * @author zhang lj
 * @createTime 2018年1月21日 上午4:29:42
 */
@WebFilter(filterName = "encodingFilter", urlPatterns = "/*", initParams = {
		@WebInitParam(name = "requestEncoding", value = "utf-8"),
		@WebInitParam(name = "responseEncoding", value = "text/html;charset=utf-8") })
public class EncodingFilter implements Filter {
	private Logger logger;
	private String requestEncoding = "";
	private String responseEncoding = "";

	@Override
	public void destroy() {
		logger.info("encoding filter destroy");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding(requestEncoding);
		response.setContentType(responseEncoding);
		chain.doFilter(request, response);

	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		logger=Logger.getLogger(this.getClass());
		requestEncoding = config.getInitParameter("requestEncoding");
		responseEncoding = config.getInitParameter("responseEncoding");
		logger.info("initial request encoding:" + requestEncoding + ",initial response encoding:" + responseEncoding);
	}

}
