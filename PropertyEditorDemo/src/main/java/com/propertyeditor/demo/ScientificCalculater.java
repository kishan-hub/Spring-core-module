package com.propertyeditor.demo;

public class ScientificCalculater {
	private ComplexNumber complexNumber;
	
	public void setComplexNumber(ComplexNumber complexNumber) {
		this.complexNumber=complexNumber;
	}

	@Override
	public String toString() {
		return "ScientificCalculater [complexNumber=" + complexNumber + "]";
	}
	
}
