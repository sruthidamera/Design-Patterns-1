package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;


import org.junit.jupiter.api.Test;

class NewBidObservableTest {
	
	
	@Test
	public void addObserverTest() {
		NewBidObservable bidObject=new NewBidObservable("diamond",50000f);
		BidderObserver ob1=new BidderObserver();
		bidObject.addObserver(ob1);
		assertEquals(bidObject.countObservers(),1);
	}
	
	@Test
	public void removeObserverTest() {
		NewBidObservable bidObject=new NewBidObservable("diamond",50000f);
		BidderObserver ob1=new BidderObserver();
		bidObject.addObserver(ob1);
		assertEquals(bidObject.countObservers(),1);
		bidObject.removeObserver(ob1);
		assertEquals(bidObject.countObservers(),0);
	}
	
	@Test
	public void clearObserversTest() {
		NewBidObservable bidObject=new NewBidObservable("diamond",50000f);
		BidderObserver ob1=new BidderObserver();
		BidderObserver ob2=new BidderObserver();
		bidObject.addObserver(ob1);
		bidObject.addObserver(ob2);
		assertEquals(bidObject.countObservers(),2);
		bidObject.clearObservers();
		assertEquals(bidObject.countObservers(),0);
	}
	
	@Test
	public void getObserversTest() {
		NewBidObservable bidObject=new NewBidObservable("diamond",50000f);
		BidderObserver ob1=new BidderObserver();
		BidderObserver ob2=new BidderObserver();
		bidObject.addObserver(ob1);
		bidObject.addObserver(ob2);
		
		
		LinkedList<BidderObserver> expectedObservers = new LinkedList<>();
		expectedObservers.add(ob1);
		expectedObservers.add(ob2);
		assertEquals(bidObject.getObservers(),expectedObservers);
	}
	
	@Test
	public void notifyObserversTest() {
		NewBidObservable bidObject=new NewBidObservable("diamond",50000f);
		BidderObserver ob1=new BidderObserver();
		BidderObserver ob2=new BidderObserver();
		AuctioneerObserver ob3=new AuctioneerObserver();
		bidObject.addObserver(ob1);
		bidObject.addObserver(ob2);
		bidObject.addObserver(ob3);
		bidObject.placeBid(80000f);
		assertEquals(80000f,ob1.getBidValue("diamond"));
		assertEquals(80000f,ob2.getBidValue("diamond"));
		assertEquals(80000f,ob3.getBidValue("diamond"));
		
	}
	
	
	
	

}
