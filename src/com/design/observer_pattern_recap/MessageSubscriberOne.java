package com.design.observer_pattern_recap;

public class MessageSubscriberOne implements Observer {
	private MessagePublisher publisher; 
	private String message;
	
	public MessageSubscriberOne(MessagePublisher publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public void update() {
		this.message = publisher.getMessage();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
