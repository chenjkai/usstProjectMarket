package com.usstprojectmarket.dao;

import java.util.List;

import com.usstprojectmarket.vo.Professor;

public interface TeacherDao {
	public void saveTeacher(Professor teacher);
	public void updateTeacher(Professor teacher);
	public void deleteTeacher(Professor teacher);
	public List<Professor> getTeacherList();
	public Professor getTeacherById(int teacherId);
	public Object validateTeacherUser(String name,String pwd);
	public int validateRename(String userName);
	public List<Professor> getProfessors();
	public Long getSize();

}
