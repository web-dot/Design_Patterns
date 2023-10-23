package com.design.observer_pattern_recap;

public class MessageSubscriberThree implements Observer {
	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberThree :: " + m.getMessageContent());
	}
}
