package _12_BreakContinue;

public class Continue {
    public static void main(String[] args) {
        // continue - 반복문 내에서 코드 진행을 멈추고, 다음 반복으로 넘어감
        // 사실상 스킵!
        for (int i = 1; i <= 10; i++) {
            // 짝수만 출력하겠다
            if (i % 2 != 0) { // 홀수조건
                continue; // 홀수조건일때는 다음반복으로 스킵
            }

            System.out.println(i); // if문에 걸리지 않을경우(짝수조건)
        }

        int waiting = 50; // 대기
        int stock = 10; // 재고량
        int noShowIndex = 6; // 노쇼 번호
        int sold = 0; // 실시간 판매량

        for (int i = 1; i <= waiting; i++) {
            System.out.println(i + "번째 손님 입장하세요");

            if (i == noShowIndex) {
                System.out.println(i + "번째 손님????");
                continue;
            }

            sold++; // 노쇼가 아니면 1증가(판매처리)

            if (stock == sold) { // 재고량과 실제 판매량이 일치하면
                System.out.println("재료 소진!");
                break;
            }
        }


    }
}
