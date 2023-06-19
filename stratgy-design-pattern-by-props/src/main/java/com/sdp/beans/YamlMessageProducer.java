package com.sdp.beans;

public class YamlMessageProducer implements IMessageProducer {

	@Override
	public String messageConvert(String message) {
		// TODO Auto-generated method stub
		return "<yaml>"+message+"</yaml>";
	}

}
