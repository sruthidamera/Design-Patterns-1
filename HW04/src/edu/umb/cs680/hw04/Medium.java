package edu.umb.cs680.hw04;

public class Medium implements State  {
	public void IncreaseSpeed(Fan fan) {
		fan.IncreaseVoltage();
		fan.IncreaseCooling();
		fan.changeState(new High());
	}
	
	public void DecreaseSpeed(Fan fan) {
		fan.DecreaseVoltage();
		fan.DecreaseCooling();
		fan.changeState(new Low());
	}
	
	public void TurnOff(Fan fan) {
		fan.TurnOffVoltage();
		fan.TurnOffCooling();
		fan.changeState(new Off());
	}
}
