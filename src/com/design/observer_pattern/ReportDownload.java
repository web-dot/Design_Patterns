package com.design.observer_pattern;

public class ReportDownload implements Observer {
	private WeatherStation station;
	private int temperature;
	public ReportDownload(WeatherStation station) {
		this.station = station;
	}
	
	@Override
	public void update() {
		this.temperature = this.station.getTemperature();
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	
}
