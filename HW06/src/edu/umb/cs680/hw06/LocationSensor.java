package edu.umb.cs680.hw06;

import java.util.LinkedList;
import java.util.List;

public class LocationSensor<T> {
	
	String Location;
	
	private LinkedList<LocationObserver<T>> observers = new LinkedList<>();
	
	LocationSensor(String Location){
		this.Location=Location;
	}

	
	public void addObserver(LocationObserver<T> o) {
		observers.add(o);
	}

	public void clearObservers() {
		observers.clear();
	}
	public List<LocationObserver<T>> getObservers(){
		return observers;
	}
	
	public int countObservers() {
		return observers.size();
		
	}
	public void removeObserver(LocationObserver<T> o) {
		observers.remove(o);
	}

	public void notifyObservers(T event) {
		observers.forEach( (observer)->{observer.updateLocation(this, event);} );
	}
	public void changeLocation(T newLocation){
        Location=((Location) newLocation).getCurrentLocation();
        notifyObservers(newLocation);
    }
    

}
