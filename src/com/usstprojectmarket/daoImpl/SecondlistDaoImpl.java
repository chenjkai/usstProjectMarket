package com.usstprojectmarket.daoImpl;

import java.util.List;

import org.hibernate.Session;

import com.usstprojectmarket.dao.SecondlistDao;
import com.usstprojectmarket.vo.Secondlist;

public class SecondlistDaoImpl extends BaseOperation<Secondlist> implements SecondlistDao {

	public void deleteSecondlist(Secondlist secondlist) {
		deleteVoEntity(secondlist);
	}


	@SuppressWarnings("unchecked")
	public List<Secondlist> getSecondlistByFirstlistId(int firstlistId) {
		Session session=getSession();
		String hql="From Secondlist snl where snl.firstlist.id="+firstlistId;
		List<Secondlist> list;
		try{
			list=session.createQuery(hql).list(); 
		}finally{
			session.close();
		}
		return list;
	}

	public void saveSecondlist(Secondlist secondlist) {
		saveVoEntity(secondlist);
	}

	public void updateSecondlist(Secondlist secondlist) {
		updateVoEntity(secondlist);
	}


	public Secondlist getSecondListById(int secondListId) {
		return getVoEntityById(Secondlist.class,secondListId);
	}

}
