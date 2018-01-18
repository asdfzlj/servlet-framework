<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../commons/taglibs.jsp"%>
<div id="sidebar" class="sidebar responsive sidebar-fixed sidebar-scroll">
	<script type="text/javascript">
		try {
			ace.settings.check('sidebar','fixed')
		} catch (e) {
		}
	</script>

	<!-- /.sidebar-shortcuts -->

	<ul class="nav nav-list" style="top: 0px;">
		<c:choose>
			<c:when test="${modleName=='index' }">
				<li class="active">
			</c:when>
			<c:otherwise>
				<li>
			</c:otherwise>
		</c:choose>

		<a href="/index">
			<i class="menu-icon fa fa-home"></i>
			<span class="menu-text"> 首页 </span>
		</a>

		<b class="arrow"></b>
		</li>

		<c:choose>
			<c:when test="${modleName=='present_query' }">
				<li class="active hsub">
			</c:when>
			<c:otherwise>
				<li>
			</c:otherwise>
		</c:choose>
		<a href="/present/query/index">
			<i class="menu-icon fa fa-search"></i>
			<span class="menu-text"> 考勤查询 </span>
		</a>
		</li>

		<c:choose>
			<c:when test="${modleName=='present_check' }">
				<li class="active hsub">
			</c:when>
			<c:otherwise>
				<li>
			</c:otherwise>
		</c:choose>
		<a href="/present/check/search/index">
			<i class="menu-icon fa fa-gavel"></i>

			<span class="menu-text"> 考勤审核 </span>

		</a>
		</li>
		
		<li class="hsub">
			<a href="#" class="dropdown-toggle">
				<i class="menu-icon fa fa-cog"></i>

				<span class="menu-text"> 系统管理 </span>

				<b class="arrow fa fa-angle-down"></b>
			</a>

			<b class="arrow"></b>

			<ul class="submenu">
				<li class="">
					<a href="faq.html">
						<i class="menu-icon fa fa-caret-right"></i>
						用户管理
					</a>

					<b class="arrow"></b>
				</li>

				<li class="">
					<a href="error-404.html">
						<i class="menu-icon fa fa-caret-right"></i>
						角色管理
					</a>

					<b class="arrow"></b>
				</li>

				<li class="">
					<a href="permission.html">
						<i class="menu-icon fa fa-caret-right"></i>
						权限管理
					</a>

					<b class="arrow"></b>
				</li>

			</ul>
		</li>
	</ul>
	<!-- /.nav-list -->

	<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
		<i class="ace-icon fa fa-angle-double-left" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
	</div>

	<script type="text/javascript">
		try {
			ace.settings.check('sidebar','collapsed')
		} catch (e) {
		}
	</script>
</div>