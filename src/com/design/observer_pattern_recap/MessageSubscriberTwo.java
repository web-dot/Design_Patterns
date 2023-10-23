package com.design.observer_pattern_recap;

public class MessageSubscriberTwo implements Observer {
	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
	}
}
