package _24_Inheritance.car;

public class GasCar extends Car{
    private int fuelLevel;

    public GasCar() {
        // super(); // 생략가능하다
        System.out.println("GasCar 기본생성자 호출");
        this.fuelLevel = 100;
    }

    public GasCar(String brand) {
        // super(brand); -> 이 코드를 생략하면, 자동으로 super() 삽입된다.
        super(brand);
        this.fuelLevel = 100;
    }

    // 메서드 오버라이딩(overriding) - over-writing
    // 메서드시그니처(메서드 이름, 매개변수 수, 매개변수 순서, 반환타입)
    // 오버라이딩이 되려면, 부모의 메서드시그니처와 완전히 동일해야한다.
    @Override // 어노테이션(@) Override
    public void move() {
        System.out.println("가솔린차가 이동합니다.");
    }

    @Override
    public void showInfo() {
        System.out.println("브랜드: " + brand);
        System.out.println("차종: 가솔린차");
        System.out.println("연료: " + fuelLevel);
    }

}
