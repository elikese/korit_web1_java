package _36_Lambda;

// 인터페이스를 메서드용 포장지로 씁니다
@FunctionalInterface
public interface PersonChecker {
    boolean check(Person p);
}
