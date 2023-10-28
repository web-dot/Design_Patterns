package com.design.factory_method_pattern;

public interface ContentFactory {
	abstract ContentType createContent(String id, String title, String description, int duration);
}
