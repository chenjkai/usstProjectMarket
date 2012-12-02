package com.usstprojectmarket.serviceImpl;

import java.util.List;

import com.usstprojectmarket.dao.ProjectDao;
import com.usstprojectmarket.service.ProjectService;
import com.usstprojectmarket.vo.Project;

public class ProjectServiceImpl  implements ProjectService {
	private ProjectDao projectDao;
	
	public ProjectDao getProjectDao() {
		return projectDao;
	}

	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}

	public void deleteProject(Project project) {
		projectDao.deleteProject(project);
		
	}

	public Project getProjectById(int projectId) {
		
		return projectDao.getProjectById(projectId);
	}

	public List<Project> getProjectsBySecondlistId(int secondListId) {
		
		return projectDao.getProjectsBySecondlistId(secondListId);
	}

	public void saveProject(Project project) {
		
		projectDao.saveProject(project);
	}

	public void updateProject(Project project) {
	
		projectDao.updateProject(project);
		
	}

	public List<Project> getProjectsPagination(int secondListId,
			int currentPage, int pageSize) {
		return projectDao.getProjectsPagination(secondListId, currentPage, pageSize);
	}

	public int getTotalSizeBySecondlist(int secondlist) {
		return projectDao.getTotalSizeBySecondlist(secondlist);
	}

	public List<Project> getProjectList(int currentPage, int pageSize) {
		return projectDao.getProjectList(currentPage, pageSize);
	}

	public int getTotalSize() {
		return projectDao.getTotalSize();
	}

	public List<Project> getProjectsPaginationByUserId(int userId,
			int currentPage, int pageSize) {
		return projectDao.getProjectsPaginationByUserId(userId, currentPage, pageSize);
	}

	public int getTotalSizeByUserId(int userId) {
		return projectDao.getTotalSizeByUserId(userId);
	}

	public List<Project> getTopProjects(int num) {
		return projectDao.getTopProjects(num);
	}

	public Long getCompleteSize() {
		return projectDao.getCompleteSize();
	}

	public Long getUnCompleSize() {
		return projectDao.getUnCompleSize();
	}

	public List<Project> getCompletedProjects(int num) {
		
		return projectDao.getCompletedProjects(num);
	}

	public List<Project> getCompletedProjects(int currentPage, int pageSize) {
		return projectDao.getCompletedProjects(currentPage, pageSize);
	}

	public List<Project> getTopProjects(int currentPage, int pageSize) {
		return projectDao.getTopProjects(currentPage, pageSize);
	}

}
