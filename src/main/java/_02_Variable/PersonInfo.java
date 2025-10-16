package _02_Variable;

public class PersonInfo {
    public static void main(String[] args) {
        // 실습
        /*
            아래의 데이터를 적절한 자료형과 변수명으로 저장하고,
            각 변수들을 콘솔에 출력해 주세요.
            1.이름, 2.출생연도, 3.키(소숫점포함),
            4.혈액형, 5.학생여부(true/false)
        */
        String name = "박화목";
        int birthYear = 1991;
        double height = 173.0;
        char bloodType = 'B';
        boolean isStudent = false;

        // 정보출력
        System.out.println("이름: " + name);
        System.out.println("출생연도: " + birthYear);
        System.out.println("키: " + height);
        System.out.println("혈액형: " + bloodType);
        System.out.println("학생여부: " + isStudent);

    }
}
