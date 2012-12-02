package com.usstprojectmarket.action;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.usstprojectmarket.dto.ProjectDto;
import com.usstprojectmarket.service.MenuListService;
import com.usstprojectmarket.service.ProjectChangeService;
import com.usstprojectmarket.service.ProjectService;
import com.usstprojectmarket.util.GlobalConstants;
import com.usstprojectmarket.util.Pagination;
import com.usstprojectmarket.util.ProjectStatus;
import com.usstprojectmarket.vo.Company;
import com.usstprojectmarket.vo.Project;
import com.usstprojectmarket.vo.ProjectChanging;
import com.usstprojectmarket.vo.Secondlist;
import com.usstprojectmarket.vo.User;

public class ProjectAction {
	
	private ProjectService projectService;
	private MenuListService menuListService;
	private ProjectChangeService projectChangeService;
	
	private String projectTitle;
	private int projectType;
	private String projectPhone;
	private int projectObject;
	private int firstList;
	private int secondList;
	private String editor;
	
	
	public ProjectChangeService getProjectChangeService() {
		return projectChangeService;
	}
	public void setProjectChangeService(ProjectChangeService projectChangeService) {
		this.projectChangeService = projectChangeService;
	}
	public MenuListService getMenuListService() {
		return menuListService;
	}
	public void setMenuListService(MenuListService menuListService) {
		this.menuListService = menuListService;
	}
	public String getProjectTitle() {
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}
	public int getProjectType() {
		return projectType;
	}
	public void setProjectType(int projectType) {
		this.projectType = projectType;
	}
	public String getProjectPhone() {
		return projectPhone;
	}
	public void setProjectPhone(String projectPhone) {
		this.projectPhone = projectPhone;
	}
	public int getProjectObject() {
		return projectObject;
	}
	public void setProjectObject(int projectObject) {
		this.projectObject = projectObject;
	}
	public int getFirstList() {
		return firstList;
	}
	public void setFirstList(int firstList) {
		this.firstList = firstList;
	}
	public int getSecondList() {
		return secondList;
	}
	public void setSecondList(int secondList) {
		this.secondList = secondList;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}


	
	public ProjectService getProjectService() {
		return projectService;
	}
	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}
	
	private boolean validate(){
		ActionContext ac=ActionContext.getContext();
		Map<String, Object> session=ac.getSession();
		if(projectTitle==null||projectTitle.trim().length()<=0||projectTitle.trim().length()>100){
			return false;
		}
		
		if(session.get("user")==null){
			return false;
		}
		
		if(projectPhone==null||projectPhone.trim().length()<=0||projectPhone.trim().length()>20){
			return false;
		}
		
		if(projectType==0){
			return false;
		}
		
		if(projectObject==0){
			return false;
		}
		
		if(editor==null){
			return false;
		}
		
		if(secondList==0){
			return false;
		}
		Project project = new Project();
		project.setTitle(projectTitle);
		project.setClassId(projectType);
		project.setToobject(projectObject);
		project.setTel(projectPhone);
		project.setPubtime(new Timestamp(System.currentTimeMillis()));
		project.setCompany((Company)session.get("user"));
		project.setSecondlist(menuListService.getSecondListById(secondList));
		project.setDescription(editor);
		project.setUndertakerId(0);
		project.setStatus(ProjectStatus.WAIT_CHECK);
		projectService.saveProject(project);
		return true;
	}
	
	
	 /*
	  * 保存项目
	  */
	public String saveProject(){
		if(validate()){
			
			return "success";
		}
		
		return "fail";
	}
	
	
	private int secondlist;
	private int currentPage;
	public int getSecondlist() {
		return secondlist;
	}
	public void setSecondlist(int secondlist) {
		this.secondlist = secondlist;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	/*
	 * 通过二级菜单得到项目列表
	 */
	public String getProjectsBySecondListId(){
		HttpServletRequest request = ServletActionContext.getRequest();
		Pagination page=new Pagination(currentPage,projectService.getTotalSizeBySecondlist(secondlist));
		page.setPagesize(GlobalConstants.PROJECTS_ITEMS_PAGE);
		List<Project> projects = projectService.getProjectsPagination(secondlist, currentPage, page.getPagesize());
		Iterator<Project> it = projects.iterator();
		List<ProjectDto> lists = new ArrayList<ProjectDto>();
		Secondlist menu = menuListService.getSecondListById(secondlist);
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
		request.setAttribute("secondlist",secondlist);
		request.setAttribute("menu",menu);
		request.setAttribute("totalpage",page.getTotalpage());
		request.setAttribute("page", page);
		return "show";
	}
	
	
	private int projectId;
	
	public int getProjectId() {
		return projectId;
	}
	
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	
	/*
	 * 通过项目id得到项目
	 */
	public String getProjectByProjectId(){
		ActionContext ac=ActionContext.getContext();
		Map<String, Object> session=ac.getSession();
		HttpServletRequest request = ServletActionContext.getRequest();
		
		Project project = projectService.getProjectById(projectId);
		ProjectChanging projectChanging = null;
		if(session.containsKey("user")&&session.containsKey("role")){
			User user = (User)session.get("user");
			int role = (Integer) session.get("role");
			projectChanging = projectChangeService
			.getProjectChangeByUserIdAndProjectId(user.getId(), projectId,role);
			
		}
		
		boolean flag = true;
		
		if(projectChanging==null){
			flag = false;
		}
		
		request.setAttribute("flag", flag);
		request.setAttribute("project",project);
		return "show";
	}
	
	public String showAttachments(){
		
		return "show";
	}
	
	/**
	 * 显示已发布的工程
	 * @return
	 */
	public String showPublished(){
		ActionContext ac=ActionContext.getContext();
		Map<String, Object> session=ac.getSession();
		
		User user = null;
		if(session.containsKey("user")){
			 user = (User)session.get("user");
		}
		else{
			return null;
		}
		
		HttpServletRequest request = ServletActionContext.getRequest();
		Pagination page=new Pagination(currentPage,projectService.getTotalSizeByUserId(user.getId()));
		page.setPagesize(GlobalConstants.PROJECTS_ITEMS_PAGE);
		List<Project> projects = projectService.getProjectsPaginationByUserId(user.getId(), currentPage, page.getPagesize());
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
		request.setAttribute("secondlist",secondlist);
		request.setAttribute("totalpage",page.getTotalpage());
		request.setAttribute("page", page);
		
		return "show";
	}
}
