package com.usstprojectmarket.dao;

import java.util.List;

import com.usstprojectmarket.vo.Secondlist;

public interface SecondlistDao {
	public void saveSecondlist(Secondlist secondList);
	public void updateSecondlist(Secondlist secondlist);
	public void deleteSecondlist(Secondlist secondlist);
	public List<Secondlist> getSecondlistByFirstlistId(int firstlistId);
	public Secondlist getSecondListById(int secondListId);
}
