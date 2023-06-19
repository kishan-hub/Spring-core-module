package com.nestedbean.bean;

public class A {
  
	private B b;

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
}
