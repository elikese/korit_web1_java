package _27_Interface;

// 강아지 - Animal, Swimmable
// 인터페이스는 이식받을때, extends가 아니라 implements 사용
public class Dog implements Animal, Swimmable {
    
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지가 깡총깡총");
    }

    @Override
    public void swim() {
        System.out.println("강아지가 어푸어푸");
    }
}
