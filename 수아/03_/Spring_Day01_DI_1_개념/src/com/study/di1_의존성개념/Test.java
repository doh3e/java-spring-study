package com.study.di1_의존성개념;

public class Test {
	public static void main(String[] args) {
		
		// 프로그래머가 데스크톱에 대한 의존성을 가지고 있음 
		// 즉, Programmer 객체가 Desktop의 객체의 도움을 받아서 일을 처리함
		Programmer p = new Programmer();

		p.coding();
	}
}
