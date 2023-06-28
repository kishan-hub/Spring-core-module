package com.propertyeditor.demo;

import java.beans.PropertyEditorSupport;

public class ComplexNumberPropertyEditor  extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String value) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		int base=0;
		int expo=0;
		String[] token=null;
		ComplexNumber complexNumber=null;
		
		token=value.split(",");
		base=Integer.parseInt(token[0]);
		expo=Integer.parseInt(token[1]);
		
		complexNumber =new ComplexNumber();
		complexNumber.setBase(base);
		complexNumber.setExpo(expo);
		setValue(complexNumber);
		
	}

}
