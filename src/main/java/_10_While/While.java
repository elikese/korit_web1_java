package _10_While;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        /*
        while (boolean 자료형 - 비교연산, 논리연산(조건식)) {
            // 반복될 코드
        }
        조건 결과가 false가 되면 while문 탈출
        (조건검사 -> 코드실행)xn -> 조건검사 결과 false가 나와 탈출
        
        for문 - 횟수가 명확할 때(배열이나 리스트에 있는 자료 순회)
        while문 - 횟수가 불명확할 때, 조건 중심
        */


        Scanner scanner = new Scanner(System.in);

        // 반복횟수를 알 수 없다의 예시
        boolean isLogin = true; // 로그인여부
        
        while(isLogin) {
            System.out.println("로그인 상태입니다.");
            System.out.print("로그아웃 하시겠습니까?(y/n) >>");

            String command = scanner.nextLine(); // "y" or "n"을 담음

            // while 조건검사에서 조건을 바꾸는 코드가 필요하다.
            isLogin = !"y".equals(command); // isLogin의 조건변화
        }
        System.out.println("로그아웃 성공!");



    }
}
