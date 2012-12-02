package com.usstprojectmarket.dto;

import java.util.ArrayList;
import java.util.List;

import com.usstprojectmarket.vo.College;
import com.usstprojectmarket.vo.Company;
import com.usstprojectmarket.vo.Professor;
import com.usstprojectmarket.vo.School;
import com.usstprojectmarket.vo.Student;

public class VotedUserDto {
	private List<School> schools;
	private List<College> colleges;
	private List<Company> companys;
	private List<Professor> professor;
	private List<Student> students;
	
	
	public VotedUserDto() {
		schools = new ArrayList<School>();
		colleges = new ArrayList<College>();
		companys = new ArrayList<Company>();
		professor = new ArrayList<Professor>();
		students = new ArrayList<Student>();
	}
	public List<School> getSchools() {
		return schools;
	}
	public void setSchools(List<School> schools) {
		this.schools = schools;
	}
	public List<College> getColleges() {
		return colleges;
	}
	public void setColleges(List<College> colleges) {
		this.colleges = colleges;
	}
	public List<Company> getCompanys() {
		return companys;
	}
	public void setCompanys(List<Company> companys) {
		this.companys = companys;
	}
	public List<Professor> getProfessor() {
		return professor;
	}
	public void setProfessor(List<Professor> professor) {
		this.professor = professor;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public int getSize(){
		return schools.size()+colleges.size()+companys.size()+professor.size()+students.size();
	}
}
