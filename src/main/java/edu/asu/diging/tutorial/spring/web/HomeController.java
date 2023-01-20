package edu.asu.diging.tutorial.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.asu.diging.tutorial.spring.service.MoodService;
import edu.asu.diging.tutorial.spring.service.ReasonService;

@Controller
public class HomeController {

	@Autowired
	private MoodService moodService;

	@Autowired
	private ReasonService reasonService;

	@RequestMapping(value = "/")
	public String home(ModelMap map) {
		map.addAttribute("mood", moodService.getCurrentMood());
		return "home";
	}

	@RequestMapping(value = "/whymood/{feeling}")
	public String whyMood(ModelMap map, @PathVariable("feeling") String feeling) {
		map.addAttribute("feeling", feeling);
		map.addAttribute("moodReason", reasonService.getReason(feeling));
		return "whymood";
	}
}
