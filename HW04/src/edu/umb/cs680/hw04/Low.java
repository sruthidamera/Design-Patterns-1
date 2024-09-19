package edu.umb.cs680.hw04;

public class Low implements State {
	public void IncreaseSpeed(Fan fan) {
		fan.IncreaseVoltage();
		fan.IncreaseCooling();
		fan.changeState(new Medium());
	}
	
	public void DecreaseSpeed(Fan fan) {
		fan.TurnOffVoltage();
		fan.TurnOffCooling();
		fan.changeState(new Off());
	}
	
	public void TurnOff(Fan fan) {
		fan.TurnOffVoltage();
		fan.TurnOffCooling();
		fan.changeState(new Off());
	}
}
