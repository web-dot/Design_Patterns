package com.design.observer_pattern_recap;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements ObservableSubject {
	private String message;
	private List<Observer> observers = new ArrayList<>();
	
	@Override
	public void add(Observer observer) {
		observers.add(observer);
	}
	
	@Override
	public void remove(Observer observer) {
		observers.remove(observer);
	}
	
	@Override
	public void notifyObservers() {
		for(Observer o : observers) {
			o.update();
		}
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}
	
	
}
