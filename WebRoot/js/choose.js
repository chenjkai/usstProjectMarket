$(document).ready(function(){
	
	$("#content_mid").find("a[class='choose']").click(function(){
		
		 var projectId = $(this).parent().find("input[class='projectId']").val();
		 var userId = $(this).parent().find("input[class='userId']").val();
		 var userRole = $(this).parent().find("input[class='userRole']").val();
		 var text = $(this).text();
		if(text=="中标"){			
			$.getJSON("choose.action?projectId="+projectId+"&&userId="+userId+"&&userRole="+userRole,function(data){
				if(data.result = "success"){
					$("#content_mid").find("a[class='choose']").text("");
					$("#content_mid").find("td[class='"+userId+"']").find("a[class='choose']").text("取消");
					alert("成功选中");
				}else if(data.result=="failure"){
					alert("选中失败");
				}else if(data.result=="noVoted"){
					alert("该用户未投标");
				}
			});
			}
		if(text=="取消"){
			$.getJSON("unChoose.action?projectId="+projectId+"&&userId="+userId+"&&userRole="+userRole,function(data){
				if(data.result=="success"){
					$("#content_mid").find("a[class='choose']").text("中标");
					alert("成功取消");
				}else if(data.result=="failure"){
					alert("取消失败");
				}else if(data.result=="noVoted"){
					alert("该用户未投标");
				}	
			});
			
		}	
	});
});
