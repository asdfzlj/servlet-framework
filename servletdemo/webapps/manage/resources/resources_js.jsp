<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/manage/commons/taglibs.jsp"%>
<script src="${vendorsBase}/bootstrap-table/bootstrap-table.min.js"></script>
<script
	src="${vendorsBase}/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
<script
	src="${vendorsBase}/bootstrap-table/extensions/treegrid/bootstrap-table-treegrid.js"></script>
<script src="${vendorsBase}/treeGrid/jquery.treegrid.js"></script>
<script type="text/javascript">
	var $table = $('#resourcesGrid');
	$(function() {
		$table.bootstrapTable({
			url : '${ctx}/resources',
			height : $(window).height(),
			striped : true,
			toolbar : '#toolbar',
			search : true,
			showColumns : true,
			height:'100%',
			showRefresh : true,
			showToggle : true,
			//sidePagination: 'server',
			idField : 'id',
			columns : [ {
				field : 'ck',
				checkbox : true
			}, {
				field : 'id',
				title : '资源编号',
				align : 'center'
			}, {
				field : 'title',
				title : '资源名称',
				align : 'center'
			}, {
				field : 'url',
				title : '资源地址',
				align : 'center'
			}, {
				field : 'icon',
				title : 'icon',
				align : 'center'
			}, {
				field : 'state',
				title : '状态',
				align : 'center'
			}, {
				field : 'seq',
				title : '排序',
				align : 'center'
			} ],
			treeShowField : 'title',
			parentIdField : 'pid',
			onLoadSuccess : function(data) {
				console.log(data);
				//jquery.treegrid.js
				$table.treegrid({
					initialState : 'collapsed',
					treeColumn : 2,
					expanderExpandedClass : 'glyphicon glyphicon-minus',
					expanderCollapsedClass : 'glyphicon glyphicon-plus',
					onChange : function() {
						$table.bootstrapTable('resetWidth');
					}
				});
			}
		});
	});

	// 格式化类型
	/*  function typeFormatter(value, row, index) {
	   if (value === 'menu') {
	     return '菜单';
	   }
	   if (value === 'button') {
	     return '按钮';
	   }
	   if (value === 'api') {
	     return '接口';
	   }
	   return '-';
	 } */

	// 格式化状态
	/* function statusFormatter(value, row, index) {
	  if (value === 1) {
	    return '<span class="label label-success">正常</span>';
	  } else {
	    return '<span class="label label-default">锁定</span>';
	  } 
	}*/
</script>
