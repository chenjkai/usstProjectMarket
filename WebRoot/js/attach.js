$(document).ready(function(){
	$("#userRole").change(function(){
		var role = $("#userRole").val();
		var options;
		if(role==0)
			options = "<option value=\"0\">---------</option>";
		if(role==1)
			options = "<option value=\"0\">---------</option>" +
					"<option value=\"1\">项目详细资料" +
					"</option><option value=\"2\">项目小结</option>" +
					"</option><option value=\"3\">项目备案</option>";
		if(role==2)
			options =  "<option value=\"0\">---------</option>" +
			"<option value=\"1\">项目计划" +
			"</option><option value=\"2\">项目详细资料</option>" +
			"</option><option value=\"3\">项目备案</option>";
		
		$("#classic").empty();
		$("#classic").append(options);
	});

});
