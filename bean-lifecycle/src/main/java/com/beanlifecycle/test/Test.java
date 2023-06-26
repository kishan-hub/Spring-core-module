package com.beanlifecycle.test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.beanlifecycle.demo.Calculater;
import com.beanlifecycle.demo.ShutDownHookUp;

public class Test {
	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring-context.xml"));
		
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
