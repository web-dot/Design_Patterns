package com.design.observer_pattern_recap;

public class MessageSubscriberOne implements Observer {
	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
	}
}
