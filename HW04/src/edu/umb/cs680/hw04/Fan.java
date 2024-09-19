package edu.umb.cs680.hw04;

public class Fan {
	private State currentState;
	
	public Fan() {
		currentState=new Off();
	}
	
	
	public State getState() {
		return this.currentState;
	}
	
	public void changeState(State newState) {
		this.currentState=newState;
	}
	
	public void IncreaseSpeed() {
		currentState.IncreaseSpeed(this);
	}
	
	public void DecreaseSpeed() {
		currentState.DecreaseSpeed(this);
	}
	
	public void TurnOff() {
		currentState.TurnOff(this);
	}
	
	public void IncreaseVoltage() {
		System.out.println("increase voltage");
	}
	
	public void DecreaseVoltage() {
		System.out.println("decrease voltage");
	}
	
	public void TurnOffVoltage() {
		System.out.println("turn off voltage");
	}
	
	public void IncreaseCooling() {
		System.out.println("increase cooling");
	}
	
	public void DecreaseCooling() {
		System.out.println("decrease cooling");
	}
	
	public void TurnOffCooling() {
		System.out.println("turn off cooling");
		
	}
	

}
