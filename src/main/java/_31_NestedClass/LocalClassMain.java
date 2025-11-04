package _31_NestedClass;

public class LocalClassMain {
    // 지역클래스
    /*
    - 메서드 내부에서 정의하는 클래스
    - 해당 메서드 내부에서만 사용가능
    - 바깥 클래스가 존재하게된다
    -> 바깥클래스의 private 접근제한자에도 접근할 수 있다.
    */
    // 클래스의 필드
    private int a;

    // 클래스의 인스턴스 메서드
    public void printTotal(int num1, int num2) {
        // 여기에 클래스 하나를 정의한다
        class Calculator {
            int add(int x, int y) {
                System.out.println("바깥클래스의 private 필드 접근!: " + a);
                return x + y;
            }
        }

        // 지역클래스(Calculator)는 이 메서드 내부에서만 사용가능
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println("계산결과: " + result);

    }

    // 왜 쓸까? .... 이제는 잘 안사용하는 문법
    // 자바에서는 메서드가 단독으로 존재할 수 없다.
    // 메서드안에서 메서드를 정의해서 쓰고 싶다(함수형 프로그래밍)
    // -> 지역클래스라는걸 만들어서 어떻게든 메서드안에서 메서드를 정의해보자!
    // 람다 출현이후로 사실상 안쓰이게 되었다.


}
