$(document).ready(function(){
	 $("#content_mid_a").find("select").change(function(){
		 var status = $(this).val();
		 var projectId = $(this).parent().find("input").val();
		 $.getJSON("changeStatus.action?projectId="+projectId+"&&status="+status,function(data){
				alert("修改成功");
				
			});
	 })
	 
	 $("#content_mid_a").find("a[class='delete']").click(function(){
		 var projectId = $(this).parent().find("input").val();
		 $.getJSON("deleteProject.action?projectId="+projectId,function(data){
				alert("成功删除");
				
			});
		 
		$(this).parent().parent().remove();
	 })
	 
	 $("#firstList").change(function(){
			var id = $("#firstList").val();
			$.getJSON("getSecondMenuList.action?firstListId="+id,function(data){
//				$("#select_right").html(data.result);
				$("#select_right").find("select").empty();
				$("#select_right").find("select").append(data.result);
			});
		});
});