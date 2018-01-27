package com.beatles.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.beatles.demo.biz.IResourcesBiz;
import com.beatles.demo.biz.impl.ResourcesBizImpl;
import com.beatles.demo.controller.base.BaseController;
import com.beatles.demo.entity.Resources;
import com.beatles.utils.FastJSONUtils;

/**
 * @author zhang lj
 * @createTime 2018年1月21日 上午1:27:52
 */
@WebServlet("/resources")
public class ResourcesController extends HttpServlet {
	private Logger logger;
	private IResourcesBiz resourcesBiz;

	public void init() throws ServletException {
		logger = Logger.getLogger(this.getClass());
		resourcesBiz = new ResourcesBizImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		process(request, response);
	}

	protected void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String op = request.getParameter("op");
		if ("resources".equals(op)) {
			resources(request, response);
		} else if ("treeView".equals(op)) {
			treeView(request, response);
		} else if ("add".equals(op)) {
			add(request, response);
		} else {
			resources(request, response);
		}
	}

	/**
	 * 添加操作
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void add(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		Resources t = new Resources();
		t.setIcon(request.getParameter("icon"));
		if (request.getParameter("pid") != null) {
			t.setPid(Integer.parseInt(request.getParameter("pid")));
		}
		if (request.getParameter("seq") != null) {
			t.setSeq(Integer.parseInt(request.getParameter("seq")));
		}
		t.setTitle(request.getParameter("title"));
		t.setUrl(request.getParameter("url"));
		resourcesBiz.add(t);
		out.flush();
		out.close();

	}

	/**
	 * 获取资源列表
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void resources(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().write(FastJSONUtils.toJsonString(resourcesBiz.treeGrid()));
		response.getWriter().flush();
		response.getWriter().close();
	}

	/**
	 * 获取树型结构
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	protected void treeView(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String json = FastJSONUtils.toJsonString(resourcesBiz.treeView(id));
		logger.info(json);
		response.getWriter().write(json);
		response.getWriter().flush();
		response.getWriter().close();
	}

}
