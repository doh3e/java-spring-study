package com.study.di3_타입의존성제거;

public class Programmer {
	
	// case3) 타입 의존성 제거 안된상태 
//	private Laptop laptop; // laptop 필드 생성
//
//	public Programmer(Laptop laptop) {
//		this.laptop = laptop; // 프로그래머 고용 -> 가지고 있던 컴퓨터 한 대 전달 
//	}
//	
//	public void coding() {
//		System.out.println(laptop.getInfo()+"으로 개발을 합니다.");
//	}
	
	
	// case4) interface 사용해서 타입의존성 제거
	// 느스한 결합
	// - 객체지향 설계원칙 SOLID
	// - Programmer 클래스는
	// - 특정 구현체(Laptop 또는 Desktop)가 아니라, Computer 인터페이스에 의존하도록 설계
	// - Programmer 클래스와 실제 구현체 간의 결합도가 낮아짐
	// 장점 : 유연성 (구현체가 변경되더라도 Programmer 코드는 수정할 필요가 없음)
	private Computer computer;
	
	public Programmer(Computer computer) {
		this.computer = computer;
	}
	
	public void coding() {
		System.out.println(computer.getInfo()+"으로 개발을 합니다.");
	}
}