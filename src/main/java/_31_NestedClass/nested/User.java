package _31_NestedClass.nested;

// User 클래스에 빌더패턴을 적용시켜 주세요!
// -> 내부 정적 클래스(Builder)를 만들어서 필드 초기화를 맡겨야겠다.
// 1. static 메서드로 내부 정적 클래스 객체를 생성해야겠다.
// 2. 메서드체이닝으로 만들어야겠다.
// 3. 다 완성한 필드구성은 바깥클래스 생성자로 가져와야겠다.

public class User {

    private String username;
    private String name;
    private String email;
    private String address;

    private User(Builder builder) {
        this.username = builder.username;
        this.name = builder.name;
        this.email = builder.email;
        this.address = builder.address;
    }

    public static class Builder {
        private String username;
        private String name;
        private String email;
        private String address;

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            // 바깥클래스의 private 생성자를 호출
            return new User(this);
        }

    }



}
