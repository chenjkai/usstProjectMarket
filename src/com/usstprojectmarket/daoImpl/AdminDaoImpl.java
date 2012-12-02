package com.usstprojectmarket.daoImpl;

import com.usstprojectmarket.dao.AdminDao;
import com.usstprojectmarket.vo.Admin;

public class AdminDaoImpl extends BaseOperation<Admin> implements AdminDao {

	public void updateAdmin(Admin admin) {
		updateVoEntity(admin);
	}

	public Object validateAdmin(String name, String pwd) {
		return validateUserWithUserNameAndUserPwd("Admin",name,pwd);
	}

	
}
