package com.usstprojectmarket.vo;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable,User{

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 2783935147762197277L;
	private Integer id;
	private School school;
	private College college;
	private Professor professor;
	private String name;
	private int grade;
	private String major;
	private String address;
	private String tel;
	private String zip;
	private String fax;
	private String email;
	private String bank;
	private String bankId;
	private Integer integration;
	private Integer status;
	private String username;
	private String userpwd;
	
	// Constructors
	
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
	public Student() {
	}

	/** minimal constructor */
	public Student(School school, College college, Professor professor,
			Integer integration, Integer status) {
		this.school = school;
		this.college = college;
		this.professor = professor;
		this.integration = integration;
		this.status = status;
	}

	/** full constructor */
	public Student(School school, College college, Professor professor,
			String name, int grade, String major, String address,
			String tel, String zip, String fax, String email, String bank,
			String bankId, Integer integration, Integer status,String username,String userpwd) {
		this.school = school;
		this.college = college;
		this.professor = professor;
		this.name = name;
		this.grade = grade;
		this.major = major;
		this.address = address;
		this.tel = tel;
		this.zip = zip;
		this.fax = fax;
		this.email = email;
		this.bank = bank;
		this.bankId = bankId;
		this.integration = integration;
		this.status = status;
		this.username=username;
		this.userpwd=userpwd;
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

	public Professor getProfessor() {
		return this.professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return this.grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
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