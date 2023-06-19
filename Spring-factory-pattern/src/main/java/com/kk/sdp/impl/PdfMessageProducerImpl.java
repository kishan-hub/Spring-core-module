package com.kk.sdp.impl;

import com.kk.sdp.IMessageProducer;

public class PdfMessageProducerImpl implements IMessageProducer {

	@Override
	public String convertMessage(String message) {
		// TODO Auto-generated method stub
       //Write a logic to convert the String into Pdf format
		return "<pdf>"+message+"</pdf>";
	}
	

}
