package study_yehyun_00;

import java.util.Scanner;

public class NameAge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        System.out.println("안녕하세요, 제 이름은 " + name + "입니다. 나이는 " + age + "살 입니다.");
        scanner.close();
	}

}
