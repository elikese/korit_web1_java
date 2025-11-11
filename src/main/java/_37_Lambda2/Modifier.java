package _37_Lambda2;

// 제네릭
@FunctionalInterface
public interface Modifier<T, R> {
    R modify(T t);
    // 매개변수로 특정 타입을 받아서, 다른 타입으로 리턴
}
