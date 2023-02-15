package com.onesoft.oops1;

public class UseCollege {
	public static void main(String[] args) {
		Course c1=new Course(45000,"B.Sc",true);
		Course c2=new Course(50000,"B.com",false);
		Course c3=new Course(70000,"B.A",false);
		College cl1=new College("sakthi",184,"adayar",c1);
		College cl2=new College("Srm",1843,"perungalathur",c2);
		College cl3=new College("Rmk",3577,"vandalur",c3);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(cl1);
		System.out.println(cl2);
		System.out.println(cl3);
	}
	

}
