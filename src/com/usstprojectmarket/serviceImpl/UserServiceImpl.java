package com.usstprojectmarket.serviceImpl;

import java.util.List;

import com.usstprojectmarket.dao.AdminDao;
import com.usstprojectmarket.dao.CollegeDao;
import com.usstprojectmarket.dao.CompanyDao;
import com.usstprojectmarket.dao.SchoolDao;
import com.usstprojectmarket.dao.StudentDao;
import com.usstprojectmarket.dao.TeacherDao;
import com.usstprojectmarket.dto.VotedUserDto;
import com.usstprojectmarket.service.UserService;
import com.usstprojectmarket.util.AccountStatus;
import com.usstprojectmarket.util.Roles;
import com.usstprojectmarket.vo.Admin;
import com.usstprojectmarket.vo.College;
import com.usstprojectmarket.vo.Company;
import com.usstprojectmarket.vo.Professor;
import com.usstprojectmarket.vo.School;
import com.usstprojectmarket.vo.Student;

public class UserServiceImpl implements UserService {
	
	//-------------------------------------Spring framework IOC
	private CollegeDao collegeDao;
	private CompanyDao companyDao;
	private SchoolDao schoolDao;
	private StudentDao studentDao;
	private TeacherDao teacherDao;
	private AdminDao adminDao;
	
	//------------------------------------IOC getters and setters
	public CollegeDao getCollegeDao() {
		return collegeDao;
	}

	public void setCollegeDao(CollegeDao collegeDao) {
		this.collegeDao = collegeDao;
	}

	public CompanyDao getCompanyDao() {
		return companyDao;
	}

	public void setCompanyDao(CompanyDao companyDao) {
		this.companyDao = companyDao;
	}

	public SchoolDao getSchoolDao() {
		return schoolDao;
	}

	public void setSchoolDao(SchoolDao schoolDao) {
		this.schoolDao = schoolDao;
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public TeacherDao getTeacherDao() {
		return teacherDao;
	}

	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	
	//the services from dao layer
	
	//---------------------------------college
	public College getCollegeByID(int collegeId) {
		
		return collegeDao.getCollegeByID(collegeId);
	}

	public List<College> getCollegeList() {
		
		return collegeDao.getCollegeList();
	}
	
	public void saveCollege(College college) {
		collegeDao.saveCollege(college);
	}
	
	public void updateCollege(College college) {
		
		collegeDao.updateCollege(college);

	}
	
	public Object validateCollegeUser(String name, String pwd) {
		return collegeDao.validateCollegeUser(name, pwd);
	}
	
//-------------------------------------------company
	
	public Company getCompanyById(int companyId) {
		
		return companyDao.getCompanyById(companyId);
	}

	public List<Company> getCompanyList() {
		
		return companyDao.getCompanyList();
	}

	public void saveCompany(Company company) {
		
		companyDao.saveCompany(company);
	}
	
	public void updateCompany(Company company) {
		companyDao.updateCompany(company);

	}
	
	public Object validateCompanyUser(String name, String pwd) {
		
		return companyDao.validateCompanyUser(name, pwd);
	}

	
//-----------------------------------------school
	public School getSchoolById(int schoolId) {
		
		return schoolDao.getSchoolById(schoolId);
	}

	public List<School> getSchoolList() {
		
		return schoolDao.getSchoolList();
	}
	
	public void saveSchool(School school) {
		schoolDao.saveSchool(school);

	}
	
	public void updateSchool(School school) {
		schoolDao.updateSchool(school);
	}
	
	public Object validateSchoolUser(String name, String pwd) {
		
		return schoolDao.validateSchoolUser(name, pwd);
	}

	
//----------------------------------------student
	
	public Student getStudentById(int studentId) {
		
		return studentDao.getStudentById(studentId);
	}

	public List<Student> getStudentList() {
		
		return studentDao.getStudentList();
	}
	
	public void saveStudent(Student student) {
		studentDao.saveStudent(student);
	}
	
	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
	}

	public Object validateStudentUser(String name, String pwd) {
		
		return studentDao.validateStudentUser(name, pwd);
	}

	
//----------------------------------------------teacher
	
	public Professor getTeacherById(int teacherId) {
		
		return teacherDao.getTeacherById(teacherId);
	}

	public List<Professor> getTeacherList() {
		
		return teacherDao.getTeacherList();
	}

	public void saveTeacher(Professor teacher) {
		
		teacherDao.saveTeacher(teacher);
	}

	public void updateTeacher(Professor teacher) {
		teacherDao.updateTeacher(teacher);

	}

	public Object validateTeacherUser(String name, String pwd) {
		
		return teacherDao.validateTeacherUser(name, pwd);
	}

	
	
	//----------------------------------------------admin
	
	public void updateAdmin(Admin admin) {
		adminDao.updateAdmin(admin);
	}
	public Object validateAdmin(String name, String pwd) {
		return adminDao.validateAdmin(name, pwd);
	}

	public boolean validateRename(String name) {

		if(collegeDao.validateRename(name)
				+companyDao.validateRename(name)
				+schoolDao.validateRename(name)
				+studentDao.validateRename(name)
				+teacherDao.validateRename(name) != 0){
			return false;
		}
		else{
			return true;
		}
	}

	public List<College> getCollegeListBySchoolId(int schoolId){ 
		return collegeDao.getCollegeListBySchoolId(schoolId);
	}

	public boolean validateTeacherById(int teacherId) {
		if(teacherDao.getTeacherById(teacherId) != null){
			return true;
		}
		return false;
	}

	//获得未激活的用户列表
	public VotedUserDto getUserByFactor(int role) {
		VotedUserDto votedUserDto= new VotedUserDto();
		if(role==1){
			votedUserDto.setSchools(schoolDao.getSchools());
		}else if(role == 2){
			votedUserDto.setColleges(collegeDao.getColleges());
		}else if(role == 3){
			votedUserDto.setCompanys(companyDao.getCompanys());
		}else if(role == 4){
			votedUserDto.setProfessor(teacherDao.getProfessors());
		}else if(role == 5){
			votedUserDto.setStudents(studentDao.getStudents());
		}
		return votedUserDto;
	}
	//激活用户
	public void activeUser(int role,int userId,int status){
		if(role==1){
			School school = schoolDao.getSchoolById(userId);
			school.setStatus(status);
			schoolDao.updateSchool(school);
		}else if(role == 2){
			College college = collegeDao.getCollegeByID(userId);
			college.setStatus(status);
			collegeDao.updateCollege(college);
		}else if(role == 3){
			Company company = companyDao.getCompanyById(userId);
			company.setStatus(status);
			companyDao.updateCompany(company);
		}else if(role == 4){
			Professor pr = teacherDao.getTeacherById(userId);
			pr.setStatus(status);
			teacherDao.updateTeacher(pr);
		}else if(role == 5){
			Student student = studentDao.getStudentById(userId);
			student.setStatus(status);
			studentDao.updateStudent(student);
		}
	}
	//冻结用户
	public void lockUser(int role, int userId) {
		activeUser(role,userId,AccountStatus.FROZEN);
	}
	//解冻用户
	public void unLockUser(int role ,int userId){
		activeUser(role,userId,AccountStatus.ACTIVATED);
	}
	//删除用户
	public void deleteUser(int role, int userId) {
		if(role==1){
			School school = schoolDao.getSchoolById(userId);
			schoolDao.deleteSchool(school);
		}else if(role == 2){
			College college = collegeDao.getCollegeByID(userId);
			collegeDao.deleteCollege(college);
		}else if(role == 3){
			Company company = companyDao.getCompanyById(userId);
			companyDao.deleteCompany(company);
		}else if(role == 4){
			Professor pr = teacherDao.getTeacherById(userId);
			teacherDao.deleteTeacher(pr);
		}else if(role == 5){
			Student student = studentDao.getStudentById(userId);
			studentDao.deleteStudent(student);
		}
	}
	//返回指定用户的个数
	public Long getSize(int role) {
		if(role==1){
			 return schoolDao.getSize();
		}else if(role == 2){
			 return collegeDao.getSize(); 
		}else if(role == 3){
			return companyDao.getSize();
		}else if(role == 4){
			return  teacherDao.getSize();
		}else if(role == 5){
			return studentDao.getSize();
		}
		
		return 0L;
	}
	
	//返回用户数
	public Long getTotalSize(){
		return getSize(Roles.COLLEGE)
		+getSize(Roles.COMPANY)
		+getSize(Roles.SCHOOL)
		+getSize(Roles.STUDENT)
		+getSize(Roles.TEACHER);
	}
}
