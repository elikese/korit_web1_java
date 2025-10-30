package _24_Inheritance.car;

public class Main {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();

        // 상속관계에서 메서드 호출시 순서
        // move()가 호출되면, move()가 자식클래스에 있는지 먼저 탐색
        // 없으면 부모클래스에 있는지 탐색.
        tesla.move(); // move() -> 부모의 메서드
        tesla.openDoor(); // openDoor() -> 부모의 메서드
        tesla.moveWithInfo(); // super.move()를 내부적으로 호출 중

        GasCar gasCar = new GasCar("현대");

        System.out.println("--------");
        // 오버라이드를 하게 되면, 자식의 메서드가 호출되고
        // 부모의 메서드는 무시된다.
        gasCar.move();
        gasCar.showInfo();

    }
}
