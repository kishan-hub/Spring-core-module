package com.stock.consumer;

import com.stock.provider.BSEStockManagerImpl;
import com.stock.provider.StockManager;

public class ICICIServiceLocater {
	
	private static ICICIServiceLocater instance;
	
	private StockManager stockManager;
	
	
	public static synchronized ICICIServiceLocater getInstance() {
		 if(instance==null) {
			 instance=new ICICIServiceLocater();
		 }
		 return instance;
	}
	public StockManager getService() {
		//logic to lookup into jndi registery
		stockManager = new BSEStockManagerImpl();
		return stockManager;
	}

}
