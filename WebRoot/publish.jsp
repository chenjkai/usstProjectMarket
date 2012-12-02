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
   	<script type="text/javascript" src="js/ckeditor/ckeditor.js"></script>
   	<script type="text/javascript" src="js/ckeditor-config.js"></script>
   	<script type="text/javascript" src="js/publish_project.js"></script>
    <script type="text/javascript" src="js/calendar.js"></script>
   	
   	<script type="text/javascript">
 		
		window.onload = function()
			{	
		
				CKEDITOR.replace('editor',
					{
						 customConfig:'js/ckeditor-config.js'
					}
				);
				
			};
	</script>
	
	
  </head>
  

  <body>

  	<div id="container">
  		<jsp:include page="top.jsp"></jsp:include>
  		<div id="left">
  			<jsp:include page="left.jsp"></jsp:include>
  		</div>
  		<div id="position">位置：<a href="home.action">首页</a>》发布项目</div>
  		<div id="projects">
  			<div id="project_description">
				<form action="saveProject.action" method="post">
					<br/>
					
					<center>发布项目</center>
					<br/>
					
					<div class="label">项目标题：&nbsp;<input id="project_title" type="text" name="projectTitle" maxlength="100"/> 100字以内</div>
					<div class="label">联系电话：&nbsp;<input id="project_phone" type="text" name="projectPhone" maxlength="20"/>  20字以内</div>
					
					<div class="label">项目类型：
						<select id="project_type" name="projectType">
							<option value="0">---</option>
							<option value="1">快速</option>
							<option value="2">具体</option>
						</select>
						
						面向对象：
						<select id="project_object" name="projectObject">
							<option value="0">----</option>
							<option value="1">学校</option>
							<option value="2">学院</option>
							<option value="3">企业</option>
							<option value="4">教师</option>
							<option value="5">学生</option>
							
						</select>
						</div>
					
					<div class="label">
						<span id="select_left">
							项目类别：
							<select id="firstList" name="firstList">
								<option value="0">-----</option>
								<option value="1">新能源</option>
								<option value="2">高效清洁能源</option>
								<option value="3">工业装备</option>
								<option value="4">现代服务业</option>
							</select>
							
						</span>
						<span id="select_right">
							<select id="secondList" name="secondList">
								<option value="0">-----</option>
							</select>
						</span>
					</div>
					
					
						<div class="label">描述：</div><textarea id="editor" name="editor"></textarea>
						
					
						<center><input id="project_submit" type="submit" value="发布"/></center>
						
				</form>
			</div>
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
