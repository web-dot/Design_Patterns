package com.design.factory_method_pattern;

public class QuizFactory implements ContentFactory {
	@Override
	public ContentType createContent(String id, String title, String description, int duration) {
		boolean isQuiz = false;
		if(duration == 20) {
			isQuiz = true;
		}
		if(isQuiz) {
			return new Quiz(id, title, description, duration);
		}
		return null;
	}
}
