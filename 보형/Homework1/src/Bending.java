import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class Bending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> menus = new HashMap<>();
		menus.put("아메", 1800);
		menus.put("라떼", 2000);
		menus.put("지원", 50000);

		
		while (true) {
			System.out.println("===== 자판기 메뉴 ====\n"
					+ "아메리카노 : 1800원\n"
					+ "카페라떼 : 2000원\n"
					+"백지원: 50000원\n"
					+ "=".repeat(20));
			System.out.print("골라 (아메/라떼/지원) ");
			String menu = sc.nextLine();
			boolean menuErr = true;
			for (String m: menus.keySet()) {
				if (m.equals(menu)) menuErr = false;
			}
			if (menuErr) continue;
			System.out.print("돈내: ");
			String pay = sc.nextLine().strip();
			int payment = 0;
			try {
				payment = Integer.parseInt(pay);
			} catch (Exception e) {
				continue;
			}
			
			if (payment >= menus.get(menu)) {
				switch (menu) {
				case "아메": {
					System.out.print("아메리카노 나왔음 잔돈 ");
					break;
				}
				case "라떼": {
					System.out.print("라떼 나왔음 잔돈 ");
					break;
				}
				case "지원": {
					System.out.print("지원 나왔음 잔돈 ");
					break;
				}
				}
				System.out.println(payment - menus.get(menu));
			}
			else {
				System.out.println("나가");
				continue;
			}
			System.out.println("더살거? (y/n)");
			String cmd = sc.nextLine();
			if (cmd.equals("y"))
				continue;
			else break;
			
		}
		
	}

}
