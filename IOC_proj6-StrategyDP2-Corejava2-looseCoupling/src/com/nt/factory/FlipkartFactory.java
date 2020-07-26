package com.nt.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.nt.comp.Courier;
import com.nt.comp.Flipkart;

public class FlipkartFactory {
	private static Properties prop;
	static {
		InputStream is=null;
		try {
			//locate file using inputStream
			is=new FileInputStream("src/com/nt/commons/info.properties");
//			locate properties file into java.util.Properties Object
			prop=new Properties();
			prop.load(is);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Flipkart getInstance() throws Exception {
    	  Courier courier=null;
    	  Flipkart fpkt=null;
//    	get Dependent class  and create that class object
    	courier=(Courier)Class.forName(prop.getProperty("sdp.dependent")).newInstance();  
//    	 create target class object
     	 fpkt = new Flipkart();
     	 //assign dependent class object to target class object
     	 fpkt.setCourier(courier);
    	  return fpkt;
      }
}
