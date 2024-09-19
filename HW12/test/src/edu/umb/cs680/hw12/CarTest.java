package edu.umb.cs680.hw12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw12.Car;

class CarTest {
	
	
	private String[] carToStringArray( Car c ){
		 String[] carInfo = { c.getMake(),c.getModel(),
		Integer.toString(c.getYear())};
		 return carInfo;
		}
	@Test
	public void verifyCarEqualityWithMakeModelYear() {
	
	String[] expected = {"Toyota", "RAV4", "2018"};
	Car actual = new Car("Toyota", "RAV4",53, 2018,31.5f);
	assertArrayEquals(expected,carToStringArray(actual) );
	
	}
}
