package _29_Wrapper;

public class Main {
    public static void main(String[] args) {
        /*
        원시자료형의 한계
        - 원시형은 객체가 아니므로
        1. 메서드를 가질 수 없음: 외부에서 메서드를 정의해서 사용
        2. null값을 가질 수 없다.
        int[] scores = {80, 90, 30, 0, 50};
        scores[3]의 값이 0인데, 초기화가 안되서 0인건지 실제 점수가 0인건지
        -> null로 명시하면 좋을텐데..
        */

        // int를 감싸는 래핑클래스: Integer
        Integer integer1 = Integer.valueOf(90); // 기본
        Integer integer2 = 90; // 자동으로 컴파일러가 16번라인 코드로 변환

        // Long을 감싸는 래핑클래스: Long
        Long long1 = Long.valueOf(100L);
        Long long2 = 100L;

        // double -> Double 클래스
        // boolean -> Boolean 클래스


    }
}
