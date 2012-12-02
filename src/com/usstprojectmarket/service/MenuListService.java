package com.usstprojectmarket.service;

import java.util.List;

import com.usstprojectmarket.vo.Firstlist;
import com.usstprojectmarket.vo.Secondlist;

public interface MenuListService {
	
	public List<Firstlist> getFirstList();
	
	public List<Secondlist> getSecondListByFirstListId(int firstListId);
	
	public Secondlist getSecondListById(int secondListId);
}
