<%@ page language="java" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
%>
<!Doctype html>
<html>
	<head>
		<title>sohu租房 - 用户注册</title>
		<meta content="text/html; charset=utf-8" http-equiv=content-type>
		<link rel="stylesheet" type="text/css" href="<%=path%>/css/style.css">		
		<body>
			<div class="wrap">
				注册成功，3秒之后跳转到登录页面!
				<meta http-equiv="refresh" content="3;url=<%=path%>/login.jsp" />
			</div>
			<div id="footer" class="wrap">
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
