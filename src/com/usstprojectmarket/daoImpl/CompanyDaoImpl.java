package com.usstprojectmarket.daoImpl;

import java.util.List;

import org.hibernate.Session;

import com.usstprojectmarket.dao.CompanyDao;
import com.usstprojectmarket.vo.Company;

public class CompanyDaoImpl extends BaseOperation<Company> implements CompanyDao {

	public Company getCompanyById(int companyId) {
		return getVoEntityById(Company.class,companyId);
	}

	@SuppressWarnings("unchecked")
	public List<Company> getCompanyList() {
		Session session=getSession();
		String hql="From Company";
		List<Company> list;
		try{
			list=session.createQuery(hql).list(); 
		}finally{
			session.close();
		}
		return list;
	}

	public void saveCompany(Company company) {
		
		saveVoEntity(company);
		
	}

	public void updateCompany(Company company) {
		updateVoEntity(company);
	}

	public Object validateCompanyUser(String name, String pwd) {
		
		return validateUserWithUserNameAndUserPwd("Company",name,pwd);
	}

	public void deleteCompany(Company company) {
		
		deleteVoEntity(company);
		
	}

	public int validateRename(String userName) {
		return validateRenameByTablenameAndUserName("Company",userName);
	}

	public List<Company> getCompanys() {
		return getEntitys("Company");
	}

	public Long getSize() {
		return super.getSize("Company");
	}

	
}
