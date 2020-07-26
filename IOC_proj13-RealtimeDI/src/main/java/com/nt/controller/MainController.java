package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.CustomerMgmtService;
import com.nt.vo.CustomerVO;

public class MainController {
     private CustomerMgmtService service;
     
     private MainController(CustomerMgmtService service) {
    	 this.service=service;
     }
     
     public String customerProcess(CustomerVO vo) throws Exception{
    	 String result=null;
    	 CustomerDTO dto=null;
    	 dto=new CustomerDTO();
    	 //convert vo to dto class Object
    	 dto.setCname(vo.getCname());
    	 dto.setCadd(vo.getCadd());
    	 dto.setpAmt(Float.parseFloat(vo.getpAmt()));
    	 dto.setRate(Float.parseFloat(vo.getRate()));
    	 dto.setTime(Float.parseFloat(vo.getTime()));
    	 result=service.calculateInterestAmount(dto);
		return result;
    	 
     }
}
