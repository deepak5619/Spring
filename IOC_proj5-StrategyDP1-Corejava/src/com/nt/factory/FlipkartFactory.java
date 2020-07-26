package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.FirstFlight;
import com.nt.comp.Flipkart;

public class FlipkartFactory {
      public static Flipkart getInstance(String courierName) {
    	  Courier courier=null;
    	  Flipkart fpkt=null;
    	  if(courierName.equalsIgnoreCase("DTDC"))
    		    courier=new DTDC();
    	  else if(courierName.equalsIgnoreCase("BlueDart"))
    		  courier=new BlueDart();
    	  else if(courierName.equalsIgnoreCase("FirstFlight"))
    		  courier=new FirstFlight();
    	  else 
			   throw new  IllegalArgumentException(" Invalid courier name");
//     	 create target class object
     	 fpkt = new Flipkart();
     	 //assign dependent class object to target class object
     	 fpkt.setCourier(courier);
    	  return fpkt;
      }
}
