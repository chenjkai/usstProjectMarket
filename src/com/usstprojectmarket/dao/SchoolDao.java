package com.usstprojectmarket.dao;

import java.util.List;

import com.usstprojectmarket.vo.School;

public interface SchoolDao {
	public void saveSchool(School school);
	public void updateSchool(School school);
	public void deleteSchool(School school);
	public List<School> getSchoolList();
	public School getSchoolById(int schoolId);
	public Object validateSchoolUser(String name,String pwd);
	public int validateRename(String userName);
	public List<School> getSchools();
	public Long getSize();
}
