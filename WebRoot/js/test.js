$(document).ready(function(){
	
	$("#userName").focusout(function(){
		var username = $.trim($(this).val());
		if(username.length<6||username.length>16){
			$(this).parent().parent().find("span[class^='message']").text("<img src=\"image\\no.jpg\">用户名长度为6-16个英文字母");
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class^='message']").text("<img src=\"image\\yes.jpg\">")
		}
		alert(username);
	});
	
});