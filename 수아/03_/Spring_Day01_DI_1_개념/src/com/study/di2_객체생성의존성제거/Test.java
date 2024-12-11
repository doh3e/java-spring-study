package com.study.di2_객체생성의존성제거;

// 스프링컨테이너 역할 - 의존관계가 필요하다면 집어 넣어 줌
// 의존관계 역전 - Desktop에 대한 객체생성 의존성을 Programmer에서 Test로 
public class Test {
	public static void main(String[] args) {
		
		// case1) 기존 - 의존성o
//		Programmer p = new Programmer();
		
		// case2) Programmer의 객체 생성 의존성 제거 
		Desktop desktop = new Desktop();
		Programmer p = new Programmer(desktop);
		
		
		p.coding();
	}
}
