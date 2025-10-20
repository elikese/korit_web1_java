package _06_If;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // if ~ else if ~ else
        // bmi 계산 = 체중(kg) / 키*키(m^2)
        // 철수(174cm, 70kg)의 비만도를 출력하라!
        int weight = 70;
        double height = 174 / 100.0; // 자동형변환(cm -> m)
        double bmi = weight / (height * height); // 자동형변환

        if (bmi >= 30) {
            System.out.println("비만");
        } else if(bmi >= 25) { // bmi < 30
            System.out.println("과체중");
        } else if(bmi >= 18.5) { // bmi < 25 && bmi < 30
            System.out.println("정상");
        } else {
            System.out.println("저체중");
        }

        // 실습)
        // 1. 스캐너로 점수를 입력받아 주세요 (1~100)
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요(1~100) >");
        int score = scanner.nextInt();
        // 2. 점수에 따라 등급을 판정해주세요
        // 90이상 A, 80~89 B, 70~79 C, 60~69 D, 60미만 F
        String grade = "X";
        // 추가내용) if문 중첩할 수 있다.
        // 중첩 -> 2번이상 하지 않는게 가독성에 좋다.
        // 얼리리턴 패턴 - 값 검증할때 사용
        if (score > 100 || score < 0) {
            System.out.println("불가능한 점수 입력입니다.");
            return; // 리턴을 만나면 즉시 메서드 종료(지금코드에선 main 종료)
        }
        
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // 3. A,B 등급이면 장학금 대상, 이외에는 장학금 대상이 아님
        boolean isAGrade = grade.equals("A");
        boolean isBGrade = grade.equals("B");
        String sentence;
        if (isAGrade || isBGrade) {
            sentence = "장학금 대상입니다!";
        } else {
            sentence = "장학금 대상이 아닙니다!";
        }

        /*
        최종출력
        점수: ~점
        등급: A~F - String 자료형, char(x)
        장학금 대상입니다! 혹은 장학금 대상이 아닙니다!
        */
        System.out.println("점수: " + score + "점");
        System.out.println("등급: " + grade);
        System.out.println(sentence);


    }
}
