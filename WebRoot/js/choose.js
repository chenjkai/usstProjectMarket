$(document).ready(function(){
	
	$("#content_mid").find("a[class='choose']").click(function(){
		
		 var projectId = $(this).parent().find("input[class='projectId']").val();
		 var userId = $(this).parent().find("input[class='userId']").val();
		 var userRole = $(this).parent().find("input[class='userRole']").val();
		 var text = $(this).text();
		if(text=="�б�"){			
			$.getJSON("choose.action?projectId="+projectId+"&&userId="+userId+"&&userRole="+userRole,function(data){
				if(data.result = "success"){
					$("#content_mid").find("a[class='choose']").text("");
					$("#content_mid").find("td[class='"+userId+"']").find("a[class='choose']").text("ȡ��");
					alert("�ɹ�ѡ��");
				}else if(data.result=="failure"){
					alert("ѡ��ʧ��");
				}else if(data.result=="noVoted"){
					alert("���û�δͶ��");
				}
			});
			}
		if(text=="ȡ��"){
			$.getJSON("unChoose.action?projectId="+projectId+"&&userId="+userId+"&&userRole="+userRole,function(data){
				if(data.result=="success"){
					$("#content_mid").find("a[class='choose']").text("�б�");
					alert("�ɹ�ȡ��");
				}else if(data.result=="failure"){
					alert("ȡ��ʧ��");
				}else if(data.result=="noVoted"){
					alert("���û�δͶ��");
				}	
			});
			
		}	
	});
});
