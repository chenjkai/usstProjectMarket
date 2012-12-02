package com.usstprojectmarket.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.usstprojectmarket.dao.ProjectDao;
import com.usstprojectmarket.util.ProjectStatus;
import com.usstprojectmarket.vo.Project;

public class ProjectDaoImpl extends BaseOperation<Project> implements ProjectDao {

	public void deleteProject(Project project) {
		deleteVoEntity(project);
	}

	public Project getProjectById(int projectId) {
		
		return (Project)getVoEntityById(Project.class,projectId);
	}

	@SuppressWarnings("unchecked")
	public List<Project> getProjectList(int currentPage, int pageSize) {
		Session session=getSession();
		String hql="From Project pr order by pr.id desc";
		List<Project> list;
		try{
			Query query=session.createQuery(hql);
			query.setFirstResult((currentPage-1)*pageSize);
			query.setMaxResults(pageSize);
			list=query.list();
			
		}finally{
			session.close();
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	public List<Project> getProjectsBySecondlistId(int secondListId) {
		Session session=getSession();
		String hql="From Project pr where pr.secondlist.id="+secondListId;
		List<Project> list;
		try{
			list=session.createQuery(hql).list();
		}finally{
			session.close();
		}
		return list;
	}

	public void saveProject(Project project) {
		saveVoEntity(project);
	}

	public void updateProject(Project project) {
		updateVoEntity(project);
	}

	@SuppressWarnings("unchecked")
	public List<Project> getProjectsPagination(int secondListId,
			int currentPage, int pageSize) {
		
		Session session=getSession();
		String hql="From Project pr where pr.secondlist.id="+secondListId+" and pr.status>"+ProjectStatus.WAIT_CHECK+" order by pr.id desc";
		List<Project> list;
		try{
			Query query=session.createQuery(hql);
			query.setFirstResult((currentPage-1)*pageSize);
			query.setMaxResults(pageSize);
			list=query.list();
		}finally{
			session.close();
		}
		return list;
	}

	public int getTotalSizeBySecondlist(int secondlist) {
		Session session=getSession();
		String hql="select count(*) from Project pr where pr.secondlist.id="+secondlist+" and pr.status>"+ProjectStatus.WAIT_CHECK;
		Long count = (Long)session.createQuery(hql).uniqueResult();
		session.close();
		return Integer.parseInt(count.toString());
	}
	
	public int getTotalSize() {
		Session session=getSession();
		String hql="select count(*) from Project";
		Long count = (Long)session.createQuery(hql).uniqueResult();
		session.close();
		return Integer.parseInt(count.toString());
	}

	@SuppressWarnings("unchecked")
	public List<Project> getProjectsPaginationByUserId(int userId,
			int currentPage, int pageSize) {	
		Session session=getSession();
		String hql="From Project pr where pr.company.id="+userId+" and pr.status>0"+" order by pr.id desc";
		List<Project> list;
		try{
			Query query=session.createQuery(hql);
			query.setFirstResult((currentPage-1)*pageSize);
			query.setMaxResults(pageSize);
			list=query.list();
		}finally{
			session.close();
		}
		return list;
	}

	public int getTotalSizeByUserId(int userId) {
		Session session=getSession();
		String hql="select count(*) from Project pr where pr.company.id="+userId;
		Long count = (Long)session.createQuery(hql).uniqueResult();
		session.close();
		return Integer.parseInt(count.toString());
	}

	@SuppressWarnings("unchecked")
	public List<Project> getTopProjects(int num) {
		Session session=getSession();
		String hql = "From Project pr where pr.status>"+ProjectStatus.WAIT_CHECK+" order by pr.id desc";
		List<Project> list;
		try{
			Query query=session.createQuery(hql);
			query.setFirstResult(0);
			query.setMaxResults(num);
			list=query.list();
		}finally{
			session.close();
		}
		return list;
	}

	public Long getCompleteSize() {
		Session session=getSession();
		String hql = "select count(*) from Project pr where pr.status="+ProjectStatus.PROJECT_END;
		Long count = (Long)session.createQuery(hql).uniqueResult();
		session.close();
		return count;
	}

	public Long getUnCompleSize() {
		Session session=getSession();
		String hql = "select count(*) from Project pr where pr.status>"+ProjectStatus.WAIT_CHECK;
		Long count = (Long)session.createQuery(hql).uniqueResult();
		session.close();
		return count;
	}

	@SuppressWarnings("unchecked")
	public List<Project> getCompletedProjects(int num) {
		Session session=getSession();
		String hql = "From Project pr where pr.status="+ProjectStatus.PROJECT_END;
		List<Project> list;
		try{
			Query query=session.createQuery(hql);
			query.setFirstResult(0);
			query.setMaxResults(num);
			list=query.list();
		}finally{
			session.close();
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	public List<Project> getCompletedProjects(int currentPage, int pageSize) {
		Session session=getSession();
		String hql = "From Project pr where pr.status="+ProjectStatus.PROJECT_END;
		List<Project> list;
		try{
			Query query=session.createQuery(hql);
			query.setFirstResult((currentPage-1)*pageSize);
			query.setMaxResults(pageSize);
			list=query.list();
		}finally{
			session.close();
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	public List<Project> getTopProjects(int currentPage, int pageSize) {
		Session session=getSession();
		String hql = "From Project pr where pr.status>"+ProjectStatus.WAIT_CHECK;
		List<Project> list;
		try{
			Query query=session.createQuery(hql);
			query.setFirstResult((currentPage-1)*pageSize);
			query.setMaxResults(pageSize);
			list=query.list();
		}finally{
			session.close();
		}
		return list;
	}



	
}
