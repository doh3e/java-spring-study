package sample1;

import java.util.Scanner;

public class CoffeeMachine {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("====== 자판기메뉴 ======");
			System.out.println("아메리카노 : 1000원");
			System.out.println("카페라떼 : 2000원");
			System.out.println("자바칩 프라푸치노 : 3000원");
			System.out.println("=====================");
			
			System.out.print("메뉴를 골라주세요(아메/라떼/자바)");
			String menu = sc.nextLine();
			System.out.print("금액을 넣어주세요:");
			int money = sc.nextInt();
			sc.nextLine();
			
			int jandon = 0;
			if(menu.equals("아메")) {
				if(money >= 1000) {
					jandon = money - 1000;
					System.out.println("아메리카노 나왔습니다. 잔돈은 "+jandon+"입니다");
					System.out.println("추가 주문하시겠습니까?(y/n)");
					String yn = sc.nextLine();
					if(yn.equals("Y") || yn.equals("y")) {
						continue;
					}
					else {
						break;
					}
				}
				else if(money < 1000) {
					System.out.println("금액이 부족합니다. 처음부터 다시 해주세요.");
				}
			}
			else if(menu.equals("라떼")) {
				if(money >= 2000) {
					jandon = money = 2000;
					System.out.println("카페라떼 나왔습니다. 잔돈은 "+jandon+"입니다");
					System.out.println("추가 주문하시겠습니까?(y/n)");
					String yn = sc.nextLine();
					if(yn.equals("Y") || yn.equals("y")) {
						continue;
					}
					else {
						break;
					}
				}
				else if(money < 2000) {
					System.out.println("금액이 부족합니다. 처음부터 다시 해주세요.");
				}
			}
			else if(menu.equals("자바")) {
				if(money >= 3000) {
					jandon = money = 3000;
					System.out.println("자바칩 프라푸치노 나왔습니다. 잔돈은 "+jandon+"입니다");
					System.out.println("추가 주문하시겠습니까?(y/n)");
					String yn = sc.nextLine();
					if(yn.equals("Y") || yn.equals("y")) {
						continue;
					}
					else {
						break;
					}
				}
				else if(money < 3000) {
					System.out.println("금액이 부족합니다. 처음부터 다시 해주세요.");
				}
			}
		}

	}

}
