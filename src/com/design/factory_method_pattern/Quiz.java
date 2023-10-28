package com.design.factory_method_pattern;

public class Quiz extends ContentType {
	private int duration;
	public Quiz(String id, String title, String description, int duration) {
		super(id, title, description);
		this.duration = duration;
	}
	public int getPassingScore() {
		return duration;
	}
	public void setPassingScore(int duration) {
		this.duration = duration;
	}
}
