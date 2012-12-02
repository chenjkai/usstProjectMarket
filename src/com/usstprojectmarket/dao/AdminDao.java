package com.usstprojectmarket.dao;

import com.usstprojectmarket.vo.Admin;

public interface AdminDao {
	public Object validateAdmin(String name,String pwd);
	public void updateAdmin(Admin admin);
}
