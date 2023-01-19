package edu.asu.diging.tutorial.spring.service;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;

@Service
public class MoodService implements MoodInterface {

	private Mood[] moods = new Mood[5];

	@PostConstruct
	public void init() {
		for (int i = 0; i < moods.length; i++) {
			moods[i] = new Mood(moodStrings[i]);
		}
	}

	public Mood getCurrentMood() {
		int randomIndex = new Random().nextInt(moods.length);
		return moods[randomIndex];
	}

	public String getReason(Mood mood) {
		String reason = null;
		switch (mood.getFeeling()) {
		case "Happy":
			reason = "I just rode a unicorn!";
			break;
		case "Sad":
			reason = "My Unicorn just died :(";
			break;
		case "Frustrated":
			reason = "I can't get my code to work!";
			break;
		case "Tired":
			reason = "I just walked for 10 miles!";
			break;
		case "Angry":
			reason = "My roommate went out without me";
			break;
		default:
			reason = "Really no reason at all! I just feel this way today";
		}
		return reason;
	}
}
