<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>�鿴�ѷ�����Ŀ</title>
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
  		<div id="position">λ�ã�<a href="home.action">��ҳ</a>���ѷ�����Ŀ</div>
  		<div id="projects">	
  			<div id="projects_top">
  					<table>
  						<tr>
  						<td width="150"><span class="title">����</span></td>
  						<td width="70"><span class="project_type">��Ŀ����</span></td>
  						<td width="60" style="text-algin:center;"><span class="vote_count">Ͷ������</span></td>
  						<td width="150"><span class="publisher">������</span></td>
  						<td width="100"><span class="time">����ʱ��</span></td>
  						<td width="100">
  							<span class="status">��Ŀ״̬</span>
  						</td>
  						 <td width="100">
  							<span class="toObject">�������</span>
  						</td>
  						 <td width="100">
  							<span class="operation">����</span>
  						</td>
  						</tr>
  				 </table>			
  			</div>
  			
  			<div id="content_mid">
  				<table>
  					<s:iterator value="#request['projects']" id="project">
  						<tr>
  						<td width="150"><a href="showProject.action?projectId=<s:property value="#project.id"/>">${project.title}</a></td>
  						<td width="70"><s:if test="#project.classId==1">������Ŀ</s:if> <s:else>������Ŀ</s:else></td>
  						<td width="60" style="text-algin:center;"><s:if test="#project.voteCount==0">0</s:if><s:else><a href="showVoted.action?projectId=<s:property value="#project.id"/>&&currentPage=1">${project.voteCount}</a></s:else></td>
  						<td width="150">${project.publisher}</td>
  						<td width="100"><s:property value="#project.publishTime"/></td>
  						<td width="100">
  							<s:if test="#project.status==0">�����</s:if>
  							<s:elseif test="#project.status==1">��Ͷ��</s:elseif>
  							<s:elseif test="#project.status==2">Ͷ�����</s:elseif>
  							<s:elseif test="#project.status==3">��Ŀ��ʼ</s:elseif>
  							<s:elseif test="#project.status==4">��Ŀ����</s:elseif>
  						</td>
  						<td width="100">
  							<s:if test="#project.toRole==1">ѧУ</s:if>
  							<s:elseif test="#project.toRole==2">ѧԺ</s:elseif>
  							<s:elseif test="#project.toRole==3">��ҵ</s:elseif>
  							<s:elseif test="#project.toRole==4">��ʦ</s:elseif>
  							<s:elseif test="#project.toRole==5">ѧ��</s:elseif>
  						</td>
  						<td width="100">
  							<input class="projectId" type="hidden" value="${project.id}"/>
  							<span class="operation">
  								<s:if test="#project.status==2"><a href="#" class="${project.id}">������Ŀ</a></s:if>
  								<s:elseif test="#project.status==3"><a href="#" class="${project.id}">������Ŀ</a></s:elseif>
  								<s:elseif test="#project.status==4">��Ŀ�ѽ���</s:elseif>
  							</span>
  						</td>
  						</tr>
  						
  					</s:iterator>
  				</table>
  			</div>
  			
  			<div id="content_bottom">
  				<s:set name="page" value="#request.page"></s:set>
  				<s:set name="secondlist" value="#request.secondlist"></s:set>


  						<a href="showPublished.action?currentPage=1">��ҳ</a>

  					

  					<s:if test="#page.hasprevious">
  						<a href="showPublished.action?currentPage=<s:property value="#page.currentpage-1"/>">��һҳ</a>
  					</s:if>
  					<s:else>
  						<a href="showPublished.action?currentPage=<s:property value="#page.currentpage"/>">��һҳ</a>
  					</s:else>

  					<s:if test="#page.hasnext">
  						<a href="showPublished.action?currentPage=<s:property value="#page.currentpage+1"/>">��һҳ</a>
  					</s:if>
					<s:else>
						 <a href="showPublished.action?currentPage=<s:property value="#page.currentpage"/>">��һҳ</a>
					</s:else>
  	
  						<a href="showPublished.action?currentPage=<s:property value="#page.totalpage"/>">βҳ</a>

				${page.currentpage}/${page.totalpage} ҳ
  			</div>
  		</div>
  		
  		<div id="footer">
  			<br>
  			��Ȩ����&copy; 2008 �Ϻ�����ѧ
  			<br>  
			��ַ���Ϻ��о���·516��  &nbsp;&nbsp;  �ʱࣺ200093
  		</div>
  	</div>
  </body>
</html>
