package _24_Inheritance.car;

// 부모 클래스 - 기초 설계도(공통부분) 역할
// 모든 차가 가져야할 공통 필드, 기능들을 정의
// 참고) 공통필드, 공통기능을 추려내는 것 -> 추상화
public class Car {
    // 상속 - 부모의 protected, public 필드, 메서드들을 물려받는 문법
    // 1. 상속의 계층구조를 통한 "다형성" 설계(나중에)
    // 2. 재사용성 좋아진다.
    
    private int year; // 생산연도
    // protected - 상속받는 클래스만 접근 가능
    protected String brand; // 브랜드

    // 기본생성자
    public Car() {
        System.out.println("기본 생성자 호출!");
        this.brand = "기본차";
    }

    // 전체초기화 생성자
    public Car(int year, String brand) {
        this.year = year;
        this.brand = brand;
    }

    // 상속되는 필드 생성자
    public Car(String brand) {
        System.out.println("부모 생성자 호출!" + brand);
        this.brand = brand;
    }

    // 차를 상속하면 가지고 있는 공통 메서드
    public void move() {
        System.out.println("기본차가 이동합니다.");
    }

    public void openDoor() {
        System.out.println("차문을 엽니다.");
    }

    public void showInfo() {
        System.out.println("기본차 showInfo 호출!");
        System.out.println("브랜드: " + brand);
    }


}
