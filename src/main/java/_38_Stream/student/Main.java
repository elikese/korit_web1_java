package _38_Stream.student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // bit.ly/koreait-web
        List<Student> students = List.of(
                new Student("김자바", "컴퓨터공학", 92, "010-1111-1111", "kim@secret.com"),
                new Student("이파이썬", "컴퓨터공학", 88, "010-2222-2222", "lee@secret.com"),
                new Student("박경영", "경영학", 76, "010-3333-3333", "park@secret.com"),
                new Student("최경영", "경영학", 84, "010-4444-4444", "choi@secret.com"),
                new Student("정노드", "컴퓨터공학", 91, "010-5555-5555", "jung@secret.com"),
                new Student("한삼성", "전자공학", 79, "010-6666-6666", "han@secret.com")
        );
        // 실습)
        // 1. 90점 이상 학생이 있는지 확인 - boolean 타입을 출력
        // 2. 성적 상위 3명의 이름을 담은 리스트 출력
        // 3. "컴퓨터공학"과 이면서 90점 이상인 학생이름을 담은 리스트 출력

        // 4. 실무에서 가장많이하는 dto 변환 -- 나중에

    }
}
