package com.usstprojectmarket.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.usstprojectmarket.dao.BaseDAO;

public class BaseOperation<T> extends BaseDAO{
	//-----------------------------------common save
	protected void saveVoEntity(T object){
		Session session=getSession();
		Transaction tx = session.beginTransaction();
		try{
			session.save(object);
		}finally{
			tx.commit();
			session.close();
		}
	}
	
	//-----------------------------------common getEntity by id
	@SuppressWarnings("unchecked")
	protected T getVoEntityById(Class<?> type,int id){
		Session session=getSession();
		T object=null;
		try{
			object=(T)session.get(type, id);
		}finally{
			session.close();
			
		}
		return object;
	}
	
	
	//------------------------------------common update
	protected void updateVoEntity(T object){
		Session session=getSession();
		Transaction tx = session.beginTransaction();
		try{
			session.update(object);
		}finally{
			tx.commit();
			session.close();
		}
	}
	
	//-------------------------------------common validate
	@SuppressWarnings("unchecked")
	protected T validateUserWithUserNameAndUserPwd(String table,String name,String pwd){
		Session session=getSession();
		String hql="From "+table+" user where user.userpwd=:pwd and user.username=:name and user.status=2";
		List<T> list;
		try{
			Query query=session.createQuery(hql); 
			query.setString("pwd", pwd);
			query.setString("name",name);
			list=query.list();
			if(list.size()==0)
				return null;
		}finally{
			session.close();
		}
		return list.get(0);
	}
	
	//--------------------------------------delete common delete
	protected void deleteVoEntity(T object){
		Session session=getSession();
		Transaction tx = session.beginTransaction();
		try{
			session.delete(object);
		}finally{
			tx.commit();
			session.close();
		}
	}
	
	//-----------------------------------验证注册名是否重名
	@SuppressWarnings("unchecked")
	protected int validateRenameByTablenameAndUserName(String table , String name){
		Session session=getSession();
		String hql="From "+table+" user where user.username=:name";
		List<T> list;
		try{
			Query query=session.createQuery(hql); 
			query.setString("name",name);
			list=query.list();
		}finally{
			session.close();
		}
		return list.size();
	}
	
	//-----------------------------------根据条件获得用户
	@SuppressWarnings("unchecked")
	protected List<T> getEntitys(String table){
		Session session=getSession();
		
		StringBuilder hql=new StringBuilder("From "+table);
		List<T> list;
		try{
			Query query=session.createQuery(hql.toString());
			list=query.list();
		}finally{
			session.close();
		}
		return list;
	}
	
	//------------------------------------获取该表的总记录数
	protected Long getSize(String table){
		Session session=getSession();
		StringBuilder hql=new StringBuilder("select count(*) from ").append(table).append(" user ").append("where user.status=2");
		Long count = (Long)session.createQuery(hql.toString()).uniqueResult();
		session.close();
		return count;
	}
}
