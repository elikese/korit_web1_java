package _16_Overloading;

public class Overloading {
    // 메서드 오버로딩
    // 복습) 자바에서 메서드는 단독으로 존재할 수 있다? (x)
    // -> 자바에서는 메서드는 항상 클래스에 종속된다.

    // 동일 클래스 내에서 같은 이름의 메서드를 여러개 선언
    // 매개변수의 자료형(타입)/ 순서 / 갯수가 다르면 같은 메서드이름 사용가능
    // 메서드 시그니처: 컴파일러가 메서드를 구분하는 방법
    // 이름 + 매개변수 타입목록

    // 시그니처: printInfo 함수(1:String)
    public static void printInfo(String name) {
        System.out.println("이름: " + name);
    }

    // 시그니처: printInfo 함수(1:String, 2:int)
    public static void printInfo(String name, int age) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }

    // 시그니처: printInfo 함수(1:int, 2:String) - 순서가 달라도 서로 다르다
    // 매개변수의 변수명은 상관이 없음.
    public static void printInfo(int age, String name) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }

    public static void printNum(int num) {
        System.out.println("정수!");
        System.out.println(num);
    }

    public static void printNum(double num) {
        System.out.println("실수!");
        System.out.println(num);
    }

    public static void main(String[] args) {
        // 매개변수로 전달되는 데이터의 타입(자료형)에 따라서 호출된다
        printNum(1); // 정수!
        printNum(1.0); // 실수!
    }
}
