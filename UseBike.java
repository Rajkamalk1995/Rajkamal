package com.onesoft.oops1;

public class UseBike {
	public static void main(String[] args) {
		Bike bike1=new Bike();
		bike1.setBrand("yamaha");
		bike1.setPrice(300000);
		bike1.setModel("zr");
		bike1.setIsElectric(false);
		Bike bike2=new Bike();
		bike2.setBrand("ninja");
		bike2.setPrice(200000);
		bike2.setModel("v3");
		bike2.setIsElectric(false);
		Bike bike3=new Bike();
		bike3.setBrand("R15");
		bike3.setPrice(150000);
		bike3.setModel("fg");
		bike3.setIsElectric(true);
		Bike [] b= {bike1,bike2,bike3};
		for(Bike x:b) {
			System.out.println(x.getBrand()+" "+x.getPrice()+" "+x.getModel()+" "+x.getIsElectric());
		}
		for(Bike x:b) {
			System.out.println(x.getBrand());
		}
		
	}

}
