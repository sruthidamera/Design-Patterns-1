package edu.umb.cs680.hw04;

public class High implements State  {
	public void IncreaseSpeed(Fan fan) {
		
	}
	
	public void DecreaseSpeed(Fan fan) {
		fan.DecreaseVoltage();
		fan.DecreaseCooling();
		fan.changeState(new Medium());
	}
	
	public void TurnOff(Fan fan) {
		fan.TurnOffVoltage();
		fan.TurnOffCooling();
		fan.changeState(new Off());
	}
}
