package com.design.observer_pattern;

import java.util.ArrayList;
import java.util.List;


public class WeatherStation implements Observable {
	private int temperature;
	List<Observer> observers = new ArrayList<>();
	
	@Override
	public void add(Observer observer) {
		this.observers.add(observer);
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

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}
	
	
	
	
}
