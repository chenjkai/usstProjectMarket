package com.usstprojectmarket.dao;

import java.util.List;

import com.usstprojectmarket.vo.Project;

public interface ProjectDao {
	public void saveProject(Project project);
	public void updateProject(Project project);
	public void deleteProject(Project project);
	public List<Project> getProjectList(int currentPage, int pageSize);
	public Project getProjectById(int projectId);
	public List<Project> getProjectsBySecondlistId(int secondListId);
	public List<Project> getProjectsPagination(int secondListId,int currentPage,int pageSize);
	
	public int getTotalSizeBySecondlist(int secondlist);
	public int getTotalSize();
	
	public int getTotalSizeByUserId(int userId);
	public List<Project> getProjectsPaginationByUserId(int userId,int currentPage,int pageSize);
	
	public List<Project> getTopProjects(int num);
	public List<Project> getTopProjects(int currentPage, int pageSize);
	
	public List<Project> getCompletedProjects(int num);
	public List<Project> getCompletedProjects(int currentPage, int pageSize);
	
	public Long getUnCompleSize();
	public Long getCompleteSize();
}
