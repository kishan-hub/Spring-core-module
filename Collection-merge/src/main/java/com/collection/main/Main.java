package com.collection.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.collection.merge.Course;

public class Main {
	
	public static void main(String[] args) {
		
		BeanFactory factory =new XmlBeanFactory(new ClassPathResource("spring-ioc.xml"));
		
		Course  course = factory.getBean("cloudops",Course.class);
		
		System.out.println(course);
		
		
	}

}
