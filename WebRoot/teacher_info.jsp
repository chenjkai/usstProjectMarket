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
	<s:set name="pr" value="#request.professor"></s:set>
	<s:set name="user" value="session['user']"></s:set>
	<s:set name="role" value="session['role']"></s:set>
  	<div id="container"> 
  		<jsp:include page="top.jsp"></jsp:include>
  		<div id="left">
  			<jsp:include page="left.jsp"></jsp:include>
  		</div>
  		<div id="position">λ�ã�<a href="home.action">��ҳ</a>��<s:property value="#pr.name"/>������ҳ
  			
		</div> 	
				
		<div id="user_info">
  			 <div class="user_photo">
  			 	<img src="image/default_head.gif" height="200px" width="200px"/>
  			 </div>
  			<div class="user_simaple_info">
  				<div class="name">
  					<s:property value="#pr.name"/>
  				</div>
  				
  				<div class="info_item">
  					
  				</div>
  				
  				<div class="border">
					
  						<div class="info_item">
  							ѧУ��<s:property value="#pr.school.name"/>      <s:if test="#role==4"> <s:if test="#user.id==#pr.id"><span class="modify_info"> <a href="showmodifyinfo.action" id="modify_basic">�޸ĸ�����Ϣ</a></span></s:if></s:if>
  						</div>
  						<div class="info_item">
  							ѧԺ��<s:property value="#pr.college.name"/>
  						</div>
  						<div class="info_item">
  							רҵ��<s:property value="#pr.major"/>
  						</div>  
  						<div class="info_item">
  							ְ�ƣ�<s:if test="#pr.positiorl==1">����</s:if><s:elseif test="#pr.positiorl==2">������</s:elseif><s:else>��ʦ</s:else>
  						</div> 
  						<div class="info_item">
  							���䣺<s:property value="#pr.email"/>
  						</div>
  						<div class="info_item">
  							�绰��<s:property value="#pr.tel"/>
  						</div>  
  					
  					
  				</div>				
  			</div>
  			<div class="user_introduction">
  				<div class="title">
  					���˼��
  				</div>
  				<div class="content">
  					${pr.introduction}
  				</div>
  			</div>
  		</div>
  		<div id="footer">
  			<jsp:include page="footer.jsp"></jsp:include>
  		</div>
  	</div>
  </body>
</html>
