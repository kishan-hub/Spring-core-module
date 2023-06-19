package com.nestedbean.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nestedbean.bean.A;
import com.nestedbean.bean.B;

public class Main {
	
	public static void main(String[] args) {
		
		BeanFactory parentfactory =new XmlBeanFactory(new ClassPathResource("Parent-ioc.xml"));
		
		BeanFactory childFactory =new XmlBeanFactory(new ClassPathResource("child-ioc.xml"),parentfactory);
         
		  B b =parentfactory.getBean("b",B.class);
		  System.out.println(b);
	      A  a =childFactory.getBean("a",A.class);
	      System.out.println(a);
	}

}
