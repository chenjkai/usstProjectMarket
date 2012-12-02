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
   	 	<script type="text/javascript" src="js/menu.js"></script>
   	 	<script type="text/javascript" src="js/projectmanage.js"></script>
  </head>
  
  <body>
	
	
  	<div id="container">
  		<jsp:include page="top.jsp"></jsp:include>
  		<div id="projects_a">	
  			
  			
					
  			<div id="projects_top_a">
  					
  					
  					<table>
  						<tr>
  						<td width="180"><span class="title">项目标题</span></td>
  						<td width="70"><span class="project_type">项目类型</span></td>
  						<td width="60" style="text-algin:center;"><span class="vote_count">投标数量</span></td>
  						<td width="150"><span class="publisher">发布人</span></td>
  						<td width="100"><span class="time">发布时间</span></td>
  						<td width="100">
  							<span class="status">项目状态</span>
  						</td>
  						 <td width="100">
  							<span class="toObject">面向对象</span>
  						</td>
  						<td width="50">
  							操作
  						</td>
  						</tr>
  				</table>			
  			</div>
  			
  			<div id="content_mid_a">
  				<table>
  					<s:iterator value="#request['projects']" id="project">
  						<tr>
  						<td width="180"><a href="showProject.action?projectId=<s:property value="#project.id"/>">${project.title}</a></td>
  						<td width="70"><s:if test="#project.classId==1">快速项目</s:if> <s:else>具体项目</s:else></td>
  						<td width="60" style="text-algin:center;">${project.voteCount}</td>
  						<td width="150">${project.publisher}</td>
  						<td width="100"><s:property value="#project.publishTime"/><br></td>
  						<td width="100" class="importand">
  							<input type="hidden" value="<s:property value="#project.id"/>"></input>
  							<s:select  list="#{0:'待  审  核',1:'待  投  标',2:'投标结束',3:'项目开始',4:'项目结束'}" value="#project.status" listKey="key" listValue="value">
  							</s:select>
  							
  						</td>
  						<td width="100">
  							<s:if test="#project.toRole==1">学校</s:if>
  							<s:elseif test="#project.toRole==2">学院</s:elseif>
  							<s:elseif test="#project.toRole==3">企业</s:elseif>
  							<s:elseif test="#project.toRole==4">教师</s:elseif>
  							<s:elseif test="#project.toRole==5">学生</s:elseif>
  						</td>
  						<td width="50">
  							<input type="hidden" value="<s:property value="#project.id"/>"></input>
  							<a href="#" class="delete">删除</a>
  						</td>
  						</tr>
  						
  					</s:iterator>
  				</table>
  			</div>
  			<br/>
  			<br/>
  			
  			
  			<div id="content_bottom_a">
  				<s:set name="page" value="#request.page"></s:set>
  				<s:set name="secondlist" value="#request.secondlist"></s:set>
  				<a href="showProjectsManage.action?currentPage=1">首页</a>
  				<s:if test="#page.hasprevious">
  					<a href="showProjectsManage.action?currentPage=<s:property value="#page.currentpage-1"/>">上一页</a>
  				</s:if>
  				 <s:else>
  				  	<a href="showProjectsManage.action?currentPage=<s:property value="#page.currentpage"/>">上一页</a>
  				</s:else>
  				<s:if test="#page.hasnext">
  					<a href="showProjectsManage.action?currentPage=<s:property value="#page.currentpage+1"/>">下一页</a>
  				</s:if>
  				<s:else>
  				  	<a href="showProjectsManage.action?currentPage=<s:property value="#page.currentpage"/>">下一页</a>
  				</s:else>
  				<s:if test="#page.haslast">
  					<a href="showProjectsManage.action?currentPage=<s:property value="#page.totalpage"/>">尾页</a>
  				</s:if>

  			</div>
  		</div>
  		<div id="footer">
  			  <jsp:include page="../footer.jsp"></jsp:include>
  		</div>
  	</div>
	
	
	
  		
  		
  </body>
</html>
