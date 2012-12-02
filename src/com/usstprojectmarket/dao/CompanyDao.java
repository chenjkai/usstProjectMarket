package com.usstprojectmarket.dao;

import java.util.List;

import com.usstprojectmarket.vo.Company;

public interface CompanyDao {
	public void saveCompany(Company company);
	public void updateCompany(Company company);
	public void deleteCompany(Company company);
	public List<Company> getCompanyList();
	public Company getCompanyById(int companyId);
	public Object validateCompanyUser(String name,String pwd);
	public int validateRename(String userName);
	public List<Company> getCompanys();
	public Long getSize();
}
