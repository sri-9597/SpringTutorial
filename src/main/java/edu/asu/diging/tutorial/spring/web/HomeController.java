package edu.asu.diging.tutorial.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.asu.diging.tutorial.spring.domain.Mood;
import edu.asu.diging.tutorial.spring.service.MoodService;
@Controller
public class HomeController {
	
	@Autowired
	private MoodService moodService;
	
	private Mood currentMood;
	
	@RequestMapping(value = "/")
	public String home(ModelMap map) {
		currentMood = moodService.getCurrentMood();
		map.addAttribute("mood",currentMood);
	    return "index";
	}
	
	@RequestMapping(value = "whymood")
	public String whyMood(ModelMap map) {
		map.addAttribute("moodReason", moodService.getReason(currentMood));
		return "whymood";
	}
}
