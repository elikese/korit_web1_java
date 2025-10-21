package _10_While;

import java.util.Random;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        // 스캐너 객체 생성 및 변수에 대입
        Scanner scanner = new Scanner(System.in);
        // 랜덤 객체 생성 및 변수에 대입
        Random random = new Random();
        
        // 1~10 사이에 랜덤숫자를 생성가능
        int num = random.nextInt(1,11); // 1이상, 11미만
        int myInput = 0;

        // 내가 랜덤숫자를 맞출때(num == myInput 조건이 false) 탈출
        while(num != myInput) {
            System.out.print("숫자입력 >");
            myInput = scanner.nextInt();
            if (myInput == num) {
                System.out.println("정답입니다! : " + num);
            } else {
                System.out.println("땡! 다시 입력하세요!");
            }
        }

        
    }
}
