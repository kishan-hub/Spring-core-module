package com.stock.consumer;

import com.stock.provider.StockManager;

public class ICICIGetStock {
	 
	private StockManager stockManager;

	public void setStockManager(StockManager stockManager) {
		this.stockManager = stockManager;
	}
	
	public void getStockPrice(String stockName) {
		double price =stockManager.getPrice(stockName);
		System.out.println(price);
	}
	
	
}
