package com.sdp.beans;

public class PdfMessageProducerImpl implements IMessageProducer{

	@Override
	public String messageConvert(String message) {
		// TODO Auto-generated method stub
		return "<pdf>"+message+"</pdf>";
	}

}
