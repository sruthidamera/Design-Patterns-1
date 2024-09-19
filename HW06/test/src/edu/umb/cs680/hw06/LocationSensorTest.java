package edu.umb.cs680.hw06;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;



class LocationSensorTest {

	@Test
	public void addObserverTest() {
		LocationSensor<Location> lso=new LocationSensor<Location>("41°24'12.2\"N 2°10'26.5\"E");
		TrackerApp ob1=new TrackerApp();
		lso.addObserver(ob1);
		assertEquals(lso.countObservers(),1);
	}
	
	@Test
	public void removeObserverTest() {
		LocationSensor<Location> lso=new LocationSensor<Location>("41°24'12.2\"N 2°10'26.5\"E");
		TrackerApp ob1=new TrackerApp();
		lso.addObserver(ob1);
		assertEquals(lso.countObservers(),1);
		lso.removeObserver(ob1);
		assertEquals(lso.countObservers(),0);
	}
	
	@Test
	public void clearObserversTest() {
		LocationSensor<Location> lso=new LocationSensor<Location>("41°24'12.2\"N 2°10'26.5\"E");
		TrackerApp ob1=new TrackerApp();
		TrackerApp ob2=new TrackerApp();
		lso.addObserver(ob1);
		lso.addObserver(ob2);
		assertEquals(lso.countObservers(),2);
		lso.clearObservers();
		assertEquals(lso.countObservers(),0);
	}
	
	@Test
	public void getObserversTest() {
		LocationSensor<Location> lso=new LocationSensor<Location>("41°24'12.2\"N 2°10'26.5\"E");
		TrackerApp ob1=new TrackerApp();
		TrackerApp ob2=new TrackerApp();
		lso.addObserver(ob1);
		lso.addObserver(ob2);
		
		
		LinkedList<TrackerApp> expectedObservers = new LinkedList<>();
		expectedObservers.add(ob1);
		expectedObservers.add(ob2);
		assertEquals(lso.getObservers(),expectedObservers);
	}
	
	@Test
	public void notifyObserversTest() {
		LocationSensor<Location> lso=new LocationSensor<Location>("41°24'12.2\"N 2°10'26.5\"E");
		TrackerApp ob1=new TrackerApp();
		TrackerApp ob2=new TrackerApp();
		lso.addObserver(ob1);
		lso.addObserver(ob2);
		lso.changeLocation(new Location("37°48'52.2\"N 122°16'31.5\"W"));
		String expectedLocation="37°48'52.2\"N 122°16'31.5\"W";
		assertEquals(expectedLocation,ob1.getLocation());
		assertEquals(expectedLocation,ob2.getLocation());
		
	}
}
