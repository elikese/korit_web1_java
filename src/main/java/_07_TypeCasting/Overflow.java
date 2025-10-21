package _07_TypeCasting;

public class Overflow {
    public static void main(String[] args) {
        // 큰 -> 작은 자료형 변환시, 흘러넘칠 가능성이 있다.
        // int의 범위: -21억 ~ 21억
        long maxIntValue = 2_147_483_647L; // int 최대값
        long overIntValue = 2_147_483_648L; // int 최대값 + 1

        // 정상적인 형변환
        int intValue1 = (int) maxIntValue; // 명시적 형변환
        System.out.println(intValue1);

        // 오버플로우
        int intValue2 = (int) overIntValue; // 명시적 형변환
        System.out.println(intValue2);

        // 체중계가 0~100kg까지 측정할 수 있다.
        // 130kg사람이 체중계에 올라가면, 눈금이 30kg을 가르킨다.
        
        /* 참고)
        8비트 데이터 가정,
        음수표현은 2의 보수로 표현한다
        2의 보수: 비트를 반전하고, 1을 더하는 것
        0000 0001 -> 1
        1111 1110 + 1 -> 1111 1111 -> -1
        ---
        쉽게 일반화: 맨 앞자리를 부호표시용으로 쓴다.
        0111 1111 -> 127
       +0000 0001 -> 1
       ----------
        1000 0000 -> -128
        */

        // 서비스를 만들때, 정수타입은 long 고려하자.


    }
}
