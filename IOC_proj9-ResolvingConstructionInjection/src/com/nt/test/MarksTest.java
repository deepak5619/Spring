package com.nt.test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.comp.Marks;

public class MarksTest {
  public static void main(String[] args) {
	 Resource res=null;
	 BeanFactory factory=null;
	 Marks mk=null;
	 //hold the spring bean configuration file
	 res=new ClassPathResource("com/nt/cfgs/ApplicationContext.xml");
	 //create IOC container
	 factory=new XmlBeanFactory(res);
	 mk=factory.getBean("mr",Marks.class);
	 System.out.println(mk);
}
}
