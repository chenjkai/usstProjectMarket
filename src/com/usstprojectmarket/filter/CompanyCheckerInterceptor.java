package com.usstprojectmarket.filter;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
/**
 * check if the user has login,and the user is Company
 * @author steven
 *
 */
public class CompanyCheckerInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 2969110128806559909L;
	
	public String intercept(ActionInvocation arg0) throws Exception {
		Map<String,Object> session = arg0.getInvocationContext().getSession();
		int role = 0;
		if(session.containsKey("role")){
			role =  (Integer)session.get("role");
		}
		
		if(session.containsKey("user")&&role==3){
			return arg0.invoke();		
		}
		
		return "home";
	}

}
