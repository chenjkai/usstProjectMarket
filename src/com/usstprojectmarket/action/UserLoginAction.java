package com.usstprojectmarket.action;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.usstprojectmarket.service.MessageService;
import com.usstprojectmarket.service.UserService;
import com.usstprojectmarket.util.Roles;
import com.usstprojectmarket.vo.User;

public class UserLoginAction {
	// ------------------------------Spring framewrok Ioc
	private UserService userService;
	private MessageService messageService;

	// http form attribute
	private String loginName;
	private String loginPwd;
	private int loginRole;

	// --------------------------------getters and setters
	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public int getLoginRole() {
		return loginRole;
	}

	public void setLoginRole(int loginRole) {
		this.loginRole = loginRole;
	}

	// login method
	public void userLogin() {
		JSONObject json = new JSONObject();
		HttpServletResponse response = ServletActionContext.getResponse();
		ActionContext ac = ActionContext.getContext();
		Map<String, Object> session = ac.getSession();
		User user = null;
		int role = 0;
		if (loginRole == Roles.COLLEGE) {
			user = (User) userService.validateCollegeUser(loginName, loginPwd);
			role = Roles.COLLEGE;
		}
		if (loginRole == Roles.COMPANY) {
			user = (User) userService.validateCompanyUser(loginName, loginPwd);
			role = Roles.COMPANY;
		}
		if (loginRole == Roles.SCHOOL) {
			user = (User) userService.validateSchoolUser(loginName, loginPwd);
			role = Roles.SCHOOL;
		}
		if (loginRole == Roles.STUDENT) {
			user = (User) userService.validateStudentUser(loginName, loginPwd);
			role = Roles.STUDENT;
		}

		if (loginRole == Roles.TEACHER) {
			user = (User) userService.validateTeacherUser(loginName, loginPwd);
			role = Roles.TEACHER;
		}

		if (loginRole == Roles.ADMIN) {
			user = (User) userService.validateAdmin(loginName, loginPwd);
			role = Roles.ADMIN;
		}

		try {
			if (session.containsKey("user")) {
				session.remove("user");
			}
			if (user != null) {
				session.put("user", user);
				session.put("role", role);
				int newMessCount = messageService
					.totalSizeUnReadByUserIdAndUserRole(user.getId(), role);
				session.put("newMessCount", newMessCount);
				json.put("username", user.getUsername());
				json.put("userid", user.getId());
				json.put("role", role);
				json.put("newMessCount",newMessCount);
			}
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
