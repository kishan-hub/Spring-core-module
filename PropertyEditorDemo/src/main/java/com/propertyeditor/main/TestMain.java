package com.propertyeditor.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.propertyeditor.demo.CustomePropertyEditor;
import com.propertyeditor.demo.ScientificCalculater;
import com.propertyeditor.demo.Student;

public class TestMain {
   
	public static void main(String[] args) {
		
		BeanFactory factory =new XmlBeanFactory(new ClassPathResource("spring-context.xml"));
		 ((ConfigurableListableBeanFactory)factory).addPropertyEditorRegistrar(new CustomePropertyEditor());
		 ScientificCalculater calculater=factory.getBean("calculater",ScientificCalculater.class);
	    
		 System.out.println(calculater);
	}
}
