/* NOTE1 ) Java에서 문자열 비교
 menu != "아메"
 !menu.equals("아메")

 1. == 연산자
 	-. 객체의 참조(주소)를 비교
 	-. 두 객체가 같은 메모리 주소를 가리킬 때만 true를 반환
 	-. 문자열 리터럴처럼 동일한 메모리 주소를 공유하는 경우에는 true 
 	   새로운 문자열 객체를 생성 or 사용자가 입력한 문자은 false (새로운 메모리 주소에 할당)

 2. .equals() 연산 
 	-. 문자열의 내용을 비교 
 	-. 대소문자 구분O
 	-. 문자열로 비
 	
 etc. 참고) 문자열 리터럴
 	-. 자동 메모리 관리: Java는 동일한 문자열 리터럴이 여러 번 사용되더라도 String Pool에 한 번만 저장하고, 그 이후에는 기존의 리터럴을 재사용하여 메모리를 절약
	-. Immutable (불변성): 문자열 리터럴은 한 번 생성되면 변경할 수 없음 
	-. new 로 생성한 객체와는 다른 객체 / new 로 생성한 객체는 힙 메모리에 저장 
*/

/* NOTE2 ) 입력 타입 비교 후, 입력 소비해주기 
   if (scanner.hasNextInt()) { // 정수 타입인지 확인 
		...
	} else {
		scanner.next(); // 잘못된 입력 소비
		...
	}
*/

/* NOTE3 ) 문자열이 아닌 문자로 비교해서 무한루프되는 문제
 	-. 마지막 종료 코드에서 종료되지 않는 문제 			if(newOrder.equals('N'))  break;
 	-. .equals()는 문자열로 비교 
 * */

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n====== 자판기 메뉴 ======");
			System.out.println("아메리카노 : 1000원");
			System.out.println("카페라떼 : 2000원");
			System.out.println("자바칩 프라푸치노 : 3000원");
			System.out.println("======================");
			
			System.out.print("메뉴를 골라주세요 (아메/라떼/자바) : ");
			String menu = scanner.nextLine().trim(); // 개행 없이 입력받
			if (!menu.equals("아메") && !menu.equals("라떼") && !menu.equals("자바")) {
				System.out.println("현재 제공하고 있지 않은 메뉴입니다.\n");
				continue;
			}
			
			System.out.print("금액을 넣어주세요 : ");
			int price = 0;
			if (scanner.hasNextInt()) { // 정수 타입인지 확인 
				price = scanner.nextInt();
				scanner.nextLine(); // 남은 개행 제거
				if (price == 0) { // 0원 인 경우 
					System.out.println("잔액이 없습니다.");
					continue;
				}
			} else {
				scanner.next(); // 잘못된 입력 소비
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			if (menu.equals("아메")){
				price -= 1000;
				if (price >= 0)	System.out.println("아메리카노 나왔습니다. 잔돈은 " + price + "원입니다.");
			} else if (menu.equals("라떼")) {
				price -= 2000;
				if (price >= 0)	System.out.println("카페라떼 나왔습니다. 잔돈은 " + price + "원입니다.");
			} else if (menu.equals("자바")) {
				price -= 3000;
				if (price >= 0)	System.out.println("자바칩 프라푸치노 나왔습니다. 잔돈은 " + (price - 3000) + "원입니다.");
			}
			if (price < 0 ) {
				System.out.println("금액이 부족합니다. 금액을 넣어주세요.");
				continue;
			}
			
			System.out.println("추가 주문하시겠습니까?(Y/N)");
			String newOrder = scanner.nextLine().trim();
//			if(newOrder.equals("N"))  break; // 대소문자 구분 O
			if(newOrder.equalsIgnoreCase("N")) break; // 대소문자 구분 x

		}
	}
}