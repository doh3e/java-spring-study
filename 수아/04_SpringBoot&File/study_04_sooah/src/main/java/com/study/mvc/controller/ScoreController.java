package com.study.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class ScoreController {

	@GetMapping("/score")
	public String scoreForm() {
		return "score/scoreInput";
	}
	
	@PostMapping("/score-result")
	public String scoreResult(
			@RequestParam("name") String name,
			@RequestParam("korean") Integer korean,
			@RequestParam("english") Integer english,
			@RequestParam("math") Integer math,
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("korean", korean);
		model.addAttribute("english", english);
		model.addAttribute("math", math);
		
		return "score/scoreOutput";
	}
	
}
