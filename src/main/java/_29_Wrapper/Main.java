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

        // 원시자료형 -> 래퍼클래스(박싱)
        // int를 감싸는 래핑클래스: Integer
        Integer integer1 = Integer.valueOf(90); // 기본
        Integer integer2 = 90; // 자동으로 컴파일러가 16번라인 코드로 변환

        // Long을 감싸는 래핑클래스: Long
        Long long1 = Long.valueOf(100L);
        Long long2 = 100L;
        
        // jdk 설치하면 같이 설치되는 java.lang 패키지에 정의된걸 사용하면 된다
        // double -> Double 클래스
        // boolean -> Boolean 클래스
        // float -> Float 클래스
        
        // 객체 -> 메서드사용, Object를 상속받았음
        // 원시자료형이 아니니까 == 연산자 x
        Integer a = Integer.valueOf(1000);
        Integer b = Integer.valueOf(1000);

        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // 올바른 방법. true

        // 반대로 래퍼클래스 -> 원시자료형(언박싱)
        // 객체.intValue(), 객체.longValue(), 객체.doubleValue()...
        int int1 = a.intValue();

        // 미리 정의되어있는 유틸메서드
        int max = Integer.max(10, 20); // 박싱 -> 언박싱
        int min = Integer.min(10, 20); // 박싱 -> 언박싱
        int sum = Integer.sum(10, 20); // 박싱 -> 언박싱
        



    }
}
