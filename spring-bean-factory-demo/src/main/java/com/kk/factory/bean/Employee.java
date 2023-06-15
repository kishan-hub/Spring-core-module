package com.kk.factory.bean;

public class Employee {
    
	private int employeId;
	
	private String name;
	
	private String department;

	@Override
	public String toString() {
		return "Employee [employeId=" + employeId + ", name=" + name + ", department=" + department + "]";
	}
	public int getEmployeId() {
		return employeId;
	}

	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
