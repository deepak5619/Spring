package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.comp.Student;

public class StudentTest {
    public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		Student student=null;
		//hold the Spring bean configuration file
		res=new ClassPathResource("com/nt/cfgs/ApplicationContext.xml");
		//create the IOC container
		factory=new XmlBeanFactory(res);
		student=factory.getBean("st",Student.class);
		System.out.println(student);
	}
}
