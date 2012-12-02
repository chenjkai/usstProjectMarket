<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>项目附件</title>
	<link rel="stylesheet" href="css/style.css" type="text/css"/>
   	<link rel="stylesheet" href="css/menu.css" type="text/css"/>
   	<link rel="stylesheet" href="css/css.css" type="text/css"/>
   	<script type="text/javascript" src="js/jquery.js"></script> 
   	<script type="text/javascript" src="js/home.js"></script>
    <script type="text/javascript" src="js/menu.js"></script>
    <script type="text/javascript" src="js/attach.js"></script>
	 <script type="text/javascript" src="js/calendar.js"></script>
	
  </head>
  
  <body>
  	<div id="container">
  		<jsp:include page="top.jsp"></jsp:include>
  		<div id="left">
  			<jsp:include page="left.jsp"></jsp:include>
  		</div>
  		<s:set name="project" value="#request.project"></s:set>
		<div id="position">位置：<a href="home.action">首页</a>》${project.secondlist.firstlist.name}》<a href="showprojects.action?secondlist=<s:property value="#project.secondlist.id"/>&&currentPage=1">${project.secondlist.name}</a>》<a href="showProject.action?projectId=<s:property value="#project.id"/>">${project.title}</a> </div> 	
  		
  		
  		<div id="attachment">
  				<div id="company">
  					<div class="item_title">企业</div>
  					
  								<div class="item_content">
  								<s:set name="attach" value="#request.attach"></s:set>

  								<table>
  								<tr><td>项目详细资料:</td>
  								<s:iterator id="attach1" value="#attach.companynote">
  								<td style="font-size:12px">
  								<a href="downLoad.action?file=<s:property value="#request.projectId"/>\<s:property value="#attach1.name"/>"><s:property value="#attach1.name"/></a> | 
  								</td>
  								</s:iterator>
  								</tr>
  								
  								</table>		
								
  								<table>
  								<tr><td>项目小结:</td>
  								
  								<s:iterator id="attach2" value="#attach.companysummary">
  								<td style="font-size:12px">
  								<a href="downLoad.action?file=<s:property value="#request.projectId"/>\<s:property value="#attach2.name"/>"><s:property value="#attach2.name"/></a> |
  								</td> 
  								</s:iterator>
  								
  								</tr>
  								</table>	
  							
  								<table>
  								<tr><td>项目备案:</td>
  								<s:iterator id="attach3" value="#attach.companybeian">
  								<td style="font-size:12px">
  								<a href="downLoad.action?file=<s:property value="#request.projectId"/>\<s:property value="#attach3.name"/>"><s:property value="#attach3.name"/></a> | 
  								</td>
  								</s:iterator>
  								</tr>
  								</table>	

  						
  						</div>
  					
  				
  				
  				
  				<div id="undertake">
  					<div class="item_title">项目承接人</div>
  				  	<div class="item_content">
  					
  					
  						<table>
  								<tr><td>项目计划：</td>
  								<s:iterator id="attach4" value="#attach.undertakeplan">
  								<td style="font-size:12px">
  								<a href="downLoad.action?file=<s:property value="#request.projectId"/>\<s:property value="#attach4.name"/>"><s:property value="#attach4.name"/></a> | 
  								</td>
  								</s:iterator>
  								</tr>
  						</table>	
  						
  						<table>
  								<tr><td>项目详细资料：</td>
  								<s:iterator id="attach5" value="#attach.undertakenote">
  								<td style="font-size:12px">
  								<a href="downLoad.action?file=<s:property value="#request.projectId"/>\<s:property value="#attach5.name"/>"><s:property value="#attach5.name"/></a> | 
  								</td>
  								</s:iterator>
  								</tr>
  						</table>
  						
  						<table>
  								<tr><td>项目备案：  </td>
  								<s:iterator id="attach6" value="#attach.undertakebeian">
  								<td style="font-size:12px">
  								<a href="downLoad.action?file=<s:property value="#request.projectId"/>\<s:property value="#attach6.name"/>"><s:property value="#attach6.name"/></a> | 
  								</td>
  								</s:iterator>
  								</tr>
  						</table>					
  				  	</div>
  				</div>
  				
  				<div id="upload" >
  					<s:set name="project" value="#request.project"></s:set>
  					<s:form action ="upLoad.action" method ="post" enctype ="multipart/form-data" > 
  					<s:hidden name="projectId" value="%{#project.id}"></s:hidden>
  						<center> <div style="font-size:18px">单次上传文件大小不得超过10M</div></center>
  						<br/>
  						<br/>
  					<div>
  					  	<input id="userrole" type="hidden" value="${role}"/>
  						选择上传类别：
  						<select id="userRole" name="userRole">
  						<option value="0">---------</option>
  						<s:if test="#userrole=3">
  						<option value="1">企业</option>
  						</s:if>
  						<s:else>
  							<option value="2">项目承接人</option>
  						</s:else>
  						</select>
  					
  						<select id="classic" name="classic">
  						<option value="0">---------</option>
  						</select>
  					</div>
  					<div>
  						 选择上传文件：<s:file name ="myFile"/>        
  					</div>
  					<div>
  						<s:submit value="上传"/> 
  					</div>
  					</s:form>
  				</div>
 
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
