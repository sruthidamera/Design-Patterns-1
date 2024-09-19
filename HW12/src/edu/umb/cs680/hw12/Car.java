package edu.umb.cs680.hw12;

import java.util.List;

public class Car {
	private String make, model;
	 private int mileage, year;
	 private float price; 
	 private int dominationCount;
	 
	 public Car(String make, String model,int mileage,int year,float price) {
		 this.make=make;
		 this.model=model;
		 this.mileage=mileage;
		 this.year=year;
		 this.price=price;
		 this.dominationCount=0;
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
	 public void setDominationCount(List<Car> Cars) {
		 for (Car car : Cars) {
	            if (this != car && dominates(car)) {
	                this.dominationCount++;
	            }
	        } 
	 }
	 
	 public boolean dominates(Car car) {
		 	return ((this.price <= car.getPrice() && this.year <= car.getYear() && this.mileage <= car.getMileage()) 
		 			&&(this.price < car.getPrice() || this.year < car.getYear() || this.mileage < car.getMileage()));
	 }
	 
	 public int getDominationCount() {
		 return dominationCount;
	 }
	 
	 
	 
}

