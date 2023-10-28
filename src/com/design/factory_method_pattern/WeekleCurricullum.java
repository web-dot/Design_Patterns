package com.design.factory_method_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeekleCurricullum {
	
	public static Random random = new Random();
	public static void main(String[] args) {		
		String[] ids = {"A2414", "V9574", "Q1009", "V8179", "A3901","V1047", "Q9097", "A4028"};
		String[] titles = {"env studies", "optics", "organic", "differentials", "inorganic", "limits"};
		String[] dscs = {"fadsfa", "fadsfa", "fadsfa", "fadsfa", "fadsfa", "fadsfa", "fadsfa"};
		int[] durations = {60, 20, 120};
		
		
		
		/**
		 * now for a specific used cases we are getting a bunch of payloads from ui
		 * */
		
		List<RequirementPayload> payloadList = new ArrayList<>();
		RequirementPayload payload1 = new RequirementPayload(ids[0], titles[random.nextInt(titles.length)], dscs[random.nextInt(dscs.length)], durations[2]);
		RequirementPayload payload2 = new RequirementPayload(ids[4], titles[random.nextInt(titles.length)], dscs[random.nextInt(dscs.length)], durations[2]);
		RequirementPayload payload3 = new RequirementPayload(ids[6], titles[random.nextInt(titles.length)], dscs[random.nextInt(dscs.length)], durations[1]);
		RequirementPayload payload4 = new RequirementPayload(ids[1], titles[random.nextInt(titles.length)], dscs[random.nextInt(dscs.length)], durations[0]);
		RequirementPayload payload5 = new RequirementPayload(ids[2], titles[random.nextInt(titles.length)], dscs[random.nextInt(dscs.length)], durations[1]);
		RequirementPayload payload6 = new RequirementPayload(ids[3], titles[random.nextInt(titles.length)], dscs[random.nextInt(dscs.length)], durations[0]);
		payloadList.add(payload1);
		payloadList.add(payload2);
		payloadList.add(payload3);
		payloadList.add(payload4);
		payloadList.add(payload5);
		payloadList.add(payload6);
		/**
		 * we will pass each payload to create the kind of ContentType on runtime
		 * */
		for(RequirementPayload payload : payloadList) {
			ContentFactory factory = null;
			
			if(payload.getId().startsWith("V")) {
				factory = new VideoFactory();
			}
			if(payload.getId().startsWith("A")) {
				factory = new AssignmentFactory();
			}
			if(payload.getId().startsWith("Q")) {
				factory = new QuizFactory();
			}
			
			ContentType content = factory.createContent(payload.getId(), payload.getTitle(), payload.getDescription(), payload.getDuration());

			
			if(content.getId().startsWith("A")) {
				System.out.println("STUDENT NEEDS AN ASSIGNMENT");
			}
			if(content.getId().startsWith("Q")) {
				System.out.println("STUDENT NEEDS A QUIZ");
			}
			if(content.getId().startsWith("V")) {
				System.out.println("STUDENT NEEDS A VIDEO");
			}
		}
		
	}
}
