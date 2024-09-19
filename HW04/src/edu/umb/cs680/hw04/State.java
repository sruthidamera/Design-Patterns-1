package edu.umb.cs680.hw04;
 
public interface State {
	public void IncreaseSpeed(Fan fan);
	public void DecreaseSpeed(Fan fan);
	public void TurnOff(Fan fan);
}
