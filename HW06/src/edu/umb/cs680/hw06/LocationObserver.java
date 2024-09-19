package edu.umb.cs680.hw06;


public interface LocationObserver<T> {
	public void updateLocation(LocationSensor<T> sender, T event);
}

