package com.usstprojectmarket.filter;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;


import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.usstprojectmarket.service.ProjectService;
import com.usstprojectmarket.vo.Project;
import com.usstprojectmarket.vo.User;
/**
 * 
 * @author steven
 *
 */
public class ProjectRelationCheckerInterceptor extends AbstractInterceptor {
	 
	private static final long serialVersionUID = 1L;
	private ProjectService projectService;
	
	public ProjectService getProjectService() {
		return projectService;
	}

	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}

	public String intercept(ActionInvocation arg0) throws Exception {
		
		Map<String,Object> session = arg0.getInvocationContext().getSession();
		HttpServletRequest request = ServletActionContext.getRequest();
		boolean isRelatedWithTheProject = false;
		if(session.containsKey("user")&&session.containsKey("role")){
			User user = (User)session.get("user");
			int projectId = (Integer)request.getAttribute("projectId");
			Project project = projectService.getProjectById(projectId);
			int role = (Integer)session.get("role");
			
			if(((user.getId().equals(project.getCompany().getId()))&&(role==3))||((user.getId().equals(project.getUndertakerId()))&&(role==project.getToobject()))){
				isRelatedWithTheProject = true;
			}
			
		}
		request.setAttribute("related",isRelatedWithTheProject);
		return arg0.invoke();		
		
	}

}
