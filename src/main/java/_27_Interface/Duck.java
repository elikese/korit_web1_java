package _27_Interface;

public class Duck implements Animal, Flyable, Swimmable {
    @Override
    public void sound() {
        System.out.println("꽥꽥");
    }

    @Override
    public void move() {
        System.out.println("오리가 뒤뚱뒤뚱");
    }

    @Override
    public void fly() {
        System.out.println("오리난다");
    }

    @Override
    public void swim() {
        System.out.println("오리가 헤엄칩니다.");
    }
}
