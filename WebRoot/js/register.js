$(document).ready(function(){
	$("#role").change(function(){
		var role=$("#role").attr("value");
		if(role=="1"){
			$("#school").show();
			$("#college").hide();
			$("#company").hide();
			$("#teacher").hide();
			$("#student").hide();
		}
		else if(role=="2"){
			$("#school").hide();
			$("#college").show();
			$("#company").hide();
			$("#teacher").hide();
			$("#student").hide();
			
		}
		else if(role=="3"){
			$("#school").hide();
			$("#college").hide();
			$("#company").show();
			$("#teacher").hide();
			$("#student").hide();
			
		}	
		
		else if(role=="4"){
			$("#school").hide();
			$("#college").hide();
			$("#company").hide();
			$("#teacher").show();
			$("#student").hide();
			
		}
		else if(role=="5"){
			$("#school").hide();
			$("#college").hide();
			$("#company").hide();
			$("#teacher").hide();
			$("#student").show();
			
		}
		else if(role=="0"){
			$("#school").hide();
			$("#college").hide();
			$("#company").hide();
			$("#teacher").hide();
			$("#student").hide();
			
		}
	});

	$("#userName").change(function(){
		
		var username = $.trim($(this).val());
		if(username.length<6||username.length>16){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");
		}
		
		$.getJSON("validateRename.action?userName="+username,function(data){
			var result = data.result;
			if(result == "0"){
				$("#userName").parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">该用户名已存在");
				$("#userName").val("");
			}
		});
	});
	
	$("#userPwd").change(function(){
		var  userPwd= $.trim($(this).val());
		if(userPwd.length<6||userPwd.length>16){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");
		}
	});
	
	
	$("#reuserPwd").change(function(){
		var reuserPwd= $.trim($(this).val());
		var userPwd= $.trim($("#userPwd").val());
		if(reuserPwd!=userPwd){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");
		}
	});
	
	$("#phone").change(function(){
		var  phone = $.trim($(this).val());
		if(phone.length<8||phone.length>14){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");
		}
	});
	
	$("#email").change(function(){
		var email = $.trim($(this).val());
		if(email.length>20){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}
		if(!checkEmail(email)){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");
		}
	});
	
	$("#fax").change(function(){
		var fax = $.trim($(this).val());
		if(fax.length<8||fax.length>14){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");

		}
	});
	
	$("#zip").change(function(){
		var zip = $.trim($(this).val());
		if(zip.length!=6){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
			 
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");
		}
	});
	
	$("#role").change(function(){
		var role = $.trim($(this).val());
		if(role==0){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");
		}
	});
	
	$("#schoolName").change(function(){
		var schoolName = $.trim($(this).val());		
		if(schoolName.length==0||schoolName.length>20){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");
		}
	});
	
	$("#schoolAddress").change(function(){
		var schoolAddress = $.trim($(this).val());
		if(schoolAddress.length==0){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">"); 
			$(this).val("");
		}
		else if(schoolAddress.length>100){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">"); 
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	
	$("#schoolContact").change(function(){
		var schoolContact = $.trim($(this).val());
		if(schoolContact.length==0){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">"); 
			$(this).val("");
		}
		else if(schoolPresident.length>10){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	
	$("#schoolPresident").change(function(){
		var schoolPresident = $.trim($(this).val());
		if(schoolPresident.length==0){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">"); 
			$(this).val("");
		}
		else if(schoolPresident.length>10){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">"); 
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	
	$("#schoolWeb").change(function(){
		var schoolWeb = $.trim($(this).val());
		if(schoolWeb.length==0){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">"); 
			$(this).val("");
		}
		else if(schoolWeb.length>50){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">"); 
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	
	$("#collegeName").change(function(){
		var collegeName = $.trim($(this).val());
		if(collegeName.length==0){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}
		else if(collegeName.length>40){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
			 
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
		
	});
	$("#collegeAddress").change(function(){
		var  collegeAddress = $.trim($(this).val());
		if(collegeAddress.length==0){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">"); 
			$(this).val("");
		}
		else if(collegeAddress.length>100){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	
	
	$("#deportName").change(function(){
		var  deportName = $.trim($(this).val());
		if(deportName.length==0){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}
		else if(deportName.length>10){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">"); 
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	

	$("#companyName").change(function(){
		var companyName = $.trim($(this).val());
		if(companyName.length==0){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}
		else if(companyName.length>40){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">"); 
			$(this).val("");
			 
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	
	$("#companyAddress").change(function(){
		var companyAddress = $.trim($(this).val());
		if(companyAddress.length==0){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">"); 
			$(this).val("");
		}
		else if(companyAddress.length>40){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">"); 
			$(this).val("");
			 
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	
	$("#companyContact").change(function(){
		var companyContact = $.trim($(this).val());
		if(companyContact.length==0){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}
		else if(companyContact.length>20){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">"); 
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	
	$("#companyWeb").change(function(){
		var companyWeb = $.trim($(this).val());
		if(companyWeb.length==0){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">"); 
			$(this).val("");
		}
		else if(companyWeb.length>50){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	
	$("#companyLawer").change(function(){
		var companyLawer = $.trim($(this).val());
		if(companyLawer.length==0){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");  
		}
		else if(companyLawer.length>20){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");  
			 
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	
	$("#companyBank").change(function(){
		var companyBank = $.trim($(this).val());
		if(companyBank.length>20){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	
	$("#companyBandId").change(function(){
		var companyBandId = $.trim($(this).val());
		if(companyBandId.length>30){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	
	$("#companyTax").change(function(){
		var companyTax = $.trim($(this).val());
		if(companyTax.length>20){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	

	$("#teacherName").change(function(){
		var teacherName = $.trim($(this).val());
		if(teacherName.length==0){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}
		else if(teacherName.length>20){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">"); 
			$(this).val("");
			 
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	
	$("#teacherMajor").change(function(){
		var teacherMajor = $.trim($(this).val());
		if(teacherMajor.length==0){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">"); 
			$(this).val("");
		}
		else if(teacherMajor.length>20){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">"); 
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	$("#teacherBank").change(function(){
		var companyBank = $.trim($(this).val());
		if(companyBank.length>20){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");  
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	
	$("#teacherBankId").change(function(){
		var teacherBankId = $.trim($(this).val());
		if(teacherBankId.length>30){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">"); 
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	

	
	$("#studentName").change(function(){
		var studentName = $.trim($(this).val());
		if(studentName.length==0){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">"); 
			$(this).val("");
		}
		else if(studentName.length>20){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
			 
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	
	$("#studentPrefessor").change(function(){
		var studentPrefessor = $.trim($(this).val());
		$.getJSON("validateTeacherById.action?teacherId="+studentPrefessor,function(data){
			if(data.result=="1"){
				$("#studentPrefessor").parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");
			}else{
				$("#studentPrefessor").parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
				$("#studentPrefessor").val("");
			}
			
		});
	});
	
	$("#studentMajor").change(function(){
		var studentMajor = $.trim($(this).val());
		if(studentMajor.length==0){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}
		else if(studentMajor.length>30){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">"); 
			$(this).val("");
			 
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	
	$("#studentAddress").change(function(){
		var studentAddress = $.trim($(this).val());
		if(studentAddress.length>100){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	
	$("#studentBank").change(function(){
		var studentBank = $.trim($(this).val());
		if(studentBank.length>20){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");  			 
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	
	$("#studentBankId").change(function(){
		var studentBankId = $.trim($(this).val());
		if(studentBankId.length>30){
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\yes.jpg\">");			
		}
	});
	
	
	//全局校验
	$("#userRegisterForm").find("form").submit(function(){
		
		//验证公共属性
		var  userName = $.trim($("#userName").val());
		var  userPwd = $.trim($("#userPwd").val());
		var  reuserPwd = $.trim($("#reuserPwd").val());
		var  email = $.trim($("#email").val());
		var  phone = $.trim($("#phone").val());
		var  fax = $.trim($("#fax").val());
		var  zip = $.trim($("#zip").val());
		if(userName.length==0||userPwd.length==0||reuserPwd.length==0||email.length==0||phone.length==0){
			alert("还有必填项为空，请认真填写");
			return false;
		}
		
		var role = $("role").val();
		if(role==0){
			alert("未选择角色");
			return false;
		}
		if(role==1){
			
			$("#school").find("input[id^='school']").each(function(){
				var val = $.trim($(this).val());
				if(val.length==0){
					$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
					alert("还有必填项为空，请认真填写");
					return false;
				}
			});
		}
		
		if(role==2){
			$("#college").find("span[class='message_require']").each(function(){
				var val = $.trim($(this).parent().find("input").val());
				if(val.length==0){
					$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
					alert("还有必填项为空，请认真填写");
					return false;
				}
				
			});
			
			$("#college").find("span[class='message_require_no']").each(function(){
				var val1 = $.trim($(this).parent().find("select").val());
				if(val1=='0'){
					$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
					alert("还有必选项为空，请认真填写");
					return false;
				}
			});
		}
		
		if(role==3){
			$("#company").find("span[class='message_require']").each(function(){
				var val = $.trim($(this).parent().find("input").val());
				if(val.length==0){
					$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
					alert("还有未正确填写的数据");
					return false;
				}
				
			});
		}
		
		
		if(role==4){
			$("#teacher").find("span[class='message_require']").each(function(){
				var val = $.trim($(this).parent().find("input").val());
				if(val.length==0){
					$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
					alert("还有未正确填写的数据");
					return false;
				}
				
			});
			
			$("#teacher").find("span[class='message_require_no']").each(function(){
				var val1 = $.trim($(this).parent().find("select").val());
				if(val1=='0'){
					$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
					alert("还有必选项为空，请认真填写");
					return false;
				}
			});
		}
		
		if(role==5){
			$("#student").find("span[class='message_require']").each(function(){
				var val = $.trim($(this).parent().find("input").val());
				if(val.length==0){
					$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
					alert("还有未正确填写的数据");
					return false;
				}
				
			});
			
			$("#student").find("span[class='message_require_no']").each(function(){
				var val1 = $.trim($(this).parent().find("select").val());
				if(val1=='0'){
					$(this).parent().parent().find("span[class='message1']").html("<img src=\"image\\no.jpg\">");
					alert("还有必选项为空，请认真填写");
					return false;
				}
			});
		}
	});
	//根据学校id获取学院列表
	$("#teacherSchool").change(function(){
		var schoolId = $(this).val();
		$.getJSON("getCollegeBySchool.action?schoolId="+schoolId,function(data){
			$("#teacherCollege").empty();
			$("#teacherCollege").append(data.result);
		});
	});
	
	$("#studentSchool").change(function(){
		var schoolId = $(this).val();
		$.getJSON("getCollegeBySchool.action?schoolId="+schoolId,function(data){
			$("#studentCollege").empty();
			$("#studentCollege").append(data.result);
		});
	});
	
});

function checkEmail(email){
	var emailRegExp = new RegExp(            "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?");
	if (!emailRegExp.test(email)||email.indexOf('.')==-1){
		return false;
	}else{
		return true;
	}
}
