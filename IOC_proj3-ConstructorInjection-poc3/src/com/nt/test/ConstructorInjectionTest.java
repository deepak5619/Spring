package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjectionTest {
	public static void main(String[] args) {
		
		System.out.println("ConstructorInjectionTest.main()");//1
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null;
		WishMessageGenerator generator=null;
		String result=null;
		
		//holds name and location of spring bean configuration file
		res=new FileSystemResource("src/com/nt/cfgs/ApplicationContext.xml");        //2
		
		//create beanFactory IOC container   
		factory=new XmlBeanFactory(res);              //3
		
		//get target bean class object
		System.out.println("\nConstructorInjectionTest.main():before target class object wmg");
		obj=factory.getBean("wmg");                 //4
		System.out.println("ConstructorInjectionTest.main():After target class object wmg");
		
		//type casting
		generator=(WishMessageGenerator)obj;
		
		//call the b. method	
		result=generator.getWishMessage("deepak");    //11
		System.out.println("\nMessage::"+result);        //13
	
		}//main
}//class
