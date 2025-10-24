package _15_Method;

public class Return {

    // 리턴값이 존재한다면, void대신 리턴되는 데이터의 자료형을 적어준다.
    public static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static String addNim(String name) {
        // 참고) String -> "문자"의 배열
        // 홍길동 -> "홍길동님"
        return name + "님";
    }

    public static void main(String[] args) {

        // return -> 호출결과
        // 리턴되는 데이터가 값이라면 값,
        // 객체라면 객체로 다룰 수 있다.(참조(.)할 수 있다.)
        int sum = add(10, 20);
        //f(g()) -> g()먼저 호출되고, f()호출
        int sum2 = add(10, add(10, 20)); // 값처럼 다룬 것

        /*
        stack(main)---
        sum: 30 (리턴할때도 stack값을 복사해서 가져간다)
        stack(main)---
        stack(add)---
        num1: 10
        num2: 20
        sum: 30
        stack(add)---
        */
        String name = "홍길동";
        // ~님으로 끝나나? endswith("님")
        // addNim(name) -> "홍길동님" 문자열
        if(addNim(name).endsWith("님")){
            System.out.println("님으로 끝납니다.");
        };
        System.out.println(addNim(name).length()); // 4




    }
}
