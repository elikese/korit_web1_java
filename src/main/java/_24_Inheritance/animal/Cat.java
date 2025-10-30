package _24_Inheritance.animal;

public class Cat extends Animal {
    private String color;

    public Cat() {
        super();
        this.color = "회색";
    }

    public Cat(String name, int age, String color) {
        super(name, age); // 부모의 매개변수 생성자 호출
        this.color = color;
    }
    
    // 부모의 메서드와 동일한 메서드시그니처로 정의
    // 메서드구성요소: 메서드시그니처 + 메서드바디(중괄호 - 구현부)
    @Override
    public void eat() {
        System.out.println("고양이가 생선을 먹습니다");
    }

    @Override
    public void showInfo() {
        System.out.println("이름: " + this.name);
        System.out.println("나이: " + this.age);
        System.out.println("털색: " + this.color);
    }

}
