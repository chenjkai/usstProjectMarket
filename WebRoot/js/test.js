$(document).ready(function(){
	
	$("#userName").focusout(function(){
		var username = $.trim($(this).val());
		if(username.length<6||username.length>16){
			$(this).parent().parent().find("span[class^='message']").text("<img src=\"image\\no.jpg\">�û�������Ϊ6-16��Ӣ����ĸ");
			$(this).val("");
		}else{
			$(this).parent().parent().find("span[class^='message']").text("<img src=\"image\\yes.jpg\">")
		}
		alert(username);
	});
	
});