<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!Doctype html>
<html>
	<head>
		<title></title>
		<meta content="text/html; charset=utf-8" http-equiv=content-type>
		<link rel="stylesheet" type="text/css" href="<%=path%>/css/style.css">
		</head><body>
		<div>
			<div class="wrap">
				页面没有发现，，3秒之后跳转到登录页面!
				<meta http-equiv="refresh" content="3;url=<%=path%>/login.jsp" />
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
