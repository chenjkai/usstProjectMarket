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
	<s:set name="com" value="#request.company"></s:set>
	<s:set name="user" value="#session['user']"></s:set>
  	<div id="container"> 
  		<jsp:include page="top.jsp"></jsp:include>
  		<div id="left">
  			<jsp:include page="left.jsp"></jsp:include>
  		</div>
  		<div id="position">λ�ã�<a href="home.action">��ҳ</a>��<a href="showUserInfo.action?role=<s:property value="#session['role']"/>&&userId=<s:property value="#user.id"/>"><s:property value="#com.name"/>������ҳ</a>���޸ĸ�������
  			
		</div> 	
				
  		<div id="modify">
  			<form action="modifyinfo.action" method="post">
  			��������
  			<div>
  				<span>���ƣ�</span>
  				<span><input id="companyName" type="text" name="companyName" value="<s:property value="#com.companyName"/>"></span>
  			</div>
  			<div>
  				
  			</div>
  			<div>	
  				<span>
  					��ַ��
  				</span>
  				<span><input id="companyAddress" type="text" name="companyAddress" value="<s:property value="#com.address"/>"></span>
  			</div>
  			<div>	
  				<span>
  					�ʱࣺ
  				</span>
  				<span>
  					<span><input id="companyZip" type="text" name="companyZip" value="<s:property value="#com.zip"/>"></span>
  				</span>
  			</div>
  			
  			<div>	
  				<span>
  					�绰��
  				</span>
  				<span>
  					<input id="companyTel" type="text" name="companyTel" value="<s:property value="#com.tel"/>"></input>
  				</span>
  			</div>
  			
  			<div>	
  				<span>
  					���䣺
  				</span>
  				<span>
  					<input id="companyMail" type="text" name="companyMail" value="<s:property value="#com.EMail"/>"></input>
  				</span>
  			</div>
  			
  			
  			  			
  			<div>	
  				<span>
  					��վ��
  				</span>
  				<span>
  					<input id="companyWeb" type="text" name="companyWeb" value="<s:property value="#com.web"/>"></input>
  				</span>
  			</div>
  			
  			
  			<div>
  				<span>	
  					��飺
  				</span>
  				<span>
  					<textarea id="editor" name="companyEditor">
  						<s:property value="#com.introduction"/>
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
