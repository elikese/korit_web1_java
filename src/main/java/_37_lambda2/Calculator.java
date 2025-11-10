package _37_lambda2;

// @FunctionalInterface : 컴파일러가 함수 하나만 선언되었는지 검사
@FunctionalInterface
public interface Calculator {
    // 메서드 시그니처만 정의 -> 구체적인 구현은 익명클래스에서 구현
    int calculate(int number1, int number2);
}
