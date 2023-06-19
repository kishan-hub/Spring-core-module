package com.sdp.beans;

public class XmlMessageProducer implements IMessageProducer{

	@Override
	public String messageConvert(String message) {
		// TODO Auto-generated method stub
		return "<xml?>"+message+"</xml>";
	}

}
