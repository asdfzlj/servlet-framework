<%--
	提供标签和全局变量
 --%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<c:set var="base" value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}" />
<%--版本变量 --%>
<c:set var="version" value="1"></c:set>
<%--全局html title --%>
<c:set var="htmlTitleText" value="Demo管理平台"></c:set>
<%--全局版权信息 --%>
<c:set var="copyright" value="demo.com"></c:set>
<%--定义资源路径变量 --%>
<c:set var="mimeBase" value="${base }/assets" />
<%--定义ace资源的路径 变量 --%>
<c:set var="ace" value="${ctx }/assets/ace"/>
<%--定义组件的路径变量 --%>
<c:set var="vendorsBase" value="${base }/assets/vendors" />