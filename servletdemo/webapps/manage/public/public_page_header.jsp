<%@ page language="java" pageEncoding="UTF-8"%>
<div id="navbar" class="navbar navbar-default navbar-fixed-top">
	<script type="text/javascript">
		try {
			ace.settings.check('navbar','fixed')
		} catch (e) {
		}
	</script>

	<div class="navbar-container" id="navbar-container">
		<button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler">
			<span class="sr-only">Toggle sidebar</span>

			<span class="icon-bar"></span>

			<span class="icon-bar"></span>

			<span class="icon-bar"></span>
		</button>

		<div class="navbar-header pull-left">
			<a href="/" class="navbar-brand">
				<small>
					<i class="fa fa-leaf"></i>
					职业生崖管理后台
				</small>
			</a>
		</div>

		<div class="navbar-buttons navbar-header pull-right" role="navigation">
			<ul class="nav ace-nav">

				<li class="light-blue">
					<a data-toggle="dropdown" href="#" class="dropdown-toggle">
						<img class="nav-user-photo" src="${vendorsBase}/ace/avatars/avatar2.png" alt="Jason's Photo">
						<span class="user-info">
							<small>欢迎,</small>
							${user.loginname }
						</span>

						<i class="ace-icon fa fa-caret-down"></i>
					</a>
					<ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
						<li>
							<a href="/logout">
								<i class="ace-icon fa fa-power-off"></i>
								退出
							</a>
						</li>
					</ul>
				</li>
			</ul>
		</div>
	</div>
	<!-- /.navbar-container -->
</div>