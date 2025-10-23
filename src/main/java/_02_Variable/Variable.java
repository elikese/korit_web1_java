package _02_Variable;

public class Variable {
    public static void main(String[] args) {
        // 변수 쓰는 이유
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        // "hello" -> "world!" 변경하라
        // 노가다 -> 변수를 통해 특정 값을 저장(ram - 주기억장치)
        // ram에 데이터를 저장하는 행위

        // 변수 선언(빈 박스를 만들었다)
        // 변수 선언(ram 메모리주소(stack)를 지정했다)
        // 자료형 변수명
        String greeting;
        
        // 변수 초기화
        // "="은 같다는 의미가 아니다.
        // 우변의 데이터를 좌변의 변수에 저장하겠다.
        greeting = "hello";
        
        // 변수 선언 및 초기화
        String academy = "Korea IT";
        
        // 변수 재할당(이전에 있던 Hello는 사라짐)
        greeting = "World!";
        
        // 여러개를 한번에 선언 및 초기화
        String city = "부산", name = "박화목";

        /*
        명명법
        1. 필수규칙
            String 1name // 숫자로 시작할 수 없다.
            String my name // 공백을 포함할 수 없다.
            String class
            String if // 자바 예약어는 사용할 수 없다.
        2. 관례(국룰)
            파스칼표기법 LastName, PascalCase - 클래스명, 파일명
            카멜표기법 lastName, pascalCase - 변수명, 함수(메소드)명
        3. 매너
            의미없는 변수명을 사용하지 말자
            bad ex) num1, a, b, c, temp(tmp, t)
            good ex) 현재 쇼핑카트에 담긴 물품 갯수:
            numberOfItemsCurrentlyInShoppingCart
        */


    }
}
