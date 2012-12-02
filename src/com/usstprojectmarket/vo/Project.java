package com.usstprojectmarket.vo;

import java.sql.Timestamp;

/**
 * Project entity. @author MyEclipse Persistence Tools
 */

public class Project implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Company company;
	private Secondlist secondlist;
	private String title;
	private Timestamp pubtime;
	private Timestamp starttime;
	private Timestamp endtime;
	private String tel;
	private Integer classId;
	private Integer toobject;
	private String description;
	private Timestamp checktime;
	private Integer status;
	private Integer ok;
	private Integer undertakerId;
	private Integer isstudent;
	private String companynote;
	private String companysummary;
	private String companybeian;
	private String undertakeplan;
	private String undertakebeian;
	private String undertakenote;

	// Constructors

	/** default constructor */
	public Project() {
	}

	/** minimal constructor */
	public Project(Company company, String title, Integer classId,
			Integer undertakerId) {
		this.company = company;
		this.title = title;
		this.classId = classId;
		this.undertakerId = undertakerId;
	}

	/** full constructor */
	public Project(Company company, Secondlist secondlist, String title,
			Timestamp pubtime, Timestamp starttime, Timestamp endtime,
			String tel, Integer classId, Integer toobject, String description,
			Timestamp checktime, Integer status, Integer ok,
			Integer undertakerId, Integer isstudent, String companynote,
			String companysummary, String companybeian, String undertakeplan,
			String undertakebeian, String undertakenote) {
		this.company = company;
		this.secondlist = secondlist;
		this.title = title;
		this.pubtime = pubtime;
		this.starttime = starttime;
		this.endtime = endtime;
		this.tel = tel;
		this.classId = classId;
		this.toobject = toobject;
		this.description = description;
		this.checktime = checktime;
		this.status = status;
		this.ok = ok;
		this.undertakerId = undertakerId;
		this.isstudent = isstudent;
		this.companynote = companynote;
		this.companysummary = companysummary;
		this.companybeian = companybeian;
		this.undertakeplan = undertakeplan;
		this.undertakebeian = undertakebeian;
		this.undertakenote = undertakenote;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Secondlist getSecondlist() {
		return this.secondlist;
	}

	public void setSecondlist(Secondlist secondlist) {
		this.secondlist = secondlist;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getPubtime() {
		return this.pubtime;
	}

	public void setPubtime(Timestamp pubtime) {
		this.pubtime = pubtime;
	}

	public Timestamp getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}

	public Timestamp getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public Integer getToobject() {
		return this.toobject;
	}

	public void setToobject(Integer toobject) {
		this.toobject = toobject;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getChecktime() {
		return this.checktime;
	}

	public void setChecktime(Timestamp checktime) {
		this.checktime = checktime;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getOk() {
		return this.ok;
	}

	public void setOk(Integer ok) {
		this.ok = ok;
	}

	public Integer getUndertakerId() {
		return this.undertakerId;
	}

	public void setUndertakerId(Integer undertakerId) {
		this.undertakerId = undertakerId;
	}

	public Integer getIsstudent() {
		return this.isstudent;
	}

	public void setIsstudent(Integer isstudent) {
		this.isstudent = isstudent;
	}

	public String getCompanynote() {
		return this.companynote;
	}

	public void setCompanynote(String companynote) {
		this.companynote = companynote;
	}

	public String getCompanysummary() {
		return this.companysummary;
	}

	public void setCompanysummary(String companysummary) {
		this.companysummary = companysummary;
	}

	public String getCompanybeian() {
		return this.companybeian;
	}

	public void setCompanybeian(String companybeian) {
		this.companybeian = companybeian;
	}

	public String getUndertakeplan() {
		return this.undertakeplan;
	}

	public void setUndertakeplan(String undertakeplan) {
		this.undertakeplan = undertakeplan;
	}

	public String getUndertakebeian() {
		return this.undertakebeian;
	}

	public void setUndertakebeian(String undertakebeian) {
		this.undertakebeian = undertakebeian;
	}

	public String getUndertakenote() {
		return this.undertakenote;
	}

	public void setUndertakenote(String undertakenote) {
		this.undertakenote = undertakenote;
	}

}