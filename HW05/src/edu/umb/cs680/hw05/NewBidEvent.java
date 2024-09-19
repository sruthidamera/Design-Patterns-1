package edu.umb.cs680.hw05;

public class NewBidEvent{
	private String itemName;
	private float bidValue;
	
	NewBidEvent(String itemName,float bidValue){
		this.itemName=itemName;
		this.bidValue=bidValue;
	}
	
	
	public String getItemName() {
		return this.itemName;
	}
	
	public float getBidValue() {
		return this.bidValue;
	}
	
}
