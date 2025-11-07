package _36_Lambda;

@FunctionalInterface
public interface Modifier<T> {
    T modify(T t);
}
