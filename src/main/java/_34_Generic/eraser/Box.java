package _34_Generic.eraser;

public class Box<T> {
    T value;

    public Box(T value) {
        this.value = value;
    }

    public void print() {
        new Printer().print(value);
    }
}
