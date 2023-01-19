package edu.asu.diging.tutorial.spring.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ReasonService {
	private static Map<String, String> reasons = new HashMap<String, String>();
	static {
		reasons.put("Happy", "I just saw a unicorn!");
		reasons.put("Sad", "My Unicorn just died :(");
		reasons.put("Frustrated", "I can't get my code to work!");
		reasons.put("Tired", "I just walked for 10 miles!");
		reasons.put("Angry", "My roommate went out without me");
	}

	public String getReason(String feeling) {
		return reasons.get(feeling);
	}
}
