package com.nt.factory;

import com.nt.comp.ApoloTyre;
import com.nt.comp.BudgetCar;
import com.nt.comp.Car;
import com.nt.comp.CeatTyre;
import com.nt.comp.LuxaryCar;
import com.nt.comp.MrfTyre;
import com.nt.comp.SportsCar;
import com.nt.comp.Tyre;

public class CarFactory {
         public static Car getInstance(String type) {
        	 Tyre tyre=null;
        	 Car car=null;
        	 if(type.equalsIgnoreCase("luxary")) {
    			 tyre=new CeatTyre();
    			 car=new LuxaryCar(tyre);
    		 }
    		 else if(type.equalsIgnoreCase("sports")) {
    			 tyre=new MrfTyre();
    			 car=new SportsCar(tyre);
    		 }
    		 else if(type.equalsIgnoreCase("budget")) {
    			 tyre=new ApoloTyre();
    			 car=new BudgetCar(tyre);
    		 }
    		 else {
    			 throw new IllegalArgumentException("Invalid Car type");
    		 }
        	 return car;
         }//method
}//class