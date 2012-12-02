package com.usstprojectmarket.serviceImpl;

import java.util.List;

import com.usstprojectmarket.dao.MessageDao;
import com.usstprojectmarket.service.MessageService;
import com.usstprojectmarket.vo.Message;

public class MessageServiceImpl implements MessageService {
	private MessageDao messageDao;

	public MessageDao getMessageDao() {
		return messageDao;
	}

	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}

	public void delete(Message message) {
		messageDao.delete(message);
	}

	public Message getMessageByMessageId(int id) {
		return messageDao.getMessageByMessageId(id);
	}

	public List<Message> getMessageByReceiverAndStatus(int receiver,
			int receiverRole, int messageStatus) {
		return messageDao.getMessageByReceiverAndStatus(receiver, receiverRole,
				messageStatus);
	}

	public List<Message> getMessagesByUserIdAndUserRoleWithPagination(
			int userId, int userRole, int currentPage, int pageSize) {
		return messageDao.getMessagesByUserIdAndUserRoleWithPagination(userId,
				userRole, currentPage, pageSize);
	}

	public void send(Message message) {
		messageDao.send(message);
	}

	public int totalSizeUnReadByUserIdAndUserRole(int id, int role) {
		return messageDao.totalSizeUnReadByUserIdAndUserRole(id, role);
	}

	public int totalSizeUserIdAndUserRole(int id, int role) {
		return messageDao.totalSizeUserIdAndUserRole(id, role);
	}

	public void update(Message message) {
		messageDao.update(message);
	}

}
