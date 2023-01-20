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

}
