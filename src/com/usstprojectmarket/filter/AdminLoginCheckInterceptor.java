package com.usstprojectmarket.filter;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.usstprojectmarket.util.Roles;

public class AdminLoginCheckInterceptor extends AbstractInterceptor {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		Map<String,Object> session = arg0.getInvocationContext().getSession();
		if(session.containsKey("user")&&session.containsKey("role")){
			int role = (Integer)session.get("role");
			if(role == Roles.ADMIN)
				return arg0.invoke();
			else 
				return "home";
		}
		return "home";
	}

}
