package _35_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        // Set - 추상체
        // 사용할 구현체: HashSet
        // 저장을 위한 자료구조라기 보다는, 연산을 위한 자료구조
        // 순서가 보장되지 않는다, 중복을 허용하지 않는다.
        // 집합연산을 지원한다.

        Set<String> fruits = new HashSet<>(); // 업캐스팅
        
        // 추가 - add()
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("apple"); // 중복

        System.out.println(fruits);

        // 길이 - size()
        System.out.println(fruits.size());

        // 포함하는지 확인은 가능하다 - contains()
        // 해쉬함수를 사용하기 때문에 매우 빠르다.(조회가 빠르다)
        System.out.println(fruits.contains("banana"));

        // 제거도 빠르다(조회가 빠르고, 순서가 없음) - remove()
        System.out.println(fruits.remove("apple"));
        fruits.remove("아무개"); // 없는 자료면 아무일도 안일어난다.

        // 집합연산을 지원한다.
        Set<String> names1 = new HashSet<>();
        Set<String> names2 = new HashSet<>();

        names1.add("홍길동");
        names1.add("박길동");
        names1.add("고길동");

        names2.add("박길동");
        names2.add("최길동");
        names2.add("김길동");

        // 합집합 - addAll()로 각 요소들을 추가한 후 중복제거
        Set<String> union = new HashSet<>(names1);
        union.addAll(names2); // names2에 모든 요소를 names1에 add()수행
        System.out.println(union);

        // 교집합 - retainAll()
        Set<String> intersection = new HashSet<>(names1);
        intersection.retainAll(names2); // 중복값만 남김
        System.out.println(intersection);

        // 차집합 - removeAll()
        // 상대 Set에 있는 자료들 모두 각각 remove()를 수행한다.
        Set<String> difference = new HashSet<>(names1);
        difference.removeAll(names2);
        System.out.println(difference);

        // 문자열.split() : 특정 문자열 기준으로 문자열을 분리해서 배열로 리턴
        String str1 = "my name is Son";
        String[] myStrings = str1.split(" ");
        System.out.println(Arrays.toString(myStrings));

        // 실습) 아래의 문장에서 중복되는 단어들을 제거해 주세요
        // split() -> 배열 -> Set으로 변환(for문)
        String text = "java is good java is powerful";
        String[] words = text.split(" "); // 단어들 추출
        Set<String> uniques = new HashSet<>(); // 빈 set 생성
        for(String word : words) {
            uniques.add(word); // 하나씩 담아준다.
            // 알아서 중복값은 추가되도 제거될 것
        }
        System.out.println("결과: " + uniques);

    }
}
