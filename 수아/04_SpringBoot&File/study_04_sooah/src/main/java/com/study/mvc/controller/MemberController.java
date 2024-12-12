package com.study.mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.study.mvc.model.dto.Member;
import com.study.mvc.model.service.MemberService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;





@Controller
public class MemberController {
	
	private final MemberService memberService;
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@GetMapping("/writeMember")
	public String writeMember() {
		return "/member/memberinput";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute Member member) {
		memberService.registerMember(member);
		return "redirect:memberList";
	}
		
	@GetMapping("/memberList")
	public String memberList(Model model) {
		List<Member> members = memberService.getMemberList();
		model.addAttribute("members", members);
		return "/member/memberlist";
	}
	
	@GetMapping("/detail")
	public String detail(@RequestParam("id") int id, Model model) {
		Member member = memberService.readMember(id);
		model.addAttribute("member", member);
		return "/member/memberdetail";
	}
	
	@PostMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		memberService.deleteMemeber(id);
		return "redirect:memberList";
	}
	
	@GetMapping("/updatemember")
	public String updatemember(@RequestParam("id") int id, Model model) {
		model.addAttribute("member", memberService.readMember(id));
		return "member/memberupdate";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute Member member) {
		memberService.updateMember(member);
		return "redirect:detail?id="+member.getId();
	}
	
	
}
