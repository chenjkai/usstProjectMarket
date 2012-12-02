package com.usstprojectmarket.action;

import com.usstprojectmarket.service.UserService;
import com.usstprojectmarket.util.AccountStatus;
import com.usstprojectmarket.util.Roles;
import com.usstprojectmarket.vo.College;
import com.usstprojectmarket.vo.Company;
import com.usstprojectmarket.vo.Professor;
import com.usstprojectmarket.vo.School;
import com.usstprojectmarket.vo.Student;

public class UserRegisterAction{
	
	//------------------------------Spring framewrok Ioc 
	private UserService userService;
	
	//http form attributes 
	private School school;
	private College college;
	private Company company;
	private Professor teacher;
	private	Student student;
	
	//不同角色共有字段
	private String  userName;
	private String  userPwd;
	private String  reuserPwd;
	private String  phone;
	private String  zip;
	private String  email;
	private String  fax;
	private int  role;
	
	//学校
	private String  schoolName;
	private String  schoolAddress;
	private String  schoolPresident;
	private String  schoolContact;
	private String  schoolWeb;
	private String  schoolBank;
	private String  schoolBandId;
	
	//学院
	private int  schoolCollege;
	private String  collegeName;
	private String  collegeAddress;
	private String  deportName;
	
	//公司
	private String  companyName;
	private String  companyAddress;
	private String  companyContact;
	private String  companyWeb;
	private String  companyLawer;
	private String  companyBank;
	private String  companyBandId;
	private String  companyTax;
	
	//教师
	private int  teacherSchool;
	private int  teacherCollege;
	private String  teacherName;
	private int  positiorl;
	private String  teacherMajor;
	private String  teacherBank;
	private String  teacherBankId;
	
	//学生
	private String studentName;
	private int  studentSchool;
	private int  studentCollege;
	private int  studentPrefessor;
	private int  studentGrade;
	private String  studentMajor;
	private String  studentAddress;
	private String  studentBank;
	private String  studentBankId;
	
//-----------------------------------------Ioc setter and getter
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
//-----------------------------------------Action getters and setters
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(int studentGrade) {
		this.studentGrade = studentGrade;
	}
	public int getSchoolCollege() {
		return schoolCollege;
	}
	public void setSchoolCollege(int schoolCollege) {
		this.schoolCollege = schoolCollege;
	}
	public int getTeacherSchool() {
		return teacherSchool;
	}
	public void setTeacherSchool(int teacherSchool) {
		this.teacherSchool = teacherSchool;
	}
	public int getTeacherCollege() {
		return teacherCollege;
	}
	public void setTeacherCollege(int teacherCollege) {
		this.teacherCollege = teacherCollege;
	}
	public int getStudentSchool() {
		return studentSchool;
	}
	public void setStudentSchool(int studentSchool) {
		this.studentSchool = studentSchool;
	}
	public int getStudentCollege() {
		return studentCollege;
	}
	public void setStudentCollege(int studentCollege) {
		this.studentCollege = studentCollege;
	}
	public int getStudentPrefessor() {
		return studentPrefessor;
	}
	public void setStudentPrefessor(int studentPrefessor) {
		this.studentPrefessor = studentPrefessor;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getReuserPwd() {
		return reuserPwd;
	}
	public void setReuserPwd(String reuserPwd) {
		this.reuserPwd = reuserPwd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public String getSchoolPresident() {
		return schoolPresident;
	}
	public void setSchoolPresident(String schoolPresident) {
		this.schoolPresident = schoolPresident;
	}
	public String getSchoolContact() {
		return schoolContact;
	}
	public void setSchoolContact(String schoolContact) {
		this.schoolContact = schoolContact;
	}
	public String getSchoolWeb() {
		return schoolWeb;
	}
	public void setSchoolWeb(String schoolWeb) {
		this.schoolWeb = schoolWeb;
	}
	public String getSchoolBank() {
		return schoolBank;
	}
	public void setSchoolBank(String schoolBank) {
		this.schoolBank = schoolBank;
	}
	public String getSchoolBandId() {
		return schoolBandId;
	}
	public void setSchoolBandId(String schoolBandId) {
		this.schoolBandId = schoolBandId;
	}

	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeAddress() {
		return collegeAddress;
	}
	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	public String getDeportName() {
		return deportName;
	}
	public void setDeportName(String deportName) {
		this.deportName = deportName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getCompanyContact() {
		return companyContact;
	}
	public void setCompanyContact(String companyContact) {
		this.companyContact = companyContact;
	}
	public String getCompanyWeb() {
		return companyWeb;
	}
	public void setCompanyWeb(String companyWeb) {
		this.companyWeb = companyWeb;
	}
	public String getCompanyLawer() {
		return companyLawer;
	}
	public void setCompanyLawer(String companyLawer) {
		this.companyLawer = companyLawer;
	}
	public String getCompanyBank() {
		return companyBank;
	}
	public void setCompanyBank(String companyBank) {
		this.companyBank = companyBank;
	}
	public String getCompanyBandId() {
		return companyBandId;
	}
	public void setCompanyBandId(String companyBandId) {
		this.companyBandId = companyBandId;
	}
	public String getCompanyTax() {
		return companyTax;
	}
	public void setCompanyTax(String companyTax) {
		this.companyTax = companyTax;
	}
	
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherMajor() {
		return teacherMajor;
	}
	public int getPositiorl() {
		return positiorl;
	}
	public void setPositiorl(int positiorl) {
		this.positiorl = positiorl;
	}
	public void setTeacherMajor(String teacherMajor) {
		this.teacherMajor = teacherMajor;
	}
	public String getTeacherBank() {
		return teacherBank;
	}
	public void setTeacherBank(String teacherBank) {
		this.teacherBank = teacherBank;
	}
	public String getTeacherBankId() {
		return teacherBankId;
	}
	public void setTeacherBankId(String teacherBankId) {
		this.teacherBankId = teacherBankId;
	}
	
	public String getStudentMajor() {
		return studentMajor;
	}
	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentBank() {
		return studentBank;
	}
	public void setStudentBank(String studentBank) {
		this.studentBank = studentBank;
	}
	public String getStudentBankId() {
		return studentBankId;
	}
	public void setStudentBankId(String studentBankId) {
		this.studentBankId = studentBankId;
	}

	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	

	
	//------------------------------------------------验证表单数据
	private boolean validateAndSave(){

		if(userName==null||userName.trim().length()<6
				||userName.trim().length()>16){
			
			return false;
		}
		
		if(userPwd==null||userPwd.trim().length()<6
				||userPwd.trim().length()>16
				||!userPwd.trim().equals(reuserPwd.trim())){
			
			return false;
		}
		
		if(phone==null||phone.trim().length()<8
				||phone.trim().length()>14){
			
			return false;
		}
		if(email==null||!email.trim().contains("@")||email.trim().length()>20){
			return false;
		}
		
		if(zip!=null){
			if(zip.trim().length()!=6)
				return false;
		}
		
		if(fax!=null){
			if(fax.trim().length()<8||fax.trim().length()>14)
				return false;
		}
		
		if(role==0){
			return false;
		}
		
		if(role==Roles.SCHOOL){
			if(schoolName.trim().length()==0||schoolName.trim().length()>20){
				return false;
			}
				
			if(schoolAddress.trim().length()==0||schoolAddress.trim().length()>50){
				return false;
			}
			
			if(schoolPresident.trim().length()==0||schoolPresident.trim().length()>10){
				return false;
			}
			if(schoolContact.trim().length()==0||schoolContact.trim().length()>10){
				return false;
			}
			if(schoolWeb.trim().length()>50){
				return false;
			}
//			if(schoolBank.trim().length()>20){
//				return false;
//			}
//			if(schoolBandId.trim().length()>30){
//				return false;
//			}
			school=new School();
			school.setAddress(schoolAddress.trim());
//			school.setBank(schoolBank.trim());
//			school.setBankId(schoolBandId.trim());
			school.setContact(schoolContact.trim());
			school.setEmail(email.trim());
			school.setFax(fax.trim());
			school.setIntegration(0);
			school.setName(schoolName.trim());
			school.setPresident(schoolPresident.trim());
			school.setStatus(AccountStatus.WAIT_ACTIVATE);
			school.setTel(phone.trim());
			school.setUsername(userName.trim());
			school.setUserpwd(userPwd.trim());
			school.setWeb(schoolWeb.trim());
			school.setZip(zip.trim());
			//save
			userService.saveSchool(school);
			
		}else if(role==Roles.COLLEGE){
			if(schoolCollege==0){
				return false;
			}
			
			if(collegeName==null||(collegeName.trim().length()>40)){
					return false;
			}
		
			
			
			if(collegeAddress==null||collegeAddress.trim().length()>100){
				return false;
			}
			if(deportName==null||deportName.trim().length()>10){
				return false;
			}
			
			//set values
			college=new College();
			college.setAddress(collegeAddress.trim());
			college.setDeportName(deportName.trim());
			college.setEMail(email.trim());
			college.setFax(fax.trim());
			college.setIntegration(0);
			college.setName(collegeName.trim());
			college.setSchool(userService.getSchoolById(schoolCollege));
			college.setStatus(AccountStatus.WAIT_ACTIVATE);
			college.setTel(phone.trim());
			college.setUsername(userName.trim());
			college.setUserpwd(reuserPwd.trim());
			college.setZip(zip.trim());
			
			//save
			userService.saveCollege(college);
			
		}else if(role==Roles.COMPANY){
			if(companyName==null||companyName.trim().length()>40){
				return false;
			}
			if(companyAddress.trim().length()==0||companyAddress.trim().length()>100){
				return false;
			}
			if(companyContact.trim().length()==0||companyContact.trim().length()>20){
				return false;
			}
			if(companyWeb.trim().length()==0||companyWeb.trim().length()>50){
				return false;
			}
			if(companyLawer.trim().length()==0||companyLawer.trim().length()>20){
				return false;
			}
			if(companyBank.trim().length()>20||companyBandId.trim().length()>30){
				return false;
			}
			if(companyTax.trim().length()>20){
				return false;
			}
			
			//set attribute
			company = new Company();
			company.setAddress(companyAddress.trim());
			company.setBank(companyBank.trim());
			company.setBankId(companyBandId.trim());
			company.setCompanyName(companyName.trim());
			company.setContact(companyContact.trim());
			company.setEMail(email.trim());
			company.setFax(fax.trim());
			company.setIntegeration(0);
			company.setLawer(companyLawer.trim());
			company.setStatus(AccountStatus.WAIT_ACTIVATE);
			company.setTax(companyTax.trim());
			company.setTel(phone.trim());
			company.setUsername(userName.trim());
			company.setUserpwd(userPwd.trim());
			company.setWeb(companyWeb.trim());
			company.setZip(zip.trim());
			
			// save
			userService.saveCompany(company);
			
			
		}else if(role==Roles.TEACHER){
			if(teacherSchool==0||teacherCollege==0){
				return false;
			}
			if(teacherName.trim().length()==0||teacherName.trim().length()>30){
				return false;
			}
			if(positiorl==0){
				return false;
			}
			if(teacherMajor.trim().length()==0||teacherMajor.trim().length()>30){
				return false;
			}
			if(teacherBank.trim().length()>20||teacherBankId.trim().length()>30){
				return false;
			}
			//set attributes
			teacher=new Professor();
			teacher.setBank(teacherBank.trim());
			teacher.setBankId(teacherBankId.trim());
			teacher.setCollege(userService.getCollegeByID(teacherCollege));
			teacher.setEmail(email.trim());
			teacher.setFax(fax.trim());
			teacher.setIntergration(0);
			teacher.setMajor(teacherMajor.trim());
			teacher.setName(teacherName.trim());
			teacher.setPositiorl(positiorl);
			teacher.setSchool(userService.getSchoolById(teacherSchool));
			teacher.setStatus(AccountStatus.WAIT_ACTIVATE);
			teacher.setTel(phone.trim());
			teacher.setUsername(userName.trim());
			teacher.setUserpwd(userPwd.trim());
			teacher.setZip(zip);
			//save
			userService.saveTeacher(teacher);
		}else if(role==Roles.STUDENT){
			if(studentSchool==0||studentCollege==0){
				return false;
			}
			if(studentPrefessor==0){
				return false;
			}
			if(studentMajor.trim().length()==0||studentMajor.trim().length()>30){
				return false;
			}
			if(studentAddress.trim().length()>100){
				return false;
			}
			if(studentBank.trim().length()>20||studentBankId.trim().length()>30){
				return false;
			}
			if(studentGrade==0){
				return false;
			}
			
			if(studentName.trim().length()==0||studentName.trim().length()>30){
				return false;
			}
			
			//set attributes
			student=new Student();
			student.setAddress(studentAddress.trim());
			student.setBank(studentBank.trim());
			student.setBankId(studentBankId.trim());
			student.setCollege(userService.getCollegeByID(studentCollege));
			student.setEmail(email.trim());
			student.setFax(fax.trim());
			student.setGrade(studentGrade);
			student.setIntegration(0);
			student.setMajor(studentMajor.trim());
			student.setName(studentName.trim());
			student.setProfessor(userService.getTeacherById(studentPrefessor));
			student.setSchool(userService.getSchoolById(studentSchool));
			student.setStatus(AccountStatus.WAIT_ACTIVATE);
			student.setTel(phone);
			student.setUsername(userName.trim());
			student.setUserpwd(userPwd.trim());
			
			student.setZip(zip.trim());
			
			//save
			userService.saveStudent(student);
		}
		else{
			return false;
		}
		return true;
	}
	//register
	public String register(){
		if(validateAndSave()){
			return "success";
		}else{
			return "register";
		}	
	}
		
}
