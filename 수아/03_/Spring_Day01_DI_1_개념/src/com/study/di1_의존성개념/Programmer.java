package com.study.di1_의존성개념;

public class Programmer {
	private Desktop desktop; // 컴퓨터 필요하므로 desktop 필드 생성
	
	public Programmer() {
		this.desktop = new Desktop(); // 프로그래머 고용 -> 컴퓨터 한 대 구매
	}

	public void coding() {
		System.out.println(desktop.getInfo()+"으로 개발을 합니다.");
	}
	
}
