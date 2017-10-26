<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!Doctype html>
<html>
	<head>
		<title>sohu租房 - 用户登录</title>
		<meta content="text/html; charset=utf-8" http-equiv=content-type>
		<link rel="stylesheet" type="text/css" href="<%=path%>/css/style.css">
		<script>
		function checkLogin() {
			var nameObj = document.getElementById("name");
			var passwordObj = document.getElementById("password");
		
			if (nameObj == null || nameObj.value == null || nameObj.value == "") {
				window.alert("用户名不能为空");
				return false;
			}
			if (passwordObj == null || passwordObj.value == null
					|| passwordObj.value == "") {
				window.alert("密码不能为空");
				return false;
			}
			
			return true;
		}
		function jump(url) {
			window.location = url;
		}
		</script>
	<body>
		<div id=header class=wrap>
			<div id=logo>
				<img src="<%=path%>/images/logo.gif">
			</div>
		</div>
		<div id=reglogin class=wrap>
			<div class=dialog>
				<div class=box>
					<h4>
						用户登录
					</h4>
					<form action="<%=path%>/login.do" method="get">
						<div class=infos>
							<table class=field>
								<tbody>
									<tr>
										<td colspan=2></td>
									</tr>
									<tr>
										<td class=field>
											用 户 名：
										</td>
										<td>
											<input id="name" class=text type=text name="name">
										</td>
									</tr>
									<tr>
										<td class=field>
											密 码：
										</td>
										<td>
											<input id="password" class=text type=password
												name="password">
										</td>
									</tr>
									<!--
						<tr>
							<td class="field">验 证 码：</td>
							<td><input type="text" class="text verycode" name="verycode" /></td>
						</tr>
						-->
								</tbody>
							</table>
							<div class=buttons>
								<input onclick="return checkLogin()" value="登陆"
									type="submit">
								<input onclick="jump('<%=path%>/register.jsp')" value="注册"
									type="button">
							</div>
						</div>
					</form>
				</div>
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
