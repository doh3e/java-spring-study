package com.ssafy.study_04_hyunjun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MainController {
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("msg", "Hello Boot");
		return "hello";
	}
	
	// scoreinput.jsp로 이동
    @GetMapping("/scoreinput")
    public String showScoreInputPage() {
        return "scoreinput";
    }

    // POST 요청을 받아 데이터를 처리하고 scoreoutput.jsp로 이동
    @PostMapping("/scoreoutput")
    public String processScore(HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        int lang = Integer.parseInt(request.getParameter("lang"));
        int eng = Integer.parseInt(request.getParameter("eng"));
        int math = Integer.parseInt(request.getParameter("math"));


        // Model에 데이터를 추가
        model.addAttribute("name", name);
        model.addAttribute("lang", lang);
        model.addAttribute("eng", eng);
        model.addAttribute("math", math);

        return "scoreoutput"; // scoreoutput.jsp로 이동
    }
	
}