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
	  alert("���������ĵ�¼������");
	  document.form1.idname.focus();
	  return false
	  }
   if(document.form1.password.value==""){
	  alert("���������ĵ�¼���룡");
	  document.form1.password.focus();
	  return false
	  }
}
function check_sort(){
  if(document.getElementById("leibie").value==""){
	  alert("������Ʋ���Ϊ�գ�");
	  document.getElementById("leibie").focus();
	  return false
	  }
   if(document.getElementById("paixu").value==""){
	  alert("����������ţ�");
	  document.getElementById("paixu").focus();
	  return false
	  }
}
function check_up(){
  if(document.getElementById("feilei").value==""){
	  alert("������Ʋ���Ϊ�գ�");
	  return false
	  }
   if(document.getElementById("ziliao").value==""){
	  alert("���ϴ����ϣ�");
	  document.getElementById("ziliao").focus();
	  return false
	  }
}

function ckziliao1(){
  if(document.getElementById("title1").value==""){
	  alert("�������Ʋ���Ϊ�գ�");
	  return false
	  }
   if(document.getElementById("ziliao1").value==""){
	  alert("���ϴ����ϣ�");
	  document.getElementById("ziliao1").focus();
	  return false
	  }
	  t1();
}
function ckziliao2(){
  if(document.getElementById("title2").value==""){
	  alert("�������Ʋ���Ϊ�գ�");
	  return false
	  }
   if(document.getElementById("ziliao2").value==""){
	  alert("���ϴ����ϣ�");
	  document.getElementById("ziliao2").focus();
	  return false
	  
	  }
	  t2();
}
function ckziliao3(){
  if(document.getElementById("title3").value==""){
	  alert("�������Ʋ���Ϊ�գ�");
	  return false
	  }
   if(document.getElementById("ziliao3").value==""){
	  alert("���ϴ����ϣ�");
	  document.getElementById("ziliao3").focus();
	  return false
	  }
	  t3();
}
function ckziliao4(){
  if(document.getElementById("title4").value==""){
	  alert("�������Ʋ���Ϊ�գ�");
	  return false
	  }
   if(document.getElementById("ziliao4").value==""){
	  alert("���ϴ����ϣ�");
	  document.getElementById("ziliao4").focus();
	  return false
	  }
	  t4();
}
function ckziliao5(){
  if(document.getElementById("title5").value==""){
	  alert("�������Ʋ���Ϊ�գ�");
	  return false
	  }
   if(document.getElementById("ziliao5").value==""){
	  alert("���ϴ����ϣ�");
	  document.getElementById("ziliao5").focus();
	  return false
	  }
	  t5();
}

function check_xinxi(){
	if(document.getElementById("neirong").value==""){
		alert("��������Ϣ���ݣ�")
		return false
		document.getElementById("neirong").focus();
		}else{
			if(document.getElementById("neirong").value.length>300){
		      alert("��Ϣ����������300���ַ�!")
		      return false
		      document.getElementById("neirong").focus();
		}
	  }
	}