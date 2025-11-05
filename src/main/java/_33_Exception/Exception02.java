package _33_Exception;

public class Exception02 {
    static void method1() throws MyCheckedException {
        System.out.println("method1 호출되었습니다.");
        method2();
    }

    // throws : 나를 호출한 쪽에게 예외처리를 전파하겠다.
    static void method2() throws MyCheckedException {
        System.out.println("method2 호출되었습니다.");
        // 의도적으로 예외를 생성
        // throw new RuntimeException("method2에서 생성");
        // 체크예외 -> try-catch문 강제(컴파일시점에 검사하기 때문)

        throw new MyCheckedException("method2에서 생성");
    }

    public static void main(String[] args) {
        /*
        - Exception 도 2가지 종류로 나뉜다.
        1. Checked Exception (컴파일시점에 검사): 문법적으로 try-catch를 강제
        2. Unchecked Exception(RuntimeException) (런타임시점에 검사)

        - 예외를 의도적으로 생성: throw
        - 예외를 전파: throws

        - 예외 전파?
        main() -> method1() -> method2()
        method2에서 예외가 발생! JVM은 코드진행을 즉시 멈추고 
        해당 예외객체의 타입을 받아주는 catch문을 찾는다.
        method2에는 catch가 없더라 -> method1에도 catch가 없더라
        -> main에도 catch가 없더라 -> 프로그램을 종료, 콘솔에 에러메세지가 출력
        */

        // Exception(예외 최상위부모) - RuntimeException - 구체적인예외들...
        // 필드로 String message를 가지고 있음. getMessage() 메서드도 존재
        try {
            method1();
        } catch (RuntimeException e) {
            // RuntimeException은 컴파일시점 검사가 아니기 때문에
            // throws, try-catch를 강제하지 않는다.
            System.out.println("main에서 예외처리 실행");
            System.out.println(e.getMessage());
        } catch (MyCheckedException e) {
            // 최종적으로 체크예외를 main까지 throws로 전파시켜서 처리
            System.out.println("main에서 체크예외처리 실행");
            System.out.println(e.getMessage());
        }
        
        try {
            throw new MyException("나만의 예외 생성");
            // 왜 커스텀예외를 사용하는가?
            // 즉시 코드진행을 멈춰야하는 경우
            // 1. database와 소통할 때(트랜잭션 제어할 때) - 예외를 기준으로 작업을 취소
            // 2. 메모리(생성자)에서 잘못된 값을 넣을 때 명시적으로 예외 발생
            // 생성자 실행도중 예외가 발생하면, 객체에 할당된 메모리를 수거해간다.
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        // 참고) 예외객체를 catch해서 처리하는
        // 로직을 담당하는 클래스를 예외핸들러라고 부른다.
        
        
    }
}
