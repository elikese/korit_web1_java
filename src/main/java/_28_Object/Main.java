package _28_Object;

public class Main {
    public static void main(String[] args) {
        /*
        Object 클래스 - 자바의 모든 클래스의 최상위 부모 클래스
        모든 클래스는 Object를 상속받고 있다.
        -> Object가 가진 메서드를 사용할 수 있다.
        1. toString()
        2. equals()
        3. hashCode()
        */

        ObjectStudent st1 = new ObjectStudent("홍길동", 20);
        // printf(), println() -> 
        // 1. 원시값을 문자열로 변환해서 출력
        // 2. 객체들은 .toString() 결과를 출력
        // Arrays.toString(): 미리 누군가가 toString()을 오버라이딩 해놓은 것
        // println 내부에서는 toString()을 호출하고있음
        // 호출당하는 객체마다 서로 다른 결과 -> 다형성.
        System.out.println(st1);

        ObjectStudent st2 = new ObjectStudent("홍길동", 20);
        // == 연산자 -> stack에 있는 값비교
        // 참조자료형(객체) -> stack에 heap 주소 저장
        
        System.out.println(st1 == st2); // false
        // 변수에 변수를 대입 -> stack에 있는 데이터를 복사해서 대입
        // 매개변수로 데이터를 넘길때도 stack에 있는 데이터를 복사해서 대입
        ObjectStudent st3 = st1; // 얕은 복사
        System.out.println(st1 == st3); // true

        // 오버라이딩 된 equals() 호출
        System.out.println(st1.equals(st2)); // true
        String str1 = "Hello";
        String str2 = new String("Hello");

        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true

    }
}
