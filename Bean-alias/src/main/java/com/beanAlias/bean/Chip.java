package com.beanAlias.bean;

public class Chip {
	
	private int id;
	
	private String type;

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Chip [id=" + id + ", type=" + type + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
