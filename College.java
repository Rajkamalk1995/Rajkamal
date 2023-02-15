package com.onesoft.oops1;

public class College {
	private String name;
	private int noOfStudents;
	private String locations;
	private Course course;


public void SetName(String name) {
	this.name=name;
	
}
public String getName() {
	return name;
}
public void setNoOfStudents(int noOfStudents) {
	this.noOfStudents=noOfStudents;
}
public int getNoOfStudents() {
	return noOfStudents;
	
}
public void setLocations(String locations) {
	this.locations=locations;
}
public String getLocations() {
	return locations;
	
}
public void setCourse(Course course) {
	this.course=course;
}
public Course getCourse() {
	return course;
}
public College(String name,int noOfStudents,String locations,Course course) {
	this.name=name;
	this.noOfStudents=noOfStudents;
	this.locations=locations;
	this.course=course;
	
}
public String toString() {
	return "Name="+name+", NoOfStudents="+noOfStudents+", Locations="+locations+", "+course;
	
}



}