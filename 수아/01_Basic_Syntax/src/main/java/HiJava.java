/* NOTE 1)
  
 * Scanner 객체를 닫아주는 이유 
   1. 자원 관리
   		- Scanner 객체는 System.in과 같은 입력 스트림과 연결되어 있음 
   		- 입력 스트림은 운영체제 자원을 사용하며, 사용 후에 적절히 닫아주지 않으면 시스템에 불필요한 자원이 점유될 수 있음 
   2. 메모리 누수 방지
   		- 닫지 않고 계속 유지하면 메모리 누수(memory leak)가 발생 가능 
   		- 반복적으로 Scanner 객체를 생성하는 경우, 자원이 해제되지 않고 쌓여 프로그램의 성능이 저하 가능성 
   3. 프로그램 안정성
   		- 스트림을 사용 후 닫는 것은 일반적인 프로그래밍 관례
   		- 닫히지 않은 스트림은 의도치 않은 버그나 프로그램 오류를 일으킬 수 있음 -> 프로그램의 안정성을 높이는 데 기여
 

 * next(): 공백 또는 개행 문자 전까지의 문자열만 읽습니다. 여러 단어를 입력하면 첫 단어만 반환
 * nextLine() : 개행 문자 전 까지 문자열 읽음 
 	-. name = scanner.nextLine().trim(); // 공백 제거한 후 입력 받기
 */

import java.util.Scanner;

public class HiJava {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner scanner = new Scanner(System.in); // 표준 입력 스트림(System.in)과 연결 
		
            // 1. 이름 입력
            // System.out.print("이름을 입력하세요 : ");
            // 방식1) String name = scanner.nextLine(); // 문자열 입력

			// 방식2)
			String name;

            // 이름 입력 및 검증 루프
            while (true) {
                System.out.print("이름을 입력하세요 : ");
                name = scanner.nextLine().trim(); // 공백 제거한 후 입력 받기

                // 이름이 빈 문자열이거나 숫자가 포함된 경우 재입력 요구
                if (name.isEmpty()) {
                    System.out.println("이름을 입력해주세요. 빈칸일 수 없습니다.");
                } else if (name.matches(".*\\d.*")) {
                    System.out.println("잘못된 입력입니다. 이름에 숫자가 포함될 수 없습니다.");
                } else {
                    break; // 이름이 올바르면 반복문 탈출
                }
            }
			
            // 2. 나이 입력
            // System.out.print("나이를 입력하세요 : ");
            // 방식1)
            // int age = scanner.nextInt(); // 정수 입력 (int형 32bit)
            
            // 방식2)
            // int age = Integer.parseInt(scanner.nextLine()); // 문자열 입력 후 정수로 변환

            // 방식3)
            int age;

            // 나이 입력 및 검증 루프
            while (true) {
                System.out.print("나이를 입력하세요 : ");
                String ageInput = scanner.nextLine(); // 문자열 입력

                try {
                    age = Integer.parseInt(ageInput); // 문자열을 정수로 변환
                    if (age < 0) {
                        System.out.println("나이는 음수가 될 수 없습니다. 다시 입력해주세요.");
                    } else {
                        break; // 올바른 나이 입력 시 루프 탈출
                    }
                } catch (NumberFormatException e) {
                    System.out.println("잘못된 입력입니다. 나이는 숫자 형식으로 입력해야 합니다.");
                }
            }
            // 출력
            System.out.println("안녕하세요, 제 이름은 " + name + "입니다. 제 나이는 " + age + "세 입니다.");
            scanner.close(); // Scanner 객체 닫기
	}
	
}

