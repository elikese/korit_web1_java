package _14_MultiArray;

public class WorkHour {
    public static void main(String[] args) {
        // 직원 이름들
        String[] employeeNames = {"김철수", "이영희", "박민수", "최지우"};

        // 근무기록
        // int[]을 저장하는 배열
        // int[]에는 순서대로 id, 근무시간, 시급이 기록되어 있다.
        int[][] workRecords = {
                {0, 40, 10000}, // 김철수의 기록
                {1, 35, 12000}, // 이영희의 기록
                {2, 20, 9000}, // 박민수의 기록
                {3, 45, 11000} // 최지우의 기록
        };

        // 1. 전체 인건비 계산
        int totalPay = 0;
        for (int[] record : workRecords) {
            int hours = record[1]; // 일주일동안 일한 시간
            int wage = record[2]; // 시급
            int pay = hours * wage; // 주급
            totalPay += pay;
        }
        System.out.println("총 인건비: " + totalPay);
        // 3. "이영희"라는 사람이 있는가?
        // -> 있으면, 이사람의 근무시간, 시급을 출력
        String targetName = "이영희";
        int targetIndex = -1;
        for (int i = 0; i < employeeNames.length; i++) {
            if(employeeNames[i].equals(targetName)) {
                targetIndex = i; // 찾으면 index 업데이트
                break;
            }
        }

        // 못찾았다
        if (targetIndex == -1) {
            System.out.println(targetName + "는(은) 존재하지 않습니다.");
            return;
        }
        
        // 찾았다
        // workRecords의 int[]에서 0번째에 있는게 id이자 index이기 때문
        for(int[] record : workRecords) {
            int id = record[0];
            if (targetIndex == id) {
                System.out.println("직원: " + targetName);
                System.out.println("근무 시간: " + record[1]);
                System.out.println("시급: " + record[2]);
            }
        }

        // 이영희 찾을땐 ->
        // 1. employeeNames를 순회하면서 "이영희"의 index
        // 2. 찾은 index로 workRecords에 접근해서 조회

        // 2. 근무시간이 30시간 미만인 사람 출력
        // workRecords를 순회하면서, 30시간 미만인 데이터의 id를 찾는다
        // 찾은 id로 employeeNames[id]를 출력!
        boolean found = false;
        for (int i = 0; i < workRecords.length; i++) {
            int[] record = workRecords[i];
            int time = record[1];
            if(time < 30) {
                found = true;
                int id = record[0];
                String name = employeeNames[id];
                System.out.println("30시간 미만 근무: " + name);
            }
        }
        
        // 순회 끝나고 작성
        if (!found) {
            System.out.println("30시간 미만 근무자는 없습니다.");
        }



    }
}
