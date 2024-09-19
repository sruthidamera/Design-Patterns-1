package edu.umb.cs680.hw04;

public class Off implements State {
	
	public void IncreaseSpeed(Fan fan) {
		fan.IncreaseVoltage();
		fan.IncreaseCooling();
		fan.changeState(new Low());
	}
	
	public void DecreaseSpeed(Fan fan) {
		
	}
	
	public void TurnOff(Fan fan) {
		
	}

}
