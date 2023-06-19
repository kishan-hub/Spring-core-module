package com.sdp.beans;

public class JsonMessageProducerImpl implements IMessageProducer {

	@Override
	public String messageConvert(String message) {
		// TODO Auto-generated method stub
		return "<json>"+message+"</json>";
	}

}
