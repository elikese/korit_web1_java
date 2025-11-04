package _31_NestedClass.anonymous;

public class Main {
    public static void main(String[] args) {
        /*
        익명클래스(***) - 람다와 이어진다(클래스가 포장지처럼 쓰인다)
        - 이름이 없는 클래스.
        - new(생성)과 동시에 정의를 같이 해준다.
        - 한번 쓰고 버릴 클래스
        */
        // 추상메서드를 모두 구현하라!(정의)
        // 추상메서드구현(정의)
        // -> new (Hello 인터페이스의 인스턴스가 아니다!, 익명1, 익명2)
        // -> Hello 타입변수에 대입 (캐스팅) - 항상 업캐스팅된 상태로만 사용가능하다.
        Hello hello = new Hello() { // Hello 인터페이스의 인스턴스가 아니다!
            @Override
            public void bye() {
                System.out.println("안녕히 계세요");
            }

            @Override
            public void hello() {
                System.out.println("안녕하세요!");
            }
        };

        // Hello 클래스의 인스턴스가 아니라, 익명1, 익명2.....
        System.out.println(hello.getClass().getName());

        // 실제 만들어진 객체타입은 익명타입이다.
        // 항상 업캐스팅 되어진 상태로만 사용 가능하다.
        Character character = new Character("마스터", 999, 99) {
            @Override
            public void attack(Character target) {
                System.out.println("운영자 입니다.");
                target.receiveDamage(attackDamage);
            }
        };
        // 우리가 추상클래스로 부터 구현한 익명클래스 이름
        System.out.println(character.getClass().getName());


    }
}
