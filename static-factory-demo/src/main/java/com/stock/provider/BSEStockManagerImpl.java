package com.stock.provider;

public class BSEStockManagerImpl implements StockManager {

	@Override
	public double getPrice(String stockName) {
		// TODO Auto-generated method stub
		double price =0.0;
		if(stockName ==null || stockName.trim().length() ==0) {
			price=346.89;
		}
		else if(stockName.equals("cipla")) {
			price=678.46;
		}
		else {
			price=458.22;
		}
		return price;
	}

}
