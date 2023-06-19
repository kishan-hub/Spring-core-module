package com.kk.sdp.factory;

import com.kk.sdp.IMessageProducer;
import com.kk.sdp.impl.HtmlMessageProducerImpl;
import com.kk.sdp.impl.PdfMessageProducerImpl;

public class MessageProducerFactory {
	
	public static IMessageProducer createMessage(String type) {
		 
		IMessageProducer messageProducer=null;
		
		if(type.equals("html")){
			messageProducer =new HtmlMessageProducerImpl();
		}else if(type.equals("pdf")) {
			messageProducer=new PdfMessageProducerImpl();
		}else {
			System.out.println("Object not found "+messageProducer);
		}
		return messageProducer;
		
	}

}
