$(document).ready(function(){
	//������ᡢ�ⶳ
	$("#user_mid").find("a[class='active']").click(function(){
		var role = $(this).parent().find("input[class='userRole']").val();
		var userId = $(this).parent().find("input[class='userId']").val();
		var text = $(this).text();
		if(text=='����'){
			$.getJSON("activeUser.action?role="+role+"&&userId="+userId,function(data){			
			});
			$(this).text("����");
		}
		if(text=='����'){
			$.getJSON("lockUser.action?role="+role+"&&userId="+userId,function(data){			
			});
			$(this).text("�ⶳ");
		}
		
		if(text=='�ⶳ'){
			$.getJSON("unLockUser.action?role="+role+"&&userId="+userId,function(data){			
			});
			$(this).text("����");
		}
	});
	//ɾ��	
	$("#user_mid").find("a[class='delete']").click(function(){
		var role = $(this).parent().find("input[class='userRole']").val();
		var userId = $(this).parent().find("input[class='userId']").val();
		$.getJSON("deleteUser.action?role="+role+"&&userId="+userId,function(data){			
		});
		$(this).parent().parent().remove();
		alert("�ѳɹ�ɾ��")
	});
});