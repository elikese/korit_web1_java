package _28_Object;

import java.util.Objects;

public class ObjectStudent {
    private String name;
    private int age;

    public ObjectStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // 1. toString()
    // Object 클래스에서 toString의 정의: 클래스풀네임 + @ + 해시코드(16진수)
    // 객체의 상태(필드값, 멤버변수값) 정보를 문자열로 표현해주는 메서드로 사용(오버라이딩)
    // 로깅목적, 디버깅용
    @Override
    public String toString() {
        String data = "name=" + this.name + " age=" + this.age;
        return data;
    }
    
    // 2. equals()
    // "문자열".equals("문자열") -> String은 객체이기 때문에
    // Object의 equals는 == 연산자와 동일하게, 주소값을 비교하고 있음
    /*
    논리적으로 동등한가?(규약이 존재)
    1. x.equals(x) -> true 여야한다.
    2. x.equals(y)가 true면, y.equals(x)도 true 여야 한다.
    3. x.equals(y)가 true고, y.equals(z)가 true면, x.equals(z)도 true 여야한다.
    4. x.equals(null)은 false 여야 한다.
    */

    @Override
    public boolean equals(Object o) {
        // null검사, 클래스이름이 다르면 -> false
        if (o == null || getClass() != o.getClass()) return false;
        ObjectStudent that = (ObjectStudent) o;
        // 필드 값 비교
        // 원시자료형은 == 연산자로
        // 참조자료형은 Objects.equals()로 필드 비교
        return age == that.age && Objects.equals(name, that.name);
    }

    // 1. equals()를 오버라이딩하면, 반드시 hashCode()도 오버라이딩 해야한다.
    // 2. HashMap, HashSet 등 해시기반 컬렉션자료형때 사용 - 동등성(중복)에 관한 이야기
    // 3. 해시: 함수에 값을 넣어서 나온 값으로 비교
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
