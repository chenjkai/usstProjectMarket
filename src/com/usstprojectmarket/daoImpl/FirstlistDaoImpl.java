package com.usstprojectmarket.daoImpl;

import java.util.List;

import org.hibernate.Session;

import com.usstprojectmarket.dao.FirstlistDao;
import com.usstprojectmarket.vo.Firstlist;

public class FirstlistDaoImpl extends BaseOperation<Firstlist> implements FirstlistDao {

	public void deleteFirstlist(Firstlist firstlist) {
		
		deleteVoEntity(firstlist);
	}

	@SuppressWarnings("unchecked")
	public List<Firstlist> getFirstlist() {
		Session session=getSession();
		String hql="From Firstlist";
		List<Firstlist> list;
		try{
			list=session.createQuery(hql).list(); 
		}finally{
			session.close();
		}
		return list;
	}

	public void saveFirstlist(Firstlist firstlist) {
		saveVoEntity(firstlist);
	}

	public void updateFirstlist(Firstlist firstlist) {
		updateVoEntity(firstlist);

	}

}
