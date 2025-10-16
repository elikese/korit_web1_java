package _01_Print;

public class HelloJava { // HelloJava 클래스 시작

    // 주석: 코드 설명용도로 사용됨. -> 인간이 읽으라고 적는것(컴파일러가 안 읽음)
    /*
    1. 자바는 객체지향언어 -> class 위주의 설계, 메모리관리, 코드작성
    2. 자바는 컴파일 과정을 거친다.
    .java(우리가 작성한 코드) -> .class(바이트코드) -> OS(윈도우,맥)호출 -> 출력
    */

    // main은 자바 프로그램의 현관문
    // 자바는 main이라는 현관문을 통해 외부와 출입한다.
//    public static void main(String[] args) { // 메인 시작
//        System.out.println("Hello World!"); // 세미콜론: 코드 끝
//
//    } // 메인 끝
    public static void main(String[] args) {
        // 실습) 콘솔창에 아래를 출력해주세요
        /*
        이름: 내이름
        나이: 내나이
        주소: 지역(부산)
        */
        System.out.println("이름: 박화목");
        System.out.println("나이: 34");
        System.out.println("지역: 부산");
    }

} // 클래스 끝
