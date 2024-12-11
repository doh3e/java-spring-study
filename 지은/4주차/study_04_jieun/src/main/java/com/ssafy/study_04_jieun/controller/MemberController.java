package com.ssafy.study_04_jieun.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ssafy.study_04_jieun.model.dto.Member;
import com.ssafy.study_04_jieun.model.service.MemberService;

@Controller
public class MemberController {

	private MemberService memberService;

	@Autowired
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	@GetMapping("/memberlist")
	public String list(Model model) {
		List<Member> members = memberService.getMemberList();
		model.addAttribute("members", members);
		return "/member/memberlist";
	}

	@GetMapping("/memberdetail")
	public String detail(@RequestParam("id") int id, Model model) {
		Member member = memberService.readMember(id);
		model.addAttribute("member", member);
		return "member/memberdetail";
	}

	@GetMapping("/memberinput")
	public String minput() {
		return "/member/memberinput";
	}

	@PostMapping("/inputsave")
	public String inputsave(@ModelAttribute Member member, @RequestParam("profile_image") MultipartFile file,
			Model model) throws IOException {

		int year = LocalDate.now().getYear();
		String jumin = member.getJumin();
		String byear = jumin.substring(0, 2);
		String sex = jumin.substring(7, 8);
		if (sex.equals("1") || sex.equals("2")) {
			byear = "19" + byear;
		} else {
			byear = "20" + byear;
		}

		member.setAge(year - Integer.parseInt(byear));

		if (!file.isEmpty()) {
			String uploadDir = System.getProperty("user.dir") + "/uploads/user_image";
			Path uploadPath = Paths.get(uploadDir);

			if (!Files.exists(uploadPath)) {
				Files.createDirectories(uploadPath);
			}

			String originalFilename = file.getOriginalFilename();
			String uniqueFilename = UUID.randomUUID() + "_" + originalFilename;

			try {
			    Path filePath = uploadPath.resolve(uniqueFilename);
			    file.transferTo(filePath);
				member.setProfileImage(uniqueFilename);
			} catch (IOException e) {
				e.printStackTrace();
				model.addAttribute("message", "파일 업로드 중 오류가 발생했습니다.");
				return "error";
			}
		}

		memberService.addMember(member);

		return "redirect:/";
	}
	
	// 유저 삭제
	@PostMapping("/memberdelete")
	public String detail(@RequestParam("id") int id) {
		memberService.deleteMember(id);
		return "redirect:memberlist";
	}
	
	// 유저 수정 폼 불러오기
	@GetMapping("/memberedit")
	public String editform(@RequestParam("id") int id, Model model) {
		Member member = memberService.readMember(id);
		model.addAttribute("member", member);
		return "/member/memberedit";
	}
	
	@PostMapping("/editsave")
	public String editsave(@ModelAttribute Member member, @RequestParam("profile_image") MultipartFile file,
			@RequestParam("currentProfileImage") String currentProfileImage, Model model) throws IOException {
		
		System.out.println("수정 요청 받은 회원 정보:");
		System.out.println("ID: " + member.getId());
		System.out.println("Name: " + member.getName());
		System.out.println("Jumin: " + member.getJumin());
		System.out.println("Age: " + member.getAge());
		System.out.println("Phone: " + member.getPhone());
		System.out.println("Address: " + member.getAddress());
		System.out.println("Profile Image: " + member.getProfileImage());
		
		int year = LocalDate.now().getYear();
		String jumin = member.getJumin();
		String byear = jumin.substring(0, 2);
		String sex = jumin.substring(7, 8);
		if (sex.equals("1") || sex.equals("2")) {
			byear = "19" + byear;
		} else {
			byear = "20" + byear;
		}

		member.setAge(year - Integer.parseInt(byear));

		if (!file.isEmpty()) {
			String uploadDir = System.getProperty("user.dir") + "/uploads/user_image";
			Path uploadPath = Paths.get(uploadDir);

			if (!Files.exists(uploadPath)) {
				Files.createDirectories(uploadPath);
			}

			String originalFilename = file.getOriginalFilename();
			String uniqueFilename = UUID.randomUUID() + "_" + originalFilename;

			try {
			    Path filePath = uploadPath.resolve(uniqueFilename);
			    file.transferTo(filePath);
				member.setProfileImage(uniqueFilename);
			} catch (IOException e) {
				e.printStackTrace();
				model.addAttribute("message", "파일 업로드 중 오류가 발생했습니다.");
				return "error";
			}
		}
		else {
			member.setProfileImage(currentProfileImage);
		}

		memberService.editMember(member);
		
		return "redirect:memberlist";
	}
	
}
