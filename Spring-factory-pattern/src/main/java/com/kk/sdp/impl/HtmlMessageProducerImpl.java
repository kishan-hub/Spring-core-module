package com.kk.sdp.impl;

import com.kk.sdp.IMessageProducer;

public class HtmlMessageProducerImpl implements IMessageProducer {

	@Override
	public String convertMessage(String message) {
		// TODO Auto-generated method stub
		//Write a Logic to convert the string into html format
		return "<html>"+message+"</html>";
	}
}
