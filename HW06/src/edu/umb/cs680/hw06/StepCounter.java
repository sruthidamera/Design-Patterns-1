package edu.umb.cs680.hw06;

import java.util.LinkedList;
import java.util.List;

public class StepCounter<T> {
	int countValue;
	private LinkedList<StepCountObserver<T>> observers = new LinkedList<>();
	
	StepCounter(int countValue){
		this.countValue=countValue;
	}

	
	public void addObserver(StepCountObserver<T> o) {
		observers.add(o);
	}

	public void clearObservers() {
		observers.clear();
		
	}
	public List<StepCountObserver<T>> getObservers(){
		return observers;
	}
	
	public int countObservers() {
		return observers.size();
		
	}
	public void removeObserver(StepCountObserver<T> o) {
		observers.remove(o);
	}

	public void notifyObservers(T event) {
		observers.forEach( (observer)->{observer.updateStepCount(this, event);} );
	}
	
	public void changeCount(T newCounter){
        countValue=((StepCount)newCounter).getCount();
        notifyObservers(newCounter);
    }
}
