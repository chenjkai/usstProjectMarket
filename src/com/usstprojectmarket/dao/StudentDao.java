package com.usstprojectmarket.dao;

import java.util.List;

import com.usstprojectmarket.vo.Student;

public interface StudentDao {
	public void saveStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
	public List<Student> getStudentList();
	public Student getStudentById(int studentId);
	public Object validateStudentUser(String name,String pwd);
	public int validateRename(String userName);
	public List<Student> getStudents();
	public Long getSize();
}
