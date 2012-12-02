$(document).ready(function(){

	
	$("#vote").click(function(){
		var text = $("#vote").text();
		var projectStatus = $("#projectStatus").val();

		if(text=="投标"){
			
			var projectId = $("#projectId").val();
			$.getJSON("vote.action?projectId="+projectId,function(data){
				if(data.result=="empty"){
					alert("没有该项目");
				}else if(data.result=="aftervote"){
					alert("投标已结束");
				}
				else if(data.result=="login"){
					alert("请先登录");
				}else if(data.result=="lock"){
					alert("该项目不能投标");
				}
				else if(data.result=="role"){
					alert("您的角色和此项目要求的不符合");
				}
				else{
					$("#vote").attr("class",data.result);
					$("#vote").text("取消投标");
					alert("成功竞标");
				}
				
				
			});
			
		}
		
		if(text=="取消投标"){
			var projectId = $("#projectId").val();
			var projectChangeId = $("#vote").attr("class");
			$.getJSON("unVote.action?projectChangeId="+projectChangeId+"&&projectId="+projectId,function(data){
				if(data.result=="ok"){
					$("#vote").text("投标");
					alert("成功取消");
				}else if(data.result=="empty"){
					alert("该项目不存在");
				}else if(data.result=="lock"){
					alert("项目不在投标期");
				}else if(data.result=="novoted"){
					alert("未对该项目投标");
				}else {
					
				}
								
			});
		}
		
	});
	
	
	$(".operation").find("a").click(function(){
		var projectId = $(this).attr("class");
		var status = $(this).text();
		if(status=="启动项目"){
			$.getJSON("projectStatusChange.action?projectId="+projectId+"&&status=3",function(data){
			
			});
			$(this).text("结束项目");
			$(this).attr("class",projectId);
		}
		if(status=="结束项目"){
			$.getJSON("projectStatusChange.action?projectId="+projectId+"&&status=4",function(data){
				
			});
			$(this).text("项目已结束");
			$(this).attr("class",projectId);
		}
	})
});
