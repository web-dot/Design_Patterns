package com.design.observer_pattern;

public class GenericDisplay implements Observer {
	private WeatherStation station;
	private int temperature;
	public GenericDisplay(WeatherStation station) {
		this.station = station;
	}
	
	@Override
	public void update() {
		this.temperature = station .getTemperature();
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	
}
