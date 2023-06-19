package com.kk.main;

import com.kk.sdp.impl.PdfMessageProducerImpl;
import com.kk.sdp.writer.MessageWriter;

public class Main {
	
	public static void main(String[] args) {
		
		MessageWriter writer =new MessageWriter();
		
		writer.setMessages(new PdfMessageProducerImpl());
		
		writer.writeMessage("Stratgy design pattern is working");
		
	}

}
