package com.usstprojectmarket.serviceImpl;

import java.util.List;

import com.usstprojectmarket.dao.ProjectChangeDao;
import com.usstprojectmarket.service.ProjectChangeService;
import com.usstprojectmarket.vo.ProjectChanging;

public class ProjectChangeServiceImpl implements ProjectChangeService {
	
	private ProjectChangeDao projectChangeDao;
	
	
	public ProjectChangeDao getProjectChangeDao() {
		return projectChangeDao;
	}

	public void setProjectChangeDao(ProjectChangeDao projectChangeDao) {
		this.projectChangeDao = projectChangeDao;
	}

	
	public void deleteProjectChange(ProjectChanging projectChange) {
		projectChangeDao.deleteProjectChange(projectChange);
	}

	public List<ProjectChanging> getProjectChangeByProjectId(int projectId) {
		return projectChangeDao.getProjectChangeByProjectId(projectId);
	}

	public List<ProjectChanging> getProjectChangeByUserId(int userId,
			int userRole) {
		return projectChangeDao.getProjectChangeByUserId(userId, userRole);
	}

	public void saveProjectChange(ProjectChanging projectChange) {
		projectChangeDao.saveProjectChange(projectChange);
	}

	public void updateProjectChange(ProjectChanging projectChange) {
		projectChangeDao.updateProjectChange(projectChange);
	}

	public ProjectChanging getProjectChangeByUserIdAndProjectId(int userId,
			int projectId,int userRole) {
		return projectChangeDao.getProjectChangeByUserIdAndProjectId(userId, projectId,userRole);
	}

	public ProjectChanging getProjectChangeByProjectChangeId(int projectChangeId) {
		return projectChangeDao.getProjectChangeByProjectChangeId(projectChangeId);
	}

	public List<ProjectChanging> getProjectChangePaginationByProjectId(
			int projectId, int currentPage, int pageSize) {
		return projectChangeDao.getProjectChangePaginationByProjectId(projectId, currentPage, pageSize);
	}

	public int getTotalsize(int projectId) {
		return projectChangeDao.getTotalsize(projectId);
	}

}
