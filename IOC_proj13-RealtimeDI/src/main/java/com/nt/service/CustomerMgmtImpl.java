package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.CustomerDAO;
import com.nt.dto.CustomerDTO;

public class CustomerMgmtImpl implements CustomerMgmtService {

	private CustomerDAO dao;

	public CustomerMgmtImpl(CustomerDAO dao) {
		this.dao = dao;
	}
	

	@Override
	public String calculateInterestAmount(CustomerDTO dto) throws Exception {
		CustomerBO bo=null;
		int count=0;
		float interestAmt=0.0f;
		interestAmt=(dto.getpAmt()*dto.getRate()*dto.getTime())/100.0f;
		//create customerBO Object having persistable data
		bo=new CustomerBO();
		bo.setCname(dto.getCname());
		bo.setCadd(dto.getCadd());
		bo.setpAmt(dto.getpAmt());
		bo.setInterestAmt(interestAmt);
		//use DAO
		count=dao.insert(bo);
		if(count==0)
			return "Customer Registration failed :: Amt::"+dto.getpAmt()+"  intrest::"+interestAmt;
		return "Customer Registration Succeded :: Amt::"+dto.getpAmt()+"  intrest::"+interestAmt;
	}
       
}
