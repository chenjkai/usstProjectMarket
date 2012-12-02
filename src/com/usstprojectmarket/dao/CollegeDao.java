package com.usstprojectmarket.dao;

import java.util.List;

import com.usstprojectmarket.vo.College;

public interface CollegeDao{
	public void saveCollege(College college);
	public void updateCollege(College college);
	public void deleteCollege(College college);
	public List<College> getCollegeList();
	public College getCollegeByID(int collegeId);
	public Object validateCollegeUser(String name,String pwd);
	public int validateRename(String userName);
	public List<College> getCollegeListBySchoolId(int schoolId);
	public List<College> getColleges();
	public Long getSize();
}
