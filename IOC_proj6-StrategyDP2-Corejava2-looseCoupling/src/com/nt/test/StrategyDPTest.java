package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {
    public static void main(String[] args) {  
    	Flipkart fpkt=null;
    	try{
	     		fpkt=FlipkartFactory.getInstance();
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    	System.out.println("problem in dependency management");
	    }
	    System.out.println(fpkt.shopping(new String[]{"mask","sanitizer","gloves"},new float[]{100,250,80}));
    }
}
