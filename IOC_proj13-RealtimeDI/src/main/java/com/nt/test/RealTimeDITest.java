package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class RealTimeDITest {
	public static void main(String[] args) {
			
		Scanner sc=null;
		CustomerVO vo=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader = null;
		MainController controller=null;
		String cname,cadd,pAmt,rate,time;
		String result=null;
		sc=new Scanner(System.in);
		System.out.println("Enter customer Name::");
		cname=sc.next();
		System.out.println("Enter Customer Address::");
		cadd=sc.next();
		System.out.println("Enter Principle Amount::");
		pAmt=sc.next();
		System.out.println("Enter Interest Rate::");
		rate=sc.next();
		System.out.println("Enter Time::");
		time=sc.next();
		//set this input values to vo object
		vo=new CustomerVO();
		vo.setCname(cname);
		vo.setCadd(cadd);
		vo.setpAmt(pAmt);
		vo.setRate(rate);
		vo.setTime(time);
		//create bean factory IOC container
		 factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/ApplicationContext.xml");
		//create bean factory class Object
		controller=factory.getBean("controller",MainController.class);
		// invoke the method
				try {
				    result = controller.customerProcess(vo);
					System.out.println(result);
				} catch (Exception e) {
					System.out.println("Internal Problem");
					e.printStackTrace();
				}
		
	}
}
