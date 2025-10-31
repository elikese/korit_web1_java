package _27_Interface;

public class AnimalManager {

    // AnimalManager 클래스의 makeSound의 의존성: Animal 인터페이스
    // Dog 클래스의 의존성: Animal... : AnimalManager를 의존하지 x
    // Duck 클래스의 의존성: Animal... : AnimalManager를 의존하지 x
    // 의존성 방향 [Dog] -> [Animal] <- [AnimalManager]
    // -> 구체적인 클래스끼리 의존하는게 아니라, 인터페이스를 통해 작동
    // -> 결합도가 낮다!(유연할 수 있다, 변경에 안정적)
    // 이상적인 구조!(구현체 모두가 추상체를 의존하는 구조!)
    // DIP - 의존성 역전의 원칙

    public void makeSound(Animal animal) {
        animal.sound();
    }

    public void makeFlying(Flyable flyable) {
        flyable.fly();
    }

    public void makeSwimming(Swimmable swimmable) {
        swimmable.swim();
    }
}
