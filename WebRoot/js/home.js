$(document).ready(function(){
	$("#login").click(function(){
		var username=$("#loginName").val();
		var userpwd = $("#loginPwd").val();
		var role=$("#loginRole").val();
		
		if(username==''){
			alert("请输入用户名");
		}else if(userpwd==''){
			alert("请输入密码");
		}else if(role=='0'){
			alert("请选择角色");
		}else{

			$.getJSON("login.action?loginName="+username+"&&loginPwd="+userpwd+"&&loginRole="+role,function(data){
				var result = data.role;
				var username = data.username;
				var userid = data.userid;
				var newMessCount = data.newMessCount;
				if(userid!=null){
					var html = null;
					if(role=="3"){
						html="欢迎回来："+"<a href=\"showUserInfo.action?role=3&&userId="+userid+"\">"+username+"</a>"+" <a href=\"logout.action\">退出</a>         <a href=\"publish.jsp\">发布项目</a>|<a href=\"showPublished.action?currentPage=1\">已发布项目</a>|<a href=\"modifyinfo.action\">修改资料</a>";
					}
					else if(role=="6"){
						html="欢迎回来："+username+" <a href=\"logout.action\">退出</a>         <a href=\"admin.action\">管理员后台</a>";
					}
					else if(role=="4"){
						html="欢迎回来："+"<a href=\"showUserInfo.action?role=4&&userId="+userid+"\">"+username+"</a>"+"<a href=\"logout.action\">退出</a>         <a href=\"modifyinfo.action\">修改资料</a>|<a href=\"myproject.action\">我的项目</a>";	
					}
					if(newMessCount=="0"){
						html+="|<a href=\"showMessage.action\">"+"我的消息"+"</a>";
					}else{
						html+="|<a href=\"showMessage.action\">"+newMessCount+"条新消息"+"</a>";
					}
					
					$("#banner_top").find(".left").empty();
					$("#banner_top").find(".left").html(html);
				}else{
					alert("登录失败");
				}
			});
		}		
});

});
