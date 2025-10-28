package _20_OOP;

public class Person {
    String name;
    int age;
    Friend[] friends; 
    // 객체간의 관계: Person 객체 하나는 여러개의 Friend 객체를 가진다
    // 1:n 관계
    
    public Person(String name, int age) {
        // 객체 초기화 전에 데이터 검증 필요함!
        this.name = name;
        this.age = age;
    }
}
