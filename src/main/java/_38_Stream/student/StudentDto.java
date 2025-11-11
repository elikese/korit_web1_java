package _38_Stream.student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

// entity - 데이터베이스에 있는 테이블데이터를 그대로 가져온 것
// dto(data transfer object) - 화면에 보여줄 데이터 객체
// 1. 민감정보를 숨기고, 필요한것만 보여준다.
// 2. 가공한 정보를 보여준다.
// entity -> dto
@Builder
@Data
@AllArgsConstructor
public class StudentDto {
    private String name;
    private String major;
    private String grade; // 등급
}
