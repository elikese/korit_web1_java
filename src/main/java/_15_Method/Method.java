package _15_Method;

public class Method {
    // public(접근제한자): 다른 클래스에서도 호출 가능(나중에)
    // static: 객체 생성 없이 호출 가능(나중에)
    // void -> 리턴이 없다.
    public static void greeting() { // 매개변수(파라미터)x, 리턴x
        System.out.println("안녕하세요!");
    } // 메서드 정의: 호출되면 코드를 실행하라!

    public static void main(String[] args) { // 메인 메서드
        /*
        메서드를 왜 사용하는가?
        변수: 데이터를 재사용하려고 -> 데이터저장용
        메서드: 코드를 재사용하려고 -> 코드저장용

        재사용의 장점: 유지보수 good
        변수,메서드는 작명이 가능하다 -> 가독성 good

        함수 정의와 호출을 헷갈리지 말자!
        */

        System.out.println("함수 호출 전");
        greeting(); // 함수 호출: 함수이름()
        System.out.println("함수 호출 후");

    }
}
