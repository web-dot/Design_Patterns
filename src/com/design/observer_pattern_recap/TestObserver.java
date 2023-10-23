package com.design.observer_pattern_recap;

public class TestObserver {
	
	public static void main(String[] args) {
		String currentMessage;
		String updatedMessage;
		
		MessagePublisher publisher = new MessagePublisher();
		
		MessageSubscriberOne subscriber1 = new MessageSubscriberOne(publisher);
		
		publisher.add(subscriber1);
		
		
		//CASE 1 - 
		currentMessage = "old message";
		updatedMessage = "new message";
		
		publisher.setMessage(updatedMessage);
		if(!currentMessage.equals(updatedMessage)) {
			publisher.notifyObservers();
		}
		
		for(Observer o : publisher.getObservers()) {
			if(o instanceof MessageSubscriberOne) {
				MessageSubscriberOne sub1 = (MessageSubscriberOne) o;
				System.out.println(sub1.getMessage());
			}
		}
		
	}
}
