package edu.umb.cs680.hw16;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw16.NewBidEvent;
import edu.umb.cs680.hw16.NewBidObservable;
import edu.umb.cs680.hw16.Observable;
import edu.umb.cs680.hw16.Observer;

class NewBidObservableTest {
	static Observer<NewBidEvent> BidderObserver;
	static Observer<NewBidEvent> AuctioneerObserver;
	
	@BeforeAll
	public static void setUp() {
		BidderObserver=(Observable<NewBidEvent> sender, NewBidEvent event)->System.out.println("Bidder Observer - Item name:"+ event.getItemName()+", Bid value:"+event.getBidValue());
		AuctioneerObserver=(Observable<NewBidEvent> sender, NewBidEvent event)->System.out.println("Auctioneer Observer - Item name:"+ event.getItemName()+", Bid value:"+event.getBidValue());
		
	}
	
	
	@Test
	public void addObserverTest() {
		NewBidObservable bidObject=new NewBidObservable("diamond",50000f);
		bidObject.addObserver(BidderObserver);
		assertEquals(bidObject.countObservers(),1);
	}
	
	@Test
	public void removeObserverTest() {
		NewBidObservable bidObject=new NewBidObservable("diamond",50000f);
		bidObject.addObserver(BidderObserver);
		assertEquals(bidObject.countObservers(),1);
		bidObject.removeObserver(BidderObserver);
		assertEquals(bidObject.countObservers(),0);
	}
	
	@Test
	public void clearObserversTest() {
		NewBidObservable bidObject=new NewBidObservable("diamond",50000f);
		bidObject.addObserver(BidderObserver);
		bidObject.addObserver(AuctioneerObserver);
		assertEquals(bidObject.countObservers(),2);
		bidObject.clearObservers();
		assertEquals(bidObject.countObservers(),0);
	}
	
	@Test
	public void getObserversTest() {
		NewBidObservable bidObject=new NewBidObservable("diamond",50000f);
		bidObject.addObserver(BidderObserver);
		bidObject.addObserver(AuctioneerObserver);
		LinkedList<Observer> expectedObservers = new LinkedList<>();
		expectedObservers.add(BidderObserver);
		expectedObservers.add(AuctioneerObserver);
		assertEquals(bidObject.getObservers(),expectedObservers);
	}
	
	@Test
	public void notifyObserversTest() {
		NewBidObservable bidObject=new NewBidObservable("diamond",50000f);
		bidObject.addObserver(BidderObserver);
		bidObject.addObserver((Observable<NewBidEvent> sender, NewBidEvent event)->System.out.println("Auctioneer Observer - Item name:"+ event.getItemName()+", Bid value:"+event.getBidValue()));
		bidObject.placeBid(90000f);

		
	}
	
	
	
	

}
