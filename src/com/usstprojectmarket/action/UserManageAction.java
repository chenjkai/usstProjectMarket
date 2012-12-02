package com.usstprojectmarket.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.usstprojectmarket.dto.VotedUserDto;
import com.usstprojectmarket.service.UserService;
import com.usstprojectmarket.util.AccountStatus;
import com.usstprojectmarket.util.Roles;
import com.usstprojectmarket.vo.College;
import com.usstprojectmarket.vo.Company;
import com.usstprojectmarket.vo.Professor;
import com.usstprojectmarket.vo.School;
import com.usstprojectmarket.vo.User;

public class UserManageAction {
	
	private UserService userService;
	private int role;
	private int currentPage;
	private int userId;
	
	//教师信息
	private int teacherSchool;
	private int teacherCollege;
	private String teachermajor;
	private int positiorl;
	private String mail;
	private String phone;
	private String editor;
	
	//公司信息
	private String companyName;
	private String companyAddress;
	private String companyZip;
	private String companyTel;
	private String companyMail;
	private String companyWeb;
	private String companyEditor;
	
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

	public String getCompanyZip() {
		return companyZip;
	}

	public void setCompanyZip(String companyZip) {
		this.companyZip = companyZip;
	}

	public String getCompanyTel() {
		return companyTel;
	}

	public void setCompanyTel(String companyTel) {
		this.companyTel = companyTel;
	}

	public String getCompanyMail() {
		return companyMail;
	}

	public void setCompanyMail(String companyMail) {
		this.companyMail = companyMail;
	}

	public String getCompanyWeb() {
		return companyWeb;
	}

	public void setCompanyWeb(String companyWeb) {
		this.companyWeb = companyWeb;
	}

	public String getCompanyEditor() {
		return companyEditor;
	}

	public void setCompanyEditor(String companyEditor) {
		this.companyEditor = companyEditor;
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

	public String getTeachermajor() {
		return teachermajor;
	}

	public void setTeachermajor(String teachermajor) {
		this.teachermajor = teachermajor;
	}

	public int getPositiorl() {
		return positiorl;
	}

	public void setPositiorl(int positiorl) {
		this.positiorl = positiorl;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	//显示待激活用户
	public String showUserWaitActive(){
		HttpServletRequest request = ServletActionContext.getRequest();
		VotedUserDto votedUserDto = userService.getUserByFactor(role);
		request.setAttribute("list",votedUserDto);
		request.setAttribute("role",role);
		return "show";
	}
	//激活账号
	public void activeUser(){
		userService.activeUser(role, userId,AccountStatus.ACTIVATED);
	}
	//冻结账号
	public void lockUser(){
		userService.lockUser(role, userId);
	}
	
	//解冻用户
	public void unLockUser(){
		userService.unLockUser(role, userId);
	}
	//删除用户
	public void deleteUser(){
		userService.deleteUser(role, userId);
	}
	//显示用户详细资料
	public String showUserDetail(){
		HttpServletRequest request = ServletActionContext.getRequest();
		if(role == Roles.TEACHER){
			request.setAttribute("professor",userService.getTeacherById(userId));
			return "professor";
		}else if(role == Roles.COMPANY){
			request.setAttribute("company",userService.getCompanyById(userId));
			return "company";
		}
		return "home";
	}
	
	//显示用户资料修改页
	public String showChangeUserInfo(){
		ActionContext ac=ActionContext.getContext();
		HttpServletRequest request = ServletActionContext.getRequest();
		Map<String, Object> session=ac.getSession();
		if(session.containsKey("role")){
			if(session.containsKey("user")){
				User user = (User)session.get("user");
				int role = (Integer)session.get("role");
				if(role == Roles.TEACHER){
					Professor pr = userService.getTeacherById(user.getId());
					Map<Integer,String> schools = new HashMap<Integer,String>();
					List<School> list = userService.getSchoolList();
					for(School school:list){
						schools.put(school.getId(),school.getName());
					}
					Map<Integer,String> colleges = new HashMap<Integer,String>();
					List<College> list2 = userService.getCollegeListBySchoolId(pr.getSchool().getId());
					
					for(College college:list2){
						colleges.put(college.getId(),college.getName());
					}
					request.setAttribute("professor",pr);
					request.setAttribute("schools",schools);
					request.setAttribute("colleges",colleges);
					return "professor";
				}else if(role == Roles.COMPANY){
					request.setAttribute("company",userService.getCompanyById(user.getId()));
					return "company";
				}
				
			}
			
		}
		return "home";
		
	}
	
	//修改用户资料
	public String modifyInfo(){
		ActionContext ac=ActionContext.getContext();
		Map<String, Object> session=ac.getSession();
		if(session.containsKey("role")){
			int role = (Integer)session.get("role");
			if(session.containsKey("user")){
				User user = (User)session.get("user");
				if(role == Roles.TEACHER){
					Professor pr = userService.getTeacherById(user.getId());
					pr.setSchool(userService.getSchoolById(teacherSchool));
					pr.setCollege(userService.getCollegeByID(teacherCollege));
					pr.setEmail(mail);
					pr.setMajor(teachermajor);
					pr.setPositiorl(positiorl);
					pr.setTel(phone);
					pr.setIntroduction(editor);
					userService.updateTeacher(pr);
				}else if(role == Roles.COMPANY){
					Company com = userService.getCompanyById(user.getId());
					com.setAddress(companyAddress);
					com.setCompanyName(companyName);
					com.setZip(companyZip);
					com.setTel(companyTel);
					com.setEMail(companyMail);
					com.setWeb(companyWeb);
					com.setIntroduction(companyEditor);
					userService.updateCompany(com);
				}
			}
		}
		
		return "success";
	}
}
