package com.study.di3_타입의존성제거;

public class Test {
	public static void main(String[] args) {

		// case4) 타입의존성 제거됨 (다형성) 
		Desktop desktop = new Desktop();
		Laptop laptop = new Laptop();
		
		Programmer p = new Programmer(desktop);
		p.coding();
		
		Programmer pp = new Programmer(laptop);
		pp.coding();
	}
}
