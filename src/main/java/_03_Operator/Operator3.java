package _03_Operator;

public class Operator3 {
    public static void main(String[] args) {
        // 논리연산자 - boolean 자료끼리 연산
        // 결과타입: boolean 타입
        boolean hasLicense = true;
        int age = 25;
        // and 연산자(&&) : 둘 다 참일때만 참(true)
        boolean canDrive = (age >= 20) && hasLicense;

        // or 연산자(||) : 둘 중 하나라도 참이면 참(or)
        boolean isWeekend = false;
        boolean isHoliday = true;
        boolean isRestDay = isWeekend || isHoliday;

        // not 연산자(!): 참을 거짓으로, 거짓을 참으로(not)
        boolean isOnline = true;
        boolean isOffLine = !isOnline;

    }
}
