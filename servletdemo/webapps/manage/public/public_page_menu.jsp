<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/manage/commons/taglibs.jsp"%>
<div id="sidebar"
	class="sidebar responsive  ace-save-state">
	<script type="text/javascript">
		try {
			ace.settings.loadState('sidebar')
		} catch (e) {
		}
	</script>

	<div class="sidebar-shortcuts" id="sidebar-shortcuts">
		<!-- sidebar shortcuts -->
		<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
			<button class="btn btn-success">
				<i class="ace-icon fa fa-signal"></i>
			</button>

			<button class="btn btn-info">
				<i class="ace-icon fa fa-pencil"></i>
			</button>

			<button class="btn btn-warning">
				<i class="ace-icon fa fa-users"></i>
			</button>

			<button class="btn btn-danger">
				<i class="ace-icon fa fa-cogs"></i>
			</button>
		</div>

		<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
			<span class="btn btn-success"></span> <span class="btn btn-info"></span>

			<span class="btn btn-warning"></span> <span class="btn btn-danger"></span>
		</div>
	</div>
	<!-- /.sidebar-shortcuts -->
	<!-- menu container -->
	<ul class="nav nav-list">
		<li class="active"><a href="${ctx }/manage/index/index.jsp"> <i
				class="menu-icon fa  fa-home"></i> <span class="menu-text">
					首页 </span>
		</a> <b class="arrow"></b></li>

		<li class=""><a href="#" class="dropdown-toggle"> <i
				class="menu-icon fa fa-desktop"></i> <span class="menu-text">
					系统管理 </span> <b class="arrow fa fa-angle-down"></b>
		</a> <b class="arrow"></b>

			<ul class="submenu">
				<li class=""><a href="typography.html"> <i
						class="menu-icon fa fa-caret-right"></i> 系统配置
				</a> <b class="arrow"></b></li>

				<li class=""><a href="elements.html"> <i
						class="menu-icon fa fa-caret-right"></i> 字典管理
				</a> <b class="arrow"></b></li>

				<li class=""><a href="buttons.html"> <i
						class="menu-icon fa fa-caret-right"></i> 用户管理
				</a> <b class="arrow"></b></li>

				<li class=""><a href="content-slider.html"> <i
						class="menu-icon fa fa-caret-right"></i> 部门管理
				</a> <b class="arrow"></b></li>

				<li class=""><a href="treeview.html"> <i
						class="menu-icon fa fa-caret-right"></i> 资源管理
				</a> <b class="arrow"></b></li>
			</ul></li>
	</ul>
	<!-- /.nav-list -->

	<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
		<i id="sidebar-toggle-icon"
			class="ace-icon fa fa-angle-double-left ace-save-state"
			data-icon1="ace-icon fa fa-angle-double-left"
			data-icon2="ace-icon fa fa-angle-double-right"></i>
	</div>
	<script type="text/javascript">
		try {
			ace.settings.check('sidebar', 'collapsed')
		} catch (e) {
		}
	</script>
</div>