package com.stock.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.stock.consumer.ICICIGetStock;

public class Test {
	
	public static void main(String[] args) {
		
		BeanFactory factory =new XmlBeanFactory(new ClassPathResource("spring-ioc.xml"));
		ICICIGetStock getStock =factory.getBean("iciciGetStock",ICICIGetStock.class);
		getStock.getStockPrice("cipla");
		
	}

}
