package com.usstprojectmarket.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.usstprojectmarket.dto.ProjectDto;
import com.usstprojectmarket.service.ProjectService;
import com.usstprojectmarket.service.UserService;
import com.usstprojectmarket.util.GlobalConstants;
import com.usstprojectmarket.util.Roles;
import com.usstprojectmarket.vo.Project;

public class HomeAction {
	private ProjectService projectService;
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public ProjectService getProjectService() {
		return projectService;
	}

	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}

	public String home(){
		HttpServletRequest request = ServletActionContext.getRequest();
		ActionContext ac=ActionContext.getContext();
		Map<String, Object> session=ac.getSession();
		
		List<Project> newprojectList = projectService.getTopProjects(GlobalConstants.TOP_NUM);
		List<ProjectDto> newprojects = new ArrayList<ProjectDto>();
		
		for(Project pr:newprojectList){
			ProjectDto project = new ProjectDto();
			project.setId(pr.getId());
			project.setPublishTime(new SimpleDateFormat("yyyy-MM-dd").format(pr.getPubtime()));
			String title = pr.getTitle();
			if(title.length()>20){
				title = title.substring(0,19)+"...";
			}
			project.setTitle(title);
			newprojects.add(project);
		}
			
		
		
		List<Project> completedprojectList = projectService.getCompletedProjects(GlobalConstants.TOP_NUM);
		List<ProjectDto> completedprojects = new ArrayList<ProjectDto>();
		
		for(Project pr:completedprojectList){
			ProjectDto project = new ProjectDto();
			project.setId(pr.getId());
			project.setPublishTime(new SimpleDateFormat("yyyy-MM-dd").format(pr.getPubtime()));
			String title = pr.getTitle();
			if(title.length()>20){
				title = title.substring(0,19)+"...";
			}
			project.setTitle(title);
			completedprojects.add(project);
		}
			session.put("totalsize",userService.getTotalSize());
			session.put("companySize",userService.getSize(Roles.COMPANY));
			session.put("teachersize",userService.getSize(Roles.TEACHER));
			session.put("uncompletedproject", projectService.getUnCompleSize());
			session.put("completedproject", projectService.getCompleteSize());		
			request.setAttribute("newprojects",newprojects);
			request.setAttribute("completedprojects",completedprojects);
		
		return "home";
	}
}
