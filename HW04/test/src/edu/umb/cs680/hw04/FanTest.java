package edu.umb.cs680.hw04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FanTest {
	
    
    @Test
    public void IntialStateMustBeInOffState() {
    	Fan fan= new Fan();
    	System.out.println(fan.getState());
    	assertTrue(fan.getState() instanceof Off);
    }
    
    @Test
    public void IncreaseSpeedInOffStateChangesToLowState() {
    	Fan fan= new Fan();
    	fan.IncreaseSpeed();
    	assertTrue(fan.getState() instanceof Low);
    }
    
    @Test
    public void DecreaseSpeedInOffStateChangesToOffState() {
    	Fan fan= new Fan();
    	fan.DecreaseSpeed();
    	assertTrue(fan.getState() instanceof Off);
    }
    
    @Test
    public void TurnOffInOffStateDoesNotChangeState() {
    	Fan fan= new Fan();
    	fan.TurnOff();
    	assertTrue(fan.getState() instanceof Off);
    }
    

    @Test
    public void IncreaseSpeedInLowStateChangesToMediumState() {
    	Fan fan= new Fan();
    	fan.changeState(new Low());
    	fan.IncreaseSpeed();
    	assertTrue(fan.getState() instanceof Medium);
    }
    
    @Test
    public void DecreaseSpeedInLowStateChangesToOffState() {
    	Fan fan= new Fan();
    	fan.changeState(new Low());
    	fan.DecreaseSpeed();
    	assertTrue(fan.getState() instanceof Off);
    }
    
    @Test
    public void TurnOffInLowStateChangesToOffState() {
    	Fan fan= new Fan();
    	fan.changeState(new Low());
    	fan.TurnOff();
    	assertTrue(fan.getState() instanceof Off);
    }
    
    
    @Test
    public void IncreaseSpeedInMediumStateChangesToHighState() {
    	Fan fan= new Fan();
    	fan.changeState(new Medium());
    	fan.IncreaseSpeed();
    	assertTrue(fan.getState() instanceof High);
    }
    
    @Test
    public void DecreaseSpeedInMediumStateChangesToLowState() {
    	Fan fan= new Fan();
    	fan.changeState(new Medium());
    	fan.DecreaseSpeed();
    	assertTrue(fan.getState() instanceof Low);
    }
    
    @Test
    public void TurnOffInMediumStateChangesToOffState() {
    	Fan fan= new Fan();
    	fan.changeState(new Medium());
    	fan.TurnOff();
    	assertTrue(fan.getState() instanceof Off);
    }
    
    
    @Test
    public void IncreaseSpeedInHighStateDoesNotChangeState() {
    	Fan fan= new Fan();
    	fan.changeState(new High());
    	fan.IncreaseSpeed();
    	assertTrue(fan.getState() instanceof High);
    }
    
    @Test
    public void DecreaseSpeedInHighStateChangesToMediumState() {
    	Fan fan= new Fan();
    	fan.changeState(new High());
    	fan.DecreaseSpeed();
    	assertTrue(fan.getState() instanceof Medium);
    }
    
    @Test
    public void TurnOffInHighStateChangesToOffState() {
    	Fan fan= new Fan();
    	fan.changeState(new High());
    	fan.TurnOff();
    	assertTrue(fan.getState() instanceof Off);
    }
    

}
