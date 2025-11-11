package _38_Stream.student;

import java.util.List;
import java.util.stream.Collectors;

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
        // 1. 90점 이상 학생이 있는지 확인 - boolean 타입을 출력 - anyMatch
        boolean hasOver90 = students.stream()
                .anyMatch(student -> student.getScore() >= 90);

        // 2. 성적 상위 3명의 이름을 담은 리스트 출력 
        // 정렬 -> limit -> 객체에서 문자열변환 -> 모으기
        List<String> top3Names = students.stream()
                .sorted((st1, st2) -> st2.getScore() - st1.getScore()) // 내림차순 정렬
                .limit(3) // 3명으로 제한
                .map(student -> student.getName())// [객체1, 객체2..] -> [이름1, 이름2..]
                .collect(Collectors.toList());

        // 3. "컴퓨터공학"과 이면서 90점 이상인 학생이름을 담은 리스트 출력 // 정렬x
        // 필터링 -> 객체에서 문자열변환 -> 모으기
        List<String> results = students.stream()
                .filter(student
                        -> student.getMajor().equals("컴퓨터공학")
                        && student.getScore() >= 90)
                .map(student -> student.getName())
                .collect(Collectors.toList());
        
        // "경영학" 전공인 학생들의 이메일들을 모은 리스트 출력
        List<String> emails = students.stream()
                .filter(student -> student.getMajor().equals("경영학"))
                .map(student -> student.getEmail())
                .collect(Collectors.toList());
        System.out.println(emails);

        // 학생들의 전공을 중복없이 추출해서 모은 리스트 출력
        // distinct -> 객체상대로 distinct()를 적용하면, equals(), hashcode()로 비교
        List<String> majors = students.stream()
                .map(student -> student.getMajor())
                .distinct() // 문자열에 distinct()를 적용
                .collect(Collectors.toList());

        System.out.println(majors);

        // 4. 실무에서 가장많이하는 dto 변환 -- 나중에
        // entity(Student) -> dto(StudentDto)
        /*
                new Student("김자바", "컴퓨터공학", 92, "010-1111-1111", "kim@secret.com"),
                new Student("이파이썬", "컴퓨터공학", 88, "010-2222-2222", "lee@secret.com"),
                new Student("박경영", "경영학", 76, "010-3333-3333", "park@secret.com"),
                new Student("최경영", "경영학", 84, "010-4444-4444", "choi@secret.com"),
                new Student("정노드", "컴퓨터공학", 91, "010-5555-5555", "jung@secret.com"),
                new Student("한삼성", "전자공학", 79, "010-6666-6666", "han@secret.com")
         */
        List<StudentDto> dtos = students.stream()
                .map(student -> student.toDto())
                .collect(Collectors.toList());

        // entity(Student) -> dto(StudentDto2) 변환!!
        List<StudentDto2> dto2s = students.stream()
                .map(student -> student.toDto2())
                .collect(Collectors.toList());

    }
}
