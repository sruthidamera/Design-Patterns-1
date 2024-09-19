package edu.umb.cs680.hw06;


public interface StepCountObserver<T> {
	public void updateStepCount(StepCounter<T> sender, T event);
}