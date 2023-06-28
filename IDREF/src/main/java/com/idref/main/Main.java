package com.idref.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.idref.bean.Car;

public class Main {
  
	public static void main(String[] args) {
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-ioc.xml"));
		
		Car car = beanFactory.getBean("car",Car.class);
		
	      car.drive();
		
		
	}
}
