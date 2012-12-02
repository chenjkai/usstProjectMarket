<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
    <title>布局页</title>
   	<link rel="stylesheet" href="css/style.css" type="text/css"/>
   	<link rel="stylesheet" href="css/menu.css" type="text/css"/>
   	<link rel="stylesheet" href="css/css.css" type="text/css"/>
   	<script type="text/javascript" src="js/jquery.js"></script> 
    <script type="text/javascript" src="js/menu.js"></script>
   
  </head>
  
  <body>

  	<div id="container">
  		<jsp:include page="top.jsp"></jsp:include>
  		<div id="main">
  			<form action="showUserWaitActive.action" method="post">
	<div>
		<div><span>选择角色:</span>
			<span>
				<select id="role" name="role">
					<option value="0" selected>----</option>
					<option value="1">学校</option>
					<option value="2">学院</option>
					<option value="3">企业</option>
					<option value="4">教师</option>
					<option value="5">学生</option>
				</select>
			</span>
		<span><input type="submit" value="提交"/></span>
		</div>
	
	</div>
 </form> 		
  		</div>
  		<div id="footer">
  			  <jsp:include page="../footer.jsp"></jsp:include>
  		</div>
  	</div>
  </body>
</html>

