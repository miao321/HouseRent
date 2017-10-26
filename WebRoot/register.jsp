<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!Doctype html>
<html>
	<head>
		<title>sohu租房 - 用户注册</title>
		<meta content="text/html; charset=utf-8" http-equiv=content-type>
		<link rel="stylesheet" type="text/css" href="<%=path%>/css/style.css">
		<script>
function check() {
	var nameObj = document.getElementById("name");
	var passwordObj = document.getElementById("password");
	var repasswordObj = document.getElementById("repassword");

	if (nameObj == null || nameObj.value == null || nameObj.value == "") {
		window.alert("用户名不能为空");
		return false;
	}
	if (passwordObj == null || passwordObj.value == null
			|| passwordObj.value == "") {
		window.alert("密码不能为空");
		return false;
	}
	if (passwordObj.value != repasswordObj.value) {
		window.alert("密码和重复密码不能为空");
		return false;
	}

	return true;
}
</script>
		<body>
			<div id="header" class="wrap">
				<div id="logo">
					<img src="<%=path%>/images/logo.gif">
				</div>
			</div>
			<div id="reglogin" class="wrap">
				<div class="dialog">
					<dl class="clearfix">
						<dt>
							新用户注册
						</dt>
						<dd class="past">
							填写个人信息
						</dd>
					</dl>
					<div class="box">
						<form action="<%=path%>/register.do" method="get">
							<div class="infos">
								<table class="field">
									<tbody>
										<tr>
											<td class="field">
												用 户 名：
											</td>
											<td>
												<input class="text" type="text" id="name" name="name">
											</td>
										</tr>
										<tr>
											<td class="field">
												密 码：
											</td>
											<td>
												<input class="text" type="password" id="password"
													name="password">
											</td>
										</tr>
										<tr>
											<td class="field">
												重复密码：
											</td>
											<td>
												<input class="text" type="password" id="repassword"
													name="repassword">
											</td>
										</tr>
										<tr>
											<td class="field">
												电 话：
											</td>
											<td>
												<input class="text" type="text" name="telephone">
											</td>
										</tr>
										<tr>
											<td class="field">
												用户姓名：
											</td>
											<td>
												<input class="text" type="text" name="username">
											</td>
										</tr>
									</tbody>
								</table>
								<div class="buttons">
									<input value="立即注册" type="submit" onclick="return check();">
								</div>
							</div>
						</form>
						<div>
							<div>
								<!-- 显示action中定义的errorMsg信息 -->
								<s:property value="errorMsg" />
								<!-- 显示异常的message信息 -->
								<s:property value="exception.message" />
								</td>
								</td>

							</div>
						</div>
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
