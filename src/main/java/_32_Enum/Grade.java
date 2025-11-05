package _32_Enum;

// enum -> 정체는 클래스(Enum이라는 클래스를 상속받은)이다.
// 많은 코드들이 생략되어있다 -> 컴파일러가 알아서 자동으로 추가
// enum은 Enum 클래스를 상속받은 상수용 인스턴스 제조 클래스
public enum Grade {

    // public static final Grade BASIC = new Grade(5);
    // BASIC(5) -> 변수이름(생성자에게 넘겨주는 매개변수)
    BASIC(5),
    GOLD(10), 
    DIAMOND(20);

    private int discountRate;

    // 생성자에 private 생략가능, public 지정 불가능
    Grade(int discountRate) {
        this.discountRate = discountRate;
    }

    // 클래스로부터 만들어진 것이기 때문에 메서드정의가 가능
    public int getDiscountRate() {
        return discountRate;
    }

    // 할인계산로직을 Grade에 위임할 수 있다.(클래스이기 때문)
    // SOLID - 객체지향프로그래밍 설계 원칙(권장)
    // 단일책임원칙(Single Responsibility Principle)
    // 하나의 클래스는 하나의 책임만 책임지게 설계하라
    // 답이 정해져 있는게 아니고, 상황마다 유연하게 대처
    public double getDiscountPrice(int price) {
        return price * discountRate / 100.0;
    }

    // 권장사용 예시 - 서로 논리적으로 관련있는 상수들
    // 회원등급, 요일, 문제유형, 커스텀예외

}
