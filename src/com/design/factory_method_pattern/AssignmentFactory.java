package com.design.factory_method_pattern;

public class AssignmentFactory implements ContentFactory {
	@Override
	public ContentType createContent(String id, String title, String description, int duration) {
		boolean isAssignment = false;
		if(duration == 120) {
			isAssignment = true;
		}
		if(isAssignment) {
			return new Assignment(id, title, description, duration);
		}
		return null;
	}
}
