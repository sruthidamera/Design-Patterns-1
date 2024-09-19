package edu.umb.cs680.hw05;

public class NewBidObservable extends Observable<NewBidEvent>{
	
	private String itemName;
	private float currentBid;
	
	NewBidObservable(String itemName, float intialBid){
		this.itemName=itemName;
		this.currentBid=intialBid;
	}
	
	public void placeBid(float newBidValue) {
		if(newBidValue>currentBid) {
			currentBid=newBidValue;
			this.notifyObservers(new NewBidEvent(this.itemName,newBidValue));
		}
	}
	
	

}
