package _33_Exception;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이메일을 입력해주세요: ");
        String email = scanner.nextLine();

        // 커스텀예외를 만들어주세요(InvalidEmailException)
        // 검증조건
        // 1. email이 null이면 예외 생성 - 메세지: 이메일이 null입니다.
        // 2. email이 빈 문자열이면 예외 생성 - 메세지: 이메일이 비어있습니다.
        // 3. email에 @가 없으면 예외 생성 - 메세지: 이메일에 @가 없습니다.
        // 4. 정상이면 "유효한 이메일입니다: {email}" 출력
        // emailHandler.handle(email)
        try {
            // 이메일 검증 로직 코드 작성!
            if (email == null) {
                throw new InvalidEmailException("이메일이 null입니다.");
            }

            if (email.isEmpty()) {
                throw new InvalidEmailException("이메일이 비어있습니다.");
            }

            if (!email.contains("@")) {
                throw new InvalidEmailException("이메일에 @가 없습니다.");
            }

            // 커스텀에러가 RuntimeException 상속받고 있기때문에 catch로 잡을 수 있다.
            // 커스텀에러, RuntimeException 모두 Exception을 상속받고 있어서 catch로 잡을 수 있다.
        } catch (InvalidEmailException e) {
            // 구체적인 예외 클래스를 상단에 적어주는게 권장된다.
            // 최종 하단에 RuntimeException이나 Exception을 잡는 catch문을 작성하는게 권장된다.
            System.out.println("오류메세지: " + e.getMessage());
        } finally {
            scanner.close(); // 스캐너 반납
        }


    }
}
