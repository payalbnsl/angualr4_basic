package com.java.model;

public class Teacher {

	private int id;
	private String name;
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
		if(name==null || name==""){
			throw new RuntimeException();
		}
	}
}
