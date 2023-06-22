package com.demo.prototype;

import com.demo.singelton.Asingelton;

public class Bsingelton {
	
	private static Bsingelton instance;
	
	private Bsingelton() {
	  //no -args constructor
	}
	
	public static Bsingelton getInstance() {
		 
		 if(instance == null) {
			 
			 synchronized (Asingelton.class) {
				
				 if(instance == null) {
					   instance = new Bsingelton();
				 }
			}
		 }
		 return instance;
	}

}
