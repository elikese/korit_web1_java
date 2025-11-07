package _36_Lambda;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        // List.of() 로 List 생성하면, 불변객체(변경이 불가능)로 생성됨
        List<String> customerNames
                = List.of("홍길동", "김길동", "박길동", "최길동");

        // 람다로 customerNames에 담긴 이름들 뒤에 +"님" 을 붙히는 코드
        // "홍길동" -> "홍길동님"
        List<String> nims = new ArrayList<>();
        // 람다 축약
        StringProcessor makeNim = s -> s + "님";
        for(String name : customerNames) {
            String addNim = makeNim.process(name);
            nims.add(addNim);
        }
        System.out.println(nims);

        List<String> lowers = List.of("aaa", "bbb", "ccc", "ddd");
        // StringProcessor를 재정의하여서 람다식으로
        // lowers에 있는 소문자들을 모두 대문자로 만들어서 uppers에 담아주시고
        // 최종 uppers를 출력해주세요!
        // 문자열.toUpperCase() 사용하면 됩니다!
        List<String> uppers = new ArrayList<>();
        // StringProcessor 인터페이스를 이식받은 익명클래스
        // 추상메서드(process)를 강제 구현
        // makeUpper는 process를 구현한 익명객체를 담은 변수(캐스팅 된 상태)
        StringProcessor makeUpper = s -> s.toUpperCase();
        for (String lower : lowers) {
            uppers.add(makeUpper.process(lower));
        }

        List<String> names = List.of("김풍", "침착맨",
                "이순신", "홍길동",
                "을지문덕", "페이커",
                "손", "쵸비");
        // 이름이 3글자 미만인 이름들만 따로 저장하고 싶다!
        // 람다로 구현해보자!
        StringChecker is3Name = s -> s.length() < 3;
        List<String> under3Names = new ArrayList<>();
        for (String name : names) {
            if(is3Name.check(name)) {
                under3Names.add(name);
            }
        }
        System.out.println(under3Names);

        List<String> inputs = List.of("hello", "",
                "world!", "",
                "java", "");

        // 빈문자열이면 true, 빈문자열이 아니면 false 로직을 담은
        // StringChecker를 정의 해주세요
        StringChecker emptyChecker = s -> s.isBlank();
        List<String> notEmptyStrings = new ArrayList<>();
        // notEmptyStrings에 빈문자열을 제외하고 추가
        for (String input : inputs) {
            if(emptyChecker.check(input)) {
                continue;
            }
            notEmptyStrings.add(input);
        }




        
    }
}
