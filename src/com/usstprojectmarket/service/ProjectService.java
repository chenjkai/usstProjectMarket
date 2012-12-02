package com.usstprojectmarket.service;

import java.util.List;

import com.usstprojectmarket.vo.Project;

public interface ProjectService {
	public void saveProject(Project project);
	public void updateProject(Project project);
	public void deleteProject(Project project);
	public List<Project> getProjectsBySecondlistId(int secondListId);
	public Project getProjectById(int projectId);
	public List<Project> getProjectsPagination(int secondListId,int currentPage,int pageSize);
	public int getTotalSizeBySecondlist(int secondlist);
	public List<Project> getProjectList(int currentPage, int pageSize);
	public int getTotalSize();
	public int getTotalSizeByUserId(int userId);
	public List<Project> getProjectsPaginationByUserId(int userId,int currentPage,int pageSize);
	public List<Project> getTopProjects(int num);
	public List<Project> getTopProjects(int currentPage, int pageSize);
	public Long getUnCompleSize();
	public Long getCompleteSize();	
	public List<Project> getCompletedProjects(int num);
	public List<Project> getCompletedProjects(int currentPage, int pageSize);
}
