package com.usstprojectmarket.dto;

import java.util.ArrayList;
import java.util.List;

public class Attachment {
	public List<Attach> companynote;
	public List<Attach> companysummary;
	public List<Attach> companybeian;
	public List<Attach> undertakeplan;
	public List<Attach> undertakebeian;
	public List<Attach> undertakenote;
	
	public Attachment(){
		companynote = new ArrayList<Attach>();
		companysummary = new ArrayList<Attach>();
		companybeian = new ArrayList<Attach>();
		undertakeplan = new ArrayList<Attach>();
		undertakebeian = new ArrayList<Attach>();
		undertakenote = new ArrayList<Attach>();
	}

	public List<Attach> getCompanynote() {
		return companynote;
	}

	public void setCompanynote(List<Attach> companynote) {
		this.companynote = companynote;
	}

	public List<Attach> getCompanysummary() {
		return companysummary;
	}

	public void setCompanysummary(List<Attach> companysummary) {
		this.companysummary = companysummary;
	}

	public List<Attach> getCompanybeian() {
		return companybeian;
	}

	public void setCompanybeian(List<Attach> companybeian) {
		this.companybeian = companybeian;
	}

	public List<Attach> getUndertakeplan() {
		return undertakeplan;
	}

	public void setUndertakeplan(List<Attach> undertakeplan) {
		this.undertakeplan = undertakeplan;
	}

	public List<Attach> getUndertakebeian() {
		return undertakebeian;
	}

	public void setUndertakebeian(List<Attach> undertakebeian) {
		this.undertakebeian = undertakebeian;
	}

	public List<Attach> getUndertakenote() {
		return undertakenote;
	}

	public void setUndertakenote(List<Attach> undertakenote) {
		this.undertakenote = undertakenote;
	}

	
	
}
