package _14_MultiArray;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        // 다중배열(다차원배열) - 배열안에 배열이 존재하는 구조
        // 이중배열
        // 영화관 좌석
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        // seatA: stack에 존재하며, heap주소를 저장하고있다.
        // heap주소: 0x1000
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        // seatB: stack에 존재하며, heap주소를 저장하고있다.
        // heap주소: 0x2000
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};
        // seatC: stack에 존재하며, heap주소를 저장하고있다.
        // heap주소: 0x3000

        // String[]를 저장하는 배열이다 -> String[][]
        // String[][]를 저장하는 배열이다 -> String[][][]
        String[][] seats = {seatA, seatB, seatC};
        // seats: stack에 존재하며, heap주소를 저장하고 있다.
        // heap주소: 0x4000 -> [0x1000, 0x2000, 0x3000]

        String[][] seats2 = {
            {"A1", "A2", "A3", "A4", "A5"}, // 0
            {"B1", "B2", "B3", "B4", "B5"}, // 1
            {"C1", "C2", "C3", "C4", "C5"} // 2
        };

        // seats2를 통해서 B3를 접근해서 출력!
        String[] Bseat = seats2[1]; // seats2는 데이터 3개를 저장하고 있음
        System.out.println(Arrays.toString(Bseat));
        // seats2의 index가 1인것을 가져오고, 가져온 거에서 index가 2인것을 가져와라
        String B3 = seats2[1][2];
        System.out.println(B3);

        // 실습) seats2를 통해서 A4, C5를 접근해서 출력해주세요!
        String A4 = seats2[0][3];
        String C5 = seats2[2][4];
        System.out.println(A4);
        System.out.println(C5);

        // 메모리주소 비슷한(내부값)이 출력된다.
        // 한번만 까서 확인하는 메서드 이기 때문
        System.out.println(Arrays.toString(seats2));

        // 다중배열(n차원 배열)의 실제값 출력
        System.out.println(Arrays.deepToString(seats2));


    }
}
