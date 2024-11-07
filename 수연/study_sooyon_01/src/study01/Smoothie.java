package study01;
import java.util.Scanner;
public class Smoothie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	String[] menu = {"바나나", "딸기", "망고", "초코", "바닐라"};
	int[] price = {3000, 4000, 6000, 4500, 2500};
	
	while (true) {
		for (int i = 0; i < price.length; i++) {
			System.out.println(menu[i] + " : " + price[i] + "원");
			}
		System.out.println("================");
		System.out.println("메뉴? : ");
		String yourmenu = sc.next();
		System.out.println("계산 : ");
		int yourmoney = sc.nextInt();
		if (yourmenu == menu[0]) {
//			System.out.println("");
			int residence = yourmoney - price[0];
			System.out.println("거스름돈 : " + residence);
			if (yourmoney < price[0]) {
				System.out.println("금액 부족");
				continue;
			} else {
				
			};
		} else if (yourmenu == "딸기") {
			if (yourmoney < price[1]) {
				System.out.println("금액 부족");
				continue;
			} else {
				System.out.println("거스름돈 : " + (yourmoney-price[1]));
			};
		} else if (yourmenu == "망고") {
			if (yourmoney < price[2]) {
				System.out.println("금액 부족");
				continue;
			} else {
				System.out.println("거스름돈 : " + (yourmoney-price[2]));
			};
		} else if (yourmenu == "초코") {
			if (yourmoney < price[3]) {
				System.out.println("금액 부족");
				continue;
			} else {
				System.out.println("거스름돈 : " + (yourmoney-price[3]));
			};
		} else if (yourmenu == "바닐라") {
			if (yourmoney < price[4]) {
				System.out.println("금액 부족");
				continue;
			} else {
				System.out.println("거스름돈 : " + (yourmoney-price[4]));
			};
		};
		System.out.println("추가 주문 (y / n)");
		String more = sc.next();
		if (more == "y") {
			continue;
		} else {
			break;
		}
	}
	

	}

}
