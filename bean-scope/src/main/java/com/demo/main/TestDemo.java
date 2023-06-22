package com.demo.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.demo.prototype.Bsingelton;

import com.demo.singelton.Asingelton;

public class TestDemo {
	
	public static void main(String[] args) {
		
		BeanFactory factory =new XmlBeanFactory(new ClassPathResource("spring-context.xml"));
		
		 Asingelton a1 = factory.getBean("a",Asingelton.class);
		 
		 Asingelton a2 = factory.getBean("a",Asingelton.class);
		 
	/* <-------------------------------------------------------------> */	 
		 Bsingelton b1= factory.getBean("b",Bsingelton.class);
		 
		 Bsingelton b2= factory.getBean("b",Bsingelton.class);
		 
		 System.out.println("prototype singleton scope is "+(b1 == b2));
		 
		 System.out.println("singelton scope is "+(a1==a2));
		 
	}

}
