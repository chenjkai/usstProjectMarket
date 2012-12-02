$(document).ready(function(){
	//激活、冻结、解冻
	$("#user_mid").find("a[class='active']").click(function(){
		var role = $(this).parent().find("input[class='userRole']").val();
		var userId = $(this).parent().find("input[class='userId']").val();
		var text = $(this).text();
		if(text=='激活'){
			$.getJSON("activeUser.action?role="+role+"&&userId="+userId,function(data){			
			});
			$(this).text("冻结");
		}
		if(text=='冻结'){
			$.getJSON("lockUser.action?role="+role+"&&userId="+userId,function(data){			
			});
			$(this).text("解冻");
		}
		
		if(text=='解冻'){
			$.getJSON("unLockUser.action?role="+role+"&&userId="+userId,function(data){			
			});
			$(this).text("冻结");
		}
	});
	//删除	
	$("#user_mid").find("a[class='delete']").click(function(){
		var role = $(this).parent().find("input[class='userRole']").val();
		var userId = $(this).parent().find("input[class='userId']").val();
		$.getJSON("deleteUser.action?role="+role+"&&userId="+userId,function(data){			
		});
		$(this).parent().parent().remove();
		alert("已成功删除")
	});
});