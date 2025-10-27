package _19_Constructor;

public class ConstructorMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        // 직접접근
        student1.name = "홍길동";

        // 생성자로 접근해서 초기화
        // 주소에 직접 접근한게 아니라, 마치 메서드로 우회해서 접근하는것과 비슷
        // 검증된 값을 넣기 위해서!
        Student student2
                = new Student("김길동", 80, 90, 100);
    }
}
