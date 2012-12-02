<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  <body>
  <input id="username" type="hidden" value="${user.username}"/>
	<input id="userid" type="hidden" value="${user.id}"/>
	<input id="userrole" type="hidden" value="${role}"/>
   <div id="header">项目交易平台</div>
  		
  		<div id="banner_top">
  			<div class="left">
  				
			   <s:set name="user" value="#session['user']"></s:set>
			    <s:set name="role" value="#session['role']"></s:set>
			    <s:set name="newMessCount" value="#session['newMessCount']"></s:set>
			   <s:if test="#role==3">
			   		欢迎回来：<a href="showUserInfo.action?role=3&&userId=<s:property value="#user.id"/>"><s:property value="#user.username"/></a> <a href="logout.action">退出</a>         <a href="publish.jsp">发布项目</a>|<a href="showPublished.action?currentPage=1">已发布项目</a>|<a href="modifyinfo.action">修改资料</a>| <s:if test="#newMessCount==''"><a href="showMessage.action">我的消息</a></s:if> <s:else><a href="showMessage.action">${newMessageCount}条新消息</a></s:else>
			   </s:if>
			  <s:elseif test="#role==1">
					欢迎回来：<s:property value="#user.username"/> <a href="logout.action">退出</a>         <a href="modifyinfo.action">修改资料</a>|<a href="myproject.action">我的项目</a>| <s:if test="#newMessCount==0"><a href="showMessage.action">我的消息</a></s:if> <s:else><a href="showMessage.action">${newMessageCount}条新消息</a></s:else>			  
				</s:elseif>
			  <s:elseif test="#role==2">
					欢迎回来：<s:property value="#user.username"/> <a href="logout.action">退出</a>         <a href="modifyinfo.action">修改资料</a>|<a href="myproject.action">我的项目</a>| <s:if test="#newMessCount==0"><a href="showMessage.action">我的消息</a></s:if> <s:else><a href="showMessage.action">${newMessageCount}条新消息</a></s:else>		  
				</s:elseif>
			  <s:elseif test="#role==4">
			  		欢迎回来：<a href="showUserInfo.action?role=4&&userId=<s:property value="#user.id"/>"><s:property value="#user.username"/></a> <a href="logout.action">退出</a>        <a href="myproject.action">我的项目</a>| <s:if test="#newMessCount==0"><a href="showMessage.action">我的消息</a></s:if> <s:else><a href="showMessage.action">${newMessageCount}条新消息</a></s:else>
			  </s:elseif>
			   <s:elseif test="#role==5">
			  		欢迎回来：<s:property value="#user.username"/> <a href="logout.action">退出</a>         <a href="modifyinfo.action">修改资料</a>|<a href="myproject.action">我的项目</a>| <s:if test="#newMessCount==0"><a href="showMessage.action">我的消息</a></s:if> <s:else><a href="showMessage.action">${newMessageCount}条新消息</a></s:else>
			  </s:elseif>
			  
			  <s:elseif test="#role==6">
			  		欢迎回来：<s:property value="#user.username"/> <a href="logout.action">退出</a>         <a href="admin.action">管理员后台</a>| <s:if test="#newMessCount==0"><a href="showMessage.action">我的消息</a></s:if> <s:else><a href="showMessage.action">${newMessageCount}条新消息</a></s:else>
			  </s:elseif>
			   <s:else>
			   
			  
			   	<div id="form">
						用户名：<input id="loginName" type="text" name="loginName" size="6" maxlength="16"  style="height:20px;width:100px;"/>
						密码     : <input id="loginPwd" type="password" name="loginPwd" size="6" maxlength="16"  style="height:20px;width:100px;"/>
						角色     ：
						<select id="loginRole" name="loginRole" style="height:20px">
							<option value="0" selected>----</option>
							<option value="1">学校</option>
							<option value="2">学院</option>
							<option value="3">企业</option>
							<option value="4">教师</option>
							<option value="5">学生</option>
							<option value="6">中心</option>	
						</select>
						<a id="login" href="#">登录</a>
						<a href="showRegister.action">注册</a>
						
			   </div>
			   </s:else>
				
  			</div>
  			
  			<div class="right">
 				
			</div>	
  							
 </div>
  		<div id="banner_bottom">
  			
  			
  			<div id="menubox">

  				<ul class="right">

    			<li id="menu_line"><a href="home.action" class="dh">首    页</a></li>

				<li id="menu_line" onmouseover="xian1()" onmouseout="yin1()"><a href="showprojects.action?firstlist=1" class="dh">新能源</a>

	 					 <div id="menu1" style="visibility:hidden;z-index:100">

	   							 <ul>

									<li class="menu_w" onmouseover="className='menu_bg'" onmouseout="className=''"><a href="showprojects.action?secondlist=1&&currentPage=1" class="dh">风电</a></li>
	
									<li class="menu_w" onmouseover="className='menu_bg'" onmouseout="className=''"><a href="showprojects.action?secondlist=2&&currentPage=1" class="dh">核电</a></li>
		
       							 </ul>

      					</div>

    			</li>


				<li id="menu_line" onmouseover="xian2()" onmouseout="yin2()"><a href="showprojects.action?firstlist=2" class="dh">高效清洁能源</a>

	 					 <div id="menu2" style="visibility:hidden;z-index:5">

	    					<ul>

								 <li class="menu_w" onmouseover="className='menu_bg'" onmouseout="className=''"><a href="showprojects.action?secondlist=3&&currentPage=1" class="dh">火电</a></li>

								 <li class="menu_w" onmouseover="className='menu_bg'" onmouseout="className=''"><a href="showprojects.action?secondlist=4&&currentPage=1" class="dh">输配电</a></li>
		
        					</ul>

      					</div>

				</li>

				<li id="menu_line" onmouseover="xian3()" onmouseout="yin3()"><a href="showprojects.action?firstlist=3" class="dh">工业装备</a>

	  					<div id="menu3" style="visibility:hidden">

	    					<ul>

								<li class="menu_w" onmouseover="className='menu_bg'" onmouseout="className=''"><a href="showprojects.action?secondlist=5&&currentPage=1" class="dh">电梯</a></li>
		 						<li class="menu_w" onmouseover="className='menu_bg'" onmouseout="className=''"><a href="showprojects.action?secondlist=6&&currentPage=1" class="dh">机床</a></li>
		 						<li class="menu_w" onmouseover="className='menu_bg'" onmouseout="className=''"><a href="showprojects.action?secondlist=7&&currentPage=1" class="dh">船用曲轴</a></li>
		 						<li class="menu_w" onmouseover="className='menu_bg'" onmouseout="className=''"><a href="showprojects.action?secondlist=8&&currentPage=1" class="dh">印刷包装机械</a></li>
		 						<li class="menu_w" onmouseover="className='menu_bg'" onmouseout="className=''"><a href="showprojects.action?secondlist=9&&currentPage=1" class="dh">电机</a></li>
		 						<li class="menu_w" onmouseover="className='menu_bg'" onmouseout="className=''"><a href="showprojects.action?secondlist=10&&currentPage=1" class="dh">轨道交通</a></li>
		
        					</ul>
						</div>

				</li>

				<li id="menu_line" onmouseover="xian4()" onmouseout="yin4()"><a href="showprojects.action?firstlist=4" class="dh">现代服务业</a>

						<div id="menu4" style="visibility:hidden">

	   						 <ul>
		
	   	 						 <li class="menu_w" onmouseover="className='menu_bg'" onmouseout="className=''"><a href="showprojects.action?secondlist=11&&currentPage=1" class="dh">电站工程</a></li>
	     						 <li class="menu_w" onmouseover="className='menu_bg'" onmouseout="className=''"><a href="showprojects.action?secondlist=12&&currentPage=1" class="dh">输配电工程</a></li>
      						</ul>

      					</div>

				</li>

 	 			</ul>
 			
		</div>
		
		
		</div>
  </body>
</html>
