package com.usstprojectmarket.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.usstprojectmarket.dao.MessageDao;
import com.usstprojectmarket.util.MessageStatus;
import com.usstprojectmarket.vo.Message;

public class MessageDaoImpl extends CommonOperation<Message> implements
		MessageDao {

	public Message getMessageByMessageId(int id) {
		return getObjectById(Message.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Message> getMessageByReceiverAndStatus(int receiver,
			int receiverRole, int messageStatus) {
		Session session = getSession();
		String hql = "From Message ms where ms.receiveUserId = " + receiver
				+ " and ms.receiveUserRole = " + receiverRole
				+ " and ms.messageStatus = " + messageStatus;
		List<Message> list;
		try {
			list = session.createQuery(hql).list();
		} finally {
			session.close();
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	public List<Message> getMessagesByUserIdAndUserRoleWithPagination(
			int userId, int userRole, int currentPage, int pageSize) {
		Session session=getSession();
		String hql = "From Message ms where ms.receiveUserId = " + userId
		+ " and ms.receiveUserRole = " + userRole;
		List<Message> list;
		try{
			Query query=session.createQuery(hql);
			query.setFirstResult(currentPage);
			query.setMaxResults(pageSize);
			list=query.list();
		}finally{
			session.close();
		}
		return list;
	}

	public void send(Message message) {
		save(message);
	}

	public int totalSizeUnReadByUserIdAndUserRole(int id, int role) {
		Session session = getSession();
		String hql = "select count(*) from Message ms where ms.receiveUserId = "
				+ id
				+ " and ms.receiveUserRole = "
				+ role
				+ " and ms.messageStatus = " + MessageStatus.UnRead;
		Long count = (Long) session.createQuery(hql).uniqueResult();
		session.close();
		return Integer.parseInt(count.toString());
	}

	public int totalSizeUserIdAndUserRole(int id, int role) {
		Session session = getSession();
		String hql = "select count(*) from Message ms where ms.receiveUserId = "
				+ id
				+ " and ms.receiveUserRole = "
				+ role;
		Long count = (Long) session.createQuery(hql).uniqueResult();
		session.close();
		return Integer.parseInt(count.toString());
	}

	public void delete(Message message) {
		delete(message);
	}

	public void update(Message message) {
		update(message);
	}

}
