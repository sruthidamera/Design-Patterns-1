package edu.umb.cs680.hw03;

public class Car {
	private String make, model;
	 private int mileage, year;
	 private float price; 
	 
	 public Car(String make, String model,int mileage,int year,float price) {
		 this.make=make;
		 this.model=model;
		 this.mileage=mileage;
		 this.year=year;
		 this.price=price;
	 }
	 
	 public String getMake() {
		 return this.make;
	 }
	 public String getModel() {
		 return this.model;
	 }
	 public int getMileage() {
		 return this.mileage;
	 }
	 public int getYear() {
		 return this.year;
	 }
	 public float getPrice() {
		 return this.price;
	 }
	 
}

