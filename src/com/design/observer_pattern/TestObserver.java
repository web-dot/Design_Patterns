package com.design.observer_pattern;

public class TestObserver {
	
	public static void main(String[] args) {
		
		int currentTemp; 
		int updatedTemp;
		
		WeatherStation station = new WeatherStation();
		
		PhoneDisplay o1 = new PhoneDisplay(station);
		GenericDisplay o2 = new GenericDisplay(station);
		ReportDownload o3 = new ReportDownload(station);
		
		station.add(o1);
		station.add(o2);
		station.add(o3);
		
		//CASE I
		currentTemp = 37;
		updatedTemp = 39;
		
		station.setTemperature(updatedTemp);
		
		// trigger when temperature changes
		if(currentTemp != updatedTemp) {
			station.notifyObservers();
		}
		
		System.out.println("fone-display temperature 	: " + o1.getTemperature());
		System.out.println("generic-display temperature 	: " + o2.getTemperature());
		System.out.println("temperature in report 		: " + o3.getTemperature());
		
		
	}
}
