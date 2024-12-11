package com.ssafy.study_04_jieun.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.http.codec.multipart.FilePart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MainController {

	@GetMapping("/")
	public String hello(Model model) {

		model.addAttribute("msg", "hello Boot");

		return "index";
	}

	@GetMapping("/scoreinput")
	public String sinput() {
		return "scoreinput";
	}

	@PostMapping("/scoreoutput")
	public String soutput(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int mat = Integer.parseInt(request.getParameter("mat"));

		int tot = kor + eng + mat;
		double avg = (double) tot / 3;

		String[] grades = { "F", "D", "C", "B", "A" };
		String grade = grades[(int) Math.min(4, avg / 10 - 5)];

		model.addAttribute("name", name);
		model.addAttribute("kor", kor);
		model.addAttribute("eng", eng);
		model.addAttribute("mat", mat);
		model.addAttribute("tot", tot);
		model.addAttribute("avg", String.format("%.1f", avg));
		model.addAttribute("grade", grade);

		return "scoreoutput";
	}

	@GetMapping("/productinput")
	public String pinput() {
		return "productinput";
	}

	@PostMapping("/productoutput")
	public String poutput(@RequestParam("pname") String pname, @RequestParam("category") String pcategory,
			@RequestParam("price") int price, @RequestParam("pfile") MultipartFile pfile, Model model) {

		if (!pfile.isEmpty()) {
			try {
				String filename = pfile.getOriginalFilename();
				String uniqueFilename = UUID.randomUUID().toString() + "_" + filename;

				String uploadDir = System.getProperty("user.dir") + "/uploads/user_image";
				Path uploadPath = Paths.get(uploadDir);
				
				if (!Files.exists(uploadPath)) {
					Files.createDirectories(uploadPath);
				}

				Path filePath = uploadPath.resolve(uniqueFilename);
				pfile.transferTo(filePath.toFile());
				model.addAttribute("msg", "파일이 성공적으로 업로드 되었습니다.");
				model.addAttribute("filename", uniqueFilename);
				
			} catch(Exception e) {
				model.addAttribute("msg", "파일 업로드 중 오류가 발생했습니다.");
				e.printStackTrace();
			}
		}
		
		else {
			model.addAttribute("msg", "파일이 선택되지 않았습니다.");
		}
		
		model.addAttribute("pname", pname);
		model.addAttribute("pcategory", pcategory);
		model.addAttribute("price", price);
		
		return "productoutput";
	}

}
