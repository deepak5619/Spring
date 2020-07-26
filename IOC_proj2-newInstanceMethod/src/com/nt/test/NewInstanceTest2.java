package com.nt.test; 

import java.lang.reflect.Constructor;

public class NewInstanceTest2 {
	public static void main(String[] args) {
		Class c1=null;
		Object obj1=null,obj2=null;
		Constructor cons[]=null;
		try {
		   //Load the class
		c1=Class.forName(args[0]);
		//get All constructor of the loaded class
		cons=c1.getDeclaredConstructors();
		//create the object
		obj1=cons[1].newInstance();
		obj2=cons[0].newInstance(10,20);
		//instantiate the loaded class
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(".....................................................................");
		}//try
		catch(InstantiationException ie) {
			ie.printStackTrace();
		}
		catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main
}//class