package _36_Lambda;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("홍길동", 18),
                new Person("김자바", 22),
                new Person("이파이썬", 30),
                new Person("박리액트", 15)
        );
        
        // 람다로 20세 이상을 찾는 코드를 구현
        PersonChecker adultChecker = p -> p.getAge() >= 20;
        // 성인만 담는 리스트
        List<Person> adults = new ArrayList<>();
        for (Person person : people) {
            if(adultChecker.check(person)) {
                adults.add(person);
            }
        }
        System.out.println(adults);

        // 이름이 3글자 초과인 사람들만 뽑아서 results에 add 해주세요!
        // 뽑는것은 PersonChecker를 implement 받은 익명클래스의 객체로 구현(람다)
        List<Person> results = new ArrayList<>();
        PersonChecker longNameChecker = p -> p.getName().length() > 3;

        for (Person p : people) {
            if(longNameChecker.check(p)) {
                results.add(p);
            }
        }

        // 이름의 두번째 글자를 *로 바꿔주는 람다 코드작성
        // Person 객체를 매개변수로 받아서, 이름을 변경하고,
        // 이름이 변경된 Person 객체를 리턴해준다.
        Modifier<Person> makeMasking = p -> {
            String name = p.getName();
            if (name.length() >= 2) {
                String maskedName
                        // charAt(index) : 문자열에서 한글자만 추출할 때 사용
                        = name.charAt(0)
                        + "*"
                        + name.substring(2);
                // Person 객체를 리턴해줘야 하는데,
                // 1. 매개변수로 받은 Person 객체를 조작(setter 사용)
                // 2. 새로운 Person 객체를 만들어서 리턴(new 사용) - 좀 더 일반적
                return new Person(maskedName, p.getAge());
            }
            return new Person(p.getName(), p.getAge());
        };

        List<Person> maskingPeople = new ArrayList<>();
        for (Person person : people) {
            Person maskedPerson = makeMasking.modify(person);
            maskingPeople.add(maskedPerson);
        }
        System.out.println(maskingPeople);

        // Modifier를 이용
        // 미성년자(age가 20세 미만)의 이름을 "비공개"로 바꾸는 Modifier를 작성
        List<Person> minors = new ArrayList<>();
        // 바꾼 Person 객체들을 minors에 담아서 출력!
        Modifier<Person> hideMinorNames = p -> {
            if(p.getAge() < 20) {
                // 20 미만일때
                return new Person("비공개", p.getAge());
            }
            // 20 이상일떄
            return new Person(p.getName(), p.getAge());
        };

        // setter를 쓰는방법
        Modifier<Person> hideMinorNames2 = p -> {
            if(p.getAge() < 20) {
                p.setName("비공개");
            }
            return p;
        };


        for (Person person : people) {
            Person hidingPerson = hideMinorNames.modify(person);
            minors.add(hidingPerson);
        }

        System.out.println(people);
        System.out.println(minors);

        List<Person> setterVer = new ArrayList<>();
        for(Person p : people) {
            Person modifiedPerson = hideMinorNames2.modify(p);
            setterVer.add(modifiedPerson);
        }

        System.out.println(setterVer);
        System.out.println(people); // setter로 구현하면, 원본보존 x


        
    }
}
