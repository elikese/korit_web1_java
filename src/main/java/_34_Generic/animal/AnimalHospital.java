package _34_Generic.animal;

// T extends A: 타입 매개변수 "상한 경계 설정"
// 1. T는 Animal 타입이거나, Animal을 상속받은 타입이어야 한다.
// 2. T는 Object까지 업캐스팅 되지않고, Animal까지만 업캐스팅 된다.(컴파일러가 자동으로)
public class AnimalHospital<T extends Animal> {

    // 필드로 Animal을 상속받는 객체들을 제너릭으로 받고자 한다.
    private T animal;

    // 필드에 있는 Animal 상속객체들의 sound() 호출을 해야하는데,
    // T로는 업캐스팅이 Object까지 이뤄지기 때문에, sound() 메서드 호출할 수 없다.
    // 하지만, 상한경계를 설정해주면, sound() 메서드가 있다는걸 보장할 수 있어서
    // 컴파일러가 컴파일검사를 통과시켜 준다.
    public void makeSound() {
        animal.sound();
    }

    // 두 동물들을 비교하여 더 큰 동물을 반환
    // 반환 타입도 T로 지정하여 타입 안전성을 보장할 수 있다.
    public T getBigger(T animal1, T animal2) {
        T biggerOne = animal1.getSize() > animal2.getSize() ? animal1 : animal2;
        return biggerOne;
    }

}
