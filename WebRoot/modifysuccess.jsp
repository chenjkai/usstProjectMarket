<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>布局页</title>
   	<link rel="stylesheet" href="css/style.css" type="text/css"/>
   	<link rel="stylesheet" href="css/menu.css" type="text/css"/>
   	<link rel="stylesheet" href="css/css.css" type="text/css"/>
   	<script type="text/javascript" src="js/jquery.js"></script> 
   	<script type="text/javascript" src="js/home.js"></script>
    <script type="text/javascript" src="js/menu.js"></script>
    <script type="text/javascript" src="js/project.js"></script>
    <script type="text/javascript" src="js/calendar.js"></script>
    
  </head>
  
  <body>
	<s:set name="role" value="#session['role']"></s:set>
	<s:set name="user" value="#session['user']"></s:set>
	
  	<div id="container">
  		<jsp:include page="top.jsp"></jsp:include>
  		<div id="left">
  			<jsp:include page="left.jsp"></jsp:include>
  		</div>
  		
  		<div id="position">位置：</div>
  		<div id="project">
  			<div style="height:200px"></div>
  			<div style="font-size:20px;text-align:center">修改成功<a href="showUserInfo.action?role=<s:property value="#role"/>&&userId=<s:property value="#user.id"/>">返回</a></div>
  		</div>
  		<div id="footer">
  			<br>
  			版权所有&copy; 2008 上海理工大学
  			<br>  
			地址：上海市军工路516号  &nbsp;&nbsp;  邮编：200093
  		</div>
  	</div>
  </body>
</html>
