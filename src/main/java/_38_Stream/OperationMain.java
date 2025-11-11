package _38_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OperationMain {
    public static void main(String[] args) {
        // Stream 중간연산자, 최종연산자
        // 중간연산자
        // 1. filter
        // 2. map
        // 3. distinct(), limit()

        // 4. sorted() - 정렬
        // Comparator<T> 함수형 인터페이스를 매개변수로 받는다.
        // Comparator<T> compare(T o1, T o2)
        // o1 과 o2를 비교(구체적인 방법을 구현해야한다)
        // o1과 o2가 같으면 0으로 구현
        // o1이 크면 양수가 되도록 구현
        // o1이 작으면 음수가 되도록 구현
        List<String> names = Arrays.asList("김자바", "이파이썬",
                "박스프링", "최코틀린", "김자바", "정리액트");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,
                6, 7, 10, 9, 8);

        // 숫자 정렬
        List<Integer> sortedNumbers = numbers.stream()
                .sorted((num1, num2) -> num1 - num2)
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);
        // 문자(문자열) 정렬
        // 문자는 숫자로 변환할 수 있음
        // b가 a보다 더 큰 숫자로 변환된다.
        // (사전에서 뒤에 출현하는 문자가 더 큰 숫자)
        // 문자열1.compareTo(문자열2) // 문자열1 - 문자열2

        List<String> sortedNames = names.stream()
                .sorted((str1, str2) -> str1.compareTo(str2))
                .collect(Collectors.toList());

        System.out.println(sortedNames);

        // 숫자를 내림차순 정렬
        // 문자열도 사전역순 정렬
        List<Integer> sortedDescNumbers = numbers.stream()
                .sorted((num1, num2) -> num2 - num1)
                .collect(Collectors.toList());
        System.out.println(sortedDescNumbers);

        List<String> sortedDescNames = names.stream()
                .sorted((str1, str2) -> str2.compareTo(str1))
                .collect(Collectors.toList());
        System.out.println(sortedDescNames);

        // 최종연산자
        // 1. collect()
        // 2. forEach()
        // 3. 조건매칭 - anyMatch(), allMatch(), noneMatch()
        // Predicate<T> 를 매개변수로 받는다.
        // 리턴으로 boolean타입을 리턴한다.

        boolean hasKim = names.stream()
                .anyMatch(name -> name.startsWith("김"));
        // 결과가 하나라도 true면 true

        boolean isAllOver2Name = names.stream()
                .allMatch(name -> name.length() >= 2);
        // 결과가 모두 true면 true

        boolean noShortName = names.stream()
                .noneMatch(name -> name.length() < 2);
        // 결과가 모두 false면 true

        // 4. 통계연산 - count(), min(), max()
        long countKim = names.stream()
                .filter(name -> name.startsWith("김"))
                .count();

        // max() - Comparator<T>를 매개변수로 받는다.
        String longestName = names.stream()
                .max((name1, name2) -> name1.compareTo(name2))
                .orElse("없음"); // names가 비어있을 수 있음

        Integer maxValue = numbers.stream()
                .max((num1, num2) -> num1 - num2)
                .orElse(0);
        
        // 추가) Optional?
        // 변수에 값이 존재할 수도 있고, 없을 수도 있는 상황에서 사용
        // 변수를 필드로 가지는 컨테이너 클래스 -> null로 인한 예외를 사전에 예방하려고

        // 5. reduce()
        // numbers에 있는 모든값의 총합을 구해보자!
        // reduce(초기값, (누적시킬변수, 순회시킬변수) -> 연산식)
        // stream은 외부변수를 사용할 수 없음 (final만 가능)
        // 누적합 sum += num 코드를 사용할 수 없음

        int total = numbers.stream()
                .reduce(0, (sum, num) -> sum + num);

        int sum = 0;
        for(int num : numbers) {
            sum = sum + num;
        }

        System.out.println(sum);
        System.out.println(total);
        





    }
}
