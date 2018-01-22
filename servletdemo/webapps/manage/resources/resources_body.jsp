<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/manage/commons/taglibs.jsp"%>

<div id="toolbar" class="btn-group">
	<button id="btn_add" type="button" class="btn btn-primary"
		data-toggle="modal" data-target="#resources_add_modal">
		<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
	</button>
</div>
<table id="resourcesGrid" class=".table-bordered"></table>

<div class="modal fade" id="resources_add_modal" tabindex="-1"
	role="dialog" aria-labelledby="exampleModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="exampleModalLabel">添加资源</h4>
			</div>
			<div class="modal-body">
				<form id="resourcesForm" class="form-horizontal" role="form">
					<div class="form-group">
						<label for="title" class="col-sm-2 control-label">资源名称</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="title">
						</div>
					</div>
					<div class="hr-line-dashed"></div>
					<div class="form-group">
						<label for="pid" class="col-sm-2 control-label">上级资源:</label>
						<div class="col-sm-10">
							<select class="form-control" id="pid">
								<option value="1">首页</option>
								<option value="2">系统管理</option>
							</select>
						</div>
					</div>
					<div class="hr-line-dashed"></div>
					<div class="form-group">
						<label for="url" class="col-sm-2 control-label">资源地址:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="url">
						</div>
					</div>
					<div class="hr-line-dashed"></div>
					<div class="form-group">
						<label for="icon" class="col-sm-2 control-label">资源图标:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="icon">
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-primary" id="btnAdd">添加</button>
			</div>
		</div>
	</div>
</div>
