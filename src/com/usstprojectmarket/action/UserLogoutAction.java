package com.usstprojectmarket.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class UserLogoutAction {
	public String logOut(){
		ActionContext ac=ActionContext.getContext();
		Map<String, Object> session=ac.getSession();
		if(session.containsKey("user")){
			session.remove("user");
		}
		if(session.containsKey("role")){
			session.remove("role");
		}
		if(session.containsKey("newMessCount")){
			session.remove("newMessCount");
		}
		return "success";
	}
}
