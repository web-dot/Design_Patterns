package com.design.observer_pattern_recap;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {
	
	List<Observer> observers = new ArrayList<>();
	
	@Override
	public void attach(Observer o) {
		observers.add(o);
	}
	
	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}
	
	@Override
	public void notifyUpdate(Message m) {
		for(Observer o : observers) {
			o.update(m);
		}
	}
	
}
