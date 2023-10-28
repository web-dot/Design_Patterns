package com.design.factory_method_pattern;

public class VideoFactory implements ContentFactory {
	@Override
	public ContentType createContent(String id, String title, String description, int duration) {
		boolean isVideo = false;
		if(duration == 60) {
			isVideo = true;
		}
		if(isVideo) {
			return new Video(id, title, description, duration);
		}
		return null;
	}
}
