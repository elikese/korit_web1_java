package _13_Array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        // 참조자료형의 특징 - "."으로 참조할 수 있다.
        // 배열(Array) 또한 참조자료형

        int[] original = {1,2,3,4,5};

        // 배열 내부를 볼때: Arrays.toString(배열을 담은 변수)
        System.out.println(Arrays.toString(original));

        int[] copy1 = original; // 얕은 복사(stack 값 복사)
        System.out.println(Arrays.toString(copy1));

        // 깊은복사: heap에 새로운 메모리 할당해서 실제 값을 복사
        int[] copy2 = Arrays.copyOf(original, original.length);

        original[0] = 999; // original의 0번째 index에 999대입
        System.out.println(Arrays.toString(original));

        // 얕은복사를 했기때문: 같은 메모리주소(heap)를 저장하고 있기 때문
        System.out.println(Arrays.toString(copy1));
        // 깊은복사 결과
        System.out.println(Arrays.toString(copy2));






    }
}
