package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements EmployeeMgmtService {

	private EmployeeDAO dao;
	
	public EmployeeMgmtServiceImpl(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public String getGrossNetSal(EmployeeDTO dto) throws Exception{
		float grossSal=0.0f;
		float netSal=0.0f;
		int count=0;
		EmployeeBO bo=null;
		grossSal=dto.getBasicSal()+ dto.getBasicSal()*0.4f;
		netSal=grossSal-(grossSal*0.2f);
		//create EmployeeBO Object having persistable data
		bo=new EmployeeBO();
		//set bo property's values
		bo.setEname(dto.getEname());
		bo.setEadd(dto.getEadd());
		bo.setBasicSal(dto.getBasicSal());
		bo.setGrossSal(grossSal);
		bo.setNetSal(netSal);
		//use dao Object method for insertion of data into db table
		count=dao.insert(bo);
		if(count==0)
			return "Employee regestration failed::"
					+ "\nBasic Sallery ::"+dto.getBasicSal()
					+"\nGross Sallery ::"+grossSal
					+"\nNet Sallery ::"+netSal;
		else
			return "Employee regestration Succeded::"
					+ "\nBasic Sallery ::"+dto.getBasicSal()
					+"\nGross Sallery ::"+grossSal
					+"\nNet Sallery ::"+netSal;
	}

}
