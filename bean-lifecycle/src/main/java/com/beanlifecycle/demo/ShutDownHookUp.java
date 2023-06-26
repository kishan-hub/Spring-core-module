package com.beanlifecycle.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class ShutDownHookUp implements Runnable, BeanFactoryAware {
	
	private BeanFactory factory;

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
         this.factory=factory;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
        ((ConfigurableListableBeanFactory)factory).destroySingletons();
	}

}
