<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
    <title>用户管理</title>
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
  						<td width="150">高校名称</td>
  						<td width="100">联系人</td>
  						<td width="100">电话</td>
  						<td width="100">电子邮件</td>
  						<td width="100">积分</td>
  						<td width="200">
  							操作
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
  							<s:if test="#school.status==1"><a class="active" href="#">激活</a></s:if><s:elseif test="#school.status==2"><a class="active" href="#">冻结</a></s:elseif><s:elseif test="#school.status==3"><a class="active" href="#">解冻</a></s:elseif> | <a class="delete" href="#">删除</a>
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
  						<td width="200">高校名称</td>
  						<td width="200">学院名称</td>
  						<td width="100">系主任</td>
  						<td width="100">电话</td>
  						<td width="150">电子邮件</td>
  						<td width="50">积分</td>
  						<td width="100">
  							操作
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
  							<s:if test="#college.status==1"><a class="active" href="#">激活</a></s:if><s:elseif test="#college.status==2"><a class="active" href="#">冻结</a></s:elseif><s:elseif test="#college.status==3"><a class="active" href="#">解冻</a></s:elseif> | <a class="delete" href="#">删除</a>
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
  						<td width="100">企业名称</td>
  						<td width="100">联系人</td>
  						<td width="100">电话</td>
  						<td width="150">电子邮件</td>
  						<td width="50">积分</td>
  						<td width="100">
  							操作
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
  							<s:if test="#company.status==1"><a class="active" href="#">激活</a></s:if><s:elseif test="#company.status==2"><a class="active" href="#">冻结</a></s:elseif><s:elseif test="#company.status==3"><a class="active" href="#">解冻</a></s:elseif> | <a class="delete" href="#">删除</a>
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
  						<td width="100">学校</td>
  						<td width="100">学院</td>
  						<td width="100">导师</td>
  						<td width="100">专业</td>
  						<td width="100">姓名</td>
  						<td width="100">电话</td>
  						<td width="150">电子邮件</td>
  						<td width="50">积分</td>
  						<td width="100">
  							操作
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
  							<s:if test="#student.status==1"><a class="active" href="#">激活</a></s:if><s:elseif test="#student.status==2"><a class="active" href="#">冻结</a></s:elseif><s:elseif test="#student.status==3"><a class="active" href="#">解冻</a></s:elseif> | <a class="delete" href="#">删除</a>
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
  						<td width="100">学校</td>
  						<td width="100">学院</td>
  						<td width="100">专业</td>
  						<td width="100">姓名</td>
  						<td width="100">职称</td>
  						<td width="100">电话</td>
  						<td width="150">电子邮件</td>
  						<td width="50">积分</td>
  						<td width="100">
  							操作
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
  						<td width="100"><s:if test="#professor.positiorl==1">教授</s:if>
  							<s:elseif test="#professor.positiorl==2">副教授</s:elseif>
  							<s:elseif test="#professor.positiorl==3">讲师</s:elseif>
  						</td>
  						<td width="100">${professor.tel}</td>
  						<td width="150">${professor.email}</td>
  						<td width="50">${professor.intergration}</td>
  						<td width="100">
  							<input class="userId" type="hidden" value="<s:property value="#professor.id"/>"></input>
  							<input class="userRole" type="hidden" value="4"></input>
  							<s:if test="#professor.status==1"><a class="active" href="#">激活</a></s:if><s:elseif test="#professor.status==2"><a class="active" href="#">冻结</a></s:elseif><s:elseif test="#professor.status==3"><a class="active" href="#">解冻</a></s:elseif> | <a class="delete" href="#">删除</a>
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






