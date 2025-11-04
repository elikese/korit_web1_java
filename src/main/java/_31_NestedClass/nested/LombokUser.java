package _31_NestedClass.nested;

import lombok.*;

@ToString // 알아서 toString 재정의
@AllArgsConstructor // 모든 필드 초기화하는 생성자 자동 추가
@NoArgsConstructor // 기본생성자 자동 추가
// @RequiredArgsConstructor // final 붙은 필드 초기화하는 생성자 자동 추가
@Getter @Setter // 모든 필드의 getter, setter 자동 추가
@Builder // 빌더패턴을 자동 추가
@Data // getter, setter, toString, equals, hashcode, RequiredArgsConstructor
public class LombokUser {
    private String username;
    private String name;
    private String email;
    private String address;

    // 롬복(lombok) - 라이브러리(공식 x), 매우 실무에서 자주 사용한다.
    // 원리? 자동으로 해주는 친구: 컴파일러
    // 컴파일러에게 @이 붙은 클래스에는 번역할때 알아서 다 만들어 줘
    // "리플렉션" < 자바 고급내용
    
    
    // 외부라이브러리 사용법
    // 1. mvn repository 에서 dependency를 복사
    // 2. pom.xml에 <dependencies> 태그를 만들어 안쪽에 붙혀넣기
    
}
