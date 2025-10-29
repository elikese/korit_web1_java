package _22_Static;

public class StaticMethod {
    // 객체마다 가지고 있음
    private int instanceValue;

    // 클래스마다 가지고 있음(이 클래스로 나온 모든 객체가 공유)
    private static int staticValue;

    // 스태틱 메서드 -> 스태틱 변수, 스태틱 메서드만 사용 가능하다.
    public static void staticMethod() {
        // instanceValue 인스턴스변수에 접근 x
        // -> 초기화가 안되었음(static이 더 빨리 메모리에 로드됨)
        // instanceMethod() 인스턴스메서드 호출 x
        // -> 인스턴스 메서드는 this(초기화 하면 생김)를 가지고 있기 때문
        // this도 사용 불가능! -> 객체가 생성되기 전에 메모리에 로드됨
        
        staticValue++; // 스태틱변수는 접근 가능
    }

    // 인스턴스 메서드
    public void instanceMethod() {
        // new 이후에 호출되는 메서드 -> this(객체의 heap 주소)가 존재함
        this.instanceValue++; // 인스턴스 변수 접근 o
        staticValue++; // 실행시 이미 메모리에 있음
        staticMethod(); // 실행시 이미 메모리에 있음
    }





}
