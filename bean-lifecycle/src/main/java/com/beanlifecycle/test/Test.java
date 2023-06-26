package com.beanlifecycle.test;


import org.springframework.beans.factory.BeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.beanlifecycle.conifg.Configuration;
import com.beanlifecycle.demo.Calculater;
import com.beanlifecycle.demo.ShutDownHookUp;

public class Test {
	
	
	public static void main(String[] args) {
		
	//	@SuppressWarnings("deprecation")
		//BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring-context.xml"));
		
	     ApplicationContext factory =new AnnotationConfigApplicationContext(Configuration.class);
	      Calculater calculater=factory.getBean("calculater",Calculater.class);
		
		System.out.println(calculater);
		
//		((ConfigurableListableBeanFactory)factory).destroySingletons();
//		
//		System.out.println(calculater);
		ShutDownHookUp shutdown=factory.getBean("shutdownhookup",ShutDownHookUp.class);
		Runtime runtime=Runtime.getRuntime();
		runtime.addShutdownHook(new Thread(shutdown));
		
		
	}
	

}
