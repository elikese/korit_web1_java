package _35_Collections;

import _28_Object.ObjectStudent;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        // Map - 추상체
        // 구현체 : HashMap(해쉬함수를 쓰는 Map)
        // key로 data를 관리하는 구조 / array - index로 data를 관리하는 구조
        // key로 관리하다보니 arrayList에 비해 상대적으로 무겁다(오버헤드가 있다)

        Map<String, Integer> studentMap = new HashMap<>();

        // 추가 - put()
        studentMap.put("김자바", 90);
        studentMap.put("이파이썬", 85);
        studentMap.put("박스프링", 92);
        /*
        {
            "김자바": 90,
            "이파이썬": 85,
            "박스프링": 92
        }
        */



        // 조회 - get(key)
        // : value가 리턴이 된다.
        System.out.println(studentMap.get("김자바"));
        // Map에서는 key 중복이 불가능하다. - 중복이 안되게하는 방법이 해쉬함수
        // 중복이 되면, 나중에 들어오는 key-value가 기존값을 덮어쓴다.
        studentMap.put("김자바", 100);
        System.out.println(studentMap.get("김자바"));

        // 만약에 key로 객체를 쓰는 경우 어떻게 중복을 판단할 것인가?
        // 1. 주소가 같으면 같게 하겠다.
        // 2. 필드가 같으면 같게 하겠다....등등
        // hashcode(), equals()의 결과가 모두 동일하면, 같은 객체다.
        // 같은 객체면 key로 사용할 때 중복제거의 대상이 된다.
        Map<ObjectStudent, Integer> myMap = new HashMap<>();
        
        // 크기 - size()
        System.out.println(studentMap.size());

        // 제거 - remove(key)
        studentMap.remove("박스프링");
        // 없는 key를 remove해도 아무일도 일어나지 않는다.
        // HashMap의 key는 Set으로 구성되어 있기 때문에
        studentMap.remove("아무개"); // 런타임, 컴파일 에러 x

        // Map을 for문으로 순회하는 방법
        // 1. key들만 따로 뽑아내서 for문으로 일일이 get해주는방법
        Set<String> keys = studentMap.keySet(); // 모든 키를 Set으로 리턴
        // keySet()메서드 내부에서 for문을 사용하고 있다.
        for(String key : keys) {
            Integer value = studentMap.get(key);
            System.out.println(key + ": " + value);
        }

        // Map안에 Map가능합니까?
        /*
        {
            "홍길동" : {
                "주소" : "부산",
                "나이" : "20"
            },
            "김길동" : {
                "주소" : "서울",
                "나이" : "22"
            }
        }
        */
        // Set안에 Map 가능합니까?
        // 중복제거 -> Map클래스의 hashCode(), equals()가 사용된다.
        // key가 기준이되어서 중복이 제거된다.
        
        // 2. 키-값을 한번에 set으로 바꿔서 키-값 쌍 순회
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        /*
        {
            {
            "김길동" : 90
            },
            {
            "박길동" : 80
            },
        }
        */
        for (Map.Entry<String, Integer> entry : entries) {
            String name = entry.getKey();
            Integer score = entry.getValue();
            System.out.println(name + ": " + score);
        }
        // 두가지 방법 모두 성능이 비슷비슷한데,
        // 방법1) keySet() + .get() -> 매 반복마다 해시탐색
        // 방법2) entrySet() -> 해시탐색 1회로 키 + 값 모두 접근
        // 수만개 데이터기준으로는 20% ~ 30% 차이가 난다.
        // 방법2를 권장한다.



    }
}
