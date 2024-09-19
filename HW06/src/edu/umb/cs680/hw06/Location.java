package edu.umb.cs680.hw06;

public class Location {
	

	String coordinates;
	
	Location(String Location){
		this.coordinates=Location;
	}
	
	public String getCurrentLocation(){
		return this.coordinates;
	}
}
