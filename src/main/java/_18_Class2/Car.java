package _18_Class2;

public class Car {
    int speed;
    boolean isEngineOn; // 시동걸려있으면 true

    // 클래스 -> 필드값 + 동작(메서드)

    // 동작(메서드) 들을 정의
    // 객체의 필드값(상태)들을 변경할 때, 논리적으로 검증된 값이 오게끔 메서드를 작성
    void engineStart() {
        isEngineOn = true;
        System.out.println("자동차 시동을 켭니다!");
    }

    void engineStop() {
        isEngineOn = false;
        speed = 0;
        System.out.println("자동차 시동을 끕니다!");
    }

    // 엑셀 밟기
    void accelerate() {
        // 시동걸려 있는지 확인
        if (!isEngineOn) {
            System.out.println("시동을 먼저 켜주세요");
            return;
        }
        speed += 20;
    }

    // 브레이크 밟기
    void brake() {
        speed -= 20;
        if (speed < 0) {
            speed = 0;
        }
    }

    void showStatus() {
        System.out.println("자동차 계기판 출력");
        if (isEngineOn) {
            System.out.println("시동 ON");
            System.out.println("현재 속도: " + speed);
        } else {
            System.out.println("시동 OFF");
        }
    }

}
