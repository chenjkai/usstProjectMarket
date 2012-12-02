package com.usstprojectmarket.daoImpl;

import java.util.List;

import org.hibernate.Session;

import com.usstprojectmarket.dao.TeacherDao;
import com.usstprojectmarket.vo.Professor;

public class TeacherDaoImpl extends BaseOperation<Professor> implements TeacherDao {

	public Professor getTeacherById(int teacherId) {
		return getVoEntityById(Professor.class,teacherId);
	}

	@SuppressWarnings("unchecked")
	public List<Professor> getTeacherList() {
		Session session=getSession();
		String hql="From Professor";
		List<Professor> list;
		try{
			list=session.createQuery(hql).list(); 
		}finally{
			session.close();
		}
		return list;
	}

	public void saveTeacher(Professor teacher) {
		saveVoEntity(teacher);
	}

	public void updateTeacher(Professor teacher) {
		updateVoEntity(teacher);
	}

	public Object validateTeacherUser(String name, String pwd) {
		return validateUserWithUserNameAndUserPwd("Professor",name,pwd);
	}

	public void deleteTeacher(Professor teacher) {
		deleteVoEntity(teacher);
	}

	public int validateRename(String userName) {
		return validateRenameByTablenameAndUserName("Professor",userName);
	}

	public List<Professor> getProfessors() {
		return getEntitys("Professor");
	}
	
	public Long getSize() {
		return super.getSize("Professor");
	}
}
