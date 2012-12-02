<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title></title>
   	<link rel="stylesheet" href="css/style.css" type="text/css"/>
   	<link rel="stylesheet" href="css/menu.css" type="text/css"/>
   	<link rel="stylesheet" href="css/css.css" type="text/css"/>
   	<link rel="stylesheet" href="css/usertmp.css" type="text/css"/>
   	<script type="text/javascript" src="js/jquery.js"></script> 
   	<script type="text/javascript" src="js/home.js"></script>
    <script type="text/javascript" src="js/menu.js"></script>
    <script type="text/javascript" src="js/project.js"></script>
    <script type="text/javascript" src="js/calendar.js"></script>

  </head>
  
  <body>
	<s:set name="com" value="#request.company"></s:set>
	<s:set name="user" value="session['user']"></s:set>
	<s:set name="role" value="session['role']"></s:set>
  	<div id="container"> 
  		<jsp:include page="top.jsp"></jsp:include>
  		<div id="left">
  			<jsp:include page="left.jsp"></jsp:include>
  		</div>
  		<div id="position">λ�ã�<a href="home.action">��ҳ</a>��<s:property value="#com.companyName"/>������ҳ
  			
		</div> 	
				
		<div id="user_info">
  			 <div class="user_photo">
  			 	<img src="image/default_head.gif" height="200px" width="200px"/>
  			 </div>
  			<div class="user_simaple_info">
  				<div class="name">
  					<s:property value="#com.companyName"/>
  				</div>
  				
  				<div class="info_item">
  					
  				</div>
  				
  				<div class="border">
					
  						<div class="info_item">
  							��ַ��<s:property value="#com.address"/>      <s:if test="#role==3"> <s:if test="#user.id==#com.id"><span class="modify_info"> <a href="showmodifyinfo.action" id="modify_basic">�޸ĸ�����Ϣ</a></span></s:if></s:if>
  						</div>
  						<div class="info_item">
  							�ʱࣺ<s:property value="#com.zip"/>
  						</div>
  						<div class="info_item">
  							�绰��<s:property value="#com.tel"/>
  						</div>  
  						<div class="info_item">
  							���䣺<s:property value="#com.EMail"/>
  						</div> 
  						<div class="info_item">
  							��վ��<a href="<s:property value="#com.web"/>"><s:property value="#com.web"/></a>
  						</div>
  						<div class="info_item">
  							���ˣ�<s:property value="#com.lawer"/>
  						</div>  
  					
  					
  				</div>				
  			</div>
  			<div class="user_introduction">
  				<div class="title">
  					���˼��
  				</div>
  				<div class="content">
  					${com.introduction}
  				</div>
  			</div>
  		</div>
  		<div id="footer">
  			<jsp:include page="footer.jsp"></jsp:include>
  		</div>
  	</div>
  </body>
</html>
