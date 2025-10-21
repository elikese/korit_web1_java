package _09_For;

public class NestedLoop {
    public static void main(String[] args) {
        // 2중 for문
        for (int day = 1; day <= 7; day++) {
            System.out.println(day + "일 살았음");
        } // for문 전체를 일주일로 치환해서 생각할 수 있다.
        // 한달 -> 일주일을 4번 반복하면된다.
        for (int week = 1; week <= 4; week++) {
            System.out.println(week + "주 시작!");
            for (int day = 1; day <= 7; day++) {
                System.out.println("\t" + day + "일 살았음");
            }
            System.out.println(week + "주 끝!");
        }

        // 구구단 출력해 주세요!
        /*
        2단 시작!
            2 x 1 = 2
            2 x 2 = 4
            ...
            2 x 9 = 18
        2단 끝!
        ...
        9단 시작!
            9 x 1 = 9
            9 x 2 = 18
            9 x 3 = 27
            ...
            9 x 9 = 81
        9단 끝!
        */
        // 2단 출력
        System.out.println("2단 시작!");
        for (int i = 1; i <= 9; i++) {
            System.out.println(2 + " x " + i + " = " + 2 * i);
        }
        System.out.println("2단 끝!");

        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("\t" + dan + "단 시작!");
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " x " + i + " = " + dan * i);
            }
            System.out.println("\t" + dan + "단 끝!");
        }

    }
}
