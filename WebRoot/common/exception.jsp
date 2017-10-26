<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!Doctype html>
<html>
	<head>
		<title></title>
		<meta content="text/html; charset=utf-8" http-equiv=content-type>
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/style.css">
		</head><body>
		<div>
			<div class="wrap">
				<s:property value="exception.message"/>
			</div>
		</div>
		<div id=footer class=wrap>
			<dl>
				<dt>
					sohu租房 © 2010 sohu 京icp证1000001号
				</dt>
				<dd>
					关于我们 · 联系方式 · 意见反馈 · 帮助中心
				</dd>
			</dl>
		</div>
	</body>
</html>
