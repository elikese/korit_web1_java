package _13_Array;

public class StackHeap {
    public static void main(String[] args) {
        // JVM(자바코드를 운영체제로 전달해주는 소프트웨어)의 메모리(ram)
        // stack + heap + a....
        // stack: 고정크기, 작은크기, 빠르게 접근가능,
        // 원시자료형 값/ 참조자료형의 주소(heap의 메모리주소) 저장
        // heap: 유동적인크기, 큰크리, 물어 물어 찾아가야한다.
        // 참조자료형의 값/ 주소저장,,,JVM이 알아서 관리/정리

        int age = 25;
        boolean isStudent = true;
        /*
        현재 stack:
        -main-
        age: 25
        isStudent: true
        
        현재 heap:
        비어있음
        */

        int[] scores = {85, 90, 70};
        /*
        현재 stack:
        -main-
        age: 25
        isStudent: true
        scores: 0x1000(주소 저장)

        현재 heap:
        0x1000: 85
        0x1004: 90
        0x1008: 70
        */
        // scores[1] -> 0x1000에서 int자료형의 크기만큼 내려가서 찾자! -> 90

        // ****변수에 변수를 대입하는것 -> stack값을 복사하는 것****
        int[] copy = scores;

        /*
        현재 stack:
        -main-
        age: 25
        isStudent: true
        scores: 0x1000(주소 저장)
        copy: 0x1000(주소 저장)

        현재 heap:
        0x1000: 85 -> 999
        0x1004: 90
        0x1008: 70
        */

    } // main메서드 종료

    /*
        현재 stack:
        비어있음

        현재 heap:
        0x1000: 85 -> 999 (참조 끊김) -> 알아서 메모리에서 내려감
        0x1004: 90 (참조 끊김) -> 알아서 메모리에서 내려감
        0x1008: 70 (참조 끊김) -> 알아서 메모리에서 내려감
        0x1000을 참조하는 변수가 없음 -> JVM이 정리(가비지 컬렉터)
    */
}
