package com.loader.demo;

public class Game {
	
	public static void main(String[] args) throws Exception {
		
//		//Get the classLoader of the game class
//		System.out.println("Game Executed By:"+Game.class.getClassLoader().getClass().getName());
//		//Instatiate The DropBox object
//		DropBox db = new DropBox();
//	    //get The coupon code
//		int coupon =db.getCoupon();
//		System.out.println("Coupon Code: "+coupon);
//		
//		//get the classLoader of the DropBox class
//		System.out.println("DropBox Executed By:"+DropBox.class.getClassLoader().getClass().getName());
		
	   CustomeClassLoader customeCLassLoader =new CustomeClassLoader(DropBox.class.getClassLoader());
	   Object box =Class.forName("com.loader.demo.DropBox",true,customeCLassLoader).newInstance();
	   System.out.println("DropBox Class Executed By: "+box.getClass().getClassLoader().getClass().getName());
	}

}
