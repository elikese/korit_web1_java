package _21_Access;

public class Main {
    public static void main(String[] args) {
        Access access = new Access("데이터입니다");
        System.out.println(access.getData());

        // data의 접근제어자가 private가 되어서
        // 직접참조(.)를 할 수 없게되었음
        
        // access.data = "에러나라~"; // 참조해서 변경 불가능
        // System.out.println(access.data); // 직접참조 불가능

        access.setData("메서드로만 변경 가능");
        System.out.println(access.getData());


    }
}
