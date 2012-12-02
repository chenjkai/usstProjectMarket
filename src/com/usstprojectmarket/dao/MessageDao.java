package com.usstprojectmarket.dao;

import java.util.List;

import com.usstprojectmarket.vo.Message;

public interface MessageDao {
	public void send(Message message);
	public void delete(Message message);
	public void update(Message message);
	public List<Message> getMessageByReceiverAndStatus(int receiver,int receiverRole,int messageStatus);
	public List<Message> getMessagesByUserIdAndUserRoleWithPagination(int userId,int userRole,int currentPage,int pageSize);
	public Message getMessageByMessageId(int id);
	public int totalSizeUserIdAndUserRole(int id,int role);
	public int totalSizeUnReadByUserIdAndUserRole(int id,int role);
}
