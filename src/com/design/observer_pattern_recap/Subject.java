package com.design.observer_pattern_recap;

public interface Subject {
	void attach(Observer o);
	void detach(Observer o);
	void notifyUpdate(Message m);
}
