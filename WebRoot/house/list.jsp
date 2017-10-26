<%@ page language="java" pageEncoding="utf-8"%>
<%@ page import="cn.tedu.entity.PageInfo"%>
<%@ page import="cn.tedu.entity.House"%>
<%@ page import="cn.tedu.entity.Type"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!Doctype html>
<html>
	<head>
		<title>sohu租房 - 浏览</title>
		<meta content="text/html; charset=utf-8" http-equiv=content-type>
		<link rel="stylesheet" type="text/css" href="<%=path%>/css/style.css">
	</head>
	<body>
		<div id=header class=wrap>
			<div id=logo>
				<img src="<%=path%>/images/logo.gif">
			</div>
		</div>
		<div id=navbar class=wrap>
			<dl class="search clearfix">
				<form id=sform method=post action="<%=path %>/house/search.do">
					<dt>
						<ul>
							<li class=bold>
								房屋信息
							</li>
							<li>
								标题：
								<input class=text type=text name="title" />
								<label class=ui-blue>
									<input onclick=dosearch() value=搜索房屋 type=button name=search>
								</label>
							</li>
						</ul>
					</dt>
					<dd>
						<ul>
							<li class=first>
								价格
							</li>
							<li>
								<select name="price">
									<option selected value="">
										不限
									</option>
									<option value="0-100">
										100元以下
									</option>
									<option value="100-200">
										100元—200元
									</option>
									<option value="200-1000000">
										200元以上
									</option>
								</select>
							</li>
						</ul>
					</dd>
					<dd>
						<ul>
							<li class=first>
								房屋位置
							</li>
							<li>
								<select id=street name="street_id">
									<option selected value="">
										不限
									</option>
									<option value="1000">
										知春路
									</option>
									<option value="1001">
										中关村大街
									</option>
									<option value="1002">
										学院路
									</option>
									<option value="1003">
										朝阳路
									</option>
								</select>
							</li>
						</ul>
					</dd>
					<dd>
						<ul>
							<li class=first>
								房型
							</li>
							<li>
								<select name="type_id">
									<option selected value="">
										不限
									</option>
									<option value="1000">
										一室一厅
									</option>
									<option value="1001">
										一室两厅
									</option>
									<option value="1002">
										两室一厅
									</option>
									<option value="1003">
										两室两厅
									</option>
								</select>
							</li>
						</ul>
					</dd>
					<dd>
						<ul>
							<li class=first>
								面积
							</li>
							<li>
								<select name="floorage">
									<option selected value="">
										不限
									</option>
									<option value="0-40">
										40以下
									</option>
									<option value="40-500">
										40-500
									</option>
									<option value="500-1000000">
										500以上
									</option>
								</select>
							</li>
						</ul>
					</dd>
				</form>
			</dl>
		</div>
		<div class="main wrap">
			<table class=house-list>
				<tbody>
				<%
					/*Object o = request.getAttribute("pageInfo");
					PageInfo<House> pageInfo = (PageInfo<House>)o;
					List<House> pageList = pageInfo.getPageList();
					int count = pageInfo.getCount(); //总记录数
					int totalPages = pageInfo.getTotalPages();//总页数
					int pageIndex = pageInfo.getPageIndex(); //当前页*/

				 %>
				
				<s:iterator value="pageInfo.pageList"> 
					<tr>
						<td class=house-thumb>
							<span><img src="<%=path %>/images/thumb_house.gif" width="100" height="75" alt="">						
							</span>
						</td>
						<td>
							<dl>
								<dt>
									<a href="<%=path %>/house/detail.do?id=<s:property value="id"/>" target="_blank"><s:property value="title"/></a>
								</dt>
								<dd>									<s:property value="street.district.name"/>
									<s:property value="street.name"/>
									<s:property value="description"/>,
									<s:property value="floorage"/>平米
									<br>
									联系方式：<s:property value="contact"/>
								</dd>
							</dl>
						</td>
						<td class=house-type>
							<s:property value="type.name"/>
						</td>
						<td class=house-price>
							<span><s:property value="price"/></span>元/月
						</td>
					</tr>
					</s:iterator>
					<tr>
						无租房信息
					</tr>
				</tbody>
			</table>
			<div class=pager>
				<ul>
					<li class=current>
						<a href="<%=path %>/house/list.do?pageIndex=1">首页</a>
					</li>
					<li>
						<s:if test="pageInfo.pageIndex>1">
							<a href="<%=path %>/house/list.do?pageIndex=<s:property value="pageInfo.pageIndex-1"/>">上一页</a>
						</s:if>
					</li>
					<li>
						<s:if test="pageInfo.pageIndex < pageInfo.totalPages">
						<a href="<%=path %>/house/list.do?pageIndex=<s:property value="pageInfo.pageIndex+1"/>">下一页</a>
						</s:if>
					</li>
					<li>
						<a href="<%=path %>/house/list.do?pageIndex=<s:property value="pageInfo.totalPages"/>">末页</a>
					</li>
				</ul>
				<span class=total><s:property value="pageInfo.pageIndex"/>/<s:property value="pageInfo.totalPages"/>页</span>
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
