<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<title>${htmlTitleText}</title>
<%@ include file="/manage/commons/commons_resource_head.jsp"%>

<jsp:include page="/manage/${modleName}/${modleName}_css.jsp" flush="true" />

</head>
<body class="no-skin">

	<%@ include file="public_page_header.jsp"%>
	<div class="main-container" id="main-container">
		<script type="text/javascript">
			try {
				ace.settings.check('main-container','fixed')
			} catch (e) {
			}
		</script>

		<%@ include file="public_page_menu.jsp"%>
		<div class="main-content">
			<jsp:include page="/manage/${modleName}/${modleName}_body.jsp" flush="true" />
		</div>
		<%@ include file="public_page_footer.jsp"%>
		<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse display">
			<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
		</a>
	</div>
	<%@ include file="/manage/commons/commons_resource_foot.jsp"%>
	<jsp:include page="/manage/${modleName}/${modleName}_js.jsp" flush="true" />

</body>
</html>