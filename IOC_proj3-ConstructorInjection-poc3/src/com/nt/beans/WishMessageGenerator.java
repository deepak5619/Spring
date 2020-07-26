package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
   private Date date;
   static {    //8
	   System.out.println("WishMessageGenerator.static block()");
   }
   
//   public WishMessageGenerator() {
//	   System.out.println("WishMessageGenerator:0-param constructor");
//}

public WishMessageGenerator(Date date) {   //9
	   System.out.println("WishMessageGenerator.1-param constructor");
		this.date = date;
}

   public void setDate(Date date) {            
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
