<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>����ҳ</title>
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
	
  	<div id="container">
  		<jsp:include page="top.jsp"></jsp:include>
  		<div id="left">
  			<jsp:include page="left.jsp"></jsp:include>
  		</div>
  		
  		<s:set name="project" value="#request.project"></s:set>
  		<s:set name="flag" value="#request.flag"></s:set>
  		<s:set name="related" value="#request.related"></s:set>
  		<s:set name="user" value="#session['user']"></s:set>
  		<input id="projectId" type="hidden" value="${project.id}"/>
  		<input id="userId" type="hidden" value="${user.id}"/>
  		<input id="projectStatus" type="hidden" value="${project.status}"/>
  		
			<div id="position">λ�ã�<a href="home.action">��ҳ</a>��${project.secondlist.firstlist.name}��<a href="showprojects.action?secondlist=<s:property value="#project.secondlist.id"/>&&currentPage=1">${project.secondlist.name}</a>��${project.title} </div> 	
				
			<div id="project">
  			 <div class="project_title">
  			 
  			 	<s:property value="#project.title"/>
  			
  			 </div>

  			 <div class="project_content">${project.description}</div>
  			 <div class="project_detial"><s:property value="#project.detail"/></div>
  			 <div class="tail">
  			 	  <div class="project_publisher">��  ��  �� ��<s:property value="#project.company.companyName"/></div>
  			 	  <div class="project_date">�������ڣ�<s:property value="#project.pubtime.toLocaleString()"/></div>
  			 
  			 <s:if test="#related"> 
  			 	<s:if test="#project.status>2">
  			 		<div class="attachment"><a id="viewattachement" href="showAttachment.action?projectId=<s:property value="#project.id"/>">�鿴��Ŀ��������չ</a></div>
  			 	</s:if>
  			 </s:if>
  			 	
  			 </div>
  			 <div class="tool_bar">
  			 		<s:if test="#flag"><a id="vote" href="#" class="">ȡ��Ͷ��</a></s:if>
  			  		<s:else><a id="vote" href="#" class="">Ͷ��</a></s:else>
  			  </div>
  			 <div class="project_replies">
  			 	
  			 </div>			
  		</div>
  		<div id="footer">
  			<jsp:include page="footer.jsp"></jsp:include>
  		</div>
  	</div>
  </body>
</html>
