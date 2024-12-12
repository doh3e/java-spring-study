package com.study.mvc.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class ProductController {
	// ResourceLoader 인터페이스 : 
	// - 스프링에서 파일, 클래스 등의 리소스를 로드할 때 사용 
	
	// 방식1 
	// - annotation으로 ResourceLoader 객체를 필드에 직접 주입
//		@Autowired
//		private ResourceLoader resourceLoader;
	
	// 방식2
	// - 생성자로 의존성 주입
	// - Spring 컨테이너가 ResourceLoader를 자동으로 주입하여 생성자를 호출
	private ResourceLoader resourceLoader;
	public ProductController(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	
	@GetMapping("/product")
	public String productForm() {
		return "product/productinput";
	}
	
	@PostMapping("/productInput")
	public String productDataUpload(
			@RequestParam("name") String name,
			@RequestParam("price") int price,
			@RequestParam("category") String category,
			@RequestParam("files") MultipartFile[] files,
			Model model) throws IllegalStateException, IOException {
		
        List<String> fileNames = new ArrayList<>();
		// 파일이 있는지 검사 
		if (files != null && files.length > 0) {
			for (MultipartFile file: files){
				if(!file.isEmpty()) {
					String fileName = file.getOriginalFilename(); // 파일명

					// src/main/resources/static/img 폴더 가져옴 (resource loader)
					// src 경로 내에 있다 -> 클래스 경로 상에 있다 
					Resource resource = resourceLoader.getResource("classpath:/static/img");

					// pjt 폴더 > target > classes > static > img 폴더 생성 됨 > 이미지 첨부됨 
					file.transferTo(new File(resource.getFile(), fileName));
					
					fileNames.add(fileName); // 리스트에 추가
				}	
			}
		}
		// 데이터 저장
		model.addAttribute("name", name);
		model.addAttribute("price", price);
		model.addAttribute("category", category);
		model.addAttribute("fileNames", fileNames);

		return "product/productoutput";
	}
	
	@GetMapping("/download")
	public String fileDownload(@RequestParam("fileName") String fileName, Model model) {
		model.addAttribute("fileName", fileName);
		return "fileDownloadView";
	}

	
}
