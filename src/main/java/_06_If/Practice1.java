package _06_If;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // 10만원 이상이면 10퍼센트 할인, 아니면 할인없음
        // 가격에 따라 출력해주세요
        Scanner scanner = new Scanner(System.in);
        System.out.print("가격을 입력하세요 >");
        int price = scanner.nextInt();
        scanner.nextLine(); // 엔터처리용 코드

        if (price >= 100000) {
            // 10% 할인 코드 작성
            double discountPrice = price * 0.9; // 정수 * 실수 -> 타입변환
            System.out.println("최종가격: " + discountPrice);
        } else {
            // 아무런 할인 없음
            System.out.println("최종가격: " + price);
        }

        // 실습2) 로그인
        String realId = "java";
        String realPW = "1234";

        // 사용자 입력
        System.out.print("아이디 입력:");
        String inputId = scanner.nextLine();

        System.out.print("패스워드 입력:");
        String inputPW = scanner.nextLine();

        // 입력값과 실제값 비교 ->
        // 아이디 패스워드가 일치할 경우에 "로그인성공" 출력
        // 아이디 패스워드가 둘 중 하나라도 일치x "로그인실패" 출력

        // String 자료형 비교시 equals 메서드 사용, == 연산자는 사용x
        boolean isValidId = realId.equals(inputId);
        boolean isValidPW = realPW.equals(inputPW);
        boolean isValidLogin = isValidId && isValidPW;

        if (isValidLogin) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }






    }
}
