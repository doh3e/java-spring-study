package com.study.di4_의존성주입;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Desktop desktop = new Desktop();
		Laptop labtop = new Laptop();
		
		// case2) 객체 생성 당시에는 할당x -> 생성 이후 부여
		Programmer p2 = new Programmer();
		p2.setComputer(labtop);
//		p2.coding();
		
		Scanner sc = new Scanner(System.in);
		Programmer p3 = new Programmer();
		
		while(true) {
			p3.setComputer(ComputerFactory.getComputer(sc.next()));
			p3.coding();
		}
	}
}
