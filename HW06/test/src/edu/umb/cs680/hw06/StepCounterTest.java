package edu.umb.cs680.hw06;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class StepCounterTest {

	@Test
	public void addObserverTest() {
		StepCounter<StepCount> sco=new StepCounter<StepCount>(2);
		TrackerApp ob1=new TrackerApp();
		sco.addObserver(ob1);
		assertEquals(sco.countObservers(),1);
	}
	
	@Test
	public void removeObserverTest() {
		StepCounter<StepCount> sco=new StepCounter<StepCount>(2);
		TrackerApp ob1=new TrackerApp();
		sco.addObserver(ob1);
		assertEquals(sco.countObservers(),1);
		sco.removeObserver(ob1);
		assertEquals(sco.countObservers(),0);
	}
	
	@Test
	public void clearObserversTest() {
		StepCounter<StepCount> sco=new StepCounter<StepCount>(2);
		TrackerApp ob1=new TrackerApp();
		TrackerApp ob2=new TrackerApp();
		sco.addObserver(ob1);
		sco.addObserver(ob2);
		assertEquals(sco.countObservers(),2);
		sco.clearObservers();
		assertEquals(sco.countObservers(),0);
	}
	
	@Test
	public void getObserversTest() {
		StepCounter<StepCount> sco=new StepCounter<StepCount>(2);
		TrackerApp ob1=new TrackerApp();
		TrackerApp ob2=new TrackerApp();
		sco.addObserver(ob1);
		sco.addObserver(ob2);
		
		
		LinkedList<TrackerApp> expectedObservers = new LinkedList<>();
		expectedObservers.add(ob1);
		expectedObservers.add(ob2);
		assertEquals(sco.getObservers(),expectedObservers);
	}
	
	@Test
	public void notifyObserversTest() {
		StepCounter<StepCount> sco=new StepCounter<StepCount>(2);
		TrackerApp ob1=new TrackerApp();
		TrackerApp ob2=new TrackerApp();
		sco.addObserver(ob1);
		sco.addObserver(ob2);
		sco.changeCount(new StepCount(3));
		int expectedCount=3;
		assertEquals(expectedCount,ob1.getStepsCount());
		assertEquals(expectedCount,ob2.getStepsCount());
		
}

}
