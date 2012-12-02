<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title></title>
   	<link rel="stylesheet" href="css/style.css" type="text/css"/>
   	<link rel="stylesheet" href="css/menu.css" type="text/css"/>
   	<link rel="stylesheet" href="css/css.css" type="text/css"/>
   	<link rel="stylesheet" href="css/usertmp.css" type="text/css"/>
   	<script type="text/javascript" src="js/jquery.js"></script> 
   	<script type="text/javascript" src="js/home.js"></script>
    <script type="text/javascript" src="js/menu.js"></script>
    <script type="text/javascript" src="js/project.js"></script>
    <script type="text/javascript" src="js/calendar.js"></script>
     <script type="text/javascript" src="js/ckeditor/ckeditor.js"></script>
     <script type="text/javascript" src="js/register.js"></script>
     	<script type="text/javascript">
 		
		window.onload = function()
			{	
		
				CKEDITOR.replace('editor',
					{
						 customConfig:'js/ckeditor-config.js'
					}
				);
				
			};
	</script>
  </head>
  
  <body>
	<s:set name="pr" value="#request.professor"></s:set>
	<s:set name="user" value="#session['user']"></s:set>
  	<div id="container"> 
  		<jsp:include page="top.jsp"></jsp:include>
  		<div id="left">
  			<jsp:include page="left.jsp"></jsp:include>
  		</div>
  		<div id="position">λ�ã�<a href="home.action">��ҳ</a>��<a href="showUserInfo.action?role=<s:property value="#session['role']"/>&&userId=<s:property value="#user.id"/>"><s:property value="#pr.name"/>������ҳ</a>���޸ĸ�������
  			
		</div> 	
				
  		<div id="modify">
  			<form action="modifyinfo.action" method="post">
  			��������
  			<div>
  				<span>ѧУ��</span>
  				<span><s:select id="teacherSchool" name="teacherSchool" list="#request.schools"  listKey="key" listValue="value" headerKey="0" headerValue="-------" value="#pr.school.id"></s:select></span>
  			</div>
  			<div>
  				<span>ѧԺ��</span>
  				<span>
  				<s:select id="teacherCollege" name="teacherCollege" list="#request.colleges"  listKey="key" listValue="value" headerKey="0" headerValue="-------" value="#pr.college.id"></s:select>
      				
  				</span>
  			</div>
  			<div>	
  				<span>
  					רҵ��
  				</span>
  				<span><input id="teachermajor" type="text" name="teachermajor" value="<s:property value="#pr.major"/>"></span>
  			</div>
  			<div>	
  				<span>
  					ְ�ƣ�
  				</span>
  				<span>
  					<s:select list="#{1:'����',2:'������',3:'��ʦ'}" value="#pr.positiorl" name="positiorl" id="positiorl"></s:select>
  				</span>
  			</div>
  			
  			<div>	
  				<span>
  					���䣺
  				</span>
  				<span>
  					<input id="mail" type="text" name="mail" value="<s:property value="#pr.email"/>"></input>
  				</span>
  			</div>
  			
  			<div>	
  				<span>
  					�绰��
  				</span>
  				<span>
  					<input id="phone" type="text" name="phone" value="<s:property value="#pr.tel"/>"></input>
  				</span>
  			</div>
  			<div>
  				<span>	
  					��飺
  				</span>
  				<span>
  					<textarea id="editor" name="editor">
  						<s:property value="#pr.introduction"/>
  					</textarea>
  				</span>
  			</div>
  			<div>
  				<center><input type="submit" value="�ύ"/></center>
  			</div>
  			</form>
  		</div>
  		
  		<div id="footer">
  			<jsp:include page="footer.jsp"></jsp:include>
  		</div>
  	</div>
  </body>
</html>
