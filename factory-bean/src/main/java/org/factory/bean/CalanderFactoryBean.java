package org.factory.bean;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

public class CalanderFactoryBean implements FactoryBean<Calendar> {

	@Override
	public Calendar getObject() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("GetObject");
		return Calendar.getInstance();
	}

	@Override
	public Class<Calendar> getObjectType() {
		// TODO Auto-generated method stub
		System.out.println("GetObjectType");
		return Calendar.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		System.out.println("isSingleton()");
		return true;
	}
	
	

}
