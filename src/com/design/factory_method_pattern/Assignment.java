package com.design.factory_method_pattern;

public class Assignment extends ContentType {
	private int duration;
	public Assignment(String id, String title, String description, int duration) {
		super(id, title, description);
		this.duration = duration;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
