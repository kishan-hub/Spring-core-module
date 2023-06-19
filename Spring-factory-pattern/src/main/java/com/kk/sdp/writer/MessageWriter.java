package com.kk.sdp.writer;

import com.kk.sdp.IMessageProducer;

public class MessageWriter {
	
	private IMessageProducer messages;
	
	
	public void writeMessage(String msg) {
		
		msg =messages.convertMessage(msg);
		System.out.println(msg);
	}
	
	public IMessageProducer getMessages() {
		return messages;
	}
	
	public void setMessages(IMessageProducer messages) {
		this.messages = messages;
	}
	
}
