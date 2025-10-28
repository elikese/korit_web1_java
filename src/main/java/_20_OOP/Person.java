package _20_OOP;

public class Person {
    String name;
    int age;
    Friend[] friends; 
    // 객체간의 관계: Person 객체 하나는 여러개의 Friend 객체를 알고있다.
    // 1:n 관계
    
    public Person(String name, int age, int count) {
        // 객체 초기화 전에 데이터 검증 필요함!
        this.name = name;
        this.age = age;
        this.friends = new Friend[count];
    }

    public void setFriend(Friend friend) {
        for (int i = 0; i < friends.length; i++) {
            if(friends[i] == null) {
                friends[i] = friend;
            }
        }
    }
}
