<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<title>${htmlTitleText}</title>
<%@ include file="/manage/commons/commons_resource_head.jsp"%>

<jsp:include page="/manage/${modelName}/${modelName}_css.jsp"
	flush="true" />

</head>
<body class="no-skin">

	<%@ include file="public_page_header.jsp"%>
	<div class="main-container" id="main-container">
		<script type="text/javascript">
			try {
				ace.settings.check('main-container', 'fixed')
			} catch (e) {
			}
		</script>

		<%@ include file="public_page_menu.jsp"%>
		<div class="main-content">
			<%@ include file="/manage/public/public_page_crumbs.jsp"%>
			<div class="main-content-inner">
				<div class="page-content">
					<%@include file="/manage/public/public_page_setting.jsp"%>
					<jsp:include page="/manage/${modelName}/${modelName}_body.jsp"
						flush="true" />
				</div>
			</div>

		</div>
		<%@ include file="public_page_footer.jsp"%>
		<a href="#" id="btn-scroll-up"
			class="btn-scroll-up btn btn-sm btn-inverse display"> <i
			class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
		</a>
	</div>
	<%@ include file="/manage/commons/commons_resource_foot.jsp"%>
	<jsp:include page="/manage/${modelName}/${modelName}_js.jsp"
		flush="true" />

</body>
</html>