package com.usstprojectmarket.daoImpl;

import java.util.List;

import org.hibernate.Session;

import com.usstprojectmarket.vo.Student;

public class StudentDaoImpl extends BaseOperation<Student> implements
		com.usstprojectmarket.dao.StudentDao {

	public Student getStudentById(int studentId) {
		
		return getVoEntityById(Student.class,studentId);
	}

	@SuppressWarnings("unchecked")
	public List<Student> getStudentList() {
		Session session=getSession();
		String hql="From Student";
		List<Student> list;
		try{
			list=session.createQuery(hql).list(); 
		}finally{
			session.close();
		}
		return list;
	}

	public void saveStudent(Student student) {
		saveVoEntity(student);
		
	}

	public void updateStudent(Student student) {
		updateVoEntity(student);
		
	}

	public Object validateStudentUser(String name, String pwd) {
		return validateUserWithUserNameAndUserPwd("Student",name,pwd);
	}

	public void deleteStudent(Student student) {
		deleteVoEntity(student);
	}

	public int validateRename(String userName) {
		return validateRenameByTablenameAndUserName("Student",userName);
	}

	public List<Student> getStudents() {
		return getEntitys("Student");
	}

	public Long getSize() {
		return super.getSize("Student");
	}
	
}
