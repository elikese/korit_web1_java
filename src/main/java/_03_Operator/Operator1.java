package _03_Operator;

public class Operator1 {
    public static void main(String[] args) {
        /*
        연산자: 계산을 수행하는 기호
        // 3 + 4 // "+"가 연산자, 3,4는 피연산자
        // a + b // "+"가 연산자, a,b는 피연산자
        */

        // 산술연산자(+,-,*,/,%) : 사칙연산
        int num1 = 1;
        int num2 = 2;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num2 / num1);
        
        // 나머지연산 - 1 / 2 -> 몫0 나머지가1
        System.out.println(num1 % num2);
        
        int even1 = 128;
        //  % 2 를 했을때 나머지가 있으면 -> 홀수
        // 있으면 짝수
        System.out.println(even1 % 2);

        // 비교연산자 - 결과값이 boolean 타입
        System.out.println(num1 == num2); // 같은지 연산
        System.out.println(num1 != num2); // 다른지 연산
        System.out.println(num1 > num2); // 초과
        System.out.println(num1 >= num2); // 이상
        System.out.println(num1 < num2); // 미만
        System.out.println(num1 <= num2); // 이하

        // 실습1) 22시에서 50시간을 더하면 몇시인지 구하세요
        int now = 22;
        int after50hour = now + (50 % 24); // 괄호 -> 우선연산
        System.out.println(after50hour);

        // 실습2) x개의 게시물이 있다.
        // 게시글은 한페이지당 20개씩 표시 된다.
        // 총 몇 페이지가 나올지 논리적으로 설계해주세요
        // (x % 20) == 0 의 결과가 true -> x / 20이 총 페이지 수
        // (x % 20) == 0 의 결과가 false -> (x / 20) + 1이 총 페이지 수
        

        


    }
}
