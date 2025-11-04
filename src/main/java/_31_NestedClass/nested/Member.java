package _31_NestedClass.nested;

public class Member {
    // 정적 내부 클래스 - 빌더패턴
    // 내부적으로 유틸리티 클래스가 필요할 때
    
    // 빌더패턴 - 생성자를 대체하는 패턴
    // 1. 많은 필드들을 어떻게 다양하게 초기화 할 수 있을까?
    // 2. 순서와 상관없이 만들게 하고 싶다.
    private String name;
    private int age;
    private String email;

    private Member(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    public static Builder builder() {
        return new Builder();
    }

    // 정적(static) 내부클래스
    // 내부클래스와는 다르게 static이라 단독으로 존재할 수 있음.
    // 사실상 서로 다른 클래스 - 차이점: 바깥클래스의 private에 접근가능
    public static class Builder {
        // 바깥클래스의 필드를 동일하게 가져간다.
        private String name;
        private int age;
        private String email;

        // 자기 자신을 리턴하는 메서드: 메서드 체이닝
        // a.name("홍길동").age(10).email("java@naver.com")
        // setter 역할을 하는 메서드들
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        // setter 역할을 하는 메서드들
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        // setter 역할을 하는 메서드들
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Member build() {
            // private 바깥생성자 호출
            // builder 객체를 넘겨준다(자기자신)
            return new Member(this);
        }

    }
    
}
