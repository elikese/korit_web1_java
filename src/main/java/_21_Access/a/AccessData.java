package _21_Access.a;

public class AccessData {
    // 접근제어자 - 클래스, 메서드, 필드
    public int publicField;
    int defaultField;
    private int privateField;

    // 메서드
    public void publicMethod() {
        System.out.println("퍼블릭 메서드 호출!");
    }

    void defaultMethod() {
        System.out.println("디폴트 메서드 호출!");
    }

    // 클래스 내부에서만 호출할 수 있음
    // - 클래스 내부 메서드 안에서 호출되는 메서드
    private void privateMethod() {
        System.out.println("프라이빗 메서드 호출!");
    }

    public void inner() {
        // private 메서드는 같은 클래스 내부에서만 호출
        privateMethod();
    }

}
