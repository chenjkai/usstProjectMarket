package com.usstprojectmarket.action;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.usstprojectmarket.dto.Attach;
import com.usstprojectmarket.dto.Attachment;
import com.usstprojectmarket.dto.ProjectDto;
import com.usstprojectmarket.dto.VotedUserDto;
import com.usstprojectmarket.service.ProjectChangeService;
import com.usstprojectmarket.service.ProjectService;
import com.usstprojectmarket.service.UserService;
import com.usstprojectmarket.util.GlobalConstants;
import com.usstprojectmarket.util.Pagination;
import com.usstprojectmarket.util.ProjectStatus;
import com.usstprojectmarket.util.Roles;
import com.usstprojectmarket.vo.Project;
import com.usstprojectmarket.vo.ProjectChanging;
import com.usstprojectmarket.vo.User;

public class ProjectManageAction {
	
	private ProjectService projectService;
	private ProjectChangeService projectChangeService;
	private UserService userService;
	
	private int currentPage;
	
	private int projectId;
	private int status;
	private int userId;
	private int userRole;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserRole() {
		return userRole;
	}
	public void setUserRole(int userRole) {
		this.userRole = userRole;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
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
	public ProjectChangeService getProjectChangeService() {
		return projectChangeService;
	}
	public void setProjectChangeService(ProjectChangeService projectChangeService) {
		this.projectChangeService = projectChangeService;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	public String getProjects(){
		HttpServletRequest request = ServletActionContext.getRequest();
		Pagination page=new Pagination(currentPage,projectService.getTotalSize());
		List<Project> projects = projectService.getProjectList(currentPage, page.getPagesize());
		Iterator<Project> it = projects.iterator();
		List<ProjectDto> lists = new ArrayList<ProjectDto>();
		
		while(it.hasNext()){
			Project project = it.next();
			ProjectDto projectDto = new ProjectDto();
			projectDto.setId(project.getId());
			projectDto.setClassId(project.getClassId());
			List<ProjectChanging> projectChangingList = projectChangeService
				.getProjectChangeByProjectId(project.getId());
			int voteCount = 0;
			if(projectChangingList!=null){
				voteCount =  projectChangingList.size();
			}
			projectDto.setVoteCount(voteCount);
			
			projectDto.setPublishTime(new SimpleDateFormat("yyyy-MM-dd").format(project.getPubtime()));
			String companyName = project.getCompany().getCompanyName();
			if(companyName.length()>9){
				companyName = companyName.substring(0,9)+"...";
			}
			projectDto.setPublisher(companyName);
			projectDto.setStatus(project.getStatus());
			String title = project.getTitle();
			if(title.length()>9){
				title = title.substring(0,9)+"...";
			}
			projectDto.setTitle(title);
			projectDto.setToRole(project.getToobject());
			lists.add(projectDto);
		}
		if(lists.size()==0){
			page.setCurrentpage(1);
			page.setTotalsize(1);
		}
		request.setAttribute("projects", lists);
		request.setAttribute("totalpage",page.getTotalpage());
		request.setAttribute("page", page);
		return "show";
	}
	
	public void changeStatus(){
		HttpServletRequest request = ServletActionContext.getRequest();
		Boolean related = (Boolean)request.getAttribute("related");
		if(related){
			Project project = projectService.getProjectById(projectId);
			project.setStatus(status);
			projectService.updateProject(project);
		}
		
	}
	
	public void deleteProject(){
		ActionContext ac=ActionContext.getContext();
		Map<String, Object> session=ac.getSession();
		if(session.containsKey("role")&&session.containsKey("user")){
			User user = (User)session.get("user");
			int role = (Integer)session.get("role");
			Project project = projectService.getProjectById(projectId);
			if(role == Roles.ADMIN||(role == Roles.COMPANY&&user.getId()==project.getCompany().getId()))
				projectService.deleteProject(project);
			
		}
	}
	
	public String showVoted(){
		HttpServletRequest request = ServletActionContext.getRequest();
		Pagination page=new Pagination(currentPage,projectChangeService.getTotalsize(projectId));
		page.setPagesize(GlobalConstants.PROJECTS_ITEMS_PAGE);
		List<ProjectChanging> list = projectChangeService.getProjectChangePaginationByProjectId(projectId, currentPage, page.getPagesize());
		Iterator<ProjectChanging> it = list.iterator();
		VotedUserDto votedUserDto = new VotedUserDto();
		Project project = projectService.getProjectById(projectId);
		
		int role=0;
		while(it.hasNext()){
			ProjectChanging projectChanging = it.next();
			role = projectChanging.getIsstudent();
			int userId = projectChanging.getUserId();
			if(role==Roles.SCHOOL){
				votedUserDto.getSchools().add(userService.getSchoolById(userId));
			}else if(role == Roles.COLLEGE){
				votedUserDto.getColleges().add(userService.getCollegeByID(userId));
			}else if(role == Roles.COMPANY){
				votedUserDto.getCompanys().add(userService.getCompanyById(userId));
			}else if(role == Roles.TEACHER){
				votedUserDto.getProfessor().add(userService.getTeacherById(userId));		
			}else if(role == Roles.STUDENT){
				votedUserDto.getStudents().add(userService.getStudentById(userId));
			}
			
		}
		
		if(votedUserDto.getSize()==0){
			page.setCurrentpage(1);
			page.setTotalsize(1);
		}
		request.setAttribute("undertaker",project.getUndertakerId());
		request.setAttribute("projectId",projectId);
		request.setAttribute("totalpage",page.getTotalpage());
		request.setAttribute("page", page);
		request.setAttribute("userRole",role);
		request.setAttribute("list", votedUserDto);
		return "show";
	}
	
	/**
	 * 选中
	 */
	public void choose(){
		JSONObject json = new JSONObject();
		HttpServletResponse response = ServletActionContext.getResponse();
		String result = null;
		ProjectChanging projectChanging = projectChangeService.getProjectChangeByUserIdAndProjectId(userId, projectId, userRole);
		if(projectChanging!=null){
			Project project = projectService.getProjectById(projectChanging.getProject().getId());
			if(project.getStatus()==ProjectStatus.WAIT_VOTE){
				projectChanging.setIschosen(1);
				projectChangeService.updateProjectChange(projectChanging);
				project.setStatus(ProjectStatus.VOTE_OVER);
				project.setUndertakerId(projectChanging.getUserId());
				projectService.updateProject(project);
				result = "success";
			}else{
				result = "failure";
			}
			
		}else{
			result = "notVoted";
		}
		
		json.put("result", result);
		response.setCharacterEncoding("utf-8");
		try {
			response.getWriter().write(json.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 取消
	 */
	public void unChoose(){
		JSONObject json = new JSONObject();
		HttpServletResponse response = ServletActionContext.getResponse();
		String result = null;
		ProjectChanging projectChanging = projectChangeService.getProjectChangeByUserIdAndProjectId(userId, projectId, userRole);
		if(projectChanging!=null){
			Project project = projectService.getProjectById(projectChanging.getProject().getId());
			if(project.getStatus()==ProjectStatus.VOTE_OVER){
				projectChanging.setIschosen(0);
				projectChangeService.updateProjectChange(projectChanging);
				project.setUndertakerId(0);
				project.setStatus(ProjectStatus.WAIT_VOTE);
				projectService.updateProject(project);
				result = "success";
			}else{
				result = "failure";
			}
			
		}else{
			result = "notVoted";
		}
		json.put("result", result);
		response.setCharacterEncoding("utf-8");
		try {
			response.getWriter().write(json.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	public String showAttachment(){
		
		Project project = projectService.getProjectById(projectId);
		Attachment attachment = new Attachment();
		
		String companybeian = project.getCompanybeian();
		String companynote = project.getCompanynote();
		String companysummary = project.getCompanysummary();
		String undertakebeian = project.getUndertakebeian();
		String undertakenote = project.getUndertakeplan();
		String undertakeplan = project.getUndertakeplan();
		
		if(companybeian!=null){
			
			String[] companybeianArray = companybeian.split(",");
		
			for(String str:companybeianArray){
				Attach attach = new Attach();
				String name = str.substring(str.lastIndexOf("\\")+1);
				attach.setName(name);
				attach.setPath(str);
				attachment.getCompanybeian().add(attach);
			}
		}
		
		if(companynote!=null){
			String[] companynoteArray = companynote.split(",");
			
			for(String str:companynoteArray){
				Attach attach = new Attach();
				String name = str.substring(str.lastIndexOf("\\")+1);
				attach.setName(name);
				attach.setPath(str);
				attachment.getCompanynote().add(attach);
			}
		}
		
		if(companysummary!=null){
			String[] companysummaryArray = companysummary.split(",");
			
			for(String str:companysummaryArray){
				Attach attach = new Attach();
				String name = str.substring(str.lastIndexOf("\\")+1);
				attach.setName(name);
				attach.setPath(str);
				attachment.getCompanysummary().add(attach);
			}
		}
			
		if(undertakebeian!=null){
			String[] undertakebeianArray = undertakebeian.split(",");
			
			for(String str:undertakebeianArray){
				Attach attach = new Attach();
				String name = str.substring(str.lastIndexOf("\\")+1);
				attach.setName(name);
				attach.setPath(str);
				attachment.getUndertakebeian().add(attach);
			}
		}

		if(undertakenote!=null){
			String[] undertakenoteArray = undertakenote.split(",");
			
			for(String str:undertakenoteArray){
				Attach attach = new Attach();
				String name = str.substring(str.lastIndexOf("\\")+1);
				attach.setName(name);
				attach.setPath(str);
				attachment.getUndertakenote().add(attach);
			}
		}
		
		if(undertakeplan!=null){
			String[] undertakeplanArray = undertakeplan.split(",");
			
			for(String str:undertakeplanArray){
				Attach attach = new Attach();
				String name = str.substring(str.lastIndexOf("\\")+1);
				attach.setName(name);
				attach.setPath(str);
				attachment.getUndertakeplan().add(attach);
			}
		}
		
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("projectId", projectId);
		request.setAttribute("project", project);
		request.setAttribute("attach",attachment);
		return "show";
	}
	
	
	public String showUserManageRoleChoose(){
		return "show";
	}
}
