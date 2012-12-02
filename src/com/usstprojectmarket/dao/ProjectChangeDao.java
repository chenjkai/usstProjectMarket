package com.usstprojectmarket.dao;

import java.util.List;

import com.usstprojectmarket.vo.ProjectChanging;

public interface ProjectChangeDao {
	public void saveProjectChange(ProjectChanging projectChange);
	public void deleteProjectChange(ProjectChanging projectChange);
	public void updateProjectChange(ProjectChanging projectChange);
	public List<ProjectChanging> getProjectChangeByProjectId(int projectId);
	public List<ProjectChanging> getProjectChangeByUserId(int userId,int userRole);
	public ProjectChanging getProjectChangeByUserIdAndProjectId(int userId,int projectId,int userRole);
	public ProjectChanging getProjectChangeByProjectChangeId(int projectChangeId);
	public List<ProjectChanging> getProjectChangePaginationByProjectId(int projectId,int currentPage,int pageSize);
	public int getTotalsize(int projectId);
}
