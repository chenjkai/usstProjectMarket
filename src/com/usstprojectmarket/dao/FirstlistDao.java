package com.usstprojectmarket.dao;

import java.util.List;

import com.usstprojectmarket.vo.Firstlist;

public interface FirstlistDao {
	public void saveFirstlist(Firstlist firstlist);
	public void deleteFirstlist(Firstlist firstlist);
	public void updateFirstlist(Firstlist firstlist);
	public List<Firstlist> getFirstlist();
}
