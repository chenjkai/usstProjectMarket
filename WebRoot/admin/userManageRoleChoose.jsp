<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
    <title>����ҳ</title>
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
		<div><span>ѡ���ɫ:</span>
			<span>
				<select id="role" name="role">
					<option value="0" selected>----</option>
					<option value="1">ѧУ</option>
					<option value="2">ѧԺ</option>
					<option value="3">��ҵ</option>
					<option value="4">��ʦ</option>
					<option value="5">ѧ��</option>
				</select>
			</span>
		<span><input type="submit" value="�ύ"/></span>
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

