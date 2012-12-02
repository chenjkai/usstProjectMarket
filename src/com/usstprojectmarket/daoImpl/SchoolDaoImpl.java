package com.usstprojectmarket.daoImpl;

import java.util.List;

import org.hibernate.Session;

import com.usstprojectmarket.dao.SchoolDao;
import com.usstprojectmarket.vo.School;

public class SchoolDaoImpl extends BaseOperation<School> implements SchoolDao {
	

	@SuppressWarnings("unchecked")
	public List<School> getSchoolList() {
		Session session=getSession();
		String hql="From School";
		List<School> list;
		try{
			list=session.createQuery(hql).list(); 
		}finally{
			session.close();
		}
		return list;
	}

	public void saveSchool(School school) {
		super.saveVoEntity(school);
	}

	public void updateSchool(School school) {
		updateVoEntity(school);
	}

	public School getSchoolById(int schoolId) {
		return getVoEntityById(School.class,schoolId);
	}

	public Object validateSchoolUser(String name, String pwd) {
		
		return validateUserWithUserNameAndUserPwd("School",name,pwd);
	}

	public void deleteSchool(School school) {
		deleteVoEntity(school);
	}

	public int validateRename(String userName) {
		return validateRenameByTablenameAndUserName("School",userName);
	}

	public List<School> getSchools() {
		return getEntitys("School");
	}
	public Long getSize() {
		return super.getSize("School");
	}
}
