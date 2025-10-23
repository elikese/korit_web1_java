package _14_MultiArray;

import java.util.Arrays;

public class Loop {
    public static void main(String[] args) {
        String[][] seats = {
                {"A1", "A2", "A3", "A4", "A5"}, // 0
                {"B1", "B2", "B3", "B4", "B5"}, // 1
                {"C1", "C2", "C3", "C4", "C5"} // 2
        };

        for (int i = 0; i < seats.length; i++) { // seats안에 있는 배열들을 순회
            String[] seat = seats[i];
            // System.out.println(Arrays.toString(seat));
            for (int j = 0; j < seat.length; j++) {
                System.out.print(seat[j] + " ");
            }
            System.out.println(); // 엔터키
        }

        // nums -> int[]를 저장하는 배열
        int[][] nums = {
                {1, 2, 3, 4, 5}, // 자료형 -> int[]
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        // nums에 있는 짝수들을 모두 더한 값을 출력해 주세요!
        int evenSum = 0;
        for(int i = 0; i < nums.length; i++) {
            int[] num = nums[i]; // 숫자배열
            for(int j = 0; j < num.length; j++) {
                int myNum = num[j]; // 숫자(int)
                if (myNum % 2 == 0) {
                    evenSum += myNum;
                }
            }
        }

        String[] departments = {"인사부", "행정부", "사업부"};
        // 부서의 index와 직원들의 index는 동기화 되어있다.
        String[][] employees = { // String[]을 저장하는 배열을 저장하는 배열: String[][]
                {"김길동", "고길동", "박길동"}, // 인사부 자료형: String[]
                {"김영희", "이영희", "최영희"}, // 행정부 자료형: String[]
                {"김철수", "박철수", "김길동"} // 사업부 자료형: String[]
        };
        //employees[2]

        // 1.모든 부서를 통틀어서 김씨성을 가진 사람들 이름을 출력해주세요
        // departments 필요없음!, 문자열.startsWith("김")
        for(int i = 0; i < employees.length; i++) {
            // String[][]을 순회 -> 꺼내온것: String[]
            String[] deptNames = employees[i];
            for(int j = 0; j < deptNames.length; j++) {
                // String[]을 순회 -> 꺼내온것: String
                String name = deptNames[j];
                if(name.startsWith("김")) {
                    System.out.println(name);
                }
            }
        }

        // 2."사업부" 이면서 "김길동"인 사람이 있는지
        // 확인할 수 있는 코드를 작성해주세요

        boolean found = false; // 찾으면 true로 바꿀 변수(최종)
        int deptIndex = -1; // 사업부가 있는지 확인하는 변수

        // String[] departments = {"인사부", "행정부", "사업부"};
        // 사업부가 있는 부서인가? departments 순회
        for (int i = 0; i < departments.length; i++) {
            // String[]배열을 순회 -> 가져온것: String
            String deptName = departments[i];
            if(deptName.equals("사업부")) {
                deptIndex = i; // 찾으면, 인덱스를 업데이트 해준다.
                break;
            }
        }

        if(deptIndex == -1) { // "사업부"가 없을때
            System.out.println("사업부는 없습니다.");
            return; // main 메서드 즉시종료
        }

        // 사업부 사람들 명단 -> String[]
        String[] busiDept = employees[deptIndex]; // employees[2]
        for (int i = 0; i < busiDept.length; i++) {
            // String[]을 순회 -> 꺼내온것: String
            String name = busiDept[i];
            if(name.equals("김길동")) {
                found = true; // 찾으면 true로 업데이트
                break;
            }
        }
        
        if(found) {
            System.out.println("사업부에 김길동이 있습니다.");
        } else {
            System.out.println("사업부에 김길동은 없습니다.");
        }

        // 다중배열
        // String[][][] -> String[][]을 저장하는 배열
        // String[] -> String을 저장하는 배열
        // String[][][] names = { {{},{}}, {{},{}}, {{},{}} };
        // names[1] -> String[][]들이 저장되어있는데 그중 index가 1인걸 가져오라는 거구나


    }
}
