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
   	<script type="text/javascript" src="js/home.js"></script>
    <script type="text/javascript" src="js/menu.js"></script>
   	<script type="text/javascript" src="js/ckeditor/ckeditor.js"></script>
   	<script type="text/javascript" src="js/ckeditor-config.js"></script>
   	<script type="text/javascript" src="js/publish_project.js"></script>
    <script type="text/javascript" src="js/calendar.js"></script>
   	
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

  	<div id="container">
  		<jsp:include page="top.jsp"></jsp:include>
  		<div id="left">
  			<jsp:include page="left.jsp"></jsp:include>
  		</div>
  		<div id="position">λ�ã�<a href="home.action">��ҳ</a>��������Ŀ</div>
  		<div id="projects">
  			<div id="project_description">
				<form action="saveProject.action" method="post">
					<br/>
					
					<center>������Ŀ</center>
					<br/>
					
					<div class="label">��Ŀ���⣺&nbsp;<input id="project_title" type="text" name="projectTitle" maxlength="100"/> 100������</div>
					<div class="label">��ϵ�绰��&nbsp;<input id="project_phone" type="text" name="projectPhone" maxlength="20"/>  20������</div>
					
					<div class="label">��Ŀ���ͣ�
						<select id="project_type" name="projectType">
							<option value="0">---</option>
							<option value="1">����</option>
							<option value="2">����</option>
						</select>
						
						�������
						<select id="project_object" name="projectObject">
							<option value="0">----</option>
							<option value="1">ѧУ</option>
							<option value="2">ѧԺ</option>
							<option value="3">��ҵ</option>
							<option value="4">��ʦ</option>
							<option value="5">ѧ��</option>
							
						</select>
						</div>
					
					<div class="label">
						<span id="select_left">
							��Ŀ���
							<select id="firstList" name="firstList">
								<option value="0">-----</option>
								<option value="1">����Դ</option>
								<option value="2">��Ч�����Դ</option>
								<option value="3">��ҵװ��</option>
								<option value="4">�ִ�����ҵ</option>
							</select>
							
						</span>
						<span id="select_right">
							<select id="secondList" name="secondList">
								<option value="0">-----</option>
							</select>
						</span>
					</div>
					
					
						<div class="label">������</div><textarea id="editor" name="editor"></textarea>
						
					
						<center><input id="project_submit" type="submit" value="����"/></center>
						
				</form>
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
