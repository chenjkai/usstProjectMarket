package com.usstprojectmarket.vo;

import java.sql.Timestamp;

/**
 * ProjectChanging entity. @author MyEclipse Persistence Tools
 */

public class ProjectChanging implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -4484784580066715701L;
	private Integer id;
	private Project project;
	private Integer userId;
	private Integer isstudent;
	private Timestamp votetime;
	private Integer ischosen;
	// Constructors

	/** default constructor */
	public ProjectChanging() {
	}

	/** full constructor */
	public ProjectChanging(Project project, Integer userId, Integer isstudent) {
		this.project = project;
		this.userId = userId;
		this.isstudent = isstudent;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getIsstudent() {
		return this.isstudent;
	}

	public void setIsstudent(Integer isstudent) {
		this.isstudent = isstudent;
	}

	public Timestamp getVotetime() {
		return votetime;
	}

	public void setVotetime(Timestamp votetime) {
		this.votetime = votetime;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getIschosen() {
		return ischosen;
	}

	public void setIschosen(Integer ischosen) {
		this.ischosen = ischosen;
	}

}