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

		
		
		// CASE I - Temperature rises
		currentTemp = 37;
		updatedTemp = 39;
		System.out.println("current temperature is :" + currentTemp);
		System.out.println("temperature changes and becomes :" + updatedTemp);
		
		station.setTemperature(updatedTemp);

		System.out.println("A trigger will call the notifyObservers() on the Observable.");
		System.out.println();
		// trigger when temperature changes
		if (currentTemp != updatedTemp) {
			station.notifyObservers();
			currentTemp = updatedTemp;
		}

		
		for (Observer o : station.getObservers()) {
			if (o instanceof PhoneDisplay) {
				PhoneDisplay pd = (PhoneDisplay) o;
				System.out.println("fone-display temperature 	: " + pd.getTemperature());
			}

			if (o instanceof GenericDisplay) {
				GenericDisplay gd = (GenericDisplay) o;
				System.out.println("generic-display temperature 	: " + gd.getTemperature());
			}

			if (o instanceof ReportDownload) {
				ReportDownload rd = (ReportDownload) o;
				System.out.println("temperature in report 		: " + rd.getTemperature());
			}
		}

		System.out.println();
		System.out.println("when a `Observer` is not required, it is removed on call to observer.remove():");
		System.out.println();

		// remove a observer
		station.remove(o3);

		// CASE II - Temperature becomes normal
		updatedTemp = 37;
		
		System.out.println("current temparuture is :" + currentTemp);
		System.out.println("temparuture becomes normal again :" + updatedTemp);
		
		station.setTemperature(updatedTemp);
		
		System.out.println("notifyObservers() is called again on the Observable.");
		System.out.println();
		// trigger when temperature changes
		if (currentTemp != updatedTemp) {
			station.notifyObservers();
			currentTemp = updatedTemp;
		}

		for (Observer o : station.getObservers()) {
			if (o instanceof PhoneDisplay) {
				PhoneDisplay pd = (PhoneDisplay) o;
				System.out.println("fone-display temperature 	: " + pd.getTemperature());
			}

			if (o instanceof GenericDisplay) {
				GenericDisplay gd = (GenericDisplay) o;
				System.out.println("generic-display temperature 	: " + gd.getTemperature());
			}

			if (o instanceof ReportDownload) {
				ReportDownload rd = (ReportDownload) o;
				System.out.println("temperature in report 		: " + rd.getTemperature());
			}
		}
		
		System.out.println();
		System.out.println("The the observer that was removed no longer exists,");
		System.out.println("and all the other Observers display the updated temperature.");
	}
}

/**
 * CONSOLE OUTPUT:
 * 
 * current temperature is :37
 * temperature changes and becomes :39
 * A trigger will call the notifyObservers() on the Observable.
 * 
 * fone-display temperature 	: 39
 * generic-display temperature 	: 39
 * temperature in report 		: 39
 * 
 * when a `Observer` is not required, it is removed on call to observer.remove():
 * 
 * current temperature is :39
 * temperature becomes normal again :37
 * notifyObservers() is called again on the Observable.
 * 
 * fone-display temperature 	: 37
 * generic-display temperature 	: 37
 * 
 * The the observer that was removed no longer exists,
 * and all the other Observers display the updated temperature.
 * 
 * */

