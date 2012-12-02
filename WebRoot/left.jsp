<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	
  </head>
  
  <body>
   
  		
  			<div id="left_top">
  				<div class="title">数据统计</div>
  				
  				<div class="content">
					<div class="tip"><span class="head">总用户数：&nbsp;&nbsp;</span><span class="count">${totalsize}</span></div>
					<div class="tip"><span class="head">企业用户数：&nbsp;&nbsp;</span><span class="count">${companySize}</span></div>
					<div class="tip"><span class="head">教师用户数：</span><span class="count">${teachersize}</span></div>
					<div class="tip"><span class="head">已发布项目数：</span><span class="count">${uncompletedproject}</span></div>
					<div class="tip"><span class="head">已完成项目数：</span><span class="count">${completedproject}</span></div>
  				</div>
  		
  			</div>
  			<div id="left_mid">
  				<div class="title">最新发布</div>
  				<div class="content">
  					<div class="tip">
  						
  					</div>
  				</div>
  			</div>
  			
  			<div id="left_bottom">
				
				

<div class="Calendar">

  <div id="idCalendarPre">&lt;&lt;</div>

  <div id="idCalendarNext">&gt;&gt;</div>

  <span id="idCalendarYear"></span>年 <span id="idCalendarMonth"></span>月

  <table cellspacing="0">

    <thead>

      <tr>

        <td>日</td>

        <td>一</td>

        <td>二</td>

        <td>三</td>

        <td>四</td>

        <td>五</td>

        <td>六</td>

      </tr>

    </thead>

    <tbody id="idCalendar">

    </tbody>

  </table>

</div>

				
  			</div>
  </body>
</html>
