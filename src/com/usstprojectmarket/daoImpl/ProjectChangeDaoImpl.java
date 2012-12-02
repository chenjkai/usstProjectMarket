package com.usstprojectmarket.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.usstprojectmarket.vo.ProjectChanging;

public class ProjectChangeDaoImpl extends BaseOperation<ProjectChanging> implements
		com.usstprojectmarket.dao.ProjectChangeDao {

	public void deleteProjectChange(ProjectChanging projectChange) {
		deleteVoEntity(projectChange);
	}

	@SuppressWarnings("unchecked")
	public List<ProjectChanging> getProjectChangeByProjectId(int projectId) {
		
		Session session=getSession();
		String hql="From ProjectChanging pc where pc.project.id="+projectId;
		List<ProjectChanging> list;
		try{
			list=session.createQuery(hql).list(); 
		}finally{
			session.close();
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	public List<ProjectChanging> getProjectChangeByUserId(int userId,int userRole) {
		Session session=getSession();
		String hql="From ProjectChanging pc where pc.userId="+userId+" and pc.isstudent="+userRole;
		List<ProjectChanging> list;
		try{
			list=session.createQuery(hql).list(); 
		}finally{
			session.close();
		}
		return list;
	}

	public void saveProjectChange(ProjectChanging projectChange) {
		saveVoEntity(projectChange);
	}

	public void updateProjectChange(ProjectChanging projectChange) {
		updateVoEntity(projectChange);
	}

	@SuppressWarnings("unchecked")
	public ProjectChanging getProjectChangeByUserIdAndProjectId(int userId,
			int projectId,int userRole) {
		
		Session session=getSession();
		String hql="From ProjectChanging pc where pc.project.id="+projectId+" and "+"pc.userId="+userId+" and "+"pc.isstudent="+userRole;
		List<ProjectChanging> list;
		try{
			list=session.createQuery(hql).list(); 
		}finally{
			session.close();
		}
		if(list.size()==0)
			return null;
		return list.get(0);
	}

	@SuppressWarnings("unchecked")
	public ProjectChanging getProjectChangeByProjectChangeId(int projectChangeId) {
		Session session=getSession();
		String hql="From ProjectChanging pc where pc.id="+projectChangeId;
		List<ProjectChanging> list;
		try{
			list=session.createQuery(hql).list(); 
		}finally{
			session.close();
		}
		if(list.size()==0)
			return null;
		return list.get(0);
	}

	
	@SuppressWarnings("unchecked")
	public List<ProjectChanging> getProjectChangePaginationByProjectId(
			int projectId, int currentPage, int pageSize) {
		Session session=getSession();
		String hql="From ProjectChanging pr where pr.project.id="+projectId+"order by pr.id desc";
		List<ProjectChanging> list;
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

	public int getTotalsize(int projectId) {
		
		Session session=getSession();
		String hql="select count(*) from ProjectChanging pr where pr.project.id="+projectId;
		Long count = (Long)session.createQuery(hql.toString()).uniqueResult();
		session.close();
		return Integer.parseInt(count.toString());
	}

}
