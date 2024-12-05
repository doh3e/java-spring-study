package com.study.di2_객체생성의존성제거;

public class Programmer {
	private Desktop desktop; // 컴퓨터 필요하므로 desktop 필드 생성
	
	// case1) 기존 생성자 (의존성o)
//	public Programmer() {
//		this.desktop = new Desktop(); // 프로그래머 고용 -> 컴퓨터 한 대 구매
//	}
	
	// case2) 생성자 (객체 생성 의존성 제거) 
	public Programmer(Desktop desktop) { // 인자로 받음 
		this.desktop = desktop; // 프로그래머 고용 -> 가지고 있던 컴퓨터 한 대 전달 
	}
	
	// case1, 2 공통 
	public void coding() {
		System.out.println(desktop.getInfo()+"으로 개발을 합니다.");
	}
	
}
