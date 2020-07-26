package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
     private Courier courier;
     
     public Flipkart() {
    	 System.out.println("Flipkart:0-param constructor");
     }
     public void setCourier(Courier courier) {
    	System.out.println("Flipkart.setCourier()");
    	this.courier=courier;
     }
     
     //b.logic
     public String shopping(String[] item,float[] price) {
    	 System.out.println("Flipkart.shopping()");
    	 float billAmt=0.0f;
    	 Random rad=null;
    	 int oid=0;
    	 String msg=null;
    	 //generate a new random number
    	 rad=new Random();
    	 oid=rad.nextInt(10000);
    	 //calculate the bill amount
    	 for(float i:price){
    		 billAmt=billAmt+i;
    	 }
    	 //get the delivery message
    	 msg=courier.deliver(oid);
    	 //return billAmount and courier detail to customer
    	 return Arrays.toString(item)+" are purchased  having prices "+Arrays.toString(price)+"  with bill amount "+billAmt+ "----"+ msg;
     }
}