// JavaScript Document
function xian1(){
 document.getElementById("menu1") .style.visibility="visible";
}
function yin1(){
 document.getElementById("menu1") .style.visibility="hidden";
}
function xian2(){
 document.getElementById("menu2") .style.visibility="visible";
}
function yin2(){
 document.getElementById("menu2") .style.visibility="hidden";
}
function xian3(){
 document.getElementById("menu3") .style.visibility="visible";
}
function yin3(){
 document.getElementById("menu3") .style.visibility="hidden";
}
function xian4(){
 document.getElementById("menu4") .style.visibility="visible";
}
function yin4(){
 document.getElementById("menu4") .style.visibility="hidden";
}
function xian5(){
 document.getElementById("menu5") .style.visibility="visible";
}
function yin5(){
 document.getElementById("menu5") .style.visibility="hidden";
}
function xian6(){
 document.getElementById("menu6") .style.visibility="visible";
}
function yin6(){
 document.getElementById("menu6") .style.visibility="hidden";
}
function xian7(){
 document.getElementById("menu7") .style.visibility="visible";
}
function yin7(){
 document.getElementById("menu7") .style.visibility="hidden";
}
function xian8(){
 document.getElementById("menu8") .style.visibility="visible";
}
function yin8(){
 document.getElementById("menu8") .style.visibility="hidden";
}
function xian9(){
 document.getElementById("menu9") .style.visibility="visible";
}
function yin9(){
 document.getElementById("menu9") .style.visibility="hidden";
}

function kuai(){
  var a;
  a=document.getElementById("gao").offsetHeight
  document.getElementById("home_more_list").style.height=a+"px"
}

function check(){
  if(document.form1.idname.value==""){
	  alert("请输入您的登录姓名！");
	  document.form1.idname.focus();
	  return false
	  }
   if(document.form1.password.value==""){
	  alert("请输入您的登录密码！");
	  document.form1.password.focus();
	  return false
	  }
}
function check_sort(){
  if(document.getElementById("leibie").value==""){
	  alert("类别名称不能为空！");
	  document.getElementById("leibie").focus();
	  return false
	  }
   if(document.getElementById("paixu").value==""){
	  alert("请输入排序号！");
	  document.getElementById("paixu").focus();
	  return false
	  }
}
function check_up(){
  if(document.getElementById("feilei").value==""){
	  alert("类别名称不能为空！");
	  return false
	  }
   if(document.getElementById("ziliao").value==""){
	  alert("请上传资料！");
	  document.getElementById("ziliao").focus();
	  return false
	  }
}

function ckziliao1(){
  if(document.getElementById("title1").value==""){
	  alert("资料名称不能为空！");
	  return false
	  }
   if(document.getElementById("ziliao1").value==""){
	  alert("请上传资料！");
	  document.getElementById("ziliao1").focus();
	  return false
	  }
	  t1();
}
function ckziliao2(){
  if(document.getElementById("title2").value==""){
	  alert("资料名称不能为空！");
	  return false
	  }
   if(document.getElementById("ziliao2").value==""){
	  alert("请上传资料！");
	  document.getElementById("ziliao2").focus();
	  return false
	  
	  }
	  t2();
}
function ckziliao3(){
  if(document.getElementById("title3").value==""){
	  alert("资料名称不能为空！");
	  return false
	  }
   if(document.getElementById("ziliao3").value==""){
	  alert("请上传资料！");
	  document.getElementById("ziliao3").focus();
	  return false
	  }
	  t3();
}
function ckziliao4(){
  if(document.getElementById("title4").value==""){
	  alert("资料名称不能为空！");
	  return false
	  }
   if(document.getElementById("ziliao4").value==""){
	  alert("请上传资料！");
	  document.getElementById("ziliao4").focus();
	  return false
	  }
	  t4();
}
function ckziliao5(){
  if(document.getElementById("title5").value==""){
	  alert("资料名称不能为空！");
	  return false
	  }
   if(document.getElementById("ziliao5").value==""){
	  alert("请上传资料！");
	  document.getElementById("ziliao5").focus();
	  return false
	  }
	  t5();
}

function check_xinxi(){
	if(document.getElementById("neirong").value==""){
		alert("请输入信息内容！")
		return false
		document.getElementById("neirong").focus();
		}else{
			if(document.getElementById("neirong").value.length>300){
		      alert("信息内容限制在300个字符!")
		      return false
		      document.getElementById("neirong").focus();
		}
	  }
	}