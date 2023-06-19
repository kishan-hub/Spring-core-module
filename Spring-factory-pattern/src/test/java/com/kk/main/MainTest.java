package com.kk.main;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

import com.kk.sdp.IMessageProducer;
import com.kk.sdp.writer.MessageWriter;

public class MainTest {

	@Test
	public void tocheckMethodIsCOnvertedIntohtml() {
	   
		String Inputmsg ="Stratgy methood is Written";
		String outputmsg="<html>"+Inputmsg+"</html>";
		MessageWriter  writer=new MessageWriter();
		IMessageProducer producer=Mockito.mock(IMessageProducer.class);
		when(producer.convertMessage(Inputmsg)).thenReturn(outputmsg);
		
		//when(writer.writeMessage(Inputmsg))
//		
		
		
//		Mockito.mock()
//		Mockito.when(writer.writeMessage(""))
		
		
	}

}
