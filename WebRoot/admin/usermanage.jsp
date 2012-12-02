<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
    <title>�û�����</title>
   	<link rel="stylesheet" href="css/style.css" type="text/css"/>
   	<link rel="stylesheet" href="css/menu.css" type="text/css"/>
   	<link rel="stylesheet" href="css/css.css" type="text/css"/>
   	<script type="text/javascript" src="js/jquery.js"></script> 
   	<script type="text/javascript" src="js/home.js"></script>
    <script type="text/javascript" src="js/menu.js"></script>
   
  </head>
  
  <body>

  	<div id="container">
  		<jsp:include page="top.jsp"></jsp:include>
  		<div id="main">
  			<s:set name="role" value="#request.role"></s:set>
    	
  		<div id="users">	
  				<s:if test="#role==1">
  						<div id="user_top">
  						<table border="1">
  						<tr>
  						<td width="150">��У����</td>
  						<td width="100">��ϵ��</td>
  						<td width="100">�绰</td>
  						<td width="100">�����ʼ�</td>
  						<td width="100">����</td>
  						<td width="200">
  							����
  						</td>
  						</tr>
  						</table>
  						</div>
  						
  					<div id="user_mid">
  					<table border="1">
  					<s:set name="schools" value="#request.list.schools"></s:set>
  					<s:iterator value="schools" id="school">
  						<tr>
  						
  						<td width="150">${school.name}</td>
  						<td width="100">${school.contact}</td>
  						<td width="100">${school.tel}</td>
  						<td width="100">${school.email}</td>
  						<td width="100">${school.integration}</td>
  						<td width="200">
  							<input class="userId" type="hidden" value="<s:property value="#school.id"/>"></input>
  							<input class="userRole" type="hidden" value="1"></input>
  							<s:if test="#school.status==1"><a class="active" href="#">����</a></s:if><s:elseif test="#school.status==2"><a class="active" href="#">����</a></s:elseif><s:elseif test="#school.status==3"><a class="active" href="#">�ⶳ</a></s:elseif> | <a class="delete" href="#">ɾ��</a>
  						</td>
  						</tr>
  						
  					</s:iterator>
  					</table>
  					</div>			
  			</s:if>
  			
  			<s:elseif test="#role==2">
  				<div id="user_top">
  						<table border="1">
  						<tr>
  						<td width="200">��У����</td>
  						<td width="200">ѧԺ����</td>
  						<td width="100">ϵ����</td>
  						<td width="100">�绰</td>
  						<td width="150">�����ʼ�</td>
  						<td width="50">����</td>
  						<td width="100">
  							����
  						</td>
  						</tr>
  						</table>
  						</div>
  						
  				<div id="user_mid">
  					<table border="1">
  					<s:set name="colleges" value="#request.list.colleges"></s:set>
  					<s:iterator value="colleges" id="college">
  						<tr>
  						<td width="200">${college.school.name}</td>
  						<td width="200">${college.name}</td>
  						<td width="100">${college.deportName}</td>
  						<td width="100">${college.tel}</td>
  						<td width="150">${college.EMail}</td>
  						<td width="50">${college.integration}</td>
  						<td width="100">
  							<input class="userId" type="hidden" value="<s:property value="#college.id"/>"></input>
  							<input class="userRole" type="hidden" value="2"></input>
  							<s:if test="#college.status==1"><a class="active" href="#">����</a></s:if><s:elseif test="#college.status==2"><a class="active" href="#">����</a></s:elseif><s:elseif test="#college.status==3"><a class="active" href="#">�ⶳ</a></s:elseif> | <a class="delete" href="#">ɾ��</a>
  						</td>
  						</tr>
  					</s:iterator>
  					</table>
  				</div>			
  				
  			</s:elseif>
  			
  			<s:elseif test="#role==3">
  				<div id="user_top">
  						<table border="1">
  						<tr>
  						<td width="100">��ҵ����</td>
  						<td width="100">��ϵ��</td>
  						<td width="100">�绰</td>
  						<td width="150">�����ʼ�</td>
  						<td width="50">����</td>
  						<td width="100">
  							����
  						</td>
  						</tr>
  						</table>
  						</div>
  						
  				<div id="user_mid">
  					<table border="1">
  					<s:set name="companys" value="#request.list.companys"></s:set>
  					<s:iterator value="companys" id="company">
  						<tr>
  						<td width="100">${company.companyName}</td>
  						<td width="100">${company.contact}</td>
  						<td width="100">${company.tel}</td>
  						<td width="150">${company.EMail}</td>
  						<td width="50">${company.integeration}</td>
  						<td width="100">
  							<input class="userId" type="hidden" value="<s:property value="#company.id"/>"></input>
  							<input class="userRole" type="hidden" value="3"></input>
  							<s:if test="#company.status==1"><a class="active" href="#">����</a></s:if><s:elseif test="#company.status==2"><a class="active" href="#">����</a></s:elseif><s:elseif test="#company.status==3"><a class="active" href="#">�ⶳ</a></s:elseif> | <a class="delete" href="#">ɾ��</a>
  						</td>
  						</tr>
  					</s:iterator>
  					</table>
  				</div>			
  				
  			</s:elseif>	
  				
  				
  				
  			<s:elseif test="#role==5">
  				<div id="user_top">
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
  						<td width="100">
  							����
  						</td>
  						</tr>
  						</table>
  						</div>
  						
  				<div id="user_mid">
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
  						<td width="100">
  							<input class="userId" type="hidden" value="<s:property value="#student.id"/>"></input>
  							<input class="userRole" type="hidden" value="5"></input>
  							<s:if test="#student.status==1"><a class="active" href="#">����</a></s:if><s:elseif test="#student.status==2"><a class="active" href="#">����</a></s:elseif><s:elseif test="#student.status==3"><a class="active" href="#">�ⶳ</a></s:elseif> | <a class="delete" href="#">ɾ��</a>
  						</td>
  						</tr>
  					</s:iterator>
  					</table>
  				</div>			
  				
  			</s:elseif>		
  				
  			<s:elseif test="#role==4">
  				<div id="user_top">
  						<table border="1">
  						<tr>
  						<td width="100">ѧУ</td>
  						<td width="100">ѧԺ</td>
  						<td width="100">רҵ</td>
  						<td width="100">����</td>
  						<td width="100">ְ��</td>
  						<td width="100">�绰</td>
  						<td width="150">�����ʼ�</td>
  						<td width="50">����</td>
  						<td width="100">
  							����
  						</td>
  						</tr>
  						</table>
  						</div>
  						
  				<div id="user_mid">
  					<table border="1">
  					<s:set name="professors" value="#request.list.professor"></s:set>
  					<s:iterator value="professors" id="professor">
  						<tr>
  						<td width="100">${professor.school.name}</td>
  						<td width="100">${professor.college.name}</td>
  							<td width="100">${professor.major}</td>
  						<td width="100">${professor.name}</td>
  						<td width="100"><s:if test="#professor.positiorl==1">����</s:if>
  							<s:elseif test="#professor.positiorl==2">������</s:elseif>
  							<s:elseif test="#professor.positiorl==3">��ʦ</s:elseif>
  						</td>
  						<td width="100">${professor.tel}</td>
  						<td width="150">${professor.email}</td>
  						<td width="50">${professor.intergration}</td>
  						<td width="100">
  							<input class="userId" type="hidden" value="<s:property value="#professor.id"/>"></input>
  							<input class="userRole" type="hidden" value="4"></input>
  							<s:if test="#professor.status==1"><a class="active" href="#">����</a></s:if><s:elseif test="#professor.status==2"><a class="active" href="#">����</a></s:elseif><s:elseif test="#professor.status==3"><a class="active" href="#">�ⶳ</a></s:elseif> | <a class="delete" href="#">ɾ��</a>
  						</td>
  						</tr>
  					</s:iterator>
  					</table>
  				</div>			
  				
  			</s:elseif>			
  			
  			
			
  		</div>
  			
  			
  			
  		</div>
  		<div id="footer">
  			  <jsp:include page="../footer.jsp"></jsp:include>
  		</div>
  	</div>
  </body>
</html>






