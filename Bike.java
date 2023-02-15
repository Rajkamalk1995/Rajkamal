package com.onesoft.oops1;

public class Bike {
	private String brand;
	private int price;
	private String model;
	private boolean isElectric;
	public void setBrand(String brand) {
		this.brand=brand;
		
	}
	public String getBrand() {
		return brand;
		
	}
	public void setPrice(int price) {
		this.price=price;
		
	}
	public int getPrice() {
		return price;
		
	}
	public void setModel(String model ) {
		this.model=model;
		
	}
	public String getModel() {
		return model;
		
	}
	public void setIsElectric(boolean isElectric) {
		this.isElectric=isElectric;
		
	}
	public boolean getIsElectric() {
		return isElectric;
	}

}
