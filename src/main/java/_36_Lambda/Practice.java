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

    }
}
