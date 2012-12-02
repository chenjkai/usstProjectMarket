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
  <div id="header">管理员后台</div>
  		
  		<div id="banner_top">
  			<div class="left">
			  欢迎回来：Admin
  			</div>
  			
  			<div class="right">
 				
			</div>	
  							
 </div>
  		<div id="banner_bottom">
  			
  			
  			<div id="menubox">

  				<ul>

    			<li id="menu_line"><a href="home.action" class="dh">首    页</a></li>

				<li id="menu_line" onmouseover="xian1()" onmouseout="yin1()"><a href="showProjectsManage.action?currentPage=1"  class="dh">项目管理</a>


    			</li>


				<li id="menu_line" onmouseover="xian2()" onmouseout="yin2()"><a href="showUserManageRoleChoose.action"  class="dh">用户管理</a>


				</li>

			
				
 	 			</ul>
 			
		</div>
		
		
		</div>
  </body>
</html>
