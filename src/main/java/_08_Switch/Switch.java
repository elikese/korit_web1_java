package _08_Switch;

public class Switch {
    public static void main(String[] args) {
        // Switch - case문: 코드 순간이동이다.
        int ranking = 2;
        // if문은 true, false에 따라 분기
        // switch(변수) - case(변수의 값에 따라 분기)
        switch (ranking) {
            case 1:
                System.out.println("전액장학금");
                break; // 가장 가까운 switch문(중괄호) 탈출
            case 2:
                System.out.println("반액장학금");
                break;
            case 3:
                System.out.println("상품권");
                break;
            default:
                System.out.println("기본!");
                break;
        }

        int month = 9;

        switch (month) {
            case 3: case 4: case 5:
                System.out.println("봄입니다.");
                break;
            case 6: case 7: case 8:
                System.out.println("여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("가을입니다.");
                break;
        }

    }
}
