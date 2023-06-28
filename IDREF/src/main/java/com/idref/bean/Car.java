package com.idref.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Car { 
	
	private String beanId;
	
	private Car(String beanId) {
		this.beanId =beanId;
	}
	
	@Override
	public String toString() {
		return "Car [beanId=" + beanId + "]";
	}

	public void drive() {
		int status=0;
		IEngine engine=null;
	
		
		BeanFactory factory =new XmlBeanFactory(new ClassPathResource("spring-ioc.xml"));
	    engine =factory.getBean(beanId,IEngine.class);
	    status = engine.startup();
	    
	    if(status == 1) {
	    	
	    	System.out.println(beanId+"  Engine Started");
	    }
	    else {
	    	System.out.println("Engine started failed");
	    }
		
	}

}
