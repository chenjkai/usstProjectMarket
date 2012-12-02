package com.usstprojectmarket.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * School entity. @author MyEclipse Persistence Tools
 */

public class School implements java.io.Serializable,User {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 6007523101957500044L;
	private Integer id;
	private String name;
	private String contact;
	private String address;
	private String tel;
	private String zip;
	private String fax;
	private String email;
	private String web;
	private String bank;
	private String bankId;
	private String president;
	private Integer integration;
	private Integer status;
	private String username;
	private String userpwd;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	private Set<College> colleges = new HashSet<College>(0);
	
	// Constructors

	/** default constructor */
	public School() {
	}

	/** minimal constructor */
	public School(String name, String email, Integer integration, Integer status) {
		this.name = name;
		this.email = email;
		this.integration = integration;
		this.status = status;
	}

	/** full constructor */
	public School(String name, String contact, String address, String tel,
			String zip, String fax, String email, String web, String bank,
			String bankId, String president, Integer integration,
			Integer status, String username,String userpwd,Set<College> colleges) {
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.tel = tel;
		this.zip = zip;
		this.fax = fax;
		this.email = email;
		this.web = web;
		this.bank = bank;
		this.bankId = bankId;
		this.president = president;
		this.integration = integration;
		this.username=username;
		this.userpwd=userpwd;
		this.status = status;
		this.colleges = colleges;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWeb() {
		return this.web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getBank() {
		return this.bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBankId() {
		return this.bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getPresident() {
		return this.president;
	}

	public void setPresident(String president) {
		this.president = president;
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

	public Set<College> getColleges() {
		return this.colleges;
	}

	public void setColleges(Set<College> colleges) {
		this.colleges = colleges;
	}

}