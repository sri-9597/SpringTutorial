package edu.asu.diging.tutorial.spring.service;

import edu.asu.diging.tutorial.spring.domain.Mood;

public interface MoodInterface {
	
	String[] moodStrings = { "Happy", "Sad", "Frustrated", "Tired", "Angry" };

	public Mood getCurrentMood();
	
	public String getReason(Mood mood);
	
}
