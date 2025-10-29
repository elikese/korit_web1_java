package _23_Final;

public class FinalStudent {
    private final String name; // 이름
    private final int studentId; // 학번
    private int age; // 나이

    // 생성자를 통해 초기화(final 필드는 반드시 포함되어야 함)
    public FinalStudent(String name, int studentId, int age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getAge() {
        return age;
    }

    // 이런 메서드는 불가능(final 이라서)
//    public void setStudentId(int id) {
//        this.studentId = id;
//    }

    public void setAge(int age) {
        this.age = age;
    }

    // final 파라미터 - 외부에서 들어온 값을 변경하지 않겠다.
    public void printInfo(final String schoolName) {
        // schoolName = "자바고";
        System.out.println("학교: " + schoolName);
        System.out.println("이름: " + name);
        System.out.println("학번: " + studentId);
    }
}
