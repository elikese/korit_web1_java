package _04_Scanner;

import java.util.Scanner;

public class ScannerStudy {
    public static void main(String[] args) {
        // 스캐너 - 외부(키보드)로 부터 데이터를 받아오는 "객체"
        // 스캐너 객체생성(우변에 있는 new) / scanner라는 변수에 대입
        // 지금은 외우고 사용.
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력받기
        // println -> 문자열 출력이후에 엔터까지 출력
        // print -> 문자열 출력하고, 엔터는 출력하지 x
//        System.out.print("문자열을 입력하세요 >>");
//        // 엔터키 까지 인식해서 데이터를 가져 옴
//        String myStr = scanner.nextLine();
//        System.out.println("입력한 문자열: " + myStr);

        // 정수 입력받기
//        System.out.print("숫자를 입력하세요 >>");
//        int myInt = scanner.nextInt(); // 정수만 읽어서 가져옴
//        System.out.println("입력한 정수: " + myInt);

        // 문자열과 정수 두개를 입력받아보자
        System.out.print("나이를 입력 >>");
        int age = scanner.nextInt(); //키보드 입력(I/O버퍼)에서 정수까지만 잘라옴
        // 33엔터 에서 33까지만 가져오고 엔터는 남게 됨

        scanner.nextLine(); // 남아있는 엔터키 제거용

        System.out.print("이름을 입력 >>");
        String name = scanner.nextLine(); // 엔터까지 인식
        // 남은 엔터를 먹고 사라짐

        System.out.println(); // 줄바꿈용
        System.out.println("나이: " + age);
        System.out.println("이름: " + name);
        System.out.println("이름: " + name);

        scanner.close(); // 스캐너 반납

    }
}
