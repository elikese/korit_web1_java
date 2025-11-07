package _35_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsMain {
    public static void main(String[] args) {
        /*
        배열: Arrays.유틸리티메서드()
        Collections - 주로 List의 유틸리티를 제공하는 유틸리티 클래스
        보통 유틸리티 클래스는 static 메서드들을 가지고 있다.
        */
        String[] names = {"홍길동", "김길동"};
        // Arrays 객체를 만들지 않고 메서드 호출이 가능했다.
        // Arrays 안에 toString()은 static 메서드로 정의되어 있기 때문
        Arrays.toString(names);

        // List, Set, Map -> 제네릭 클래스
        // 제네릭: 컴파일시점에 타입을 추론, 런타임때는 Object로 취급
        // 원시자료형(int, double, float...)을 제너릭으로 취급할 수 있나요?
        // -> 없습니다. 런타임때 Object 취급을 받기위해서는 참조자료형이어야 한다.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3); // 제일 뒷자리에 추가
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);

        System.out.println("원본상태: " + numbers);
        // 정렬(원본을 조작한다)
        Collections.sort(numbers);
        System.out.println("정렬 후: " + numbers);

        Collections.reverse(numbers);
        System.out.println("역순 정렬: " + numbers);

        // 최대, 최소
        Integer max = Collections.max(numbers); // 5
        Integer min = Collections.min(numbers); // 1


    }
}
