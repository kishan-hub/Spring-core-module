package com.propertyeditor.demo;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class Student {
  
	private int id;
	
	private String name;
	
	private Date dob;
	
	private int[] marks;
	
	private File file;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob + ", marks=" + Arrays.toString(marks) + ", file="
				+ file + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {     
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
	
}
