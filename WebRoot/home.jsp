<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>布局页</title>
   	<link rel="stylesheet" href="css/style.css" type="text/css"/>
   	<link rel="stylesheet" href="css/css.css" type="text/css"/>
   	<link rel="stylesheet" href="css/menu.css" type="text/css"/>
   	
   	<script type="text/javascript" src="js/jquery.js"></script> 
   	<script type="text/javascript" src="js/home.js"></script>   
    <script type="text/javascript" src="js/menu.js"></script>
    <script type="text/javascript" src="js/calendar.js"></script>
  </head>
  
  <body>
	
  	<div id="container">
  		<jsp:include page="top.jsp"></jsp:include>
  		<div id="left">
  			<jsp:include page="left.jsp"></jsp:include>
  		</div>
  		
  		<div id="search">
  			<form action="" style="display:inline;">
  				&nbsp;&nbsp;快速检索 &nbsp;&nbsp; <input type="text"/>&nbsp;&nbsp;<input type="submit" value="检索"/>
  			</form>
  		</div>
  		
  		<div id="content">
  		
  			<div id="content_left_top">
  			
  				<span class="list_title">
					<span class="title">最新项目</span>
					<span class="more"><a href="#"><img src="image/more_news.gif"/></a></span>
				</span>
				
				
				<s:iterator id="newproject" value="#request.newprojects">
					<div class="list_content" style="height:20px;"><span class="left"><img src="image/titlehead.bmp"><a href="showProject.action?projectId=<s:property value="#newproject.id"/>"><s:property value="#newproject.title"></s:property></a></span><span class="right"><s:property value="#newproject.publishTime"></s:property></span></div>
				</s:iterator>
				
  				
  			</div>
  			<div id="content_right_top">
				
				<span class="list_title">
					<span class="title">已完成项目</span>
					<span class="more"><a href="#"><img src="image/more_news.gif"/></a></span>
				</span>
				<s:iterator id="completedproject" value="#request.completedprojects">
					<div class="list_content" style="height:20px;"><span class="left"><img src="image/titlehead.bmp"><a href="showProject.action?projectId=<s:property value="#completedproject.id"/>"><s:property value="#completedproject.title"></s:property></a></span><span class="right"><s:property value="#completedproject.publishTime"></s:property></span></div>
				</s:iterator>
				
			</div>
			
  			<div id="content_left_bottom">
  				<span class="list_title">
					<span class="title">人才信息</span>
					<span class="more"><a href="#"><img src="image/more_news.gif"/></a></span>
				</span>
				
				
				
  			
  			</div>
  			<div id="content_right_bottom">
  				<span class="list_title">
					<span class="title">企业信息</span>
					<span class="more"><a href="#"><img src="image/more_news.gif"/></a></span>
				</span>
				
				
				
			</div>
  		</div>
  		<div id="footer">
  			<jsp:include page="footer.jsp"></jsp:include>
  		</div>
  	</div>
  </body>
</html>
