<!-- basic scripts -->

<!--[if !IE]> -->
<script src="${ace }/js/jquery-2.1.4.min.js"></script>

<!-- <![endif]-->

<!--[if IE]>
<script src="${ace}/js/jquery-1.11.3.min.js"></script>
<![endif]-->
<script type="text/javascript">
	if ('ontouchstart' in document.documentElement)
		document.write("<script src='${ace}/js/jquery.mobile.custom.min.js'>"
				+ "<"+"/script>");
</script>
<script src="${ace }/js/bootstrap.min.js"></script>

<!-- page specific plugin scripts -->

<!--[if lte IE 8]>
		  <script src="${ace}/js/excanvas.min.js"></script>
		<![endif]-->
<script src="${ace}/js/jquery-ui.custom.min.js"></script>
<script src="${ace}/js/jquery.ui.touch-punch.min.js"></script>
<script src="${ace}/js/jquery.easypiechart.min.js"></script>
<script src="${ace}/js/jquery.sparkline.index.min.js"></script>
<script src="${ace}/js/jquery.flot.min.js"></script>
<script src="${ace}/js/jquery.flot.pie.min.js"></script>
<script src="${ace}/js/jquery.flot.resize.min.js"></script>

<!-- ace scripts -->
<script src="${ace}/js/ace-elements.min.js"></script>
<script src="${ace}/js/ace.min.js"></script>