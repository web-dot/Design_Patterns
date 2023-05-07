package com.design.observer_pattern;

public interface Observable {
	void add(Observer observer);
	void notifyObservers();
}
