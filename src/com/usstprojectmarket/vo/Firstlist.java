package com.usstprojectmarket.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * Firstlist entity. @author MyEclipse Persistence Tools
 */

public class Firstlist implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 4791061098324098144L;
	private Integer id;
	private String name;
	@SuppressWarnings("unchecked")
	private Set secondlists = new HashSet(0);

	// Constructors

	/** default constructor */
	public Firstlist() {
	}

	/** minimal constructor */
	public Firstlist(String name) {
		this.name = name;
	}

	/** full constructor */
	@SuppressWarnings("unchecked")
	public Firstlist(String name, Set secondlists) {
		this.name = name;
		this.secondlists = secondlists;
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

	@SuppressWarnings("unchecked")
	public Set getSecondlists() {
		return this.secondlists;
	}

	@SuppressWarnings("unchecked")
	public void setSecondlists(Set secondlists) {
		this.secondlists = secondlists;
	}

}