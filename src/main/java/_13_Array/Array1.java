package _13_Array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        // Array(배열): 같은 자료형의 많은 데이터를 한번에 관리하는 저장자료형
        // 연속된 공간(메모리)에 위치하기 때문에 탐색시 유리(빠르다)

        int score1 = 90;
        int score2 = 80;
        int score3 = 40;
        int score4 = 60;
        int score5 = 100;

        int[] scores = new int[5]; // int 자료 5개 들어갈 배열 생성
        scores[0] = 90;
        scores[1] = 80;
        scores[2] = 40;
        scores[3] = 60;
        scores[4] = 100;

        // 간단하게 배열생성 / 초기화 한번에
        int[] scores2 = new int[]{90, 80, 40, 60, 100};
        int[] scores3 = {90, 80, 40, 60, 100}; // 가장 많이 사용

        // 길이(공간 갯수) 배열명.length
        System.out.println(scores3.length);
        // 자료형[] 배열이름 = {초기화할 데이터1, 초기화할 데이터2}

        // 배열 순회 - loop(for문과 자주 쓴다)
        String[] names = {"일길동", "이길동", "삼길동", "사길동", "오길동", "육길동"};
        System.out.println(names[0]); // names의 0번칸 데이터를 가져옴
        System.out.println(names[2]); // names의 2번칸 데이터를 가져옴
        for (int i = 0; i < 5; i++) { // 배열이 추가되면, 조건문도 바꿔줘야 한다.
            System.out.println(names[i]);
        }

        // 전형적인 배열의 순회 방법
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // 향상된 for문 - 항상 배열의 길이만큼 순회
        // for(하나씩 꺼낸 데이터를 담을 변수 : 배열,리스트..)
        // 가독성 좋다, 직관적, 인덱스 접근을 막는다.
        for (String name : names) {
            System.out.println(name);
        }

    }
}
