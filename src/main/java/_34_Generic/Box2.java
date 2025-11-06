package _34_Generic;


// <T>, <E>, <K, V>, <K, V, E>
// 매개변수로 제너릭타입을 받을때는


public class Box2<T> {
    // 클래스명<T> -> 해당클래스 내에서는 가상의 타입(T)를 쓸 수 있다.
    private T item;

    public Box2(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    // Box2타입을 받는 매개변수
    // 메서드가 제너릭타입의 매개변수를 받아 줄때 정의하는 법.
    public static <T> void printBoxData(Box2<T> box) {
        box.getItem();
    }

}
