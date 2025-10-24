package _15_Method;

public class Practice2 {
    // 메서드 작성!
    // calcTotal / calcAverage / getGrade를 작성해주세요
    public static int calcTotal(int kor, int eng, int math) {
        int sum = kor + eng + math;
        return sum;
    }

    public static double calcAverage(int totalScore) {
        return totalScore / 3.0;
    }

    public static String getGrade(double avg) {
        if (avg >= 90) {
            return "A";
        } else if (avg >= 80) {
            return "B";
        } else if (avg >= 70) {
            return "C";
        } else if (avg >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void printStudentInfo(String name, int kor, int eng, int math) {

        // 메서드 3개를 완성해서 컴파일에러를 없애주세요
        // calcTotal / calcAverage / getGrade를 작성해주세요
        // grade: 90이상 A, 80~89 B, 70~79 C, 60~69 D, 60미만 F

        // calcTotal -> 리턴: int / 매개변수: int, int, int
        int totalScore = calcTotal(kor, eng, math);
        // calcAverage -> 리턴: double / 매개변수: int
        double average = calcAverage(totalScore);
        // getGrade -> 리턴: String / 매개변수: double
        String grade = getGrade(average);

        System.out.println("이름: " + name + "학생");
        System.out.println("총점: " + totalScore);
        System.out.println("평균: " + average);
        System.out.println("등급: " + grade);
    }

    public static void main(String[] args) {
        // 학생 성적 관리

        printStudentInfo("김철수", 85, 90, 78);
        // main -> printStudentInfo -> calcTotal
        //                          -> calcAverage
        //                          -> getGrade
        // 나중에 호출된 stack 메모리가 먼저 정리된다.
    }

}
