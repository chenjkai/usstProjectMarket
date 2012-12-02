<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>Ͷ����Ϣ</title>
       	
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
  		<div id="position">λ�ã�<a href="home.action">��ҳ</a>��<a href="showPublished.action?currentPage=1">�ѷ�����Ŀ</a>���������б�</div>
  		<div id="projects">	
  				<s:if test="#role==1">
  						<div id="projects_top">
  						<table>
  						<tr>
  						<td width="150">��У����</td>
  						<td width="100">��ϵ��</td>
  						<td width="100">�绰</td>
  						<td width="180">�����ʼ�</td>
  						<td width="100">����</td>
  						<td width="100">
  							����
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
  							<a class="choose" href="#"><s:if test="#undertaker==0">�б�</s:if><s:elseif test="#undertaker==#school.id">ȡ��</s:elseif></a>
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
  						<td width="100">��У����</td>
  						<td width="100">ѧԺ����</td>
  						<td width="100">ϵ����</td>
  						<td width="100">�绰</td>
  						<td width="150">�����ʼ�</td>
  						<td width="50">����</td>
  						<td width="50">
  							����
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
  							<a class="choose" href="#"><s:if test="#undertaker==0">�б�</s:if><s:elseif test="#undertaker==#college.id">ȡ��</s:elseif></a>
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
  						<td width="100">��ҵ����</td>
  						<td width="100">��ϵ��</td>
  						<td width="100">�绰</td>
  						<td width="150">�����ʼ�</td>
  						<td width="50">����</td>
  						<td width="50">
  							����
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
  							<a class="choose" href="#"><s:if test="#undertaker==0">�б�</s:if><s:elseif test="#undertaker==#company.id">ȡ��</s:elseif></a>
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
  						<td width="100">ѧУ</td>
  						<td width="100">ѧԺ</td>
  						<td width="100">��ʦ</td>
  						<td width="100">רҵ</td>
  						<td width="100">����</td>
  						<td width="100">�绰</td>
  						<td width="150">�����ʼ�</td>
  						<td width="50">����</td>
  						<td width="50">
  							����
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
  							<a class="choose" href="#"><s:if test="#undertaker==0">�б�</s:if><s:elseif test="#undertaker==#student.id">ȡ��</s:elseif></a>
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
  						<td width="100">����</td>
  						<td width="150">ѧУ</td>
  						<td width="150">ѧԺ</td>
  						<td width="150">רҵ</td>
  						<td width="100">ְ��</td>
  						<td width="50">����</td>
  						<td width="50">
  							����
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
  						<td width="100"><s:if test="#professor.positiorl==1">����</s:if> 
  							<s:elseif test="#professor.positiorl==2">������</s:elseif> 
  							<s:elseif test="#professor.positiorl==3">��ʦ</s:elseif> 
  						</td> 
  						<td width="50">${professor.intergration}</td> 
  						<td width="50" class="<s:property value="#professor.id"/>"> 
  							<input type="hidden" class="projectId" value='<s:property value="#request.projectId"/>'> 
  							<input type="hidden" class="userId" value='<s:property value="#professor.id"/>'> 
  							<input type="hidden" class="userRole" value="4"> 
  							<a class="choose" href="#"><s:if test="#undertaker==0">�б�</s:if><s:elseif test="#undertaker==#professor.id">ȡ��</s:elseif></a>
  						</td> 
  						</tr>
  					</s:iterator>
  					</table>
  				</div>			
  				
  			</s:elseif>			
  			
  			
  			<div id="content_bottom">
  				<s:set name="page" value="#request.page"></s:set>
  				
  					<a href="showVoted.action?projectId=<s:property value="#request.projectId"/>&&currentPage=1">��ҳ</a>
  					
  			
  					<s:if test="#page.hasprevious">
  						<a href="showVoted.action?projectId=<s:property value="#request.projectId"/>&&currentPage=<s:property value="#page.currentpage-1"/>">��һҳ</a>
  					</s:if>
  					<s:else>
  						<a href="showVoted.action?projectId=<s:property value="#request.projectId"/>&&currentPage=<s:property value="#page.currentpage"/>">��һҳ</a>
  					</s:else>

  					<s:if test="#page.hasnext">
  						<a href="showVoted.action?projectId=<s:property value="#request.projectId"/>&&currentPage=<s:property value="#page.currentpage+1"/>">��һҳ</a>
  					</s:if>
  					<s:else>
  						<a href="showVoted.action?projectId=<s:property value="#request.projectId"/>&&currentPage=<s:property value="#page.currentpage"/>">��һҳ</a>
  					</s:else>
		
  				
  						<a href="showVoted.action?projectId=<s:property value="#request.projectId"/>&&currentPage=<s:property value="#page.totalpage"/>">βҳ</a>
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
