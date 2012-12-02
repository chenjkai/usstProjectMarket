package com.usstprojectmarket.action;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import net.sf.json.JSONObject;

import com.opensymphony.xwork2.ActionContext;
import com.usstprojectmarket.service.ProjectChangeService;
import com.usstprojectmarket.service.ProjectService;
import com.usstprojectmarket.util.ProjectStatus;
import com.usstprojectmarket.vo.Project;
import com.usstprojectmarket.vo.ProjectChanging;
import com.usstprojectmarket.vo.User;

public class VoteAction {
	
	private ProjectChangeService projectChangeService;
	private ProjectService projectService;
	
	private int projectId;
	private int projectChangeId;
	
	public int getProjectChangeId() {
		return projectChangeId;
	}

	public void setProjectChangeId(int projectChangeId) {
		this.projectChangeId = projectChangeId;
	}

	public ProjectService getProjectService() {
		return projectService;
	}

	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public ProjectChangeService getProjectChangeService() {
		return projectChangeService;
	}

	public void setProjectChangeService(ProjectChangeService projectChangeService) {
		this.projectChangeService = projectChangeService;
	}
	
	public void vote(){
		
		JSONObject json = new JSONObject();
		HttpServletResponse response = ServletActionContext.getResponse();
		ActionContext ac=ActionContext.getContext();
		Map<String, Object> session=ac.getSession();
		String result = null;
		
		if(session.containsKey("role")&&session.containsKey("user")){
			User user = (User) session.get("user");
			
			int role =(Integer)session.get("role");
			Project project = projectService.getProjectById(projectId);

			if(project==null){
				result = "empty";
			}
			else if(project.getStatus()!=ProjectStatus.WAIT_VOTE){
				result = "aftervote";
			}
			else{
				int projectToobject = project.getToobject();
				
				if(role==projectToobject){
					ProjectChanging projectChange = new ProjectChanging();
					projectChange.setIsstudent(projectToobject);
					projectChange.setProject(projectService.getProjectById(projectId));
					projectChange.setUserId(user.getId());
					projectChange.setIschosen(0);
					projectChange.setVotetime(new Timestamp(System.currentTimeMillis()));
					projectChangeService.saveProjectChange(projectChange);
					int projectChangeId = projectChangeService.getProjectChangeByUserIdAndProjectId(user.getId(), projectId,role).getId();
					result = ""+projectChangeId;
				}else{
					result="role";
				}
				
			}
			
			
		}else{
			result = "login";
		}
		json.put("result",result);
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
			e.printStackTrace();
		
		}				
	}
	
	
	public void unVote(){
		ActionContext ac=ActionContext.getContext();
		Map<String, Object> session=ac.getSession();
		
		String result = null;
		JSONObject json = new JSONObject();
		HttpServletResponse response = ServletActionContext.getResponse();

		User user = (User) session.get("user");
		int role = (Integer)session.get("role");
		ProjectChanging projectChanging = projectChangeService.getProjectChangeByUserIdAndProjectId(user.getId(), projectId,role);
		Project project = projectService.getProjectById(projectId);
		if(project==null){
			result = "empty";
		}else{
			if(project.getStatus()!=ProjectStatus.WAIT_VOTE){
				result = "lock";
			}else if(projectChanging==null){
				result = "novoted";
			}else{
				projectChangeService.deleteProjectChange(projectChanging);
				result = "ok";
			}
		}
		
		json.put("result", result);
		response.setCharacterEncoding("utf-8");
		
		try {
			response.getWriter().write(json.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
