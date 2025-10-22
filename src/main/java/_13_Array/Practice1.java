package _13_Array;

public class Practice1 {
    public static void main(String[] args) {
        // 실습1) scores의 평균을 구해주세요.
        // 배열의 길이 활용!
        int[] scores = {80, 90, 75, 100, 65};
        // 평균 -> 총합 / 갯수(길이)
        double sum = 0.0;
        for (int score : scores) {
            sum += score; // sum = sum + score
        }
        double average = sum / scores.length;
        System.out.println("평균: " + average);


        // 실습2) foods에서 (상함)이 포함된 음식을 제외하고(contains)
        // 순회하며 출력해 주세요
        String[] foods = {"김치", "두부(상함)",
                "우유", "달걀(상함)", "사과"};

        // 문자열에서 접두/접미 검사
        String test = "손흥민";
        // 손으로 시작하는지 검사 - startsWith
        System.out.println(test.startsWith("손"));
        // 민으로 끝나는지 검사 - endsWith
        System.out.println(test.endsWith("민"));

        for (String food : foods) {
            if (food.contains("(상함)")) {
                continue; // (상함)이 포함된 문자열이면 스킵
            }
            System.out.println(food);
        }

    }
}
