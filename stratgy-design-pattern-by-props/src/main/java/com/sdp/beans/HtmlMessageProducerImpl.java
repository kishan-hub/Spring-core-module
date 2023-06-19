package com.sdp.beans;

public class HtmlMessageProducerImpl implements IMessageProducer{

	@Override
	public String messageConvert(String message) {
		// TODO Auto-generated method stub
		return "<html>"+message+"</html>";
	}

}
