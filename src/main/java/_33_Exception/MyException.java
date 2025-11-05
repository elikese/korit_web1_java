package _33_Exception;

// 보통 커스텀예외는 RuntimeException으로 정의한다.
public class MyException extends RuntimeException {

    public MyException(String message) {
        super(message);
    }
}
