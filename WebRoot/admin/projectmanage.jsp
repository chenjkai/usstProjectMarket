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
  						<td width="180"><span class="title">��Ŀ����</span></td>
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
  						<td width="50">
  							����
  						</td>
  						</tr>
  				</table>			
  			</div>
  			
  			<div id="content_mid_a">
  				<table>
  					<s:iterator value="#request['projects']" id="project">
  						<tr>
  						<td width="180"><a href="showProject.action?projectId=<s:property value="#project.id"/>">${project.title}</a></td>
  						<td width="70"><s:if test="#project.classId==1">������Ŀ</s:if> <s:else>������Ŀ</s:else></td>
  						<td width="60" style="text-algin:center;">${project.voteCount}</td>
  						<td width="150">${project.publisher}</td>
  						<td width="100"><s:property value="#project.publishTime"/><br></td>
  						<td width="100" class="importand">
  							<input type="hidden" value="<s:property value="#project.id"/>"></input>
  							<s:select  list="#{0:'��  ��  ��',1:'��  Ͷ  ��',2:'Ͷ�����',3:'��Ŀ��ʼ',4:'��Ŀ����'}" value="#project.status" listKey="key" listValue="value">
  							</s:select>
  							
  						</td>
  						<td width="100">
  							<s:if test="#project.toRole==1">ѧУ</s:if>
  							<s:elseif test="#project.toRole==2">ѧԺ</s:elseif>
  							<s:elseif test="#project.toRole==3">��ҵ</s:elseif>
  							<s:elseif test="#project.toRole==4">��ʦ</s:elseif>
  							<s:elseif test="#project.toRole==5">ѧ��</s:elseif>
  						</td>
  						<td width="50">
  							<input type="hidden" value="<s:property value="#project.id"/>"></input>
  							<a href="#" class="delete">ɾ��</a>
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
  				<a href="showProjectsManage.action?currentPage=1">��ҳ</a>
  				<s:if test="#page.hasprevious">
  					<a href="showProjectsManage.action?currentPage=<s:property value="#page.currentpage-1"/>">��һҳ</a>
  				</s:if>
  				 <s:else>
  				  	<a href="showProjectsManage.action?currentPage=<s:property value="#page.currentpage"/>">��һҳ</a>
  				</s:else>
  				<s:if test="#page.hasnext">
  					<a href="showProjectsManage.action?currentPage=<s:property value="#page.currentpage+1"/>">��һҳ</a>
  				</s:if>
  				<s:else>
  				  	<a href="showProjectsManage.action?currentPage=<s:property value="#page.currentpage"/>">��һҳ</a>
  				</s:else>
  				<s:if test="#page.haslast">
  					<a href="showProjectsManage.action?currentPage=<s:property value="#page.totalpage"/>">βҳ</a>
  				</s:if>

  			</div>
  		</div>
  		<div id="footer">
  			  <jsp:include page="../footer.jsp"></jsp:include>
  		</div>
  	</div>
	
	
	
  		
  		
  </body>
</html>
