package com.usstprojectmarket.vo;
/**
 * Company entity. @author MyEclipse Persistence Tools
 */

public class Company implements java.io.Serializable,User{

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 3251733267732091993L;
	private Integer id;
	private String companyName;
	private String username;
	private String userpwd;
	private String contact;
	private String address;
	private String tel;
	private String zip;
	private String fax;
	private String EMail;
	private String web;
	private String lawer;
	private String bank;
	private String bankId;
	private String tax;
	private Integer status;
	private Integer integeration;
	private String introduction;

	// Constructors

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	/** default constructor */
	public Company() {
	}

	/** minimal constructor */
	public Company(String companyName, String username, String userpwd,
			String contact) {
		this.companyName = companyName;
		this.username = username;
		this.userpwd = userpwd;
		this.contact = contact;
	}

	/** full constructor */
	public Company(String companyName, String username, String userpwd,
			String contact, String address, String tel, String zip, String fax,
			String EMail, String web, String lawer, String bank, String bankId,
			String tax, Integer status, Integer integeration,String introduction) {
		this.companyName = companyName;
		this.username = username;
		this.userpwd = userpwd;
		this.contact = contact;
		this.address = address;
		this.tel = tel;
		this.zip = zip;
		this.fax = fax;
		this.EMail = EMail;
		this.web = web;
		this.lawer = lawer;
		this.bank = bank;
		this.bankId = bankId;
		this.tax = tax;
		this.status = status;
		this.integeration = integeration;
		this.introduction = introduction;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public String getEMail() {
		return this.EMail;
	}

	public void setEMail(String EMail) {
		this.EMail = EMail;
	}

	public String getWeb() {
		return this.web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getLawer() {
		return this.lawer;
	}

	public void setLawer(String lawer) {
		this.lawer = lawer;
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

	public String getTax() {
		return this.tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIntegeration() {
		return this.integeration;
	}

	public void setIntegeration(Integer integeration) {
		this.integeration = integeration;
	}

}