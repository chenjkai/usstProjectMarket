<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>布局页</title>
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
  			<center style="font-size:20px">新用户注册</center>
  			  <br/>
  			  <br/>
  			<form action="register.action" method="post">
  				<div><span class="regist_lable">用户名:</span><span class="regist_text"><input id="userName" type="text" name="userName"/></span><span class="message1"></span><span class="message_require">* 6-16个英文字母</span></div>
  				<div><span class="regist_lable">密码:</span><span class="regist_text"><input id="userPwd" type="password" name="userPwd"/></span><span class="message1"></span><span class="message_require">* 6-16个字符</span></div>
  				<div><span class="regist_lable">确认密码:</span><span class="regist_text"><input id="reuserPwd" type="password" name="reuserPwd"/></span><span class="message1"></span><span class="message_require">*</span></div>
  				<div><span class="regist_lable">电话:</span><span class="regist_text"><input id="phone" type="text" name="phone"/></span><span class="message1"></span><span class="message_require">* 8-14个字符</span></div>

  				<div><span class="regist_lable">电子邮件:</span><span class="regist_text"><input id="email" type="text" name="email"/></span><span class="message1"></span><span class="message_require">* 小于20个字符</span></div>
  				<div><span class="regist_lable">传真:</span><span class="regist_text"><input id="fax" type="text" name="fax"/></span><span class="message1"></span><span class="message">&nbsp;8-14个字符</span></div>
  				<div><span class="regist_lable">邮编:</span><span class="regist_text"><input id="zip" type="text" name="zip"/></span><span class="message1"></span><span class="message">&nbsp;6位数字</span></div>
  				<div><span class="regist_lable">账号类型:</span><span class="regist_text">
  				
  				<select name="role" id="role">
    								<option value="0">------</option>      
        							<option value="1">学校</option>   
        							<option value="2">学院</option>   
        							<option value="3">企业</option>   
        							<option value="4">教师</option>   
        							<option value="5">学生</option>   
      			</select> 
      			
  				</span><span class="message_require_no"></span>
  				</div>
  				
  				<div id="school" style="display:none">
  					<div><span class="regist_lable">学校名称:</span><span class="regist_text"><input id="schoolName" type="text" name="schoolName"/></span><span class="message1"></span><span class="message_require">* 小于20个字符</span></div>
  					<div><span class="regist_lable">学校地址:</span><span class="regist_text"><input id="schoolAddress" type="text" name="schoolAddress"/></span><span class="message1"></span><span class="message_require">* 小于100个字符</span></div>
  					<div><span class="regist_lable">校长:</span><span class="regist_text"><input id="schoolPresident" type="text" name="schoolPresident"/></span><span class="message1"></span><span class="message_require">* 小于10个字符</span></div>
  					<div><span class="regist_lable">联系人:</span><span class="regist_text"><input id="schoolContact" type="text" name="schoolContact"/></span><span class="message1"></span><span class="message_require">* 小于10个字符</span></div>
  					<div><span class="regist_lable">学校网站:</span><span class="regist_text"><input id="schoolWeb" type="text" name="schoolWeb"/></span><span class="message1"></span><span class="message_require"></span>* 小于50个字符</div>
  					<!--<div><span class="regist_lable">开户银行:</span><span class="regist_text"><input id="schoolBank" type="text" name="schoolBank"/></span><span class="message1"></span><span class="message"></span></div>
  					<div><span class="regist_lable">开户账号:</span><span class="regist_text"><input id="schoolBandId" type="text" name="schoolBandId"/></span><span class="message1"></span><span class="message"></span></div>-->
  				</div>
  				
  				
  				<div id="college" style="display:none">
  					<div><span class="regist_lable">所属大学:</span><span class="regist_text">
  						<select name="schoolCollege" id="schoolCollege">
    							<option value="0">----------</option>
    							<s:iterator id="schoolDto" value="#request.list">
    								<option value="<s:property value="#schoolDto.id"/>"><s:property value="#schoolDto.name"/></option>
    							</s:iterator>  
      					</select>  
  					</span><span class="message1"></span><span class="message_require_no"></span></div>
  					<div><span class="regist_lable">学院名称:</span><span class="regist_text"><input id="collegeName" type="text" name="collegeName"/></span><span class="message1"></span><span class="message_require">* 小于40个字符</span></div>
  					<div><span class="regist_lable">学院地址:</span><span class="regist_text"><input id="collegeAddress" type="text" name="collegeAddress"/></span><span class="message1"></span><span class="message_require">* 小于100个字符</span></div>
  					<div><span class="regist_lable">系主任:</span><span class="regist_text"><input id="deportName" type="text" name="deportName"/></span><span class="message1"></span><span class="message_require">* 小于10个字符</span></div>
  				</div>
  				
  				<div id="company" style="display:none">
  					<div><span class="regist_lable">企业名:</span><span class="regist_text"><input id="companyName" type="text" name="companyName"/></span><span class="message1"></span><span class="message_require">* 小于40个字符</span></div>
  					<div><span class="regist_lable">企业地址:</span><span class="regist_text"><input id="companyAddress" type="text" name="companyAddress"/></span><span class="message1"></span><span class="message_require">* 小于100个字符</span></div>
  					<div><span class="regist_lable">企业联系人:</span><span class="regist_text"><input id="companyContact" type="text" name="companyContact"/></span><span class="message1"></span><span class="message_require">* 小于20个字符</span></div>
  					<div><span class="regist_lable">企业网站:</span><span class="regist_text"><input id="companyWeb" type="text" name="companyWeb"/></span><span class="message1"></span><span class="message_require">* 小于50个字符</span></div>
  					<div><span class="regist_lable">企业法人:</span><span class="regist_text"><input id="companyLawer" type="text" name="companyLawer"/></span><span class="message1"></span><span class="message_require">* 小于20个字符</span></div>
  					<div><span class="regist_lable">企业银行:</span><span class="regist_text"><input id="companyBank" type="text" name="companyBank"/></span><span class="message1"></span><span class="message">小于20个字符</span></div>
  					<div><span class="regist_lable">企业账号:</span><span class="regist_text"><input id="companyBandId" type="text" name="companyBandId"/></span><span class="message1"></span><span class="message">小于30个字符</span></div>
   					<div><span class="regist_lable">企业识别人:</span><span class="regist_text"><input id="companyTax" type="text" name="companyTax"/></span><span class="message1"></span><span class="message">小于20个字符</span></div>
  				</div>
  				
  				<div id="teacher" style="display:none">
  					<div><span class="regist_lable">学校:</span><span class="regist_text">
  					
  					<select name="teacherSchool" id="teacherSchool" class="linkage_father">
  							<option value="0">----------</option>
    						<s:iterator id="schoolDto" value="#request.list">
    								<option value="<s:property value="#schoolDto.id"/>"><s:property value="#schoolDto.name"/></option>
    						</s:iterator>  
      				</select>   
				
  					
  					</span><span class="message1"></span><span class="message_require_no"></span></div>
  					
  					<div><span class="regist_lable">学院:</span><span class="regist_text">
  							
    				<select name="teacherCollege" id="teacherCollege" class="linkage_child">
    						<option value="0">----------</option>   
        					 
      				</select>  
      				
  					</span><span class="message1"></span><span class="message_require_no"></span></div>
  					
  					<div><span class="regist_lable">姓名:</span><span class="regist_text"><input id="teacherName" type="text" name="teacherName"/></span><span class="message1"></span><span class="message_require">* 小于20个字符</span></div>
  					<div><span class="regist_lable">职称:</span><span class="regist_text">
  						<select name="positiorl" id="positiorl">  
        							<option value="1">教      授</option>   
        							<option value="2">副 教 授</option>   
        							<option value="3">讲      师</option>   
      					</select>  
  					</span><span class="message1"></span><span class="message_require_no"></span></div>
  					<div><span class="regist_lable">专业:</span><span class="regist_text"><input id="teacherMajor" type="text" name="teacherMajor"></input></span><span class="message1"></span><span class="message_require">* 小于30个字符</span></div>
  					<div><span class="regist_lable">开户银行:</span><span class="regist_text"><input id="teacherBank" type="text" name="teacherBank"></input></span><span class="message1"></span><span class="message">小于20个字符</span></div>
  					<div><span class="regist_lable">开户账号:</span><span class="regist_text"><input id="teacherBankId" type="text" name="teacherBankId"></input></span><span class="message1"></span><span class="message">小于30个字符</span></div>
  				</div>
  				
  				
  				<div id="student" style="display:none">
  					<div><span class="regist_lable">姓名:</span><span class="regist_text"><input id="studentName" type="text" name="studentName"></input></span><span class="message1"></span><span class="message_require">* 小于20个字符</span></div>
  					<div><span class="regist_lable">学校:</span>
  					
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
  					
  					<div><span class="regist_lable">学院:</span>
  					
  					<span class="regist_text">
			
    				<select name="studentCollege" id="studentCollege">
    						<option value="0">----------</option>   
        					
      				</select>  
  					
  					</span>
  					<span class="message1"></span>
  					<span class="message_require_no">
  					</span>
    							
  					</div>
  					
  					
  					
  					<div><span class="regist_lable">导师id:</span><span class="regist_text"><input id="studentPrefessor" type="text" name="studentPrefessor"></input></span><span class="message1"></span><span class="message_require">*</span></div>
  					
  					<div><span class="regist_lable">专业:</span><span class="regist_text"><input id="studentMajor" type="text" name="studentMajor"></input></span><span class="message1"></span><span class="message_require">* 小于30个字符</span></div>
  					<div><span class="regist_lable">学历:</span><span class="regist_text">
  						<select name="studentGrade" id="studentGrade">
    						<option value="0">--------</option>   
        					<option value="1">本科在读</option>   
        					<option value="2">硕士在读</option>   
        					<option value="3">博士在读</option>
      					</select>  
  					
  					</span><span class="message1"></span><span class="message_require_no"></span></div>
  					<div><span class="regist_lable">住址:</span><span class="regist_text"><input id="studentAddress" type="text" name="studentAddress"></input></span><span class="message1"></span><span class="message">小于100个字符</span></div>
  					<div><span class="regist_lable">开户银行:</span><span class="regist_text"><input id="studentBank" type="text" name="studentBank"></input></span><span class="message1"></span><span class="message">小于20个字符</span></div>
   					<div><span class="regist_lable">银行账号:</span><span class="regist_text"><input id="studentBankId" type="text" name="studentBankId"></input></span><span class="message1"></span><span class="message">小于30个字符</span></div>
   					
  				</div>
  				
  				<div id="submit_reg"><input type="submit" value="注册"/></div>
  			</form>
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

