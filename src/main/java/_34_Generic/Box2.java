package _34_Generic;

public class Box2<T> {
    // 클래스명<T> -> 해당클래스 내에서는 가상의 타입(T)를 쓸 수 있다.
    private T item;

    public Box2(T item) {
        this.item = item;
    }

}
