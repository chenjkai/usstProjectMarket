$(document).ready(function(){
	$("#login").click(function(){
		var username=$("#loginName").val();
		var userpwd = $("#loginPwd").val();
		var role=$("#loginRole").val();
		
		if(username==''){
			alert("�������û���");
		}else if(userpwd==''){
			alert("����������");
		}else if(role=='0'){
			alert("��ѡ���ɫ");
		}else{

			$.getJSON("login.action?loginName="+username+"&&loginPwd="+userpwd+"&&loginRole="+role,function(data){
				var result = data.role;
				var username = data.username;
				var userid = data.userid;
				var newMessCount = data.newMessCount;
				if(userid!=null){
					var html = null;
					if(role=="3"){
						html="��ӭ������"+"<a href=\"showUserInfo.action?role=3&&userId="+userid+"\">"+username+"</a>"+" <a href=\"logout.action\">�˳�</a>         <a href=\"publish.jsp\">������Ŀ</a>|<a href=\"showPublished.action?currentPage=1\">�ѷ�����Ŀ</a>|<a href=\"modifyinfo.action\">�޸�����</a>";
					}
					else if(role=="6"){
						html="��ӭ������"+username+" <a href=\"logout.action\">�˳�</a>         <a href=\"admin.action\">����Ա��̨</a>";
					}
					else if(role=="4"){
						html="��ӭ������"+"<a href=\"showUserInfo.action?role=4&&userId="+userid+"\">"+username+"</a>"+"<a href=\"logout.action\">�˳�</a>         <a href=\"modifyinfo.action\">�޸�����</a>|<a href=\"myproject.action\">�ҵ���Ŀ</a>";	
					}
					if(newMessCount=="0"){
						html+="|<a href=\"showMessage.action\">"+"�ҵ���Ϣ"+"</a>";
					}else{
						html+="|<a href=\"showMessage.action\">"+newMessCount+"������Ϣ"+"</a>";
					}
					
					$("#banner_top").find(".left").empty();
					$("#banner_top").find(".left").html(html);
				}else{
					alert("��¼ʧ��");
				}
			});
		}		
});

});
