package _29_Wrapper;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 88};
        // 1. Integer 배열로 변환해주세요
        // Integer.valueOf(int값) -> 박싱
        // scores를 for문을 돌면서 박싱을 해줘야겠다.
        // 어디에 담지?? -> Integer 배열을 하나 만들어야겠다.
        Integer[] integerScores = new Integer[scores.length];

        for (int i = 0; i < scores.length; i++) {
            int intValue = scores[i]; // int값 추출
            Integer integerValue = Integer.valueOf(intValue); // 박싱
            integerScores[i] = integerValue; // 대입
        }
        // 확인
        System.out.println(Arrays.toString(integerScores));

        // 2. 최고점, 최저점을 적절한 Integer 메서드를 사용해서 구해주세요
        // max():두개 비교해서 큰 값 리턴, min():두개 비교해서 작은 값 리턴

        // 1. for문으로 순회
        // 2. 순회하면서 비교(max, min) 
        // -> 비교결과 큰거 비교결과 maxScore / 작은거 비교결과 minScore
        // 업데이트
        Integer maxScore = integerScores[0]; // 0번 값을 기준으로
        Integer minScore = integerScores[0]; // 0번 값을 기준으로

        // 향상 for문도 가능
        for (int i = 1; i < integerScores.length; i++) {
            Integer maxValue = Integer.max(maxScore, integerScores[i]);
            maxScore = maxValue; // 큰값 비교결과를 업데이트(대입)
            Integer minValue = Integer.min(minScore, integerScores[i]);
            minScore = minValue; // 작은값 비교결과를 업데이트(대입)
        }


        
        
    }
}
