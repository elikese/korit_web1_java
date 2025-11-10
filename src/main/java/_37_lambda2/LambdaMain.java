package _37_lambda2;

import java.util.ArrayList;
import java.util.List;

public class LambdaMain {
    public static void main(String[] args) {
        // 메서드를 객체처럼 다루고 싶다.
        // 자바는 메서드가 단독으로 객체처럼 값이나, 변수에 할당이 불가능
        // -> 익명클래스의 객체를 쓰자(익명클래스는 포장지, 본체는 메서드)
        
        // 익명클래스를 포장지로 사용한 예시
        // add: Calculator 인터페이스를 implements받은 익명클래스 객체를 담은 변수
        Calculator add = new Calculator() { // 업캐스팅된 상태
            @Override
            public int calculate(int number1, int number2) {
                return number1 + number2;
            }
        };
        
        // 생략이 가능하다.
        // Calculator 인터페이스에 선언된 추상메서드가 하나밖에 없기때문에
        // -> 시그니처 특정이 가능하다.
        // 시그니처부분(메서드명, 매개변수타입, 리턴타입) 생략
        // 한줄로 리턴이 가능할때만 중괄호 + return 키워드 생략가능
        Calculator lambdaAdd = (num1, num2) -> num1 + num2;

        // Modifier를 이식받아서, Integer -> String
        // 매개변수가 하나면 ()도 생략가능
        Modifier<Integer, String> numToString = num -> "" + num;
        System.out.println(numToString.modify(10)); // 문자열 10으로 변경됨

        List<String> names = List.of("홍길동", "김길동", "박길동", "이길동");
        // Modifier를 사용해서 names에 있는 이름들 뒤에(addNim)
        // "~님"으로 추가해서 nims에 담아주세요
        List<String> nims = new ArrayList<>();

    }
}
