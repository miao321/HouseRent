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
		<title>sohu租房 - 详细页面</title>
		<meta content="text/html; charset=utf-8" http-equiv=content-type>
		<link rel="stylesheet" type="text/css" href="<%=path%>/css/style.css">
	</head>
<body>

<div id=header class=wrap>
<div id=logo><img src="<%=path%>/images/logo.gif"></div>
<div class=search>
<form method=get><input class=text type=text name=keywords>
 <label class="ui-green searchs"><a href="list.htm" target="_blank">搜索房屋</a></label> 
</form></div></div>
<div id=navbar class=wrap>
<dl class="search clearfix">
  <form id=sform method=post action=search.action>
  <dt>
  <ul>
    <li class=bold>房屋信息</li>
    <li>标题：<input class=text type=text name=title> <label class=ui-blue><input onclick=dosearch() value=搜索房屋 type=button name=search></label> 
    </li></ul></dt>
  <dd>
  <ul>
    <li class=first>价格 </li>
    <li><select id=price name=price> <option selected value="">不限</option> 
      <option value=0-100>100元以下</option> <option 
      value=100-200>100元—200元</option> <option 
    value=200-1000000>200元以上</option></select> </li></ul></dd>
  <dd>
  <ul>
    <li class=first>房屋位置</li>
    <li><select id=street name=street_id> <option selected 
      value="">不限</option> <option value=1000>知春路</option> <option 
      value=1001>中关村大街</option> <option value=1002>学院路</option> <option 
      value=1003>朝阳路</option></select> </li></ul></dd>
  <dd>
  <ul>
    <li class=first>房型</li>
    <li><select id=housetype name=type_id> <option selected 
      value="">不限</option> <option value=1000>一室一厅</option> <option 
      value=1001>一室两厅</option> <option value=1002>两室一厅</option> <option 
      value=1003>两室两厅</option></select> </li></ul></dd>
  <dd>
  <ul>
    <li class=first>面积 </li>
    <li><select id=floorage name=floorage> <option selected 
      value="">不限</option> <option value=0-40>40以下</option> <option 
      value=40-500>40-500</option> <option 
    value=500-1000000>500以上</option></select> </li></ul></dd></form></dl></div>
<div id=position class=wrap>当前位置：sohu租房网 - 浏览房源</div>
<div id=view class="main wrap">
<div class=intro>
<div class=lefter>
<h1><s:property value="house.title" /></h1>
<div class=subinfo>2013-06-28 14:06:33.0</div>
<div class=houseinfo>
<p>户　　型：<span><s:property value="house.type.name" /></span></p>
<p>面　　积：<span><s:property value="house.floorage" />m<sup>2</sup></span></p>
<p>位　　置：<span><s:property value="house.street.district.name" />
				<s:property value="house.street.name" /></span></p>
<p>联系方式：<span><s:property value="house.contact" /></span></p></div></div>
<div class=clear></div>
<div class=introduction>
<h2><span><strong>房源详细信息</strong></span></h2>
<div class=content>
<p><s:property value="house.description" /></p></div></div></div></div>
<div id=footer class=wrap>
<dl>
  <dt>sohu租房 © 2010 sohu 京icp证1000001号</dt>
  <dd>关于我们 · 联系方式 · 意见反馈 · 帮助中心</dd></dl></div>
</body>
</html>
