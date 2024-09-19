package edu.umb.cs680.hw05;

import java.util.HashMap;
import java.util.Map;

public class BidderObserver implements Observer<NewBidEvent> {
	
	private Map<String, Float> highestBids=new HashMap<>();
	@Override
	public void update(Observable<NewBidEvent> sender, NewBidEvent event) {
		NewBidEvent nbe = (NewBidEvent) event;
		System.out.println("Bidder Observer:");
		System.out.println("Item name:"+ event.getItemName());
		System.out.println("Bid value:"+event.getBidValue());	
		highestBids.put(event.getItemName(), event.getBidValue());
	}
	
	public float getBidValue(String itemname) {
		return highestBids.get(itemname);
	}

}
