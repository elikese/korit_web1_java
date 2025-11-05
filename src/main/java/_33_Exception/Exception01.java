package _33_Exception;

public class Exception01 {
    public static void main(String[] args) {
        /*
        오류 - Error, Exception
        Error - 시스템오류(자바환경에서 통제할 수 없는 에러)
        Exception - 개발자가 처리 가능한 오류들
        (자바에서는 비정상적인 상황을 객체로 만들어 놓았다.)
        */

        int a = 10;
        int b = 2;
        // int result = a / b;
        // 사전에 정의된 예외상황이 되면 자동으로 예외객체가 생성된다.
        // 예외객체가 생성이되면 JVM이 알아채고, 코드진행을 즉시 멈춘다.
        // System.out.println(result);
        System.out.println("실행중!!!");

        // 예외상황이 일어날 걸 미리 알고, 처리를 할 수 있음
        try {
            int result = a / b; // b가 0이면, 예외가 일어남
            // 예외가 일어나면 JVM은 코드진행을 즉시 멈추고,
            // 예외객체의 타입을 받아주는 catch문을 찾는다.
            System.out.println(result);
            // catch(ArithmeticException 타입의 예외 객체를 매개변수로 받는다)
        } catch (ArithmeticException e) {
            // e는 예외객체를 대입받은 변수
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            // 예외가 발생하건, 안하건 항상 실행된다.
            // 자원정리, scanner.close() 같은 자원반납
            System.out.println("저는 항상 실행됩니다.");
        }



    }
}
