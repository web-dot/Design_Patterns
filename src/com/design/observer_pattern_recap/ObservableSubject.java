package com.design.observer_pattern_recap;

public interface ObservableSubject {
	void add(Observer observer);
	void remove(Observer observer);
	void notifyObservers();
}
