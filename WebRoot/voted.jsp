<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>投标信息</title>
       	
    <link rel="stylesheet" href="css/style.css" type="text/css"/>
   	<link rel="stylesheet" href="css/menu.css" type="text/css"/>
   	<link rel="stylesheet" href="css/css.css" type="text/css"/>
   	<script type="text/javascript" src="js/jquery.js"></script> 
   	<script type="text/javascript" src="js/home.js"></script>
    <script type="text/javascript" src="js/menu.js"></script>
    <script type="text/javascript" src="js/choose.js"></script>
   <script type="text/javascript" src="js/calendar.js"></script>
	
  </head>
  
  <body>
  
    <div id="container">
  		<jsp:include page="top.jsp"></jsp:include>
  		<div id="left">
  			<jsp:include page="left.jsp"></jsp:include>
  		</div>
  		
  		<s:set name="role" value="#request.userRole"></s:set>
  		<s:set name="undertaker" value="#request.undertaker"></s:set>
  		<div id="position">位置：<a href="home.action">首页</a>》<a href="showPublished.action?currentPage=1">已发布项目</a>》竞标人列表</div>
  		<div id="projects">	
  				<s:if test="#role==1">
  						<div id="projects_top">
  						<table>
  						<tr>
  						<td width="150">高校名称</td>
  						<td width="100">联系人</td>
  						<td width="100">电话</td>
  						<td width="180">电子邮件</td>
  						<td width="100">积分</td>
  						<td width="100">
  							操作
  						</td>
  						</tr>
  						</table>
  						</div>
  						
  					<div id="content_mid">
  					<table>
  					<s:set name="schools" value="#request.list.schools"></s:set>
  					<s:iterator value="schools" id="school">
  						<tr>
  						
  						<td width="150">${school.name}</td>
  						<td width="100">${school.contact}</td>
  						<td width="100">${school.tel}</td>
  						<td width="180">${school.email}</td>
  						<td width="100">${school.integration}</td>
  						<td width="100" class="<s:property value="#school.id"/>">
  							<input class="projectId" type="hidden" value="<s:property value="#request.projectId"/>"></input>
  							<input class="userId" type="hidden" value="<s:property value="#school.id"/>"></input>
  							<input class="userRole" type="hidden" value="1"></input>
  							<a class="choose" href="#"><s:if test="#undertaker==0">中标</s:if><s:elseif test="#undertaker==#school.id">取消</s:elseif></a>
  						</td>
  						</tr>
  						
  					</s:iterator>
  					</table>
  					</div>			
  			</s:if>
  			
  			<s:elseif test="#role==2">
  				<div id="projects_top">
  						<table border="1">
  						<tr>
  						<td width="100">高校名称</td>
  						<td width="100">学院名称</td>
  						<td width="100">系主任</td>
  						<td width="100">电话</td>
  						<td width="150">电子邮件</td>
  						<td width="50">积分</td>
  						<td width="50">
  							操作
  						</td>
  						</tr>
  						</table>
  						</div>
  						
  				<div id="content_mid">
  					<table border="1">
  					<s:set name="colleges" value="#request.list.colleges"></s:set>
  					<s:iterator value="colleges" id="college">
  						<tr>
  						<td width="100">${college.name}</td>
  						<td width="100">${college.school.name}</td>
  						<td width="100">${college.deportName}</td>
  						<td width="100">${college.tel}</td>
  						<td width="150">${college.EMail}</td>
  						<td width="50">${college.integration}</td>
  						<td width="50" class="<s:property value="#college.id"/>">
  							<input class="projectId" type="hidden" value="<s:property value="#request.projectId"/>"></input>
  							<input class="userId" type="hidden" value="<s:property value="#college.id"/>"></input>
  							<input class="userRole" type="hidden" value="2"></input>
  							<a class="choose" href="#"><s:if test="#undertaker==0">中标</s:if><s:elseif test="#undertaker==#college.id">取消</s:elseif></a>
  						</td>
  						</tr>
  					</s:iterator>
  					</table>
  				</div>			
  				
  			</s:elseif>
  			
  			<s:elseif test="#role==3">
  				<div id="projects_top">
  						<table border="1">
  						<tr>
  						<td width="100">企业名称</td>
  						<td width="100">联系人</td>
  						<td width="100">电话</td>
  						<td width="150">电子邮件</td>
  						<td width="50">积分</td>
  						<td width="50">
  							操作
  						</td>
  						</tr>
  						</table>
  						</div>
  						
  				<div id="content_mid">
  					<table border="1">
  					<s:set name="companys" value="#request.list.companys"></s:set>
  					<s:iterator value="companys" id="company">
  						<tr>
  						<td width="100">${company.companyName}</td>
  						<td width="100">${company.contact}</td>
  						<td width="100">${company.tel}</td>
  						<td width="150">${company.EMail}</td>
  						<td width="50">${company.integration}</td>
  						<td width="50" class="<s:property value="#company.id"/>">
  							<input class="projectId" type="hidden" value="<s:property value="#request.projectId"/>"></input>
  							<input class="userId" type="hidden" value="<s:property value="#company.id"/>"></input>
  							<input class="userRole" type="hidden" value="3"></input>
  							<a class="choose" href="#"><s:if test="#undertaker==0">中标</s:if><s:elseif test="#undertaker==#company.id">取消</s:elseif></a>
  						</td>
  						</tr>
  					</s:iterator>
  					</table>
  				</div>			
  				
  			</s:elseif>	
  				
  				
  				
  			<s:elseif test="#role==5">
  				<div id="projects_top">
  						<table border="1">
  						<tr>
  						<td width="100">学校</td>
  						<td width="100">学院</td>
  						<td width="100">导师</td>
  						<td width="100">专业</td>
  						<td width="100">姓名</td>
  						<td width="100">电话</td>
  						<td width="150">电子邮件</td>
  						<td width="50">积分</td>
  						<td width="50">
  							操作
  						</td>
  						</tr>
  						</table>
  						</div>
  						
  				<div id="content_mid">
  					<table border="1">
  					<s:set name="students" value="#request.list.students"></s:set>
  					<s:iterator value="students" id="student">
  						<tr>
  						<td width="100">${student.school.name}</td>
  						<td width="100">${student.college.name}</td>
  						<td width="100">${student.professor.name}</td>
  						<td width="100">${student.major}</td>
  						<td width="100">${student.name}</td>
  						<td width="100">${student.tel}</td>
  						<td width="150">${student.email}</td>
  						<td width="50">${student.integration}</td>
  						<td width="50" class="<s:property value="#student.id"/>">
  							<input class="projectId" type="hidden" value="<s:property value="#request.projectId"/>"></input>
  							<input class="userId" type="hidden" value="<s:property value="#student.id"/>"></input>
  							<input class="userRole" type="hidden" value="5"></input>
  							<a class="choose" href="#"><s:if test="#undertaker==0">中标</s:if><s:elseif test="#undertaker==#student.id">取消</s:elseif></a>
  						</td>
  						</tr>
  					</s:iterator>
  					</table>
  				</div>			
  				
  			</s:elseif>		
  				
  			<s:elseif test="#role==4">
  				<div id="projects_top">
  						<table>
  						<tr>
  						<td width="100">姓名</td>
  						<td width="150">学校</td>
  						<td width="150">学院</td>
  						<td width="150">专业</td>
  						<td width="100">职称</td>
  						<td width="50">积分</td>
  						<td width="50">
  							操作
  						</td>
  						</tr>
  						</table>
  						</div>
  						
  				<div id="content_mid">
  					<table>
  					<s:set name="professors" value="#request.list.professor"></s:set>
  					<s:iterator value="professors" id="professor">
  						 <tr> 
  						<td width="100"><a href="showUserInfo.action?role=4&&userId=<s:property value="#professor.id"/>">${professor.name}</a><br></td> 
  						<td width="150">${professor.school.name}<br></td> 
  						<td width="150">${professor.college.name}<br></td> 
  							<td width="150">${professor.major}<br></td> 
  						<td width="100"><s:if test="#professor.positiorl==1">教授</s:if> 
  							<s:elseif test="#professor.positiorl==2">副教授</s:elseif> 
  							<s:elseif test="#professor.positiorl==3">讲师</s:elseif> 
  						</td> 
  						<td width="50">${professor.intergration}</td> 
  						<td width="50" class="<s:property value="#professor.id"/>"> 
  							<input type="hidden" class="projectId" value='<s:property value="#request.projectId"/>'> 
  							<input type="hidden" class="userId" value='<s:property value="#professor.id"/>'> 
  							<input type="hidden" class="userRole" value="4"> 
  							<a class="choose" href="#"><s:if test="#undertaker==0">中标</s:if><s:elseif test="#undertaker==#professor.id">取消</s:elseif></a>
  						</td> 
  						</tr>
  					</s:iterator>
  					</table>
  				</div>			
  				
  			</s:elseif>			
  			
  			
  			<div id="content_bottom">
  				<s:set name="page" value="#request.page"></s:set>
  				
  					<a href="showVoted.action?projectId=<s:property value="#request.projectId"/>&&currentPage=1">首页</a>
  					
  			
  					<s:if test="#page.hasprevious">
  						<a href="showVoted.action?projectId=<s:property value="#request.projectId"/>&&currentPage=<s:property value="#page.currentpage-1"/>">上一页</a>
  					</s:if>
  					<s:else>
  						<a href="showVoted.action?projectId=<s:property value="#request.projectId"/>&&currentPage=<s:property value="#page.currentpage"/>">上一页</a>
  					</s:else>

  					<s:if test="#page.hasnext">
  						<a href="showVoted.action?projectId=<s:property value="#request.projectId"/>&&currentPage=<s:property value="#page.currentpage+1"/>">下一页</a>
  					</s:if>
  					<s:else>
  						<a href="showVoted.action?projectId=<s:property value="#request.projectId"/>&&currentPage=<s:property value="#page.currentpage"/>">下一页</a>
  					</s:else>
		
  				
  						<a href="showVoted.action?projectId=<s:property value="#request.projectId"/>&&currentPage=<s:property value="#page.totalpage"/>">尾页</a>
  					${page.currentpage}/${page.totalpage} 页
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
