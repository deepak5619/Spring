package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeMgmtServiceImpl;
import com.nt.vo.EmployeeVO;

public class MainController {
      private EmployeeMgmtServiceImpl service=null;
     
      //constructor for constructor injection
      public MainController(EmployeeMgmtServiceImpl service) {
    	  this.service=service;
      }
      
      public String processEmployee(EmployeeVO vo) throws Exception {
    	  String result=null;
    	  EmployeeDTO dto=null;
    	  dto=new EmployeeDTO();
    	  dto.setEname(vo.getEname());
    	  dto.setEadd(vo.getEadd());
    	  dto.setBasicSal(Float.parseFloat(vo.getBasicSal()));
    	  result=service.getGrossNetSal(dto);
    	  return result;
      }
}
