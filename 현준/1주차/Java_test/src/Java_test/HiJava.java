package Java_test;
import java.util.Scanner;

public class HiJava {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        // 사용자로부터 이름 입력 받기
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();
        
        // 사용자로부터 나이 입력 받기
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        
        // 결과 출력
        System.out.println("안녕하세요 저는 " + name + "이고, 나이는 " + age + "살입니다.");
        
        // Scanner 객체 닫기
        scanner.close();
    }
}
