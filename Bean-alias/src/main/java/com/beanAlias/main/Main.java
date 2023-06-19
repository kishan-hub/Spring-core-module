package com.beanAlias.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.beanAlias.bean.Robot;

public class Main {
    
	
	public static void main(String[] args) {
		
		BeanFactory factory =new XmlBeanFactory(new ClassPathResource("com/beanAlias/common/spring-ioc.xml"));
		
		Robot robot = factory.getBean("robot",Robot.class);
		
		System.out.println(robot);
		
	}
}
