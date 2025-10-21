package _11_Scope;

public class Scope1 {
    public static void main(String[] args) {
        // 스코프: 변수의 생존 범위
        // 마치 사람이 살 수 있는 지역과 같아서,
        // 그 지역을 벗어나면 더 이상 존재하지 않는다.

        // 선언된 중괄호 안쪽으로는 생존가능하다 - java의 경우
        int m = 10; // m생존 시작 - main 메서드 전체에서 생존

        if (true) {
            int x = 20; // x생존 시작 - if 블록 안에서만 생존
            System.out.println(m); // 외부변수 m은 생존
            System.out.println(x); // x 생존
        } // x생존 종료

        // System.out.println(x); x는 이미 사라졌음
        for (int i = 0; i < 2; i++) { // i는 for문 안에서만 생존
            System.out.println(i); // i 생존
        } // i는 생존종료

        // 새로운 i 변수(위의 i와는 별개의 변수)
        for (int i = 0; i < 2; i++) { 
            System.out.println(i); 
        }

        for (int i = 0; i < 2; i++) { // i 생존시작
            for (int j = 0; j < 2; j++) { // j 생존시작
                System.out.println(i); // 중괄호 안쪽이라서, i 생존
            } // j 생존 종료
        }// i 생존 종료

        if (true) {
            int inner = 2; // 바깥 if문 안쪽에서 생존
            if (true) {
                int deeper = 3; // 안쪽 if문 안쪽에서 생존

            } // deeper는 생존종료
            int deeper = 5; // 안쪽 if문에 있던 deeper와는 다른변수
        }

    } // m생존 종료
}
