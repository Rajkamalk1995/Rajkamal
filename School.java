package com.onesoft.oops1;

public class School {
	private String name;
	private int noOfStudents;
	private int fees;
	private String location;
	private boolean isSecondary;
	public School(String name,int noOfStudents,int fees, String location, boolean isSecondary) {
		this.name=name;
		this.noOfStudents=noOfStudents;
		this.fees=fees;
		this.location=location;
		this.isSecondary=isSecondary;
		
	}


public String toString() {
	return "Name="+name+", noOfStudents="+noOfStudents+", fees="+fees+", location="+location+", isSecondary="+isSecondary;
}
}

