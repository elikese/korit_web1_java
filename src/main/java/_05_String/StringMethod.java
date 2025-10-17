package _05_String;

public class StringMethod {
    public static void main(String[] args) {
        /*
        - 자료형 분류
        1. 첫글자가 소문자인 자료형: 원시자료형
        -> int, double, long, boolean..
        2. 첫글자가 대문자인 자료형: 참조자료형
        -> Scanner, String, Array, 클래스...

        - JVM(java virtual machine)
        -> .class 파일을 읽고 os에 명령을 내리는 주체
        - JVM의 메모리구조!
        1. Stack(스택)
            - 원시자료형(소문자시작)의 실제 값이 저장된다.
            - 참조자료형의 메모리 주소(heap에 있는주소)가 저장된다.
        2. Heap(힙) - 실제 참조자료형의 실제 값이 저장된다.
        3. MethodArea(메서드영역) - 차후에 설명
        */

        int num = 10; // a2(stack) 메모리주소에 저장되어있음
        // 참고) 메모리주소는 16진수 - "0x"로 시작함 - 0x00007FFDEA2..

        // 참조자료형 - 참조할 수 있다(.으로 기능들을 사용할 수 있다)
        String name = "홍길동";

        // 1. 실제 문자열 값 비교
        // 원시자료형은 '==' 비교연산자로 비교했음
        // '=='연산자는 stack에 저장된 값을 비교하는 것
        // .equals()를 사용한다!
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 == str2); // 같을까?
        System.out.println(str1.equals(str2)); // 문자열 값의 올바른비교

        // 2. 문자열끼리 덧셈 가능하다
        // c4 - 안녕하세요, c5 - 반갑습니다.
        // 콘솔창에 보여지는 연결된 문자열은 c4 데이터일까? c5 데이터일까?
        // 아니면 제 3의 주소에 저장된 값일까?
        System.out.println("안녕하세요 " + "반갑습니다."); // 연결 된다.

        // 3. 다른 자료형과도 덧셈 가능
        // 덧셈연산시, 다른 자료형이 문자열로 변환된다.
        System.out.println("점수: " + 100 + "점"); // 100은 int 자료형

        // 주의: 연산자 우선순위
        // ()1등이다 / 대입이 꼴찌다 / 동등할경우 왼쪽에서 오른쪽으로 진행
        // 다른 자료형과 문자열 연산시, 우선순위를 주의하자
        System.out.println("점수: " + (10 + 5) + "점");

        // 복합대입도 덧셈은 가능
        name = "홍길동";
        name += "님";

        // 문자열은 단어들이 이어진 것이다. - 각 단어마다 순서가 있다.
        // 순서를 index라고 부른다 - 0부터 카운트 한다.
        String str = "My name is Son";

        // 4. 문자열 길이 확인 // 결과타입 : int
        str.length(); // 문자열의 문자갯수를 가져온다.
        System.out.println("문자열 길이: " + str.length());
        
        // 5. 대소문자 변환 // 결과타입: String
        System.out.println(str.toUpperCase()); // 문자열 전체를 대문자로
        System.out.println(str.toLowerCase()); // 문자열 전체를 소문자로

        // 6. 특정 문자열의 포함 여부 // 결과타입: boolean
        System.out.println(str.contains("name")); // true
        System.out.println(str.contains("age")); // false


    }
}
