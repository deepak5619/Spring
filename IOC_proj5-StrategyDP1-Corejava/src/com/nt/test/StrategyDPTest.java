package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {
    public static void main(String[] args) {  
	Flipkart fpkt=null;
        fpkt=FlipkartFactory.getInstance("DTDC");
        System.out.println(fpkt.shopping(new String[]{"mask","sanitizer","gloves"},new float[]{100,250,80}));
   System.out.println("=================================================");
   fpkt=FlipkartFactory.getInstance("FirstFlight");
   System.out.println(fpkt.shopping(new String[]{"mask","sanitizer","gloves"},new float[]{100,250,80}));

    
    }
}
