package _08_Switch;

import java.util.Scanner;

public class Popcorn {
    public static void main(String[] args) {
        // 팝콘 사이즈에 따라 가격을 분기
        Scanner scanner = new Scanner(System.in);
        System.out.print("구매하실 팝콘 사이즈를 입력(S,M,L,XL) >");
        String size = scanner.nextLine();
        size = size.toUpperCase(); // 재대입

        int price;

        switch (size) {
            case "S":
                price = 3000;
                break;
            case "M":
                price = 4000;
                break;
            case "L":
                price = 5000;
                break;
            case "XL":
                price = 6000;
                break;
            default:
                price = 0;
                System.out.println("잘못된 입력입니다.");
                break;
        }

        System.out.println("주문한 사이즈: " + size);
        System.out.println("가격: " + price + "원");

    }
}
