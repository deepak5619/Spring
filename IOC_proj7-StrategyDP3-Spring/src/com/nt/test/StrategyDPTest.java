package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.comp.Flipkart;

public class StrategyDPTest {
    public static void main(String[] args) {  
    	Resource res=null;
    	BeanFactory factory=null;
    	Flipkart fpkt=null;
    	//hold the spring bean configure file
    	res=new ClassPathResource("com/nt/cfgs/ApplicationContext.xml");
    	//create the IOC Container
    	factory=new XmlBeanFactory(res);
    	//locate the target class object
    	fpkt=factory.getBean("fpkt",Flipkart.class);
    	//invoke the method
	    System.out.println(fpkt.shopping(new String[]{"mask","sanitizer","gloves"},new float[]{100,250,80}));
    }
}
