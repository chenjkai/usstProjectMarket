$(document).ready(function(){
//	$.getJSON("getFirstMenuList.action",function(data){
//		$("#select_left").html(data.result);	
//	});
//	
//	alert($("#firstList").val());
	
	$("#firstList").change(function(){
		var id = $("#firstList").val();
		$.getJSON("getSecondMenuList.action?firstListId="+id,function(data){
//			$("#select_right").html(data.result);
			$("#select_right").find("select").empty();
			$("#select_right").find("select").append(data.result);
		});
	});
	
	//������֤
	$("#project_description").find("form").submit(function(){
		var title = $("#project_title").val().trim().length;
		var phone = $("#project_phone").val().trim().length;
		var type = $("#project_type").val().trim();
		var object = $("#project_object").val().trim();
		var firstList = $("#firstList").val().trim();
		var secondList = $("#secondList").val().trim();
		var editor = $("#editor").val();
		if(title==0||title>100){
			alert("���ⳤ��Ϊ0~100���ַ�");
			return false;
		}
		
		if(phone==0||phone>20){
			alert("��ϵ�绰Ϊ0~20���ַ�");
			return false;
		}
		
		if(type=='0'||object=='0'||firstList=='0'||secondList=='0'){
			alert("����������ѡ��Ϊ��");
			return false;
		}
		if(editor==''){
			alert("��Ŀ����Ϊ�գ�����д");
			return false;
		}
		return true;
	});
	
});
