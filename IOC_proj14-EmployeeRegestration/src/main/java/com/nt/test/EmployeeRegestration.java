package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class EmployeeRegestration {
	public static void main(String[] args) {
			
		Scanner sc=null;
		EmployeeVO vo=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader = null;
		MainController controller=null;
		String ename,eadd,basicSal;
		String result=null;
		sc=new Scanner(System.in);
		//read inputs 
		System.out.println("Enter Employee Name::");
		ename=sc.next();
		System.out.println("Enter Employee Address::");
		eadd=sc.next();
		System.out.println("Enter Basic Sallery::");
		basicSal=sc.next();
		
		//set this input values to vo object
		vo=new EmployeeVO();
		vo.setEname(ename);
		vo.setEadd(eadd);
		vo.setBasicSal(basicSal);
		//create bean factory IOC container
		 factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/ApplicationContext.xml");
		//create bean factory class Object
		controller=factory.getBean("controller",MainController.class);
		// invoke the method
				try {
				    result = controller.processEmployee(vo);
					System.out.println(result);
				} catch (Exception e) {
					System.out.println("Internal Problem try again !");
					e.printStackTrace();
				}
		
	}
}
