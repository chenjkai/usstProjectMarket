$(document).ready(function(){
	$("#userRole").change(function(){
		var role = $("#userRole").val();
		var options;
		if(role==0)
			options = "<option value=\"0\">---------</option>";
		if(role==1)
			options = "<option value=\"0\">---------</option>" +
					"<option value=\"1\">��Ŀ��ϸ����" +
					"</option><option value=\"2\">��ĿС��</option>" +
					"</option><option value=\"3\">��Ŀ����</option>";
		if(role==2)
			options =  "<option value=\"0\">---------</option>" +
			"<option value=\"1\">��Ŀ�ƻ�" +
			"</option><option value=\"2\">��Ŀ��ϸ����</option>" +
			"</option><option value=\"3\">��Ŀ����</option>";
		
		$("#classic").empty();
		$("#classic").append(options);
	});

});
