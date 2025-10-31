package _27_Interface;

public class Main {
    public static void main(String[] args) {
        /*
        상속의 한계
        상속은 is - a 관계다. Archer is a Character
        1. 자식클래스로 갈수록, 기능이 방대해진다(덧방) -> 확장은 쉽다.
        2. 다중상속이 불가능하다(super 때문에). 하나의 클래스는 하나의 부모클래스만 가진다.
        -> 조합, 조립은 불가능

        인터페이스
        인터페이스는 can - do 관계다. (자격증)
        1. 확장이 아니라, 조합/조립
        2. 다중상속이 가능하다.
        -> 필드가 없음(상태가 존재하지 않음)
        -> 메서드 시그니처만 정의
        3. Method Area에만 정보가 존재(생성자 x -> 객체 생성이 x)
        */

        // 다형성
        Animal dog = new Dog(); // (사이드)캐스팅
        Animal duck = new Duck(); // (사이드)캐스팅

        Animal[] animals = {dog, duck};
        for (Animal animal : animals) {
            animal.sound(); // 다형성
            // animal이 Flyable로 캐스팅이 가능하다면
            if(animal instanceof Flyable) {
                // 임시캐스팅: 캐스팅했다가 다시 원복
                ((Flyable) animal).fly();
            }
            if(animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }

            Dog dog2 = new Dog(); // 캐스팅 x
            Duck duck2 = new Duck(); // 캐스팅 x
            AnimalManager manager = new AnimalManager();

            // 매개변수로 넘어갈때 Animal 타입으로 캐스팅된다.
            manager.makeSound(dog2); 
            manager.makeSound(duck2);

            // 매개변수로 넘어갈때 Swimmable 타입으로 캐스팅된다.
            manager.makeSwimming(dog2);
            manager.makeSwimming(duck2);




        }
    }
}
