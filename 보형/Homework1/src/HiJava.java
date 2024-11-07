import java.util.Scanner;
public class HiJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		String age = sc.nextLine();
		System.out.printf("안녕하세요, 제 이름은 %s입니다. 나이는 %s살 입니다.",name, age);
		
		
	}

}
