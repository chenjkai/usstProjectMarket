package com.usstprojectmarket.vo;


/**
 * College entity. @author MyEclipse Persistence Tools
 */

public class College implements java.io.Serializable,User {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 5621676493180573927L;
	private Integer id;
	private School school;
	private String name;
	private String address;
	private String tel;
	private String zip;
	private String fax;
	private String EMail;
	private String deportName;
	private String username;
	private String userpwd;
	private Integer integration;
	private Integer status;


	// Constructors

	/** default constructor */
	public College() {
	}

	/** minimal constructor */
	public College(School school, String name, String username, String userpwd,
			Integer integration, Integer status) {
		this.school = school;
		this.name = name;
		this.username = username;
		this.userpwd = userpwd;
		this.integration = integration;
		this.status = status;
	}

	
	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public School getSchool() {
		return this.school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEMail() {
		return this.EMail;
	}

	public void setEMail(String EMail) {
		this.EMail = EMail;
	}

	public String getDeportName() {
		return this.deportName;
	}

	public void setDeportName(String deportName) {
		this.deportName = deportName;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpwd() {
		return this.userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public Integer getIntegration() {
		return this.integration;
	}

	public void setIntegration(Integer integration) {
		this.integration = integration;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	
}