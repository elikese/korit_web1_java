package _33_Exception;

// 커스텀 체크예외를 만드는 법
// extends Exception(Exception을 상속받아 준다)
public class MyCheckedException extends Exception {
    
    // 생성자
    public MyCheckedException(String message) {
        super(message);
    }
}
