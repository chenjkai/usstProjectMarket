package com.usstprojectmarket.service;

import java.util.List;

import com.usstprojectmarket.dto.VotedUserDto;
import com.usstprojectmarket.vo.Admin;
import com.usstprojectmarket.vo.College;
import com.usstprojectmarket.vo.Company;
import com.usstprojectmarket.vo.Professor;
import com.usstprojectmarket.vo.School;
import com.usstprojectmarket.vo.Student;

public interface UserService {
	//---------------------------------college
	public void saveCollege(College college);
	public void updateCollege(College college);
	public List<College> getCollegeList();
	public College getCollegeByID(int collegeId);
	public Object validateCollegeUser(String name,String pwd);
	public List<College> getCollegeListBySchoolId(int schoolId);
	
	//-----------------------------------company
	public void saveCompany(Company company);
	public void updateCompany(Company company);
	public List<Company> getCompanyList();
	public Company getCompanyById(int companyId);
	public Object validateCompanyUser(String name,String pwd);
	
	//-----------------------------------school
	public void saveSchool(School school);
	public void updateSchool(School school);
	public List<School> getSchoolList();
	public School getSchoolById(int schoolId);
	public Object validateSchoolUser(String name,String pwd);
	
	//-----------------------------------student
	public void saveStudent(Student student);
	public void updateStudent(Student student);
	public List<Student> getStudentList();
	public Student getStudentById(int studentId);
	public Object validateStudentUser(String name,String pwd);
	public boolean validateTeacherById(int teacherId);
	
	//-------------------------------------teacher
	public void saveTeacher(Professor teacher);
	public void updateTeacher(Professor teacher);
	public List<Professor> getTeacherList();
	public Professor getTeacherById(int teacherId);
	public Object validateTeacherUser(String name,String pwd);
	
	//-------------------------------------admin
	public Object validateAdmin(String name,String pwd);
	public void updateAdmin(Admin admin);
	
	//public
	public boolean validateRename(String name);
	public VotedUserDto getUserByFactor(int role);
	public void activeUser(int role,int userId,int status);
	public void lockUser(int role,int userId);
	public void deleteUser(int role,int userId);
	public void unLockUser(int role ,int userId);
	public Long getSize(int role);
	public Long getTotalSize();
}
