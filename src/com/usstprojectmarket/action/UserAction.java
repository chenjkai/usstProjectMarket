package com.usstprojectmarket.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.usstprojectmarket.dto.SchoolIdNameDto;
import com.usstprojectmarket.service.UserService;
import com.usstprojectmarket.vo.College;
import com.usstprojectmarket.vo.School;

public class UserAction {
	//------------------------------Spring framewrok Ioc 
	private UserService userService;
	private String userName;
	private int schoolId;
	private int teacherId;
	
	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public void validateRename(){
		boolean result = userService.validateRename(userName);
		int flag=0;
		if(result){
			flag = 1;
		}
		JSONObject json = new JSONObject();
		HttpServletResponse response = ServletActionContext.getResponse();
		json.put("result",flag);
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public String getInformationBeforeReg(){
		List<School> schoolList = userService.getSchoolList();
		List<SchoolIdNameDto> list = new ArrayList<SchoolIdNameDto>();
		for(School school:schoolList){
			SchoolIdNameDto schoolDto = new SchoolIdNameDto();
			schoolDto.setId(school.getId());
			schoolDto.setName(school.getName());
			list.add(schoolDto);
		}
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("list",list);
		return "show";
	}
	
	
	public void getCollegeBySchool(){
		StringBuilder sb = new StringBuilder("<option value=\"0\">----------</option>");
		if(schoolId!=0){
			List<College> collegeList = userService.getCollegeListBySchoolId(schoolId);
			for(College college:collegeList){
				sb.append("<option value=\"")
				.append(college.getId())
				.append("\">")
				.append(college.getName())
				.append("</option>");
			}
		}
		JSONObject json = new JSONObject();
		HttpServletResponse response = ServletActionContext.getResponse();
		json.put("result",sb.toString());
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void validateTeacherById(){

		boolean flag = userService.validateTeacherById(teacherId);
		String result = "0";
		if(flag){
			result = "1";
		}
		JSONObject json = new JSONObject();
		HttpServletResponse response = ServletActionContext.getResponse();
		json.put("result",result);
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
}
