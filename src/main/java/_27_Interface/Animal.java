package _27_Interface;

public interface Animal {
    // 객체의 필드 선언 불가능(인터페이스는 Method Area에만 존재)
    // 상수는 선언이 가능하다.(값의 경우 public static final은 생략가능)
    // String name = "NAME";
    
    // 모든 메서드가 public abstract가 붙는다.(생략가능)
    // -> 시그니처만 정의
    void sound();
    void move();
}
