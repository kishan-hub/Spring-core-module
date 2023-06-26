package com.beanlifecycle.conifg;

import org.springframework.context.annotation.Bean;

import com.beanlifecycle.demo.Calculater;
import com.beanlifecycle.demo.ShutDownHookUp;

@org.springframework.context.annotation.Configuration
public class Configuration {
     
	@Bean(name = "calculater")
	public Calculater getCalculater() {
		  Calculater calculater =null;
		  calculater=new Calculater(10);
		  calculater.setNum2(400);
		  
		  return calculater;
	}
	
	@Bean(name = "shutdownhookup")
	public ShutDownHookUp getShutDownHook() {
		ShutDownHookUp shutDownHookUp=null;
		shutDownHookUp =new ShutDownHookUp();
		return shutDownHookUp;
		
	}
}
