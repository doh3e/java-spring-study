package study01;
import java.util.Scanner;

public class HiJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성

		// 기본 타입
		byte a = sc.nextByte();
		short b = sc.nextShort();
		int c = sc.nextInt();
		long d = sc.nextLong();
		
		// 실수 타입
		float e = sc.nextFloat();
		double f = sc.nextDouble();
		
		// 논리 타입
		boolean g = sc.nextBoolean();
		
		// 문자열 타입
		String h = sc.next();
		String i = sc.nextLine();
		
		// 출력
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
	}

}
