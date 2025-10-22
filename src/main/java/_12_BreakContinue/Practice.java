package _12_BreakContinue;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        /* 요구사항
        사용자로 부터 비밀번호를 입력받습니다.
        1. 올바른 비밀번호 -> 로그인성공! 출력 후 탈출
        2. 비밀번호가 틀리면 -> 비밀번호가 틀렸습니다! 출력, 다시 입력
        3. 최대 5회까지 시도할 수 있음
        4. 5회에 도달하면, "계정이 잠겼습니다" 출력 후 탈출
        5. 입력이 비어있으면(""), "다시 입력하세요" 출력하고, 이때는 시도횟수 증가x
        */
        // 1. 빈 문자열 검사1 - "" - isEmpty(길이가 0인지 검사)
        // 2. 빈 문자열 검사2 - "   " - isBlank(공백을 제거하고 길이가 0인지)
        // 3. 문자열은 참조자료형 -> null 검사!
        String test = "";
        System.out.println(test.length() == 0);
        System.out.println(test.isEmpty()); // 비어있으면 true
        test = "   "; // 길이가 0이아닌데, 공백
        System.out.println(test.isEmpty()); // false
        String test2 = test.trim(); // 공백을 제거해준다
        System.out.println(test2.isEmpty()); // true
        System.out.println(test.isBlank()); // 공백제거->빈문자열검사


        String PW = "1234";
        Scanner scanner = new Scanner(System.in);

        // 시도횟수를 카운트 해줘야한다!
        int count = 0;
        while(true) {
            System.out.print("비밀번호를 입력 >>");
            String myInput = scanner.nextLine();

            if (myInput.isEmpty()) { // 공백입력 처리
                System.out.println("다시 입력하세요");
                continue;
            }

            count++; // 입력시 시도 횟수 증가

            if (myInput.equals(PW)) { // 비밀번호 맞추면, 즉시 탈출
                System.out.println("로그인 성공!");
                break;
            } else { // 틀리면
                System.out.println("비밀번호가 틀렸습니다.");
            }

            if (count == 5) {
                System.out.println("계정이 잠겼습니다.");
                break;
            }

        }


    }
}
