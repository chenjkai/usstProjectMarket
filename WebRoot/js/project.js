$(document).ready(function(){

	
	$("#vote").click(function(){
		var text = $("#vote").text();
		var projectStatus = $("#projectStatus").val();

		if(text=="Ͷ��"){
			
			var projectId = $("#projectId").val();
			$.getJSON("vote.action?projectId="+projectId,function(data){
				if(data.result=="empty"){
					alert("û�и���Ŀ");
				}else if(data.result=="aftervote"){
					alert("Ͷ���ѽ���");
				}
				else if(data.result=="login"){
					alert("���ȵ�¼");
				}else if(data.result=="lock"){
					alert("����Ŀ����Ͷ��");
				}
				else if(data.result=="role"){
					alert("���Ľ�ɫ�ʹ���ĿҪ��Ĳ�����");
				}
				else{
					$("#vote").attr("class",data.result);
					$("#vote").text("ȡ��Ͷ��");
					alert("�ɹ�����");
				}
				
				
			});
			
		}
		
		if(text=="ȡ��Ͷ��"){
			var projectId = $("#projectId").val();
			var projectChangeId = $("#vote").attr("class");
			$.getJSON("unVote.action?projectChangeId="+projectChangeId+"&&projectId="+projectId,function(data){
				if(data.result=="ok"){
					$("#vote").text("Ͷ��");
					alert("�ɹ�ȡ��");
				}else if(data.result=="empty"){
					alert("����Ŀ������");
				}else if(data.result=="lock"){
					alert("��Ŀ����Ͷ����");
				}else if(data.result=="novoted"){
					alert("δ�Ը���ĿͶ��");
				}else {
					
				}
								
			});
		}
		
	});
	
	
	$(".operation").find("a").click(function(){
		var projectId = $(this).attr("class");
		var status = $(this).text();
		if(status=="������Ŀ"){
			$.getJSON("projectStatusChange.action?projectId="+projectId+"&&status=3",function(data){
			
			});
			$(this).text("������Ŀ");
			$(this).attr("class",projectId);
		}
		if(status=="������Ŀ"){
			$.getJSON("projectStatusChange.action?projectId="+projectId+"&&status=4",function(data){
				
			});
			$(this).text("��Ŀ�ѽ���");
			$(this).attr("class",projectId);
		}
	})
});
