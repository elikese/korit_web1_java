package _36_Lambda;

public class LambdaMain {
    public static int calcNum(int num1, int num2, Calculator calculator) {
        return calculator.calculate(num1, num2);
    }

    public static void main(String[] args) {
        /*
        함수형 프로그래밍(FP)
        : 메서드를 객체처럼 다루고 싶다.
        : 메서드를 값처럼 다루고 싶다.
        FP를 지원한다면 가능해야 하는 것
        1. 메서드를 변수에 할당할 수 있어야한다.
        add = x,y -> return x + y;
        2. 매개변수로도 함수가 전달될 수 있어야한다.
        calc = x,fn -> return fn(x);
        
        하지만, 자바는 메서드만 단독으로 존재할 수 없음.
        메서드가 객체가 안된다면, 객체처럼 보이면 되지 않을까
        -> 메서드 하나만 가지는 클래스를 만들면 되지 않을까?

        메서드를 값처럼 변수에 할당 -> 익명클래스 객체를 사용하자
        익명클래스 "객체"는 매개변수로 전달할 수 있다!
        */

        // 익명클래스
        // new로 생성되는 객체는 -> 익명1, 익명2 같은 익명클래스 타입
        // 변수타입은 Calculator로서 업캐스팅 상태로 선언되어있음.
        Calculator add = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b; // 사실상 핵심로직은 단 한줄
            }
        };
        // multi의 실제 타입은 add와는 다른 클래스타입이다.
        // 둘다 익명클래스 객체이지만, 서로 다른 익명클래스 객체인 것
        Calculator multi = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a * b; // 핵심로직 a * b
            }
        };

        // 아직까지는 객체를 매개변수로 넘겨주는 것 처럼 보임
        // 목표: 메서드를 넘겨주는 것 처럼 보여야 한다.
        System.out.println(add.calculate(10, 5));
        System.out.println(multi.calculate(10, 5));

        // 실제로직은 한줄인데, 필요한 문법코드가 방대하다.
        // 줄이기가 가능할까? -> 가능하다(Lambda 문법)

        // 람다로 동일한 기능을 간결하게 구현
        // (매개변수1, 매개변수2...) -> {} 실행부
        // 어차피 인터페이스에 정의된 메서드가 하나이기 때문에
        // 그 메서드 정의만 새롭게 해주자(다른 불필요한 코드는 생략)
        Calculator lambdaAdd = (int a, int b) -> {
            return a + b;
        };
        // lambdaMulti를 축약해서 정의해 보세요
        Calculator lambdaMulti = (int a, int b) -> {
            return a * b;
        };


        // Calculator의 메서드는 어차피 1개다 ->
        // 메서드시그니처 특정가능 -> 매개변수 타입도 특정가능
        // + 한줄로 리턴이 가능하면, 중괄호 + return 키워드 생략가능
        Calculator lambdaAdd2 = (a, b) -> a + b;
        // lambdaMulti를 축약해서 정의해 보세요
        Calculator lambdaMulti2 = (a, b) -> a * b;

        System.out.println(lambdaAdd2.calculate(10, 5));
        System.out.println(lambdaMulti2.calculate(10, 5));

        // 람다로 정의한 익명객체를 넘긴다
        calcNum(10, 5, lambdaAdd2);
        // 익명객체는 정의와 동시에 생성 -> 매개변수로 익명클래스를 받는경우
        // 인라인으로 정의를 함과 동시에 매개변수로 전달할 수 있다.
        calcNum(10, 5, (a, b) -> a + b);

    }
}
