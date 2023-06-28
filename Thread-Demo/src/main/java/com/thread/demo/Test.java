package com.thread.demo;

public class Test implements Runnable {
  
	public static void main(String[] args) {
		
		Test test1 =new Test();
        Test test2 =new Test();		
		
		  Thread t1 = new Thread(test1);
		  
		  Thread t2 = new Thread(test2);
		  
		  t1.start();
		  t2.start();
	    
	}
	
	public void run() {
		SingletonDemo s = SingletonDemo.getInstance();
		System.out.println(s);
		
	}
}
