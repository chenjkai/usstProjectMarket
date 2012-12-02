package com.usstprojectmarket.vo;

/**
 * Professor entity. @author MyEclipse Persistence Tools
 */

public class Professor implements java.io.Serializable,User {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -6814903979870371405L;
	private Integer id;
	private School school;
	private College college;
	private String name;
	private int positiorl;
	private String major;
	private String tel;
	private String zip;
	private String fax;
	private String email;
	private String bank;
	private String bankId;
	private Integer intergration;
	private Integer status;
	private String username;
	private String userpwd;
	private String introduction;
	// Constructors

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

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

	/** default constructor */
	public Professor() {
	}

	/** minimal constructor */
	public Professor(School school, College college, String name,
			int positiorl, String major, String email, Integer intergration,
			Integer status,String username,String userpwd,String introduction) {
		this.school = school;
		this.college = college;
		this.name = name;
		this.positiorl = positiorl;
		this.major = major;
		this.email = email;
		this.intergration = intergration;
		this.status = status;
		this.username=username;
		this.userpwd=userpwd;
		this.introduction = introduction;
	}

	/** full constructor */
	public Professor(School school, College college, String name,
			int positiorl, String major, String tel, String zip, String fax,
			String email, String bank, String bankId, Integer intergration,
			Integer status,String introduction) {
		this.school = school;
		this.college = college;
		this.name = name;
		this.positiorl = positiorl;
		this.major = major;
		this.tel = tel;
		this.zip = zip;
		this.fax = fax;
		this.email = email;
		this.bank = bank;
		this.bankId = bankId;
		this.intergration = intergration;
		this.status = status;
		this.introduction = introduction;
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

	public College getCollege() {
		return this.college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPositiorl() {
		return this.positiorl;
	}

	public void setPositiorl(int positiorl) {
		this.positiorl = positiorl;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
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

	public Integer getIntergration() {
		return this.intergration;
	}

	public void setIntergration(Integer intergration) {
		this.intergration = intergration;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}