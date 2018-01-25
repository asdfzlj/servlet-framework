<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/manage/commons/taglibs.jsp"%>
<script src="${vendorsBase}/bootstrap-table/bootstrap-table.min.js"></script>
<script
	src="${vendorsBase}/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
<script
	src="${vendorsBase}/bootstrap-table/extensions/treegrid/bootstrap-table-treegrid.js"></script>
<script src="${vendorsBase}/treeGrid/jquery.treegrid.js"></script>
<script
	src="${vendorsBase }/bootstrap-validator/js/bootstrapValidator.min.js"></script>
<script
	src="${vendorsBase }/bootstrap-treeview/bootstrap-treeview.min.js"></script>
<script type="text/javascript">
	var $table = $('#resourcesGrid');
	$(function() {
		/*数据列表*/
		$table.bootstrapTable({
			url : '${ctx}/resources',
			height : $(window).height(),
			striped : true,
			toolbar : '#toolbar',
			search : true,
			showColumns : true,
			height : '100%',
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
		/*表单验证操作*/
		$('form').bootstrapValidator({
			message : 'This value is not valid',
			feedbackIcons : {
				valid : 'glyphicon glyphicon-ok',
				invalid : 'glyphicon glyphicon-remove',
				validating : 'glyphicon glyphicon-refresh'
			},
			fields : {
				title : {
					message : '资源名称验证失败',
					validators : {
						notEmpty : {
							message : '资源名称不能为空'
						}
					}
				}
			}
		});
		/*下拉树型结构*/
		$("#treeview").treeview({
			data : 0,
			icon : "glyphicon glyphicon-stop",
			selectedIcon : "glyphicon glyphicon-stop",
			collapseIcon : "glyphicon glyphicon-minus",
			expandIcon : "glyphicon glyphicon-plus",
			color : "#000000",
			backColor : "#FFFFFF",
			showIcon : true,
			showCheckbox : false,
			onhoverColor : "#E8E8E8",
			showBorder : true,
			showTags : true,
			highlightSelected : true,
			highlightSearchResults : false,
			selectedBackColor : "#8D9CAA",
			levels : 3,
			tags : [ 'available' ],
			onNodeSelected : function(event, data) {
				if (data.id == undefined || data.id == null) {
					return;
				}
				$("input[name='parentId']").val(data.id);
				$("input[name='parentNodeId']").val(data.nodeId);
			},
			onNodeExpanded : function(event, data) {
				$.ajax({
					type : "Post",
					url : "${ctx}/resources/op=treeView?id=" + data.id,
					dataType : "json",
					success : function(result) {
						for (var index = 0; index < result.length; index++) {
							var item = result[index];
							$("#tree1").treeview("addNode", [ data.nodeId, {
								node : {
									text : item.text,
									id : item.id
								},
								silent : true
							} ]);
						}
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
