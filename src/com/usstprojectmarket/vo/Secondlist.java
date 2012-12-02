package com.usstprojectmarket.vo;

/**
 * Secondlist entity. @author MyEclipse Persistence Tools
 */

public class Secondlist implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -1152813704635757690L;
	private Integer id;
	private Firstlist firstlist;
	private String name;

	// Constructors

	/** default constructor */
	public Secondlist() {
	}

	/** minimal constructor */
	public Secondlist(String name) {
		this.name = name;
	}

	/** full constructor */
	public Secondlist(Firstlist firstlist, String name) {
		this.firstlist = firstlist;
		this.name = name;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Firstlist getFirstlist() {
		return this.firstlist;
	}

	public void setFirstlist(Firstlist firstlist) {
		this.firstlist = firstlist;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}