package _08_Switch;

import java.util.Scanner;

public class WeekDiscount {
    public static void main(String[] args) {
        // 요일마다 할인율이 다르다!
        // 1. 스캐너를 통해 요일을 입력 받는다
        Scanner scanner = new Scanner(System.in);
        System.out.print("오늘이 무슨 요일인지 입력하세요(월~일) >");
        String dayOfWeek = scanner.nextLine();

        // "월" , "월요일" 두가지 모두 switch문을 통과하게끔 가공
        // 삼항연산자
        dayOfWeek = dayOfWeek.contains("요일") ? dayOfWeek : dayOfWeek + "요일";

        int basePrice = 10000;
        // 2. switch - case 문을 통해 요일마다 다른 할인율을 적용
        // 월-10%, 화/수/목-5%, 금-15%, 토/일-20%, 그외-0%
        double discountRate;
        switch (dayOfWeek) {
            case "월요일":
                discountRate = 0.1;
                break;
            case "화요일":
            case "수요일":
            case "목요일":
                discountRate = 0.05;
                break;
            case "금요일":
                discountRate = 0.15;
                break;
            case "토요일":
            case "일요일":
                discountRate = 0.2;
                break;
            default:
                discountRate = 0.0;
                System.out.println("올바른 요일을 입력하세요");
        }

        // 가격 계산
        // 할인금액
        double discountPrice = basePrice * discountRate;
        double finalPrice = basePrice - discountPrice;

        /*
            최종 출력
            오늘: ~요일
            정가: ~원
            할인금액: ~원
            최종가격: ~원
        */

        System.out.println("오늘: " + dayOfWeek);
        System.out.println("정가: " + basePrice + "원");
        System.out.println("할인금액: " + discountPrice + "원");
        System.out.println("최종가격: " + finalPrice + "원");


    }
}
