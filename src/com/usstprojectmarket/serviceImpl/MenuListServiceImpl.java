package com.usstprojectmarket.serviceImpl;

import java.util.List;

import com.usstprojectmarket.dao.FirstlistDao;
import com.usstprojectmarket.dao.SecondlistDao;
import com.usstprojectmarket.service.MenuListService;
import com.usstprojectmarket.vo.Firstlist;
import com.usstprojectmarket.vo.Secondlist;

public class MenuListServiceImpl implements MenuListService {
	
	private FirstlistDao firstListDao;
	private SecondlistDao secondListDao;
	
	public FirstlistDao getFirstListDao() {
		return firstListDao;
	}

	public void setFirstListDao(FirstlistDao firstListDao) {
		this.firstListDao = firstListDao;
	}

	public SecondlistDao getSecondListDao() {
		return secondListDao;
	}

	public void setSecondListDao(SecondlistDao secondListDao) {
		this.secondListDao = secondListDao;
	}

	
	
	public List<Firstlist> getFirstList() {
		
		return firstListDao.getFirstlist();
	}

	public List<Secondlist> getSecondListByFirstListId(int firstListId) {
		
		return secondListDao.getSecondlistByFirstlistId(firstListId);
	}

	public Secondlist getSecondListById(int secondListId) {
		
		return secondListDao.getSecondListById(secondListId);
		
	}

}
