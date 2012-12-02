<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>查看已发布项目</title>
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
  		<div id="position">位置：<a href="home.action">首页</a>》已发布项目</div>
  		<div id="projects">	
  			<div id="projects_top">
  					<table>
  						<tr>
  						<td width="150"><span class="title">标题</span></td>
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
  						 <td width="100">
  							<span class="operation">操作</span>
  						</td>
  						</tr>
  				 </table>			
  			</div>
  			
  			<div id="content_mid">
  				<table>
  					<s:iterator value="#request['projects']" id="project">
  						<tr>
  						<td width="150"><a href="showProject.action?projectId=<s:property value="#project.id"/>">${project.title}</a></td>
  						<td width="70"><s:if test="#project.classId==1">快速项目</s:if> <s:else>具体项目</s:else></td>
  						<td width="60" style="text-algin:center;"><s:if test="#project.voteCount==0">0</s:if><s:else><a href="showVoted.action?projectId=<s:property value="#project.id"/>&&currentPage=1">${project.voteCount}</a></s:else></td>
  						<td width="150">${project.publisher}</td>
  						<td width="100"><s:property value="#project.publishTime"/></td>
  						<td width="100">
  							<s:if test="#project.status==0">待审核</s:if>
  							<s:elseif test="#project.status==1">待投标</s:elseif>
  							<s:elseif test="#project.status==2">投标结束</s:elseif>
  							<s:elseif test="#project.status==3">项目开始</s:elseif>
  							<s:elseif test="#project.status==4">项目结束</s:elseif>
  						</td>
  						<td width="100">
  							<s:if test="#project.toRole==1">学校</s:if>
  							<s:elseif test="#project.toRole==2">学院</s:elseif>
  							<s:elseif test="#project.toRole==3">企业</s:elseif>
  							<s:elseif test="#project.toRole==4">教师</s:elseif>
  							<s:elseif test="#project.toRole==5">学生</s:elseif>
  						</td>
  						<td width="100">
  							<input class="projectId" type="hidden" value="${project.id}"/>
  							<span class="operation">
  								<s:if test="#project.status==2"><a href="#" class="${project.id}">启动项目</a></s:if>
  								<s:elseif test="#project.status==3"><a href="#" class="${project.id}">结束项目</a></s:elseif>
  								<s:elseif test="#project.status==4">项目已结束</s:elseif>
  							</span>
  						</td>
  						</tr>
  						
  					</s:iterator>
  				</table>
  			</div>
  			
  			<div id="content_bottom">
  				<s:set name="page" value="#request.page"></s:set>
  				<s:set name="secondlist" value="#request.secondlist"></s:set>


  						<a href="showPublished.action?currentPage=1">首页</a>

  					

  					<s:if test="#page.hasprevious">
  						<a href="showPublished.action?currentPage=<s:property value="#page.currentpage-1"/>">上一页</a>
  					</s:if>
  					<s:else>
  						<a href="showPublished.action?currentPage=<s:property value="#page.currentpage"/>">上一页</a>
  					</s:else>

  					<s:if test="#page.hasnext">
  						<a href="showPublished.action?currentPage=<s:property value="#page.currentpage+1"/>">下一页</a>
  					</s:if>
					<s:else>
						 <a href="showPublished.action?currentPage=<s:property value="#page.currentpage"/>">下一页</a>
					</s:else>
  	
  						<a href="showPublished.action?currentPage=<s:property value="#page.totalpage"/>">尾页</a>

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
