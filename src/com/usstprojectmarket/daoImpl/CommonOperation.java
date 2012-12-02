package com.usstprojectmarket.daoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.usstprojectmarket.dao.BaseDAO;

public class CommonOperation<T> extends BaseDAO{
	
	//±£´æ
	public void save(Object ob){
		Session session=getSession();
		Transaction tx = session.beginTransaction();
		try{
			session.save(ob);
		}finally{
			tx.commit();
			session.close();
		}
	}
	
	//¸üÐÂ
	public void update(Object ob){
		Session session=getSession();
		Transaction tx = session.beginTransaction();
		try{
			session.update(ob);
		}finally{
			tx.commit();
			session.close();
		}
	}
	
	//É¾³ý
	public void delete(Object ob){
		Session session=getSession();
		Transaction tx = session.beginTransaction();
		try{
			session.delete(ob);
		}finally{
			tx.commit();
			session.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public T getObjectById(Class<?> type,int id){
		
		Session session=getSession();
		T object=null;
		try{
			object=(T)session.get(type, id);
		}finally{
			session.close();
		}
		return object;
	}
}
