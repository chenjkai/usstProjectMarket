package com.usstprojectmarket.filter;

import java.util.Map;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginCheckInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 1855537264630572372L;

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		Map<String,Object> session = arg0.getInvocationContext().getSession();
		if(session.containsKey("user")&&session.containsKey("role")){
			return arg0.invoke();
		}	
		return "login";
	}

}
