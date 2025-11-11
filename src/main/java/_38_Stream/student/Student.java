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
}
