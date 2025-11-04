package _31_NestedClass.nested;

public class Main {
    public static void main(String[] args) {
        /*
        내부 클래스(클래스 안에 클래스)
        내부클래스 - 권장하지 x
        내부클래스의 객체는 반드시 외부 클래스의 객체 안에서만 생성될 수 있다.
        -> 내부인스턴스는 항상 바깥인스턴스를 참조하고 있다.
        바깥인스턴스는 사용되지 않고, 내부인스턴스만 사용되는 상황이 오더라도
        바깥인스턴스는 정리되지 않고(참조가 있기 때문에) 결과적으로 메모리 누수로 이어진다.

        잘 설계하려면?
        1. 내부인스턴스의 생성을 바깥클래스의 메서드를 통해서만 생성하게 만들어야 한다.
        2. 내부인스턴스들을 바깥인스턴스의 필드로 저장해야 한다.(private)
        3. 내부클래스의 생성자를 private로 선언해줘야 한다.
        */

        // 정적 내부 클래스 - 사실상 바깥클래스와 독립적인 클래스
        // 다만 바깥클래스의 private 메서드와 필드에 접근할 수 있다.

        // 생성자와 달리 필드초기화 할때 순서가 상관 없어진다.
        Member member1 = Member // 클래스참조
                .builder() // static 메서드 호출 -> 결과: Builder 객체 생성
                .age(20) // 생성한 Builder 객체에 set
                .name("홍길동") // 생성한 Builder 객체에 set
                .email("java@naver.com") // 생성한 Builder 객체에 set
                .build(); // set해준 Builder 객체의 필드를 그대로 member 객체로 이동시켜 생성

        // 내부 클래스를 참조하기 위해 바깥 User 객체를 생성
        User user1 = new User.Builder() 
                .username("사용자1")
                .name("홍길동")
                .address("부산시")
                .email("java@naver.com")
                .build();

        LombokUser lombokUser = LombokUser
                .builder()
                .username("자바맨")
                .name("김길동")
                .email("java@naver.com")
                .address("부산시")
                .build();

        // 롬복이 알아서 만들어준 toString()
        System.out.println(lombokUser);
    }
}
