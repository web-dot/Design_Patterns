package com.design.observer_pattern_recap;

// This must be an immutable object, so no class can modify its state by chance
public class Message {
	final String messageContent;
	
	public Message(String message) {
		this.messageContent = message;
	}

	public String getMessageContent() {
		return messageContent;
	}
	
}
