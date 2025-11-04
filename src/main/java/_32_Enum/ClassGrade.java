package _32_Enum;

public class ClassGrade {
    // Enum? 상수대신 사용하는 것
    // 상수 "static final"
    /*
        상수의 문제점
        1. 컴파일 시점에 타입 검증이 불가능하다.
        -> 런타임에 내가 의도하지 않게 작동할 뿐이다.
        2. 그룹화가 어렵다.
        3. 네임스페이스 부족: 같은 이름의 상수들을 구분하기가 어렵더라
        
        문자열(String), 숫자(int,long)대신에 객체를 상수처럼 쓰면 안될까?
    */
    // ClassGrade - 등급에 따라 할인율을 차등적용
    private int discountRate;

    public static final ClassGrade BASIC = new ClassGrade(5);
    public static final ClassGrade GOLD = new ClassGrade(10);
    public static final ClassGrade DIAMOND = new ClassGrade(20);

    // private 외부접근 막아줌
    private ClassGrade(int discountRate) {
        this.discountRate = discountRate;
    }
}
