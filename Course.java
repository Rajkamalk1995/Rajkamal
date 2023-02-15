package com.onesoft.oops1;

public class Course {
	private int fees;
	private String name;
	private boolean isArts;
public void setFees(int fees) {
	this.fees=fees;
}
public int getFees() {
	return fees;
}
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
	
}
public void setIsArts(boolean isArts) {
	this.isArts=isArts;
	
}
public Course(int fees,String name,boolean isArts) {
	this.fees=fees;
	this.name=name;
	this.isArts=isArts;
}
public String toString() {
	return "Fees="+fees+", Name="+name+", IsArts="+isArts;
}




}