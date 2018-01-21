package com.beatles.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.beatles.demo.biz.IResourcesBiz;
import com.beatles.demo.biz.impl.ResourcesBizImpl;
import com.beatles.demo.controller.base.BaseController;
import com.beatles.utils.FastJSONUtils;

/**
 * @author zhang lj
 * @createTime 2018年1月21日 上午1:27:52
 */
@WebServlet("/resources")
public class ResourcesController extends BaseController {
	private Logger logger;
	private IResourcesBiz resourcesBiz;
	@Override
	public void init() throws ServletException {
		logger=Logger.getLogger(this.getClass());
		resourcesBiz=new ResourcesBizImpl();
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().write(FastJSONUtils.toJsonString(resourcesBiz.treeGrid()));
		logger.info(FastJSONUtils.toJsonString(resourcesBiz.treeGrid()));
		logger.info(getID(request));
		response.getWriter().flush();
		response.getWriter().close();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		logger.info(getID(request));
	}

	@Override
	protected void doPut(HttpServletRequest request, HttpServletResponse response) {
		logger.info(getID(request));
	}

	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) {
		logger.info(getID(request));
	}
	
	
}
