package com.demo.singelton;



public class Asingelton {
	
	private static Asingelton instance;
	
	private Asingelton() {
	  //no -args constructor
	}
	
	public static Asingelton getInstance() {
		 
		 if(instance == null) {
			 
			 synchronized (Asingelton.class) {
				
				 if(instance == null) {
					   instance = new Asingelton();
				 }
			}
		 }
		 return instance;
	}

}
