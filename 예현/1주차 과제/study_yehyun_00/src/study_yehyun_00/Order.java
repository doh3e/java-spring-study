package study_yehyun_00;

import java.util.Scanner;

public class Order {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====스파게티=====");
        System.out.println("토마토 스파게티: 13000원");
        System.out.println("크림 스파게티 : 24000원");
        System.out.println("오일 스파게티 : 18000원");
        System.out.println("==============");

        while (true) {
            System.out.print("무슨 스파게티를 주문하시나요? (토마토/크림/오일): ");
            String menu = scanner.nextLine();
            
            if (!(menu.equals("토마토") || menu.equals("크림") || menu.equals("오일"))) {
                System.out.println("메뉴명을 잘못 입력하셨습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("금액을 지불해 주세요: ");
            int money = scanner.nextInt();
            scanner.nextLine();
            

            if(menu.equals("토마토")) {
                if(money >= 13000) {
                    int change = money - 13000;
                    System.out.println("주문하신 토마토 스파게티 나왔습니다. 거스름돈은 " + change + "원입니다.");
                    System.out.print("추가주문 하시나요? (더 주문하시면 y를 입력해주세요.): ");
                    String order = scanner.nextLine();

                    if(order.equals("y")) {
                        continue;
                    } else {
                        System.out.println("이용해주셔서 감사합니다.");
                        break;
                    }
                } else {
                    System.out.print("돈이 부족합니다. 다시 주문하실거면 y를 입력해주세요: ");
                    String order = scanner.nextLine();

                    if(order.equals("y")) {
                        continue;
                    } else {
                        System.out.println("이용해주셔서 감사합니다.");
                        break;
                    }
                }

            } 
            else if(menu.equals("크림")) {
                if(money >= 24000) {
                    int change = money - 24000;
                    System.out.println("주문하신 크림 스파게티 나왔습니다. 거스름돈은 " + change + "원입니다.");
                    System.out.print("추가주문 하시나요? (더 주문하시면 y를 입력해주세요.): ");
                    String order = scanner.nextLine();

                    if(order.equals("y")) {
                        continue;
                    } else {
                        System.out.println("이용해주셔서 감사합니다.");
                        break;
                    }
                } else {
                    System.out.print("돈이 부족합니다. 다시 주문하실거면 y를 입력해주세요: ");
                    String order = scanner.nextLine();

                    if(order.equals("y")) {
                        continue;
                    } else {
                        System.out.println("이용해주셔서 감사합니다.");
                        break;
                    }
                }

            } 
            else if(menu.equals("오일")) {
                if(money >= 18000) {
                    int change = money - 18000;
                    System.out.println("주문하신 오일 스파게티 나왔습니다. 거스름돈은 " + change + "원입니다.");
                    System.out.print("추가주문 하시나요? (더 주문하시면 y를 입력해주세요.): ");
                    String order = scanner.nextLine();

                    if(order.equals("y")) {
                        continue;
                    } else {
                        System.out.println("이용해주셔서 감사합니다.");
                        break;
                    }
                } else {
                    System.out.print("돈이 부족합니다. 다시 주문하실거면 y를 입력해주세요: ");
                    String order = scanner.nextLine();

                    if(order.equals("y")) {
                        continue;
                    } else {
                        System.out.println("이용해주셔서 감사합니다.");
                        break;
                    }
                }
            } 
        }

        scanner.close();
    }
}
