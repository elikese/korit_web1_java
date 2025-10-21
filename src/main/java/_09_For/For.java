package _09_For;

public class For {
    public static void main(String[] args) {
        /*
        반복문 - for
        for(변수선언(초기식); 조건식; 증감식) {
            반복될 코드작성
        }
        초기식 -> (조건식 -> 코드실행 -> 증감식)xn -> 조건식결과가 false면 for문 탈출
        */
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
            System.out.println(i); // 0 ~ 9까지
        }

        int a = 0; // 외부변수를 반복문에서 사용할 경우
        for (; a < 5; a++) {
            System.out.println(a); // 0 ~ 4까지
        }
        System.out.println(a); // a = 5 (증감식-> 조건검사하고 탈출)

        // i는 1 ~ 10범위를 가진다, 짝수만 출력
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // 짝수 조건일때만
                System.out.println(i);
            }
        }

        // 1~100까지 덧셈
        int sum = 0; // 누적합
        for (int i = 1; i <= 100; i++) {
            sum += i; // sum = sum + i;
        }
        System.out.println(sum);
        
        // 1~100 숫자들 중 짝수합, 홀수합을 반복문을 통해 구해주세요
        int evenSum; // 짝수합
        int oddSum; // 홀수합

        // 1~100 숫자 중 3의배수와 7의배수의 갯수를 구해주세요
        int count3; // 3의배수 갯수
        int count7; // 7의배수 갯수
        


    }
}
