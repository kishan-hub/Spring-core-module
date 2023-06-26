package com.beanlifecycle.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.core.ResolvableType;

public class Calculater implements BeanFactoryAware {
	
	private int num1;
	
	private int num2;
	
	private int sum;
	
	long startTime;
	
	long endTime;
	
    public Calculater(int num1) {
    	startTime = System.currentTimeMillis();
    	System.out.println("Constructor Called...");
    	this.num1=num2;
    }
    
    public void setNum2(int num2) {
    	System.out.println("setter() Method Called...");
    	this.num2 =num2;
    	endTime= System.currentTimeMillis();
    	
    }
    public void init() {
    	System.out.println("init() Method Called...");
    	this.sum=this.num1+this.num2;
    	System.out.println("Sum of Num1 and Num2 is: "+sum);
    }
    public void shutdown() {
    	System.out.println("Shutdown() called ...");
    	//To calculate the time interval between costructor and setter method
    
    }
    
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("SetFactory() Method Called...");
		System.out.println("The Total time :"+(endTime -startTime));
	}

	

}
