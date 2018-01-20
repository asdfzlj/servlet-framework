package com.beatles.demo.controller.base;

import java.io.Serializable;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhang lj
 * @createTime 2018年1月21日 上午1:58:57
 */
public abstract class BaseController extends HttpServlet implements Serializable {

	protected abstract void doGet(HttpServletRequest request, HttpServletResponse response);

	protected abstract void doPost(HttpServletRequest request, HttpServletResponse response);

	protected abstract void doPut(HttpServletRequest request, HttpServletResponse response);

	protected abstract void doDelete(HttpServletRequest request, HttpServletResponse response);

	/**
	 * 处理请求
	 * 
	 * @param request
	 * @return
	 */
	protected String getID(HttpServletRequest request) {
		String url = request.getRequestURL().toString();
		String id = null;
		if (url.endsWith("/")) {
			url = url.substring(0, url.length() - 1);
		}
		id = url.substring(url.lastIndexOf("/") + 1);
		return id;
	}
}
