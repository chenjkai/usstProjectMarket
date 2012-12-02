package com.usstprojectmarket.daoImpl;

import java.util.List;

import org.hibernate.Session;

import com.usstprojectmarket.dao.CollegeDao;
import com.usstprojectmarket.vo.College;

public class CollegeDaoImpl extends BaseOperation<College> implements CollegeDao {
	
	public void saveCollege(College college) {
		saveVoEntity(college);
	}

	public void updateCollege(College college) {
		updateVoEntity(college);
	}

	public College getCollegeByID(int collegeId) {
		return getVoEntityById(College.class,collegeId);
	}

	@SuppressWarnings("unchecked")
	public List<College> getCollegeList() {
		Session session=getSession();
		String hql="From College";
		List<College> list;
		try{
			list=session.createQuery(hql).list(); 
		}finally{
			session.close();
		}
		return list;
	}

	public Object validateCollegeUser(String name, String pwd) {
		return validateUserWithUserNameAndUserPwd("College",name,pwd);
	}

	public void deleteCollege(College college) {
		
		deleteVoEntity(college);
	}

	public int validateRename(String userName) {
		return validateRenameByTablenameAndUserName("College",userName);
	}

	@SuppressWarnings("unchecked")
	public List<College> getCollegeListBySchoolId(int schoolId) {
		Session session=getSession();
		String hql="From College cc where cc.school.id="+schoolId;
		List<College> list;
		try{
			list=session.createQuery(hql).list(); 
		}finally{
			session.close();
		}
		return list;
	}

	public List<College> getColleges() {
		return getEntitys("College");
	}

	public Long getSize() {
		return super.getSize("College");
	}

}
