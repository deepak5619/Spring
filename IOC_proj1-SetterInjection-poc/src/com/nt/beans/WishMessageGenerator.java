package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
   private Date date;
   static {    //6
	   System.out.println("WishMessageGenerator.static block()");
   }
   public WishMessageGenerator() {   //6
	   System.out.println("WishMessageGenerator.0-param constructor");
   }
   public void setDate(Date date) {            //10
	   this.date=date;
	   System.out.println("WishMessageGenerator.setDate()");
   }
   public String getWishMessage(String user) {                     //12
	   System.out.println("WishMessageGenerator.getWishMessage()");
	   user=user.toUpperCase();
	   int hour=0;
	   hour=date.getHours();
	   if(hour<12) {
		   return "GOOD MORNING ::"+user;
	   }
	   else if(hour<16) {
		   return "GOOD AFTERNOON ::"+user;
	   }
	   else if(hour<20) {
		   return "GOOD EVENING ::"+user;
	   }
	   else{
		   return "GOOD NIGHT ::"+user;
	   }
   }
}
