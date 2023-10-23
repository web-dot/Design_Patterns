package com.design.observer_pattern_recap;

public class TestObserver {
	
	public static void main(String[] args) {
		
		// Test the communication between publishers and subscribers
		
		MessageSubscriberOne s1 = new MessageSubscriberOne();
		MessageSubscriberTwo s2 = new MessageSubscriberTwo();
		MessageSubscriberThree s3 = new MessageSubscriberThree();
		
		
		MessagePublisher p = new MessagePublisher();
		
		p.attach(s1);
		p.attach(s2);
		
		p.notifyUpdate(new Message("First message")); // s1 and s2 will receive update
		
		p.detach(s1);
		p.attach(s3);
		
		p.notifyUpdate(new Message("Second message")); // s2 and s3 will receive update
		
		
	}
}
