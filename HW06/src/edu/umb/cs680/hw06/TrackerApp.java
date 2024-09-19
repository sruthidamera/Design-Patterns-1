package edu.umb.cs680.hw06;



public class TrackerApp implements LocationObserver<Location>,StepCountObserver<StepCount>{
	
	String CurrentLocation;
	int StepsCount;

	@Override
	public void updateStepCount(StepCounter<StepCount> sender, StepCount event) {
		
		System.out.println("Step Count updated");
		System.out.println("Step Count:"+event.getCount());
		StepsCount=event.getCount();
		
	}

	@Override
	public void updateLocation(LocationSensor<Location> sender, Location event) {
		System.out.println("Location updated");
		System.out.println("Location:"+event.getCurrentLocation());
		CurrentLocation=event.getCurrentLocation();
	}
	
	public String getLocation() {
		return this.CurrentLocation;
	}
	
	public int getStepsCount() {
		return this.StepsCount;
	}
	

}
