package com.design.observer_pattern;

public class PhoneDisplay implements Observer {
	private WeatherStation station;
	private int temperature;
	public PhoneDisplay(WeatherStation station) {
		this.station = station;
	}
	
	@Override
	public void update() {
		this.temperature = station.getTemperature(); 
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	
}
