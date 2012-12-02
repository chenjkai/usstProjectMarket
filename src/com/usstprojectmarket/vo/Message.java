package com.usstprojectmarket.vo;

import java.sql.Timestamp;

/**
 * Message entity. @author MyEclipse Persistence Tools
 */

public class Message implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String title;
	private String content;
	private Timestamp sendtime;
	private Integer sendUserId;
	private Integer sendUserRole;
	private Integer receiveUserId;
	private Integer receiveUserRole;
	private Integer messageStatus;

	// Constructors

	/** default constructor */
	public Message() {
	}

	/** minimal constructor */
	public Message(Integer sendUserId, Integer sendUserRole,
			Integer receiveUserId, Integer receiveUserRole,
			Integer messageStatus) {
		this.sendUserId = sendUserId;
		this.sendUserRole = sendUserRole;
		this.receiveUserId = receiveUserId;
		this.receiveUserRole = receiveUserRole;
		this.messageStatus = messageStatus;
	}

	/** full constructor */
	public Message(String title, String content, Timestamp sendtime,
			Integer sendUserId, Integer sendUserRole, Integer receiveUserId,
			Integer receiveUserRole, Integer messageStatus) {
		this.title = title;
		this.content = content;
		this.sendtime = sendtime;
		this.sendUserId = sendUserId;
		this.sendUserRole = sendUserRole;
		this.receiveUserId = receiveUserId;
		this.receiveUserRole = receiveUserRole;
		this.messageStatus = messageStatus;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getSendtime() {
		return this.sendtime;
	}

	public void setSendtime(Timestamp sendtime) {
		this.sendtime = sendtime;
	}

	public Integer getSendUserId() {
		return this.sendUserId;
	}

	public void setSendUserId(Integer sendUserId) {
		this.sendUserId = sendUserId;
	}

	public Integer getSendUserRole() {
		return this.sendUserRole;
	}

	public void setSendUserRole(Integer sendUserRole) {
		this.sendUserRole = sendUserRole;
	}

	public Integer getReceiveUserId() {
		return this.receiveUserId;
	}

	public void setReceiveUserId(Integer receiveUserId) {
		this.receiveUserId = receiveUserId;
	}

	public Integer getReceiveUserRole() {
		return this.receiveUserRole;
	}

	public void setReceiveUserRole(Integer receiveUserRole) {
		this.receiveUserRole = receiveUserRole;
	}

	public Integer getMessageStatus() {
		return this.messageStatus;
	}

	public void setMessageStatus(Integer messageStatus) {
		this.messageStatus = messageStatus;
	}

}