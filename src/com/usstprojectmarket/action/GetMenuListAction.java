package com.usstprojectmarket.action;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import net.sf.json.JSONObject;

import com.usstprojectmarket.service.MenuListService;
import com.usstprojectmarket.vo.Firstlist;
import com.usstprojectmarket.vo.Secondlist;

public class GetMenuListAction {
	
	private MenuListService menuListService;
	
	public MenuListService getMenuListService() {
		return menuListService;
	}
	public void setMenuListService(MenuListService menuListService) {
		this.menuListService = menuListService;
	}
	
	public void getFirstList(){
		List<Firstlist> firstList = menuListService.getFirstList();
		JSONObject json = new JSONObject();
		HttpServletResponse response = ServletActionContext.getResponse();
		String result = "项目类别：<select id=\"firstList\" name=\"firstList\"><option value=\"0\">-----</option>";
		if(firstList != null){
			Iterator<Firstlist> it = firstList.iterator();
			while(it.hasNext()){
				Firstlist item = it.next();
				result = result+"<option value=\""+item.getId()+"\">"+item.getName()+"</option>";
			}
			result = result + "</select>";
		}
		json.put("result",result);
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void getSecondListByFirstListId(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		
		String firstListId = request.getParameter("firstListId");
		
		String result = "<option value=\"0\">-----</option>";
		JSONObject json = new JSONObject();
		
		if(firstListId !=null ){
			List<Secondlist> secondList = menuListService.getSecondListByFirstListId(Integer.parseInt(firstListId));
			if(secondList != null){
				Iterator<Secondlist> it = secondList.iterator();
				while(it.hasNext()){
					Secondlist item = it.next();
					result = result+"<option value=\""+item.getId()+"\">"+item.getName()+"</option>";
				}
				json.put("result",result);
				response.setCharacterEncoding("utf-8");
				try {
					response.getWriter().write(json.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
