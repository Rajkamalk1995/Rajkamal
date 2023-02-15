package com.onesoft.oops1;

public class UseCar {
	public static void main(String [] args) {
	Engine e1=new Engine();
	e1.hp=250;
	e1.noOfPistons=4;
	e1.isDiesel=true;
	Engine e2=new Engine();
	e2.hp=400;
	e2.noOfPistons=4;
	e2.isDiesel=false;
	Engine e3=new Engine();
	e3.hp=450;
	e3.noOfPistons=4;
	e3.isDiesel=true;
	
	Car car1=new Car();
	car1.brand="ford";
	car1.price=800000;
	car1.color="blue";
	car1.engine=e1;
	Car car2=new Car();
	car2.brand="Swift";
	car2.price=589404;
	car2.color="black";
	car2.engine=e2;
	Car car3=new Car();
	car3.brand="suzuki";
	car3.price=598890;
	car3.color="blue";
	car3.engine=e3;
	System.out.println(car1.brand+" "+car1.price+" "+car1.color+" "+car1.engine.hp+" "+car1.engine.noOfPistons+" "+car1.engine.isDiesel);
	System.out.println(car2.brand+" "+car2.price+" "+car2.color+" "+car2.engine.hp+" "+car2.engine.noOfPistons+" "+car2.engine.isDiesel);
	System.out.println(car3.brand+" "+car3.price+" "+car3.color+" "+car3.engine.hp+" "+car3.engine.noOfPistons+" "+car3.engine.isDiesel);
	
	}

}
