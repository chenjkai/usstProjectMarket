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
    <script type="text/javascript" src="js/register.js" ></script>
    <script type="text/javascript" src="js/home.js"></script>
    <script type="text/javascript" src="js/calendar.js"></script>
  
  </head>
  
  <body>
	
  	<div id="container">
  		<jsp:include page="top.jsp"></jsp:include>
  		<div id="left">
  			<jsp:include page="left.jsp"></jsp:include>
  		</div>
  		
  		<div id="userRegisterForm">
  			<center style="font-size:20px">���û�ע��</center>
  			  <br/>
  			  <br/>
  			<form action="register.action" method="post">
  				<div><span class="regist_lable">�û���:</span><span class="regist_text"><input id="userName" type="text" name="userName"/></span><span class="message1"></span><span class="message_require">* 6-16��Ӣ����ĸ</span></div>
  				<div><span class="regist_lable">����:</span><span class="regist_text"><input id="userPwd" type="password" name="userPwd"/></span><span class="message1"></span><span class="message_require">* 6-16���ַ�</span></div>
  				<div><span class="regist_lable">ȷ������:</span><span class="regist_text"><input id="reuserPwd" type="password" name="reuserPwd"/></span><span class="message1"></span><span class="message_require">*</span></div>
  				<div><span class="regist_lable">�绰:</span><span class="regist_text"><input id="phone" type="text" name="phone"/></span><span class="message1"></span><span class="message_require">* 8-14���ַ�</span></div>

  				<div><span class="regist_lable">�����ʼ�:</span><span class="regist_text"><input id="email" type="text" name="email"/></span><span class="message1"></span><span class="message_require">* С��20���ַ�</span></div>
  				<div><span class="regist_lable">����:</span><span class="regist_text"><input id="fax" type="text" name="fax"/></span><span class="message1"></span><span class="message">&nbsp;8-14���ַ�</span></div>
  				<div><span class="regist_lable">�ʱ�:</span><span class="regist_text"><input id="zip" type="text" name="zip"/></span><span class="message1"></span><span class="message">&nbsp;6λ����</span></div>
  				<div><span class="regist_lable">�˺�����:</span><span class="regist_text">
  				
  				<select name="role" id="role">
    								<option value="0">------</option>      
        							<option value="1">ѧУ</option>   
        							<option value="2">ѧԺ</option>   
        							<option value="3">��ҵ</option>   
        							<option value="4">��ʦ</option>   
        							<option value="5">ѧ��</option>   
      			</select> 
      			
  				</span><span class="message_require_no"></span>
  				</div>
  				
  				<div id="school" style="display:none">
  					<div><span class="regist_lable">ѧУ����:</span><span class="regist_text"><input id="schoolName" type="text" name="schoolName"/></span><span class="message1"></span><span class="message_require">* С��20���ַ�</span></div>
  					<div><span class="regist_lable">ѧУ��ַ:</span><span class="regist_text"><input id="schoolAddress" type="text" name="schoolAddress"/></span><span class="message1"></span><span class="message_require">* С��100���ַ�</span></div>
  					<div><span class="regist_lable">У��:</span><span class="regist_text"><input id="schoolPresident" type="text" name="schoolPresident"/></span><span class="message1"></span><span class="message_require">* С��10���ַ�</span></div>
  					<div><span class="regist_lable">��ϵ��:</span><span class="regist_text"><input id="schoolContact" type="text" name="schoolContact"/></span><span class="message1"></span><span class="message_require">* С��10���ַ�</span></div>
  					<div><span class="regist_lable">ѧУ��վ:</span><span class="regist_text"><input id="schoolWeb" type="text" name="schoolWeb"/></span><span class="message1"></span><span class="message_require"></span>* С��50���ַ�</div>
  					<!--<div><span class="regist_lable">��������:</span><span class="regist_text"><input id="schoolBank" type="text" name="schoolBank"/></span><span class="message1"></span><span class="message"></span></div>
  					<div><span class="regist_lable">�����˺�:</span><span class="regist_text"><input id="schoolBandId" type="text" name="schoolBandId"/></span><span class="message1"></span><span class="message"></span></div>-->
  				</div>
  				
  				
  				<div id="college" style="display:none">
  					<div><span class="regist_lable">������ѧ:</span><span class="regist_text">
  						<select name="schoolCollege" id="schoolCollege">
    							<option value="0">----------</option>
    							<s:iterator id="schoolDto" value="#request.list">
    								<option value="<s:property value="#schoolDto.id"/>"><s:property value="#schoolDto.name"/></option>
    							</s:iterator>  
      					</select>  
  					</span><span class="message1"></span><span class="message_require_no"></span></div>
  					<div><span class="regist_lable">ѧԺ����:</span><span class="regist_text"><input id="collegeName" type="text" name="collegeName"/></span><span class="message1"></span><span class="message_require">* С��40���ַ�</span></div>
  					<div><span class="regist_lable">ѧԺ��ַ:</span><span class="regist_text"><input id="collegeAddress" type="text" name="collegeAddress"/></span><span class="message1"></span><span class="message_require">* С��100���ַ�</span></div>
  					<div><span class="regist_lable">ϵ����:</span><span class="regist_text"><input id="deportName" type="text" name="deportName"/></span><span class="message1"></span><span class="message_require">* С��10���ַ�</span></div>
  				</div>
  				
  				<div id="company" style="display:none">
  					<div><span class="regist_lable">��ҵ��:</span><span class="regist_text"><input id="companyName" type="text" name="companyName"/></span><span class="message1"></span><span class="message_require">* С��40���ַ�</span></div>
  					<div><span class="regist_lable">��ҵ��ַ:</span><span class="regist_text"><input id="companyAddress" type="text" name="companyAddress"/></span><span class="message1"></span><span class="message_require">* С��100���ַ�</span></div>
  					<div><span class="regist_lable">��ҵ��ϵ��:</span><span class="regist_text"><input id="companyContact" type="text" name="companyContact"/></span><span class="message1"></span><span class="message_require">* С��20���ַ�</span></div>
  					<div><span class="regist_lable">��ҵ��վ:</span><span class="regist_text"><input id="companyWeb" type="text" name="companyWeb"/></span><span class="message1"></span><span class="message_require">* С��50���ַ�</span></div>
  					<div><span class="regist_lable">��ҵ����:</span><span class="regist_text"><input id="companyLawer" type="text" name="companyLawer"/></span><span class="message1"></span><span class="message_require">* С��20���ַ�</span></div>
  					<div><span class="regist_lable">��ҵ����:</span><span class="regist_text"><input id="companyBank" type="text" name="companyBank"/></span><span class="message1"></span><span class="message">С��20���ַ�</span></div>
  					<div><span class="regist_lable">��ҵ�˺�:</span><span class="regist_text"><input id="companyBandId" type="text" name="companyBandId"/></span><span class="message1"></span><span class="message">С��30���ַ�</span></div>
   					<div><span class="regist_lable">��ҵʶ����:</span><span class="regist_text"><input id="companyTax" type="text" name="companyTax"/></span><span class="message1"></span><span class="message">С��20���ַ�</span></div>
  				</div>
  				
  				<div id="teacher" style="display:none">
  					<div><span class="regist_lable">ѧУ:</span><span class="regist_text">
  					
  					<select name="teacherSchool" id="teacherSchool" class="linkage_father">
  							<option value="0">----------</option>
    						<s:iterator id="schoolDto" value="#request.list">
    								<option value="<s:property value="#schoolDto.id"/>"><s:property value="#schoolDto.name"/></option>
    						</s:iterator>  
      				</select>   
				
  					
  					</span><span class="message1"></span><span class="message_require_no"></span></div>
  					
  					<div><span class="regist_lable">ѧԺ:</span><span class="regist_text">
  							
    				<select name="teacherCollege" id="teacherCollege" class="linkage_child">
    						<option value="0">----------</option>   
        					 
      				</select>  
      				
  					</span><span class="message1"></span><span class="message_require_no"></span></div>
  					
  					<div><span class="regist_lable">����:</span><span class="regist_text"><input id="teacherName" type="text" name="teacherName"/></span><span class="message1"></span><span class="message_require">* С��20���ַ�</span></div>
  					<div><span class="regist_lable">ְ��:</span><span class="regist_text">
  						<select name="positiorl" id="positiorl">  
        							<option value="1">��      ��</option>   
        							<option value="2">�� �� ��</option>   
        							<option value="3">��      ʦ</option>   
      					</select>  
  					</span><span class="message1"></span><span class="message_require_no"></span></div>
  					<div><span class="regist_lable">רҵ:</span><span class="regist_text"><input id="teacherMajor" type="text" name="teacherMajor"></input></span><span class="message1"></span><span class="message_require">* С��30���ַ�</span></div>
  					<div><span class="regist_lable">��������:</span><span class="regist_text"><input id="teacherBank" type="text" name="teacherBank"></input></span><span class="message1"></span><span class="message">С��20���ַ�</span></div>
  					<div><span class="regist_lable">�����˺�:</span><span class="regist_text"><input id="teacherBankId" type="text" name="teacherBankId"></input></span><span class="message1"></span><span class="message">С��30���ַ�</span></div>
  				</div>
  				
  				
  				<div id="student" style="display:none">
  					<div><span class="regist_lable">����:</span><span class="regist_text"><input id="studentName" type="text" name="studentName"></input></span><span class="message1"></span><span class="message_require">* С��20���ַ�</span></div>
  					<div><span class="regist_lable">ѧУ:</span>
  					
  					<span class="regist_text">
  					
  					<select name="studentSchool" id="studentSchool">
    					<option value="0">----------</option>
        				<s:iterator id="schoolDto" value="#request.list">
    							<option value="<s:property value="#schoolDto.id"/>"><s:property value="#schoolDto.name"/></option>
    					</s:iterator>  
      				</select>   	
  					
  					</span>
  					<span class="message1"></span>
  					<span class="message_require_no">
  					</span>
    							
  					</div>
  					
  					<div><span class="regist_lable">ѧԺ:</span>
  					
  					<span class="regist_text">
			
    				<select name="studentCollege" id="studentCollege">
    						<option value="0">----------</option>   
        					
      				</select>  
  					
  					</span>
  					<span class="message1"></span>
  					<span class="message_require_no">
  					</span>
    							
  					</div>
  					
  					
  					
  					<div><span class="regist_lable">��ʦid:</span><span class="regist_text"><input id="studentPrefessor" type="text" name="studentPrefessor"></input></span><span class="message1"></span><span class="message_require">*</span></div>
  					
  					<div><span class="regist_lable">רҵ:</span><span class="regist_text"><input id="studentMajor" type="text" name="studentMajor"></input></span><span class="message1"></span><span class="message_require">* С��30���ַ�</span></div>
  					<div><span class="regist_lable">ѧ��:</span><span class="regist_text">
  						<select name="studentGrade" id="studentGrade">
    						<option value="0">--------</option>   
        					<option value="1">�����ڶ�</option>   
        					<option value="2">˶ʿ�ڶ�</option>   
        					<option value="3">��ʿ�ڶ�</option>
      					</select>  
  					
  					</span><span class="message1"></span><span class="message_require_no"></span></div>
  					<div><span class="regist_lable">סַ:</span><span class="regist_text"><input id="studentAddress" type="text" name="studentAddress"></input></span><span class="message1"></span><span class="message">С��100���ַ�</span></div>
  					<div><span class="regist_lable">��������:</span><span class="regist_text"><input id="studentBank" type="text" name="studentBank"></input></span><span class="message1"></span><span class="message">С��20���ַ�</span></div>
   					<div><span class="regist_lable">�����˺�:</span><span class="regist_text"><input id="studentBankId" type="text" name="studentBankId"></input></span><span class="message1"></span><span class="message">С��30���ַ�</span></div>
   					
  				</div>
  				
  				<div id="submit_reg"><input type="submit" value="ע��"/></div>
  			</form>
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

