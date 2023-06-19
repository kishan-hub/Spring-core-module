package com.sdp.util;

import java.util.Properties;

public class AppFactory {
	
	private static Properties props;
	
	static
	{
		 props =new Properties();
		 try {
			props.load(AppFactory.class.getClassLoader().getResourceAsStream("com//sdp//common//application.properties"));
			String className =props.getProperty("IMessageProducer.class");
			System.out.println(className);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
