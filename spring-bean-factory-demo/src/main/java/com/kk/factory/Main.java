package com.kk.factory;

import javax.management.MBeanServerFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.kk.factory.bean.Employee;

public class Main {
	
	public static void main(String[] args) {
		
	  
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com//kk//factory//config//spring-ioc.xml"));
		
		Employee  employee=factory.getBean("employee",Employee.class);
		
		System.out.println(employee);
		
	}

}
