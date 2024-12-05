package com.study.di4_의존성주입;

import com.study.di4_의존성주입.Computer;

public class Programmer {
	private Computer computer;
	
	// case1) 생성자 주입
	public Programmer(Computer computer) {
		this.computer = computer;
	}

	
	// case2) 설정자를 이용해서 주입 (단, 기본생성자는 있어야 함)
	public Programmer() {	// 기본생성자
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	// case3) 메서드를 이용해서 주입 - 중간에 변경될 때 유용 
	// 예시 
//	private Keyboard keyboard;
//	public void init(Computer computer, Keyboard keyboard) {
//		this.computer = computer;
//		this.keyboard = keyboard;
//	}
	
	
	// case1, 2,3 공통 
	public void coding() {
		System.out.println(computer.getInfo()+"으로 개발을 합니다.");
	}
	
}
