package _38_Stream.student;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String name; // 이름
    private String major; // 전공
    private int score;
    private String phoneNumber;
    private String email;

    // dto로 변환하는 메서드를 정의
    public StudentDto toDto() {
        String grade;
        if(score >= 90) grade = "A";
        else if(score >= 80) grade = "B";
        else if(score >= 70) grade = "C";
        else grade = "F";

        return new StudentDto(this.name, major, grade);
    }
    
    // dto2로 변환하는 인스턴스 메서드
    public StudentDto2 toDto2() {
        // this.email에서 id만 추출하는 코드 작성
        int indexOfAt = email.indexOf("@"); // aaaaa@bbbb.com
        String emailId = email.substring(0, indexOfAt);

        return StudentDto2.builder()
                .name(name)
                .score(score)
                .major(major)
                .emailId(emailId)
                .build();
    }

}
